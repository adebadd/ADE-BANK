import java.awt.Cursor;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Speed
 */
public class ErrorCustomer extends javax.swing.JFrame {
boolean isclicked = false;
 
    /**
     * Creates new form AdeBankingDriver
     */
    public ErrorCustomer() {
 

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

        jpError = new javax.swing.JPanel();
        iconerror = new javax.swing.JLabel();
        lblexit1 = new javax.swing.JLabel();
        lblerrorwarn = new javax.swing.JLabel();
        lblerrorwarn1 = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        setUndecorated(true);

        jpError.setBackground(new java.awt.Color(0, 153, 204));
        jpError.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        iconerror.setIcon(new javax.swing.ImageIcon(getClass().getResource("/erroricon3.png"))); // NOI18N

        lblexit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exiticon.png"))); // NOI18N
        lblexit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexit1MouseClicked(evt);
            }
        });

        lblerrorwarn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblerrorwarn.setForeground(new java.awt.Color(255, 255, 255));
        lblerrorwarn.setText("Incorrect date of birth or password entered");

        lblerrorwarn1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblerrorwarn1.setForeground(new java.awt.Color(255, 255, 255));
        lblerrorwarn1.setText("please try again.");

        btnok.setBackground(new java.awt.Color(2, 94, 144));
        btnok.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setText("Try Again");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpErrorLayout = new javax.swing.GroupLayout(jpError);
        jpError.setLayout(jpErrorLayout);
        jpErrorLayout.setHorizontalGroup(
            jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpErrorLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpErrorLayout.createSequentialGroup()
                        .addComponent(iconerror)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpErrorLayout.createSequentialGroup()
                        .addComponent(lblerrorwarn)
                        .addGap(33, 33, 33)))
                .addComponent(lblexit1)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpErrorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblerrorwarn1)
                    .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );
        jpErrorLayout.setVerticalGroup(
            jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpErrorLayout.createSequentialGroup()
                .addGroup(jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpErrorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblexit1))
                    .addGroup(jpErrorLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(iconerror)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblerrorwarn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblerrorwarn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnok)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField2ActionPerformed

    private void lblexit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexit1MouseClicked
       this.dispose();
        lblexit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblexit1MouseClicked

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
           this.dispose();
        lblexit1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btnokActionPerformed

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
            java.util.logging.Logger.getLogger(AdeBankingDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdeBankingDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdeBankingDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdeBankingDriver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new ErrorCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JLabel iconerror;
    private javax.swing.JPanel jpError;
    private javax.swing.JLabel lblerrorwarn;
    private javax.swing.JLabel lblerrorwarn1;
    private javax.swing.JLabel lblexit1;
    // End of variables declaration//GEN-END:variables




}
