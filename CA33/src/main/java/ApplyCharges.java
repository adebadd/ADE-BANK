
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Speed
 */
public class ApplyCharges extends javax.swing.JFrame {

    ArrayList<Customer> Customerinfo = new ArrayList<>();
    public static ApplyCharges Instance;
    /**
     * Creates new form AdeBankingDriver
     */
    public ApplyCharges() {

        initComponents();
        Instance = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        iconprofile = new javax.swing.JLabel();
        lblcustomerlogin = new javax.swing.JLabel();
        lblaccount = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        btnconfirm = new javax.swing.JButton();
        lblexit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cbtranstype = new javax.swing.JComboBox<>();
        jtfchargeamount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        iconprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logement.png"))); // NOI18N

        lblcustomerlogin.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblcustomerlogin.setForeground(new java.awt.Color(255, 255, 255));
        lblcustomerlogin.setText("APPLY BANK CHARGES");

        lblaccount.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblaccount.setForeground(new java.awt.Color(255, 255, 255));
        lblaccount.setText("Transaction Type");

        lblpass.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Charge Amount");

        btnconfirm.setBackground(new java.awt.Color(2, 94, 144));
        btnconfirm.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirm.setText("CONFIRM");
        btnconfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnconfirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnconfirmMouseEntered(evt);
            }
        });
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        lblexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exiticon.png"))); // NOI18N
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Enter the Transaction type and the amount the charge will take");

        cbtranstype.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        cbtranstype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lodgement", "Withdrawl" }));

        jtfchargeamount.setBackground(new java.awt.Color(0, 153, 204));
        jtfchargeamount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtfchargeamount.setText("0.00");
        jtfchargeamount.setBorder(null);
        jtfchargeamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfchargeamountActionPerformed(evt);
            }
        });
        jtfchargeamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfchargeamountKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblpass)
                            .addComponent(lblaccount)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(cbtranstype, 0, 305, Short.MAX_VALUE)
                            .addComponent(jtfchargeamount))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(iconprofile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblexit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblcustomerlogin)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(iconprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcustomerlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblexit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblaccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbtranstype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfchargeamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  // <editor-fold defaultstate="collapsed" desc="Generated Code">                          


    private void passwordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField2ActionPerformed

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
        this.dispose();
        lblexit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblexitMouseClicked

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void btnconfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconfirmMouseEntered
        btnconfirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_btnconfirmMouseEntered

    private void btnconfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnconfirmMouseClicked
   int transactionT;
   String charge;
   String Trans1 = "";
   double currentbalance;

   
   
        transactionT = cbtranstype.getSelectedIndex();
        if (transactionT == 0){
        Trans1 = "Lodgement Transaction";
        }
        else if (transactionT == 1){
        Trans1 = "Withdrawl Transaction";
        }
   charge = jtfchargeamount.getText();
   Double chargeamount = Double.valueOf(charge);
   
       if (transactionT == (-1)|| (charge.equals(""))){
   new ErrorFields().setVisible(true);
        } else {
        AccountTransactions foundTransactions = AccountTransactions.findTrasactions(Trans1);
        currentbalance = foundTransactions.getCustomerBalance();
        foundTransactions.setcustomerBalance(currentbalance - chargeamount);
       
       }
    }//GEN-LAST:event_btnconfirmMouseClicked

    private void jtfchargeamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfchargeamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfchargeamountActionPerformed

    private void jtfchargeamountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfchargeamountKeyTyped
        char c = evt.getKeyChar();
       
       if (!Character.isDigit(c)){
       evt.consume();
       
       }
    }//GEN-LAST:event_jtfchargeamountKeyTyped

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

                new ApplyCharges().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirm;
    private javax.swing.JComboBox<String> cbtranstype;
    private javax.swing.JLabel iconprofile;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jtfchargeamount;
    private javax.swing.JLabel lblaccount;
    private javax.swing.JLabel lblcustomerlogin;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblpass;
    // End of variables declaration//GEN-END:variables
private String customerDOBconfirm;
    private String customerpassconfirm;
private String accountNumber;
private String custname;
private String numberforbalance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustname() {
        return custname;
    }
    
    




}