/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bhumish
 */
public class ATM_TRANSACTION extends javax.swing.JFrame {

    /**
     * Creates new form ATM_TRANSACTION
     */
    public ATM_TRANSACTION() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transactionpinchange = new javax.swing.JButton();
        transactionbalance = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        transactiondeposite = new javax.swing.JButton();
        transactionwithdrawl = new javax.swing.JButton();
        transactionfastcash = new javax.swing.JButton();
        transactionmini = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        transactionpinchange.setBackground(new java.awt.Color(0, 0, 0));
        transactionpinchange.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transactionpinchange.setForeground(new java.awt.Color(255, 255, 255));
        transactionpinchange.setText("PIN CHANGE");
        transactionpinchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionpinchangeActionPerformed(evt);
            }
        });

        transactionbalance.setBackground(new java.awt.Color(0, 0, 0));
        transactionbalance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transactionbalance.setForeground(new java.awt.Color(255, 255, 255));
        transactionbalance.setText("BANALCE ENQUIRY");
        transactionbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionbalanceActionPerformed(evt);
            }
        });

        jButton7.setText("! EXIT !");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("SELECT YOUR TRANSACTION");

        transactiondeposite.setBackground(new java.awt.Color(0, 0, 0));
        transactiondeposite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transactiondeposite.setForeground(new java.awt.Color(255, 255, 255));
        transactiondeposite.setText("CASH DEPOSIT");
        transactiondeposite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactiondepositeActionPerformed(evt);
            }
        });

        transactionwithdrawl.setBackground(new java.awt.Color(0, 0, 0));
        transactionwithdrawl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transactionwithdrawl.setForeground(new java.awt.Color(255, 255, 255));
        transactionwithdrawl.setText("CASH WITHDRAWL");
        transactionwithdrawl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionwithdrawlActionPerformed(evt);
            }
        });

        transactionfastcash.setBackground(new java.awt.Color(0, 0, 0));
        transactionfastcash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transactionfastcash.setForeground(new java.awt.Color(255, 255, 255));
        transactionfastcash.setText("FAST CASH");
        transactionfastcash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionfastcashActionPerformed(evt);
            }
        });

        transactionmini.setBackground(new java.awt.Color(0, 0, 0));
        transactionmini.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        transactionmini.setForeground(new java.awt.Color(255, 255, 255));
        transactionmini.setText("MINI STATEMENT");
        transactionmini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionminiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionpinchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionfastcash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactiondeposite, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionwithdrawl, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(transactionmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transactionbalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactiondeposite, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transactionwithdrawl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionfastcash, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(transactionmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transactionpinchange, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(transactionbalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transactionpinchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionpinchangeActionPerformed
        setVisible(false);
        new PIN_CHANGE().setVisible(true);

    }//GEN-LAST:event_transactionpinchangeActionPerformed

    private void transactionbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionbalanceActionPerformed
        setVisible(false);
        new BALANCE_ENQUIRY().setVisible(true);

    }//GEN-LAST:event_transactionbalanceActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new ATM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void transactiondepositeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactiondepositeActionPerformed
        new DEPOSIT().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transactiondepositeActionPerformed

    private void transactionwithdrawlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionwithdrawlActionPerformed
        setVisible(false);
        new WITHDRAW().setVisible(true);
    }//GEN-LAST:event_transactionwithdrawlActionPerformed

    private void transactionfastcashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionfastcashActionPerformed
        setVisible(false);
        new FAST_CASH().setVisible(true);
    }//GEN-LAST:event_transactionfastcashActionPerformed

    private void transactionminiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionminiActionPerformed
        setVisible(false);
        new MINI_STATEMENT().setVisible(true);

    }//GEN-LAST:event_transactionminiActionPerformed

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
            java.util.logging.Logger.getLogger(ATM_TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM_TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM_TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM_TRANSACTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ATM_TRANSACTION().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton transactionbalance;
    private javax.swing.JButton transactiondeposite;
    private javax.swing.JButton transactionfastcash;
    private javax.swing.JButton transactionmini;
    private javax.swing.JButton transactionpinchange;
    private javax.swing.JButton transactionwithdrawl;
    // End of variables declaration//GEN-END:variables
}
