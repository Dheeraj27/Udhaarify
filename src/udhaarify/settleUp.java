package udhaarify;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.awt.Desktop;
import java.net.URI;
import java.sql.*;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.ComboBoxModel;

public class settleUp extends javax.swing.JFrame {

    /**
     * Creates new form settleUp
     */
    public int flag;
    // flag = 1 => I'm getting paid
    // flag = 0 => I'm paying   
    public int DBFlag;
    // DBFlag = 0 => payer
    // DBFlag = 1 => payee
    String friend = new String();
    public settleUp() {
        initComponents();
          jButton3.setEnabled(false);  
                            
            jRadioButton3.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent arg0) {
                    jButton3.setEnabled(true);
                    jRadioButton4.addActionListener((ActionEvent arg) -> {
                jButton3.setEnabled(false);
            }); 
                    
            
}
});
            jRadioButton3.setEnabled(false);
            jRadioButton4.setEnabled(false);
            jTextField1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
            getSQLData();
            flag = -1;
            DBFlag = -1;
}
  void getSQLData(){
        jComboBox1.removeAllItems();
        int i=0;
        while(Dashboard.friends[i]!=null){
            jComboBox1.addItem(Dashboard.friends[i]);
            i++;
        }
  }
  void doTransaction(){
      if(jRadioButton3.isSelected() == true)
            flag = 0;
        else
            flag = 1;
        try {
  
            friend = jComboBox1.getSelectedItem().toString();
            int tAmount = Integer.parseInt(jTextField1.getText());
            // flag = 1 => I'm getting paid
            // flag = 0 => I'm paying
            // DBFlag = 0 => payer
            // DBFlag = 1 => payee
            //Getting old debt first to get DBFlag value
            int old_debt;
            int new_debt;
                       
            String getOldDebt1 = "select amount from debt where payer = ? and payee = ?";  
            String getOldDebt2 = "select amount from debt where payer = ? and payee = ?";
            PreparedStatement s1 = MySQLConnection.getConnection().prepareStatement(getOldDebt1);
            PreparedStatement s2 = MySQLConnection.getConnection().prepareStatement(getOldDebt2);
            s1.setString(1, friend);
            s1.setString(2, LoginPage.username);
            s2.setString(1, LoginPage.username);
            s2.setString(2, friend);
            ResultSet rs1 = s1.executeQuery();
            ResultSet rs2 = s2.executeQuery();
            
            if(rs1.next()){
                DBFlag =1;
                old_debt = rs1.getInt(1);
            }
            else if(rs2.next()){
                DBFlag = 0;
                old_debt = rs2.getInt(1);
            }
            
            else{
                //CASE 1 : NO OLD DEBT EXISTS and I'm getting paid
                if(flag==1){
                String nEntry1 = "insert into debt values('"+LoginPage.username+"','" + friend + "',"+tAmount+")";
                PreparedStatement case1 = MySQLConnection.getConnection().prepareStatement(nEntry1);
                case1.executeUpdate();
                }
                //CASE 6 : NO OLD DEBT AND I'm paying
                if(flag==0){
                String nEntry2 = "insert into debt values('" + friend + "','" + LoginPage.username + "',"+tAmount+")";
                PreparedStatement case6 = MySQLConnection.getConnection().prepareStatement(nEntry2);
                case6.executeUpdate();
                }
                return;
            }
            //CASE 2 : I'm getting paid [user in payer table]
                if(flag==1 && DBFlag==0 ){
                    new_debt = old_debt + tAmount;
                
                    String debt2 = "update debt set amount = ? where payer = ? and payee = ?";
                    PreparedStatement case2 = MySQLConnection.getConnection().prepareStatement(debt2);
                    case2.setString(1, new_debt+"");
                    case2.setString(2, LoginPage.username);
                    case2.setString(3, friend);
                    case2.executeUpdate();
                }
                //CASE 3 : I'm getting paid [user in payee table]
                if(flag==1 && DBFlag == 1){
                    new_debt = old_debt - tAmount;
                    
                    String debt3 = "update debt set amount = ? where payer = ? and payee = ?";
                    PreparedStatement case3 = MySQLConnection.getConnection().prepareStatement(debt3);
                    case3.setString(1, new_debt+"");
                    case3.setString(2, friend);
                    case3.setString(3, LoginPage.username);
                    case3.executeUpdate();
                }
            //CASE 4 : I'm paying [user in payer table]
            if(flag==0 && DBFlag == 0){
                new_debt = old_debt - tAmount;
                    
                    String debt4 = "update debt set amount = ? where payer = ? and payee = ?";
                    PreparedStatement case4 = MySQLConnection.getConnection().prepareStatement(debt4);
                    case4.setString(1, new_debt+"");
                    case4.setString(2, LoginPage.username);
                    case4.setString(3, friend);
                    case4.executeUpdate();
            }
            //CASE 5 : I'm paying [user in payee table]
            if(flag==0 && DBFlag == 1){
                new_debt = old_debt + tAmount;
                
                    String debt5 = "update debt set amount = ? where payer = ? and payee = ?";
                    PreparedStatement case5 = MySQLConnection.getConnection().prepareStatement(debt5);
                    case5.setString(1, new_debt+"");
                    case5.setString(2, friend);
                    case5.setString(3, LoginPage.username);
                    case5.executeUpdate();
            }
            
  }catch (SQLException ex) {
            Logger.getLogger(settleUp.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton2.setText("Record Cash Transaction");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton3.setText("Pay by Paytm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel3.setText("Settle Up");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Enter Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("American Typewriter", 0, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel1.setText("Select Friend");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ","Ayushman", "Raghu", "Dheeraj" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("American Typewriter", 2, 14)); // NOI18N
        jRadioButton3.setText("I am paying");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("American Typewriter", 2, 14)); // NOI18N
        jRadioButton4.setText("I am getting paid");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel2.setText("Enter Amount    ₹");

        jButton4.setText("Confirm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(12, 12, 12)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if((jRadioButton3.isSelected() == false && jRadioButton4.isSelected() ==false)){
            JOptionPane.showMessageDialog(null, "Select whether paying or receiving");
            return;
        }
        else if(jTextField1.getText().toString().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter amount!");
            return;
        }
        // flag = 1 => I'm getting paid
        // flag = 0 => I'm paying   
        if(jRadioButton3.isSelected() == true)
            flag = 0;
        else
            flag = 1;
        
        int amt = Integer.parseInt(jTextField1.getText());
        doTransaction();
        JOptionPane.showMessageDialog(null, "Transaction successfully recorded!");
       int result = JOptionPane.showConfirmDialog(null, "Add another transaction?");
       if(result == JOptionPane.YES_OPTION){
                this.dispose();
                new settleUp().setVisible(true);
            }
       else if(result == JOptionPane.NO_OPTION){
                this.dispose();
                new Dashboard().setVisible(true);
            }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField1.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter amount to pay!");
            return;
        }
        if(Desktop.isDesktopSupported()){
           try {
               Desktop.getDesktop().browse(new URI("https://accounts.paytm.com/oauth2/authorize?theme=mp-web&redirect_uri=https%3A%2F%2Fpaytm.com%2Fv1%2Fapi%2Fcode&is_verification_excluded=false&client_id=paytm-web&type=web_server&scope=paytm&response_type=code#/login"));
           } catch (IOException ex) {
               Logger.getLogger(settleUp.class.getName()).log(Level.SEVERE, null, ex);
           } catch (URISyntaxException ex) {
               Logger.getLogger(settleUp.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       int result = JOptionPane.showConfirmDialog(null, "Was your transaction successful?");
       if(result == JOptionPane.YES_OPTION){
                doTransaction();
                JOptionPane.showMessageDialog(null, "Transaction recorded");
            int result2 = JOptionPane.showConfirmDialog(null, "Add another transaction?");
            if(result2 == JOptionPane.YES_OPTION){
                this.dispose();
                new settleUp().setVisible(true);
            }
            else if(result2 == JOptionPane.NO_OPTION){
                this.dispose();
                new Dashboard().setVisible(true);
            }
       }
       else if(result == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Transaction cancelled.");
                    int result2 = JOptionPane.showConfirmDialog(null, "Add another transaction?");
                if(result2 == JOptionPane.YES_OPTION){
                    this.dispose();
                    new settleUp().setVisible(true);
                }
                else if(result2 == JOptionPane.NO_OPTION){
                    this.dispose();
                    new Dashboard().setVisible(true);
                }
       }
       
       
       
    }//GEN-LAST:event_jButton3ActionPerformed
        
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Dashboard().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jComboBox1.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Enter friend first!");
            return;
        }
        else{
            jRadioButton3.setEnabled(true);
            jRadioButton4.setEnabled(true);
            jTextField1.setEnabled(true);
            jButton2.setEnabled(true);

            jComboBox1.setEnabled(false);        // TODO add your handling code here:
          
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        int x;
        try {
        x = Integer.parseInt(jTextField1.getText());
    } catch (NumberFormatException nfe) {
        jTextField1.setText("");
    }          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
    }//GEN-LAST:event_jTextField1KeyTyped

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
                if ("Mac OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
           
       
        
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(settleUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settleUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settleUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settleUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new settleUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
   

}
     
   
    

