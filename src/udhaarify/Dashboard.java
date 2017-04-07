/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udhaarify;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class Dashboard extends javax.swing.JFrame {

    //dheeraj DB variables
    public static String[] friends;
    public String[] owe;
    public String[] owes;
    String check;
    String selected;
    String debugString;
    /**
     * Creates new form Dashboard
     */
    private String[] friend_arr = new String[100];
    private String newFriend;
    int ctr = 0;
    public Dashboard() {
        initComponents();
        friends = new String[20];
        owe = new String[20];
        owes = new String[20];
        debugString = " ";
        Arrays.fill(friends, null);
        Arrays.fill(owe, null);
        Arrays.fill(owes, null);
        friends[0]=debugString;
        removeZeroDebts();
        getSQLFriends();
        getSQLAddFList();
        removeSelfName();
        getDebtData();
        ButtonsCheck();
    }    
    public void ButtonsCheck(){
        if(friends[0].equals(debugString)){
            jButton8.setEnabled(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
        else{
            jButton8.setEnabled(true);
            jButton1.setEnabled(true);
            jButton2.setEnabled(true);
        }
    }
    public void getDebtData(){
        try {
            int i=0;
            int j=0;
            String owe_data = "select payee,amount from debt where payer = ?";
            PreparedStatement st = MySQLConnection.getConnection().prepareStatement(owe_data);
            st.setString(1, LoginPage.username);
            ResultSet rs = st.executeQuery();
                int at1 = 0;
                String frnd;
                String addString1;
                jList2.setFixedCellWidth(216);       
            while(rs.next()){
                frnd = rs.getString(1);
                at1 = rs.getInt(2);
                if(at1<0){
                    at1*=-1;
                    owes[j]= frnd+" owes you "+at1;
                    j++;
                    continue;
                }
                addString1 = "You owe "+at1+" to "+frnd;  
                owe[i]=addString1;
                i++;
            }
            jList2.setListData(owe); 
            String owes_data = "select payer,amount from debt where payee = ?";
            PreparedStatement st1 = MySQLConnection.getConnection().prepareStatement(owes_data);
            st1.setString(1, LoginPage.username);
            ResultSet rs1 = st1.executeQuery();
                int at2 = 0;
                String frnd2;
                String addString2;
                jList1.setFixedCellWidth(216);       
            while(rs1.next()){
                frnd2 = rs1.getString(1);
                at2 = rs1.getInt(2);
                if(at2<0){
                    at2*=-1;
                    owe[i]="You owe "+at2+" to "+frnd2;
                    i++;
                    continue;
                }
                addString2 = frnd2+" owes you "+at2;  
                owes[j]=addString2;
                j++;
            }
            jList1.setListData(owes);
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
        
    
       
    public void getSQLFriends(){
        try {
            String get_friends = "(select friend_username from friend where username = ?) UNION (select username from friend where friend_username = ?)";
            PreparedStatement st = MySQLConnection.getConnection().prepareStatement(get_friends);
            st.setString(1, LoginPage.username);
            st.setString(2, LoginPage.username);
            ResultSet rs = st.executeQuery();
            int i = 0;
            while(rs.next()){
             friends[i]=rs.getString(1);
             i++;
            }
            jList3.setFixedCellWidth(130);
            jList3.setListData(friends);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error fetchning from database");
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void getSQLAddFList(){
        try {
            jComboBox1.removeAllItems();
            String f_list = "select username from user where username not in (select friend_username from friend where username = '"+LoginPage.username+"' UNION select username from friend where friend_username = '"+LoginPage.username+"' and username <>'"+LoginPage.username+"')";
            PreparedStatement st1 = MySQLConnection.getConnection().prepareStatement(f_list);
            ResultSet rs1 = st1.executeQuery();
            while(rs1.next()){
                jComboBox1.addItem(rs1.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error");
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void removeSelfName(){
        for(int i = 0; i<jComboBox1.getItemCount();i++){
            check = jComboBox1.getItemAt(i);
            if(check.equals(LoginPage.username))
                jComboBox1.removeItemAt(i);
        }
    }
    public void removeZeroDebts(){
        try {
            String remove = "delete from debt where amount = 0";
            PreparedStatement stmt = MySQLConnection.getConnection().prepareStatement(remove);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 48)); // NOI18N
        jLabel1.setText("Dashboard");

        jComboBox1.setFont(new java.awt.Font("American Typewriter", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {" ","Raghu", "Ayushman", "Dheeraj", "Rick" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("American Typewriter", 0, 24)); // NOI18N
        jLabel4.setText("Friends");

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jList3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jList3.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList3);

        jLabel5.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel5.setText("Add friends");

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Add a bill");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 204, 255));
        jButton2.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton2.setText("Settle a bill");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 204, 255));
        jButton3.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton3.setText("View Bills");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 204, 255));
        jButton5.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton5.setText("View Account");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 204, 255));
        jButton6.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton6.setText("Log Out");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Remove friend");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("American Typewriter", 0, 24)); // NOI18N
        jLabel3.setText("What you owe");

        jList2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jList2.setFont(new java.awt.Font("American Typewriter", 0, 20)); // NOI18N
        jScrollPane3.setViewportView(jList2);

        jLabel2.setFont(new java.awt.Font("American Typewriter", 0, 24)); // NOI18N
        jLabel2.setText("What people owe you");

        jList1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jList1.setFont(new java.awt.Font("American Typewriter", 0, 20)); // NOI18N
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addContainerGap(54, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new AddABill().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        new AccountSettingsPage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       this.dispose(); // TODO add your handling code here:
       new LoginPage().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new settleUp().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
          try {
              if(jComboBox1.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "No more registered users!");
            return;
             }
              if(friends[0]==(debugString)){
                friends[0]=null;
              }
            int i=0;
            while(friends[i]!=null){
                i++;
            }
                selected = jComboBox1.getSelectedItem().toString();
                friends[i]=selected;
                ButtonsCheck();
            jList3.setListData(friends);
            //QUERY PART
            String add_friend = "insert into friend values( ? , ? )";
            PreparedStatement st = MySQLConnection.getConnection().prepareStatement(add_friend);
            st.setString(1, LoginPage.username);
            st.setString(2, selected.toString());
            st.executeUpdate();
            jComboBox1.removeItem(selected);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in adding");
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

            if(jList3.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(null, "Select/Add friend first!");
                return;
            }
            int i = jList3.getSelectedIndex();
            String removed = friends[i];
            if(removed.equals(debugString)){
             JOptionPane.showMessageDialog(null, "No friends to remove");
                return;
            }
            removed = friends[i];
            //Friend-Transaction check
            String query = "select * from debt where payer = ? and payee = ? UNION select * from debt where payer = ? and payee = ?";
        try {
            PreparedStatement st1 = MySQLConnection.getConnection().prepareStatement(query);
            st1.setString(1, removed);
            st1.setString(2, LoginPage.username);
            st1.setString(3, LoginPage.username);
            st1.setString(4, removed);
            ResultSet rs = st1.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "You need to clear your debts with "+removed+" before removing them as a friend");
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                jButton8.setVisible(true);
                while(friends[i]!=null){
                    friends[i]=friends[i+1];
                    i++;
                }
            friends[i]=null;
            
            jComboBox1.addItem(removed);
            jList3.setListData(friends);
             //Query here
            try{
            String rmv = "delete from friend where username = ? and friend_username = ? ";
            String rmv2 ="delete from friend where friend_username = ? and username = ? ";
            PreparedStatement st1 = MySQLConnection.getConnection().prepareStatement(rmv);
            st1.setString(1, LoginPage.username);
            st1.setString(2, removed);
            st1.executeUpdate();
            PreparedStatement st2 = MySQLConnection.getConnection().prepareStatement(rmv2);
            st2.setString(1, LoginPage.username);
            st2.setString(2, removed);
            st2.executeUpdate(); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in removing user");
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(friends[0]==null){
                friends[0]=debugString;
                ButtonsCheck();
                jList3.setListData(friends);
            }
            
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new ViewBills().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
                if ("MAC OS X".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
