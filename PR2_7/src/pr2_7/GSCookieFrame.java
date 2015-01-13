/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_7;

/**
 * The frame that will manage the cookie selling operation. Allows the user
 * to specify the number of each type of cookie being purchased via spinners and
 * provides the user with a running total of the quantities of sold cookies and 
 * their individual profit totals
 * @author showland17
 */
public class GSCookieFrame extends javax.swing.JFrame {

    private CookieSalesTracker tracker;
    
    /**
     * Creates new form GSCookieFrame
     */
    public GSCookieFrame() {
        initComponents();
        tracker = new CookieSalesTracker(3,4,5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblGSTitle = new javax.swing.JLabel();
        lblEnabler = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnTM = new javax.swing.JSpinner();
        spnS = new javax.swing.JSpinner();
        spnCC = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        lblTMSales = new javax.swing.JLabel();
        lblSSales = new javax.swing.JLabel();
        lblCCSales = new javax.swing.JLabel();
        btnTM = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnCC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblGSTitle.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 14)); // NOI18N
        lblGSTitle.setText("Girl Scout Cookies");

        lblEnabler.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 14)); // NOI18N
        lblEnabler.setText("\"The Enabler\"");

        jLabel1.setText("Number of Thin Mints ($3)");

        jLabel2.setText("Number of Somoas ($4)");

        jLabel3.setText("Number of C. Chips ($5)");

        spnTM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spnTM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTMStateChanged(evt);
            }
        });

        spnS.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spnS.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnSStateChanged(evt);
            }
        });

        spnCC.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99, 1));
        spnCC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCCStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Mincho Demibold", 0, 14)); // NOI18N
        jLabel4.setText("Total Sales");

        lblTMSales.setText("0 Thin Mints ($0)");

        lblSSales.setText("0 Somoas ($0)");

        lblCCSales.setText("0 C. Chip ($0)");

        btnTM.setText("Buy!");
        btnTM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTMActionPerformed(evt);
            }
        });

        btnS.setText("Buy!");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnCC.setText("Buy!");
        btnCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnTM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTM)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(lblEnabler))
                                        .addComponent(lblGSTitle))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(spnCC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCC))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnS)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTMSales)
                    .addComponent(lblSSales)
                    .addComponent(jLabel4)
                    .addComponent(lblCCSales))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblGSTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnabler)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spnTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTMSales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSSales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCCSales)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sells an amount of Thin Mints based on the user-specified spinner value,
     * then updates the label showing the quantity sold and profit total to the
     * user
     * @param evt The action being performed on button press 
     */
    private void btnTMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTMActionPerformed
        int spinnerCount = (int)spnTM.getValue();
       
        tracker.SellTM(spinnerCount);        
        int num = tracker.getTMNum();
        int sales = tracker.getTMSales();
        String data = String.format("%d Thin Mints ($%d)", num, sales);
        lblTMSales.setText(data);
    }//GEN-LAST:event_btnTMActionPerformed

    /**
     * Sells an amount of Chocolate Chip cookies based on the user-specified spinner value,
     * then updates the label showing the quantity sold and profit total to the
     * user
     * @param evt The action being performed on button press 
     */
    private void btnCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCActionPerformed
        int spinnerCount = (int)spnCC.getValue();
        
        tracker.SellCChip(spinnerCount);
        int num = tracker.getCCNum();
        int sales = tracker.getCCSales();
        String data = String.format("%d C. Chip ($%d)", num, sales);
        lblCCSales.setText(data);
    }//GEN-LAST:event_btnCCActionPerformed

    /**
     * Sells an amount of Somoas based on the user-specified spinner value,
     * then updates the label showing the quantity sold and profit total to the
     * user
     * @param evt The action being performed on button press 
     */
    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        int spinnerCount = (int)spnS.getValue();
        
        tracker.SellSomoa(spinnerCount);
        int num = tracker.getSNum();
        int sales = tracker.getSSales();
        String data = String.format("%d Somoas ($%d)", num, sales);
        lblSSales.setText(data);
        
    }//GEN-LAST:event_btnSActionPerformed


    private void spnTMStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTMStateChanged
    }//GEN-LAST:event_spnTMStateChanged

    private void spnSStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnSStateChanged
    }//GEN-LAST:event_spnSStateChanged

    private void spnCCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCCStateChanged
    }//GEN-LAST:event_spnCCStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GSCookieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GSCookieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GSCookieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GSCookieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GSCookieFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCC;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnTM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCCSales;
    private javax.swing.JLabel lblEnabler;
    private javax.swing.JLabel lblGSTitle;
    private javax.swing.JLabel lblSSales;
    private javax.swing.JLabel lblTMSales;
    private javax.swing.JSpinner spnCC;
    private javax.swing.JSpinner spnS;
    private javax.swing.JSpinner spnTM;
    // End of variables declaration//GEN-END:variables
}