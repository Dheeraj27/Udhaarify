package udhaarify;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class AddABill extends javax.swing.JFrame {
    //dheeraj DBvariables
    public String value1,value2,value3,value4,payee,payer;
    public String amt,desc,notes,billdate,get_names,get_remaining_names;
    public static int billID;
    //end of Dheeraj's variables
    static String[] peopleInBill;
    float amount[];
    static String[] final_string;
    static int counter;
    String[] friend_arr;
    String newFriend;
    
    int ctr = 0;
    int size;
    
   //raghu variables 
    
    private String amount_Str;
    private int index=0;
    
    private float[] amount_arr = new float[100]; //change to avoid exception
    private int size1= 0;
    private int size2= 0;
    private int size5= 0;
    
    private int[] index_paidBy = new int[100];
    private int[] index_splitBy = new int[100];
    private float[] paidByAmount = new float[100];
    private float[] splitByAmount = new float[100];
    int ctr1=0;
    int ctr2=0;

    public AddABill() {
        initComponents();
        getMySQLDropDown();
        jComboBox3.setEnabled(false);
        jComboBox4.setEnabled(false);
        jComboBox1.setEnabled(true);
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jTextField1.setEnabled(false);
        jTextField8.setEnabled(false);
        jButton2.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false); //con
        jComboBox1.setEnabled(false);//con
        jButton10.setEnabled(false); //con
        jButton3.setEnabled(false); //con
        jButton7.setEnabled(false); //con
        jButton8.setEnabled(false); //con
        jButton11.setEnabled(false);  //con
        jButton9.setEnabled(false);  //con
        jList2.setEnabled(false);  //con    
        jList5.setEnabled(false);   //con
        jList1.setEnabled(false);   //con
        jButton1.setEnabled(false); //con
        
        final_string = new String[100];
        counter = 0;
    }
 //Function to ger SQL Drop Down Working properly
    private void getMySQLDropDown(){
        try {
            jComboBox1.removeAllItems();
            get_names = "(select friend_username from friend where username = ?) UNION (select username from friend where friend_username = ?)";
            PreparedStatement st2 = MySQLConnection.getConnection().prepareStatement(get_names);
            st2.setString(1, LoginPage.username);
            st2.setString(2, LoginPage.username);
            String get_user = "select username from friend where username = ?";
            PreparedStatement st3 = MySQLConnection.getConnection().prepareStatement(get_user);
            st3.setString(1, LoginPage.username);
            ResultSet rs1 = st3.executeQuery();
            rs1.next();
            jComboBox1.addItem(rs1.getString(1));
            ResultSet rs = st2.executeQuery();
            while (rs.next()){
                jComboBox1.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            //Logger.getLogger(AddABill.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //final_string = new String[100];
        jButton7.setEnabled(false);
        jButton11.setEnabled(false);
        jButton10.setEnabled(false);
  
        friend_arr = new String[100];
        jList3.setEnabled(false);
        jList4.setEnabled(false);
        
        jButton9.setEnabled(false);
        jButton8.setEnabled(false);
        
        
        jTextField2.setDocument(new JTextFieldLimit(160));
        jTextArea2.setDocument(new JTextFieldLimit(160));
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 255));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jButton1.setText("Add bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("American Typewriter", 1, 36)); // NOI18N
        jLabel6.setText("Add A Bill");

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Add friends", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("American Typewriter", 0, 18))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ","Raghu", "Ayushman", "Dheeraj"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel8.setText("Friends added to the bill");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        jButton10.setText("Remove friend");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton3.setText("Customize Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jButton10))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jButton3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Enter bill description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("American Typewriter", 0, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("American Typewriter", 0, 16)); // NOI18N
        jLabel3.setText("Date");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.setToolTipText("d/M/yy");

        jLabel5.setFont(new java.awt.Font("American Typewriter", 0, 16)); // NOI18N
        jLabel5.setText("Bill amount");

        jTextField3.setToolTipText("Enter valid bill amount");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("American Typewriter", 0, 16)); // NOI18N
        jLabel2.setText("Description");

        jLabel4.setFont(new java.awt.Font("American Typewriter", 0, 16)); // NOI18N
        jLabel4.setText("Add notes");

        jTextField2.setToolTipText("Enter description");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setToolTipText("Enter notes");
        jScrollPane2.setViewportView(jTextArea2);

        jButton12.setText("Confirm");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(243, 243, 243))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jButton12)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Paid by", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("American Typewriter", 0, 18))); // NOI18N

        jCheckBox2.setText("Paid Equally");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList2);

        jScrollPane7.setViewportView(jList3);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel10.setText("Amount");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setText("Remove friend");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Confirm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel10))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Split Amongst", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("American Typewriter", 0, 18))); // NOI18N

        jCheckBox1.setText("Split Equally");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(jList5);

        jLabel12.setText("Amount");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        jScrollPane3.setViewportView(jList4);

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton11.setText("Remove friend");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton9.setText("Confirm");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 797, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //all elements of the graph are now initialised to zero
        amount = new float[size];
         ListModel model1 = jList2.getModel();
         int paid_size = model1.getSize();
         float equal_amt = (Float.parseFloat(jTextField3.getText()))/paid_size;

            
        if(jCheckBox2.isSelected()){ //paid by
            //divide by number of people
            
                      
            for(int i=0;i<paid_size;i++){
                for(int j=0;j<size;j++){
                    if(index_paidBy[i] == j){
                        amount[j]+= equal_amt; //added because incoming money they are creditors
                        break;
                    }
                }
                
            }
            
            
        }
        else{
            
            for(int i=0;i<paid_size;i++){
                for(int j=0;j<size;j++){
                    if(index_paidBy[i] == j){
                        amount[j]+= paidByAmount[i];
                        break;
                    }
                }
                
            }
        }
        
        ListModel model2 = jList5.getModel();
        int split_size = model2.getSize();
        float equal_amt2 = (Float.parseFloat(jTextField3.getText()))/split_size;

        
        
        if(jCheckBox1.isSelected()){ //split by
           //divide by number of people

            for(int i=0;i<split_size;i++){
                for(int j=0;j<size;j++){
                    if(index_splitBy[i] == j){
                        amount[j]-= equal_amt2; //added because incoming money they are creditors
                        break;
                    }
                }
                
            }
        }
        else{
            for(int i=0;i<split_size;i++){
                for(int j=0;j<size;j++){
                    if(index_splitBy[i] == j){
                        amount[j]-= splitByAmount[i];
                        break;
                    }
                }
                
            }
        }
        // now we have the net array
        //now we minimise cashflow
        
        // amount[p] indicates the net amount to be credited/debited to/from person 'p'
        // If amount[p] is positive, then i'th person will get amount[i]
        // If amount[p] is negative, then i'th person will give  -amount[i]

        minCashflowRec(amount);
        //SQLConnection here
        amt = jTextField3.getText();
        desc = jTextField2.getText();
        notes = jTextArea2.getText();
        billdate = jFormattedTextField1.getText();
        try {
            String bill_details = "insert into bill(bill_amt,description,notes,bill_date) values (?,?,?,?)";
            PreparedStatement st1 = MySQLConnection.getConnection().prepareStatement(bill_details);
            st1.setString(1, amt);
            st1.setString(2, desc);
            st1.setString(3, notes);
            st1.setString(4, billdate);
            st1.executeUpdate();
            //Debt
            //Bill_Payer_Update
            String get_bill_id = "select bill_id from bill where bill_ID = LAST_INSERT_ID()";
            PreparedStatement st3 = MySQLConnection.getConnection().prepareStatement(get_bill_id);
            ResultSet id = st3.executeQuery();
            id.next();
            billID = id.getInt(1);
            //billID is working properly
            ListModel user = jList5.getModel();
            ListModel amt = jList4.getModel();
            ListModel userp = jList2.getModel();
            ListModel amtp = jList3.getModel();
            for(int i =0;i<user.getSize();i++){
                value1 = user.getElementAt(i).toString();
                value2 = amt.getElementAt(i).toString();
                String Bill_Member_Update = "insert into bill_members values("+billID+",'"+value1+"','"+value2+"')";
                PreparedStatement st4 = MySQLConnection.getConnection().prepareStatement(Bill_Member_Update);
                st4.executeUpdate();
            }
            for(int i = 0; i<userp.getSize();i++){
                value3 = userp.getElementAt(i).toString();
                value4 = amtp.getElementAt(i).toString();
                String Bill_Payers_Update = "insert into bill_payers values("+billID+",'"+value3+"','"+value4+"')";
                PreparedStatement st5 = MySQLConnection.getConnection().prepareStatement(Bill_Payers_Update);
                st5.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Bill successfully added with Bill ID "+ billID + "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error");
            ex.printStackTrace();
        }
        this.dispose();
        new BillTransactions().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            jButton10.setEnabled(false);
            jList1.setEnabled(false);
            jList2.setEnabled(true);
            jList5.setEnabled(true);

        ListModel model = jList1.getModel();
        if(model.getSize()!=0){
        
            jButton10.setEnabled(false);
            jButton6.setEnabled(false);
            jList1.setEnabled(false);
            jComboBox3.setEnabled(true);
          //  jComboBox4.setEnabled(true);   //con
           // jCheckBox1.setEnabled(true);   //con
            jCheckBox2.setEnabled(true);
            jTextField1.setEnabled(true);
          //  jTextField8.setEnabled(true);   //con
            jButton2.setEnabled(true);
           // jButton5.setEnabled(true);//con
           jComboBox1.setEnabled(false);  //con
           jButton6.setEnabled(false);  //con
           jList1.setEnabled(false);  //con
           jButton10.setEnabled(false);  //con
           jButton3.setEnabled(false);
           jList2.setEnabled(true);  //con


             //extracting people from the list
            peopleInBill = new String[100];
            
            size = model.getSize();
            for(int i=0; i < size; i++)
                peopleInBill[i] =  model.getElementAt(i).toString();

            for(int i=0;i<size;i++){
                jComboBox3.insertItemAt((String)peopleInBill[i],index);
                jComboBox4.insertItemAt((String)peopleInBill[i],index);
                index++;
        
            }
        }
        else
            JOptionPane.showMessageDialog(null, "No friends added yet!");
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new Dashboard().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected() == false)
                    jTextField1.setEnabled(true);        // TODO add your handling code here:
        else
                    jTextField1.setEnabled(false);        // TODO add your handling code here:


    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jComboBox1.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Select a friend!");
            return;
        }
        jList1.setEnabled(true);
            jButton3.setEnabled(true);
            jButton10.setEnabled(true);

        DefaultListModel list = new DefaultListModel();
        ListModel duplicates = jList1.getModel();
       
        newFriend = (String)jComboBox1.getSelectedItem();
        int flag = 1;
        if(duplicates.getSize()!=0){
            for(int j=0;j<duplicates.getSize();j++){
                if(newFriend.equals((String)duplicates.getElementAt(j))){
                    flag = 0;
                    JOptionPane.showMessageDialog(null, "Friend already added!");
                    break;
                }
            }
            if(flag == 1){
                friend_arr[ctr] = newFriend;
                ctr++;
            }
        }
        else{
            friend_arr[ctr] = newFriend;
            ctr++;
        }
           for(int i=0;i<ctr;i++)
               list.addElement(friend_arr[i]);

           jList1.setModel(list);   
           // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected() == false)
                    jTextField8.setEnabled(true);        // TODO add your handling code here:
        else
                    jTextField8.setEnabled(false);        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        DefaultListModel list2 = new DefaultListModel();
        DefaultListModel list3 = new DefaultListModel();
   
        jCheckBox2.setEnabled(false);
        ListModel duplicates1 = jList2.getModel();
        newFriend = jComboBox3.getSelectedItem().toString();
        
        
            
                if(jCheckBox2.isSelected()){

                    int flag = 1;
                    if(duplicates1.getSize()!=0){
                        for(int j=0;j<duplicates1.getSize();j++){

                            if(newFriend.equals(duplicates1.getElementAt(j).toString())){
                                flag = 0;
                                JOptionPane.showMessageDialog(null, "Friend already added!");
                                return;
                            }
                        }
                        if(flag == 1)
                            friend_arr[ctr1++] = newFriend;            
                    }
                    else{
                        friend_arr[ctr1++] = newFriend;
                    }
                    for(int i=0;i<ctr1;i++)
                         list2.addElement(friend_arr[i]);

                    jList2.setModel(list2);

                    ListModel model6 = jList2.getModel();
                    int paid_size = model6.getSize();
                    float equal_amt = (Float.parseFloat(jTextField3.getText()))/paid_size;

                    for(int i=0;i<ctr1;i++)
                        list3.addElement(equal_amt);
                    jList3.setModel(list3);

             }
            else{
                   if(jTextField1.getText().toString().equals("")){
                       JOptionPane.showMessageDialog(null, "Please enter amount!");
                      return;
                   }
                   else{
                       int flag = 1;
                        if(duplicates1.getSize()!=0){
                            for(int j=0;j<duplicates1.getSize();j++){

                                if(newFriend.equals(duplicates1.getElementAt(j).toString())){
                                    flag = 0;
                                    JOptionPane.showMessageDialog(null, "Friend already added!");
                                    return;
                                }
                            }
                            if(flag == 1)
                                friend_arr[ctr1++] = newFriend;            
                        }
                        else{
                            friend_arr[ctr1++] = newFriend;
                        }
                     
                       amount_Str =jTextField1.getText().toString();

                       amount_arr[ctr1-1]=Float.parseFloat(amount_Str);
                      
                       for(int i=0;i<ctr1;i++)
                         list2.addElement(friend_arr[i]);

                       jList2.setModel(list2);
                       for(int i=0;i<ctr1;i++)
                           list3.addElement(amount_arr[i]);
                       jList3.setModel(list3);        // TODO add your handling code here:

                   }
            }
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultListModel model3 = (DefaultListModel)jList3.getModel();
        size2= model3.getSize();
        DefaultListModel model2 = (DefaultListModel)jList2.getModel();
        size1 = model2.getSize();
        float sum = 0;
        for(int i=0;i<size2;i++){
            sum += (float)model3.getElementAt(i);
        }
        if(Math.floor(sum)!=Integer.parseInt(jTextField3.getText().toString())){
            JOptionPane.showMessageDialog(null, "Total amount must match sum of individual amounts, retry!");
               model2.removeAllElements();
               model3.removeAllElements(); 
               jCheckBox2.setEnabled(true);
               
               friend_arr = new String[100];
               ctr1 = 0;
        }
        else{
        
             jCheckBox1.setEnabled(true);  //con
       jComboBox4.setEnabled(true);   //con
       jTextField8.setEnabled(true);  //com
       jButton5.setEnabled(true);  //comn
       jButton11.setEnabled(true); //con
       jList5.setEnabled(true);  //con
       jButton7.setEnabled(false); //con
       jButton2.setEnabled(false); //con
       jTextField1.setEnabled(false);  //con
       jComboBox3.setEnabled(false);  //con
        
            jList2.setEnabled(false);
            jList3.setEnabled(false);
            jButton8.setEnabled(false);
            

            for(int i=0; i < size1; i++){
                for(int j=0;j<size;j++){
                    if(peopleInBill[j]==(String)model2.getElementAt(i)){
                        index_paidBy[i] = j;
                        paidByAmount[i]= (float)model3.getElementAt(i);
                        break;
                    }
                }
            } 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton11.setEnabled(true);
        jButton9.setEnabled(true);
        DefaultListModel list5 = new DefaultListModel();
        DefaultListModel list4 = new DefaultListModel();
        jCheckBox1.setEnabled(false);
        ListModel duplicates2 = jList5.getModel();
        newFriend = jComboBox4.getSelectedItem().toString();
        
        
        if(jCheckBox1.isSelected()){
        
                int flag = 1;
                if(duplicates2.getSize()!=0){
                    for(int j=0;j<duplicates2.getSize();j++){
                        if(newFriend.equals(duplicates2.getElementAt(j).toString())){
                            flag = 0;
                            JOptionPane.showMessageDialog(null, "Friend already added!");
                            return;
                        }
                    }
                    if(flag == 1)
                        friend_arr[ctr2++] = newFriend;            
                }
                else{
                    friend_arr[ctr2++] = newFriend;
                }
                for(int i=0;i<ctr2;i++)
                     list5.addElement(friend_arr[i]);
                
                jList5.setModel(list5);
                
                ListModel model5 = jList5.getModel();
                int paid_size = model5.getSize();
                float equal_amt = (Float.parseFloat(jTextField3.getText()))/paid_size;
                
                for(int i=0;i<ctr2;i++)
                    list4.addElement(equal_amt);
                jList4.setModel(list4);
                
         }
         else{
                if(jTextField8.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter amount");
                    return;
                }
                else{
                    int flag = 1;
                    if(duplicates2.getSize()!=0){
                        for(int j=0;j<duplicates2.getSize();j++){
                            if(newFriend.equals(duplicates2.getElementAt(j).toString())){
                                flag = 0;
                                JOptionPane.showMessageDialog(null, "Friend already added!");
                                return;
                            }
                        }
                        if(flag == 1)
                            friend_arr[ctr2++] = newFriend;            
                    }
                    else{
                        friend_arr[ctr2++] = newFriend;
                    }
                    amount_Str =(String)jTextField8.getText();

                    amount_arr[ctr2-1]=Float.parseFloat(amount_Str);

                    for(int i=0;i<ctr2;i++)
                    { list5.addElement(friend_arr[i]);


                    }
                    jList5.setModel(list5);
                    for(int i=0;i<ctr2;i++)
                        list4.addElement(amount_arr[i]);
                    jList4.setModel(list4);        // TODO add your handling code here:
                }

         }
        
        
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultListModel model15 = (DefaultListModel)jList5.getModel();
        size2= model15.getSize();
        DefaultListModel model14 = (DefaultListModel)jList4.getModel();
        size1 = model14.getSize();
        float sum = 0;
        for(int i=0;i<size2;i++){
            sum += (float)model14.getElementAt(i);
        }
        if(Math.floor(sum)!=Integer.parseInt(jTextField3.getText().toString())){
            JOptionPane.showMessageDialog(null, "Total amount must match sum of individual amounts, retry!");
               model14.removeAllElements();
               model15.removeAllElements();
               jCheckBox1.setEnabled(true);
               friend_arr = new String[100];
               ctr2 = 0;
        }
        else{
             jCheckBox1.setEnabled(false);  //con
        jComboBox4.setEnabled(false);  //con
        jTextField8.setEnabled(false);   //con
        jButton5.setEnabled(false);   //con
        jButton11.setEnabled(false);   //con
        jButton1.setEnabled(true);  //con
            jList4.setEnabled(false);
            jList5.setEnabled(false);
            jButton9.setEnabled(false);

            ListModel model5 = jList5.getModel();
            size5 = model5.getSize();
            ListModel model4 = jList4.getModel();
            size2 = model4.getSize();
            for(int i=0; i < size5; i++){
                for(int j=0;j<size;j++){
                    if(peopleInBill[j]==(String)model5.getElementAt(i)){
                        index_splitBy[i] = j;
                        splitByAmount[i]= (float)model4.getElementAt(i);
                        break;
                    }
                }
            }       
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
   if(jTextField3.getText().equals("Enter bill amount"))
   {
       jTextField3.setText("");
   }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
      if(jTextField3.getText().equals(""))
  {
      jTextField3.setText("Enter bill amount");
  }   // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
   if(jTextField2.getText().equals("Enter description"))
   {
       jTextField2.setText("");
   }       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
if(jTextField2.getText().equals(""))
  {
      jTextField2.setText("Enter description");
  }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
                 // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
    int x;
        try {
        x = Integer.parseInt(jTextField3.getText());
    } catch (NumberFormatException nfe) {
        jTextField3.setText("");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultListModel l = (DefaultListModel)jList2.getModel();
        DefaultListModel m = (DefaultListModel)jList3.getModel();
        if(jList2.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(null, "Select a friend to remove an element!");
        
        else if(l.getSize() == 0)
                JOptionPane.showMessageDialog(null, "List empty, nothing to remove!");
       
        else{
        
                int selectedIndex = jList2.getSelectedIndex();
                String friend = l.getElementAt(selectedIndex).toString();
                if(selectedIndex!=-1){
                    l.remove(selectedIndex);// TODO add your handling code here:
                    m.remove(selectedIndex);

                    if(l.getSize() == 0){
                        jCheckBox2.setEnabled(true);
                        jButton8.setEnabled(false);
                    }



                    int flag = 0;
                    if(jCheckBox2.isSelected() == true){
                        flag = 1;
                        int paid_size = l.getSize();
                        float equal_amt = (Float.parseFloat(jTextField3.getText()))/paid_size;
                        m.removeAllElements();
                        if(paid_size!=0){
                           for(int i=0;i<paid_size;i++)
                                    m.addElement(equal_amt);
                        }
                        jList3.setModel(m);
                    }
                     for(int i=0;i<friend_arr.length;i++){
                        if(friend.equals(friend_arr[i])){
                            for(int j=i;j<friend_arr.length-1;j++){
                                friend_arr[j]=friend_arr[j+1];
                                if(flag == 0){
                                    amount_arr[j] = amount_arr[j+1];
                                }
                            }
                            ctr1--;
                        }
                    }

                }
            }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DefaultListModel l = (DefaultListModel)jList1.getModel();
        if(jList1.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(null, "Select a friend to remove an element!");
        }
        else if(l.getSize() ==0){
                JOptionPane.showMessageDialog(null, "List empty, nothing to remove!");
            }
        else{
                int selectedIndex = jList1.getSelectedIndex();
                String friend = l.getElementAt(selectedIndex).toString();
                if(selectedIndex!=-1){
                    l.remove(selectedIndex);// TODO add your handling code here:
                    // TODO add your handling code here:
                    for(int i=0;i<friend_arr.length;i++){
                        if(friend.equals(friend_arr[i])){
                            for(int j=i;j<friend_arr.length-1;j++)
                                friend_arr[j]=friend_arr[j+1];
                            ctr--;
                        }
                    }
                }       
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         DefaultListModel l = (DefaultListModel)jList5.getModel();
         DefaultListModel m = (DefaultListModel)jList4.getModel();
        if(jList5.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(null, "Select a friend to remove an element!");
        
        else if(l.getSize() == 0){
            JOptionPane.showMessageDialog(null, "List empty, nothing to remove!");
        }
        else{
            int selectedIndex = jList5.getSelectedIndex();
            String friend = l.getElementAt(selectedIndex).toString();
            if(selectedIndex!=-1){
                l.remove(selectedIndex);// TODO add your handling code here:
                m.remove(selectedIndex);
                if(l.getSize() == 0){
                    jCheckBox1.setEnabled(true);
                    jButton9.setEnabled(false);
                }


                int flag = 0;
                if(jCheckBox1.isSelected() == true){
                    flag = 1;
                    int paid_size = l.getSize();
                    float equal_amt = (Float.parseFloat(jTextField3.getText()))/paid_size;
                    m.removeAllElements();
                    if(paid_size!=0){
                       for(int i=0;i<paid_size;i++)
                                m.addElement(equal_amt);
                    }
                    jList4.setModel(m);
                }
                 for(int i=0;i<friend_arr.length;i++){
                    if(friend.equals(friend_arr[i])){
                        for(int j=i;j<friend_arr.length-1;j++){
                            friend_arr[j]=friend_arr[j+1];
                            if(flag == 0){
                                amount_arr[j] = amount_arr[j+1];
                            }
                        }
                        ctr2--;
                    }
                }

            }   // TODO add your handling code here:
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
int x;
        try {
        x = Integer.parseInt(jTextField1.getText());
    } catch (NumberFormatException nfe) {
        jTextField1.setText("");
    }          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        int x;
        try {
        x = Integer.parseInt(jTextField8.getText());
    } catch (NumberFormatException nfe) {
        jTextField8.setText("");
    }          // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(jFormattedTextField1.getText().isEmpty() || jTextField3.getText().isEmpty()|| jTextField2.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Bill Description Fields Can't be Empty!");
           
       }
     else{
         jFormattedTextField1.setEnabled(false);
         jTextField3.setEnabled(false);
         jTextField2.setEnabled(false);
         jTextArea2.setEnabled(false);
         jButton6.setEnabled(true);
         jComboBox1.setEnabled(true);
         jButton12.setEnabled(false);
         jList1.setEnabled(true); //con
         
        
                 
     }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the MAC look and feel */
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
            java.util.logging.Logger.getLogger(AddABill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddABill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddABill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddABill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddABill().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables

     void minCashflowRec(float[] amount) {
            // Find the indexes of minimum and maximum values in amount[]
            // amount[mxCredit] indicates the maximum amount to be given
            //                  (or credited) to any person .
            // And amount[mxDebit] indicates the maximum amount to be taken
            //                  (or debited) from any person.
            // So if there is a positive value in amount[], then there must
            // be a negative value
            
           
            
            int mxCredit = getMax(amount), mxDebit = getMin(amount);
            

            // If both amounts are 0, then all amounts are settled
            if ((amount[mxCredit] == 0 && amount[mxDebit] == 0) || (amount[mxDebit]>-1 && amount[mxDebit]<0) 
                    || (amount[mxCredit]>0 && amount[mxCredit]<1))
                return;
            

            // Find the minimum of two amounts
            float min = minOf2(-amount[mxDebit], amount[mxCredit]);
            amount[mxCredit] -= min;
            amount[mxDebit] += min;

            // If minimum is the maximum amount to be
            final_string[counter++] = peopleInBill[mxDebit]+ " has to pay " + (int)min + " to " + peopleInBill[mxCredit];
            add_into_debt(peopleInBill[mxDebit],peopleInBill[mxCredit],(int)min);
            
            // Recur for the amount array.  Note that it is guaranteed that
            // the recursion would terminate as either amount[mxCredit] 
            // or  amount[mxDebit] becomes 0
            minCashflowRec(amount);
    }
    // A utility function that returns index of minimum value in arr[]
        int getMin(float arr[])
        {
            int minInd = 0;
            for (int i=1; i<size; i++)
                if (arr[i] <= arr[minInd])
                    minInd = i;
            return minInd;
        }

        // A utility function that returns index of maximum value in arr[]
        int getMax(float arr[])
        {
            int maxInd = 0;
            for (int i=1; i<size; i++)
                if (arr[i] >=arr[maxInd])
                    maxInd = i;
            return maxInd;
        }

        // A utility function to return minimum of 2 values
        float minOf2(float x, float y)
        {
            return (x<=y)? x: y;
        }
        void add_into_debt(String p1, String p2, int at){
        try {
            int o_debt = 0;
            int o_debt2 = 0;
            String old_debt = "select amount from debt where payer = ? and payee = ? ";
            PreparedStatement old = MySQLConnection.getConnection().prepareStatement(old_debt);
            old.setString(1, p1);
            old.setString(2, p2);
            int n_debt = at;
            ResultSet rs1 = old.executeQuery();
            if(rs1.next()){
                o_debt = rs1.getInt(1);
                int ins_debt = n_debt + o_debt;
                String updateDebt = "update debt set amount = ? where payer = ? and payee = ?";
                PreparedStatement update = MySQLConnection.getConnection().prepareStatement(updateDebt);
                update.setString(1,ins_debt+"");
                update.setString(2, p1);
                update.setString(3, p2);
                update.executeUpdate();
                return;
}
            String old_debt2 = "select amount from debt where payer = ? and payee = ? ";
            PreparedStatement old2 = MySQLConnection.getConnection().prepareStatement(old_debt2);
            old2.setString(1, p2);
            old2.setString(2, p1);
            ResultSet rs2 = old2.executeQuery();
            int n_debt2 = at;
            if(rs2.next()){
                o_debt2 = rs2.getInt(1);
                int ins_debt2 = o_debt2 - n_debt2;
                String updateDebt2 = "update debt set amount = ? where payer = ? and payee = ? ";
                PreparedStatement update2 = MySQLConnection.getConnection().prepareStatement(updateDebt2);
                update2.setString(1, ins_debt2+"");
                update2.setString(2, p2);
                update2.setString(3, p1);
                update2.executeUpdate();
                return;
            }
            String newEntry = "insert into debt values('" + p1 + "','"+ p2 +"'," + at + ")";
            PreparedStatement nEntry = MySQLConnection.getConnection().prepareStatement(newEntry);
            nEntry.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddABill.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
