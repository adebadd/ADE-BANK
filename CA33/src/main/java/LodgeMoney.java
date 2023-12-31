
import java.awt.Cursor;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Speed
 */
public class LodgeMoney extends javax.swing.JFrame {
 public static LodgeMoney Instance;
 

    /**
     * Creates new form AdeBankingDriver
     */
    public LodgeMoney() {

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
        iconlogement = new javax.swing.JLabel();
        lblexit = new javax.swing.JLabel();
        lbllogementdet = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblaccountnumber = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblDOT = new javax.swing.JLabel();
        jdcDOT = new com.toedter.calendar.JDateChooser();
        jbconfirmlodge = new javax.swing.JButton();
        jbcancellodge = new javax.swing.JButton();
        jComboBoxTT = new javax.swing.JComboBox<>();
        lbltransactionType = new javax.swing.JLabel();
        lblaccountLodged = new javax.swing.JLabel();
        lblaccountnum = new javax.swing.JLabel();
        jtfamountlodg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        iconlogement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logement.png"))); // NOI18N

        lblexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exiticon.png"))); // NOI18N
        lblexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
        });

        lbllogementdet.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lbllogementdet.setForeground(new java.awt.Color(255, 255, 255));
        lbllogementdet.setText("ENTER BANK LODGEMENT");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        lblaccountnumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblaccountnumber.setForeground(new java.awt.Color(255, 255, 255));
        lblaccountnumber.setText("Account Number:");

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        lblDOT.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblDOT.setForeground(new java.awt.Color(255, 255, 255));
        lblDOT.setText("Date of Transaction:");

        jdcDOT.setBackground(new java.awt.Color(0, 153, 204));
        jdcDOT.setForeground(new java.awt.Color(0, 153, 204));
        jdcDOT.setDateFormatString("dd-MM-yy");
        jdcDOT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jdcDOT.setMaxSelectableDate(new java.util.Date(1677632500000L));
        jdcDOT.setMinSelectableDate(new java.util.Date(1671670900000L));

        jbconfirmlodge.setBackground(new java.awt.Color(0, 153, 204));
        jbconfirmlodge.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbconfirmlodge.setForeground(new java.awt.Color(255, 255, 255));
        jbconfirmlodge.setText("CONFIRM LODGEMENT");
        jbconfirmlodge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbconfirmlodge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbconfirmlodgeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbconfirmlodgeMouseEntered(evt);
            }
        });
        jbconfirmlodge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbconfirmlodgeActionPerformed(evt);
            }
        });

        jbcancellodge.setBackground(new java.awt.Color(0, 153, 204));
        jbcancellodge.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbcancellodge.setText("CANCEL LODGEMENT");
        jbcancellodge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jbcancellodge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbcancellodgeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbcancellodgeMouseEntered(evt);
            }
        });
        jbcancellodge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancellodgeActionPerformed(evt);
            }
        });

        jComboBoxTT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBoxTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Logement" }));
        jComboBoxTT.setEnabled(false);

        lbltransactionType.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbltransactionType.setForeground(new java.awt.Color(255, 255, 255));
        lbltransactionType.setText("Transaction Type:");

        lblaccountLodged.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblaccountLodged.setForeground(new java.awt.Color(255, 255, 255));
        lblaccountLodged.setText("Amount Lodged:");

        lblaccountnum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblaccountnum.setForeground(new java.awt.Color(255, 255, 255));
        lblaccountnum.setText("33234");

        jtfamountlodg.setBackground(new java.awt.Color(0, 153, 204));
        jtfamountlodg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtfamountlodg.setText("0.00");
        jtfamountlodg.setBorder(null);
        jtfamountlodg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfamountlodgActionPerformed(evt);
            }
        });
        jtfamountlodg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfamountlodgKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDOT)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblaccountLodged)
                        .addComponent(jtfamountlodg)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator5)
                        .addComponent(jdcDOT, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTT, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltransactionType)
                    .addComponent(lblaccountnumber)
                    .addComponent(lblaccountnum))
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbconfirmlodge, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbcancellodge, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbllogementdet)
                        .addGap(252, 252, 252))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(iconlogement)
                        .addGap(346, 346, 346)
                        .addComponent(lblexit)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblexit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(iconlogement, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbllogementdet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDOT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jdcDOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbltransactionType, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblaccountLodged))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblaccountnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblaccountnum)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jtfamountlodg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcancellodge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbconfirmlodge, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  // <editor-fold defaultstate="collapsed" desc="Generated Code">                          


    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
        this.dispose();
        lblexit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblexitMouseClicked

    private void passwordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField2ActionPerformed

    private void jbconfirmlodgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbconfirmlodgeActionPerformed
          lblexit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        String custaccnum = ConfirmDetailsforLodgement.Instance.getNumberforlogement();
    
        String tempamount;
        tempamount = jtfamountlodg.getText();
        dateoftrans = ((JTextField) jdcDOT.getDateEditor().getUiComponent()).getText();
        amount = Double.parseDouble(tempamount); 
  
        transtype = "Lodgement Transaction";
        
          AccountTransactions foundAcc = AccountTransactions.accountexists(custaccnum);
         
          if (foundAcc != null){
          double existingcustbal = foundAcc.getCustomerBalance();
           double newbal = amount + existingcustbal;
         String texttranstype = foundAcc.getTransactionType();
    
        if (texttranstype.equals("")){
       foundAcc.setTransactionType(transtype);
       foundAcc.setTransactionDate(dateoftrans);
       foundAcc.setTransactionAmount(amount);
       foundAcc.setcustomerBalance(newbal);
        new LodgeSucess().setVisible(true);
        
        String forbal =String.valueOf(newbal);  
        LodgeSucess.Instance.getLblbalance().setText("€"+ forbal);
        this.dispose();
        new LodgeSucess().setVisible(true);
         LodgeSucess.Instance.getLblbalance().setText("€"+ forbal);
        
        }else{
            this.dispose();
              AccountTransactions newtransactions = new AccountTransactions (newbal, custaccnum, dateoftrans,transtype, amount);
             new LodgeSucess().setVisible(true);
             String forbal =String.valueOf(newbal);  
        LodgeSucess.Instance.getLblbalance().setText("€"+ forbal);
        }   
    }
        
    }//GEN-LAST:event_jbconfirmlodgeActionPerformed

    private void jbcancellodgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancellodgeActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbcancellodgeActionPerformed

    private void jtfamountlodgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfamountlodgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfamountlodgActionPerformed

    private void jtfamountlodgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfamountlodgKeyTyped
       char c = evt.getKeyChar();
       
       if (!Character.isDigit(c)){
       evt.consume();
       
       }
       
    }//GEN-LAST:event_jtfamountlodgKeyTyped

    private void jbconfirmlodgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbconfirmlodgeMouseClicked
        
        String custaccnum = ConfirmDetailsforLodgement.Instance.getNumberforlogement();
    
        String tempamount;
        tempamount = jtfamountlodg.getText();
        dateoftrans = ((JTextField) jdcDOT.getDateEditor().getUiComponent()).getText();
        amount = Double.parseDouble(tempamount); 
  
        transtype = "Lodgement Transaction";
        
          AccountTransactions foundAcc = AccountTransactions.accountexists(custaccnum);
         
          if (foundAcc != null){
          double existingcustbal = foundAcc.getCustomerBalance();
           double newbal = amount + existingcustbal;
         String texttranstype = foundAcc.getTransactionType();
       foundAcc.setTransactionType(transtype);
       foundAcc.setTransactionDate(dateoftrans);
       foundAcc.setTransactionAmount(amount);
       foundAcc.setcustomerBalance(newbal);
        String forbal =String.valueOf(newbal);  
        this.dispose();
        new LodgeSucess().setVisible(true);
         LodgeSucess.Instance.getLblbalance().setText("€"+ forbal);
            this.dispose();
            
            if (!texttranstype.equals("")){

              AccountTransactions newtransactions = new AccountTransactions (newbal, custaccnum, dateoftrans,transtype, amount);
             new LodgeSucess().setVisible(true);
        LodgeSucess.Instance.getLblbalance().setText("€"+ forbal);
        this.dispose();
        
            }
        
    }
        
        
    }//GEN-LAST:event_jbconfirmlodgeMouseClicked

    private void jbconfirmlodgeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbconfirmlodgeMouseEntered
  jbconfirmlodge.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));       
    }//GEN-LAST:event_jbconfirmlodgeMouseEntered

    private void jbcancellodgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcancellodgeMouseClicked
  jbcancellodge.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));       
    }//GEN-LAST:event_jbcancellodgeMouseClicked

    private void jbcancellodgeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbcancellodgeMouseEntered
    jbcancellodge.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbcancellodgeMouseEntered


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

                new LodgeMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconlogement;
    private javax.swing.JComboBox<String> jComboBoxTT;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbcancellodge;
    private javax.swing.JButton jbconfirmlodge;
    private com.toedter.calendar.JDateChooser jdcDOT;
    private javax.swing.JTextField jtfamountlodg;
    private javax.swing.JLabel lblDOT;
    private javax.swing.JLabel lblaccountLodged;
    private javax.swing.JLabel lblaccountnum;
    private javax.swing.JLabel lblaccountnumber;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lbllogementdet;
    private javax.swing.JLabel lbltransactionType;
    // End of variables declaration//GEN-END:variables
  private String numberforlodgement;
private String dateoftrans;
private double amount;
private String transtype; 

    public JLabel getLblaccountnum() {
        return lblaccountnum;
    }

    public void setLblaccountnum(JLabel lblaccountnum) {
        this.lblaccountnum = lblaccountnum;
    }
    

  
  

}
