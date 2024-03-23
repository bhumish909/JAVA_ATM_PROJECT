
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bhumish
 */
public class ATM extends javax.swing.JFrame {

    /**
     * Creates new form ATM
     */
    public ATM() {
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

        jLabel3 = new javax.swing.JLabel();
        logincardno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginsignin = new javax.swing.JButton();
        loginclear = new javax.swing.JButton();
        loginpassword = new javax.swing.JPasswordField();
        lofinsignup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Card no: ");

        logincardno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logincardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logincardnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Pin: ");

        loginsignin.setBackground(new java.awt.Color(0, 0, 0));
        loginsignin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginsignin.setForeground(new java.awt.Color(255, 255, 255));
        loginsignin.setText("SIGN IN");
        loginsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginsigninActionPerformed(evt);
            }
        });

        loginclear.setBackground(new java.awt.Color(0, 0, 0));
        loginclear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginclear.setForeground(new java.awt.Color(255, 255, 255));
        loginclear.setText("CLEAR");

        loginpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpasswordActionPerformed(evt);
            }
        });

        lofinsignup.setBackground(new java.awt.Color(0, 0, 0));
        lofinsignup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lofinsignup.setForeground(new java.awt.Color(255, 255, 255));
        lofinsignup.setText("SIGN UP");
        lofinsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lofinsignupActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ATM SERVICE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lofinsignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(logincardno, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                    .addComponent(loginpassword)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(loginsignin)
                                .addGap(71, 71, 71)
                                .addComponent(loginclear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logincardno))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(loginpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginsignin)
                    .addComponent(loginclear))
                .addGap(18, 18, 18)
                .addComponent(lofinsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logincardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logincardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logincardnoActionPerformed

    private void loginsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginsigninActionPerformed
        String username = "23456";
        String password = "23456";

        String enteredUsername = logincardno.getText();
        var enteredPassword = loginpassword.getText();

        if (username.equals(enteredUsername) && password.equals(enteredPassword)) {

            JOptionPane.showMessageDialog(this, "Login successful");

            setVisible(false);
            new ATM_TRANSACTION().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Invalid username or password");

        }
    }//GEN-LAST:event_loginsigninActionPerformed

    private void loginpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginpasswordActionPerformed

    private void lofinsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lofinsignupActionPerformed
        new SIGNUP().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lofinsignupActionPerformed

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
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ATM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ATM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lofinsignup;
    private javax.swing.JTextField logincardno;
    private javax.swing.JButton loginclear;
    private javax.swing.JPasswordField loginpassword;
    private javax.swing.JButton loginsignin;
    // End of variables declaration//GEN-END:variables
}
