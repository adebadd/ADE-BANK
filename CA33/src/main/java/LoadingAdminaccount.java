import java.awt.Cursor;
import java.util.concurrent.TimeUnit;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Speed
 */
public class LoadingAdminaccount extends javax.swing.JFrame {
boolean isclicked = false;
 
    /**
     * Creates new form AdeBankingDriver
     */
    public LoadingAdminaccount() {
 

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
        lblerrorwarn1 = new javax.swing.JLabel();
        iconerror = new javax.swing.JLabel();
        lblexit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 153));
        setUndecorated(true);

        jpError.setBackground(new java.awt.Color(0, 153, 204));
        jpError.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblerrorwarn1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        lblerrorwarn1.setForeground(new java.awt.Color(255, 255, 255));
        lblerrorwarn1.setText("ADMINISTATOR ACCOUNT CREATED");

        iconerror.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profileadd0.png"))); // NOI18N

        lblexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exiticon.png"))); // NOI18N
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpErrorLayout = new javax.swing.GroupLayout(jpError);
        jpError.setLayout(jpErrorLayout);
        jpErrorLayout.setHorizontalGroup(
            jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpErrorLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(lblerrorwarn1)
                .addGap(57, 57, 57))
            .addGroup(jpErrorLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(iconerror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblexit)
                .addContainerGap())
        );
        jpErrorLayout.setVerticalGroup(
            jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpErrorLayout.createSequentialGroup()
                .addGroup(jpErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpErrorLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(iconerror)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jpErrorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblexit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblerrorwarn1)
                .addGap(35, 35, 35))
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

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
 this.dispose();
      lblexit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));       
    }//GEN-LAST:event_lblexitMouseClicked

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
                
                new LoadingAdminaccount().setVisible(true);
                 try{
                    TimeUnit.SECONDS.sleep(5);}

                catch(InterruptedException e) {}

            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconerror;
    private javax.swing.JPanel jpError;
    private javax.swing.JLabel lblerrorwarn1;
    private javax.swing.JLabel lblexit;
    // End of variables declaration//GEN-END:variables




}
