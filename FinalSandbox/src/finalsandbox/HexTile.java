/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalsandbox;

/**
 *
 * @author Scott
 */
public class HexTile {
    //The number of corners the tile has
    private final static int CORNERS = 6;
    //The tile's gridspace coordinates
    private final int[] gridCoords;
    //The grid coordinates of all potential neighbors of this tile
    private int[][] neighborGridCoords;
    //The tile's center position in screenspace
    private int centerX, centerY;
    //Lengths for point calculation
    private final int radius; //The distance from the center to any corner
    private final int width; //Twice the radius. Distance between opposite corners
    private final int height; //Radius times the sqrt of 3. Distance between opposite sides
    private final int side; //Radius times 1.5
    //The X-coordinates of the tile's corners
    private final int[] cornersX;
    //The Y-coordinates of the tile's corners
    private final int[] cornersY;
    
    public HexTile(int radius, int gridX, int gridY, int gridZ) {
        gridCoords = new int[3];
        cornersX = new int[6];
        cornersY = new int[6];
        this.radius = radius;
        width = radius * 2;
        side = radius * 3/2;
        height = (int)(radius * Math.sqrt(3));
        gridCoords[0] = gridX;
        gridCoords[1] = gridY;
        gridCoords[2] = gridZ;
        
        calcCenter();
        calcCorners();
        calcNeighbors();
    }
    
    /**
     * Calculates the position of the tile's center using its grid coordinates,
     * where positive X is to the right and positive Y is downwards
     */
    private void calcCenter() {
        //The horizontal distance each increment in grid units moves the hex
        int horizontalOffset = (int)(width * 0.5);
        //The vertical distance in each increment in grid units moves the hex
        int verticalOffset = (int)(height * 0.5);
        //The tile's coordinates in gridspace
        int gridX = gridCoords[0];
        int gridY = gridCoords[1];
        int gridZ = gridCoords[2];
        
        //An increase in the X axis moves the tile to the right, while an increase
        //in Y moves it to the left
        centerX = horizontalOffset - gridY * horizontalOffset - gridZ * horizontalOffset + gridX * horizontalOffset/2;
        //Increasing in either the X or Y directions moves the tile upwards, while
        //an increase in the Z direction moves it down
        centerY = verticalOffset + gridX + gridZ * verticalOffset - gridY * verticalOffset;
    }
    
    private void calcCorners() {
        //These modifiers will be added to the hex's center position to determine
        //the positions of the corners in screenspace. The corners are organized
        //starting from the top-leftmost point, then moving clockwise
        int[] xCornerCalc = {-radius/2, radius/2, radius, radius/2, -radius/2, -radius};
        int[] yCornerCalc = {height/2, height/2, 0, -height/2, -height/2, 0};
        
        //Adds the corner offsets to the tile's center position to determine
        //the screenspace coordinates of the tile's corners
        for (int i=0; i < CORNERS; i++) {
            cornersX[i] = centerX + xCornerCalc[i];
            cornersY[i] = centerY + yCornerCalc[i];
        }
    }
    
    /** 
     * Calculates the positions of this tile's neighbors in gridspace
     */
    private void calcNeighbors() {
        //The coordinates of the neighboring tiles relative to this one
        int[][] neighborRelativeCoords = { {1, -1, 0}, {1, 0, -1}, {0, 1, -1}, 
                                           {0, -1, 1}, {-1, 1, 0}, {-1, 0, 1}};
        
        //Add this tile's grid coordinates to the relative neighbor coordinates
        //to get the absolute neighbor coordinates. This is where we would expect
        //the neighbors for this hex to be
        for (int i=0; i < CORNERS; i++) {
            for (int j=0; j < 3; j++) {
                neighborRelativeCoords[i][j] += gridCoords[j];
            }
        }
        
        neighborGridCoords = neighborRelativeCoords;
    }
    
    public int[] gridCoords() {
        return gridCoords;
    }
    
    public float[] centerCoords() {
        float[] centerCoords = {centerX, centerY};
        return centerCoords;
    }
    
    public int[] cornerXCords() {
        return cornersX;
    }
    
    public int[] cornerYCords() {
        return cornersY;
    }
}