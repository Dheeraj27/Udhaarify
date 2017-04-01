package udhaarify;

import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class AddABill extends javax.swing.JFrame {

    String[] peopleInBill;
    float amount[];
    static String[] final_string;
    static int counter = 0;
    String[] friend_arr = new String[100];
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
    private String amound_paid;
    
    int ctr1=0;
    int ctr2=0;

    
    public AddABill() {
        initComponents();
        jComboBox3.setEnabled(false);
        jComboBox4.setEnabled(false);
        
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jTextField9.setEnabled(false);
        jTextField8.setEnabled(false);
        jButton2.setEnabled(false);
        jButton5.setEnabled(false);
        
        
  
        
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel1.setText("Add friends");

        jButton1.setFont(new java.awt.Font("American Typewriter", 2, 18)); // NOI18N
        jButton1.setText("Add bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ","Raghu", "Ayushman", "Dheeraj"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Description");

        jLabel3.setText("Date");

        jTextField2.setText("Enter description");

        jLabel4.setText("Add notes");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setText("Bill amount");

        jTextField3.setText("Enter bill amount");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel6.setText("Add a Bill");

        jButton3.setText("Customize Bill");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel8.setText("Friends added to the bill");

        jLabel9.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel9.setText("Paid by");

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("American Typewriter", 0, 18)); // NOI18N
        jLabel11.setText("Split amongst");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Split Equally");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Paid Equally");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Add friend");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        jScrollPane1.setViewportView(jList2);

        jButton8.setText("Confirm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Confirm");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jList4);

        jScrollPane4.setViewportView(jList5);

        jScrollPane7.setViewportView(jList3);

        jLabel10.setText("Amount");

        jLabel12.setText("Amount");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jButton7.setText("Delete friend");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel7.setText("---------------------------------------------------------------------------------------");

        jLabel13.setText("---------------------------------------------------------------------------------------");

        jButton10.setText("Remove friend");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Delete friend");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jCheckBox2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel10)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton8)
                                                    .addComponent(jButton7)))))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jCheckBox1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton9)
                                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton9)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        
        JOptionPane.showMessageDialog(null, "Bill successfully added");
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
        jButton6.setEnabled(false);
        jList1.setEnabled(false);
        jComboBox3.setEnabled(true);
        jComboBox4.setEnabled(true);
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jTextField9.setEnabled(true);
        jTextField8.setEnabled(true);
        jButton2.setEnabled(true);
        jButton5.setEnabled(true);
        
        
         //extracting people from the list
        peopleInBill = new String[100];
        ListModel model = jList1.getModel();
        size = model.getSize();
        for(int i=0; i < size; i++)
            peopleInBill[i] =  (String)(model.getElementAt(i));
        
        for(int i=0;i<peopleInBill.length;i++){
        jComboBox3.insertItemAt((String)peopleInBill[i],index);
        jComboBox4.insertItemAt((String)peopleInBill[i],index);
        index++;
        
        }
        
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        new Dashboard().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if(jCheckBox2.isSelected() == false)
                    jTextField9.setEnabled(true);        // TODO add your handling code here:
        else
                    jTextField9.setEnabled(false);        // TODO add your handling code here:


    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultListModel list = new DefaultListModel();
     
        newFriend = (String)jComboBox1.getSelectedItem();
        friend_arr[ctr] = newFriend;
        ctr++;
        for(int i=0;i<ctr;i++)
            list.addElement(friend_arr[i]);
        
        jList1.setModel(list);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected() == false)
                    jTextField8.setEnabled(true);        // TODO add your handling code here:
        else
                    jTextField8.setEnabled(false);        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultListModel list2 = new DefaultListModel();
        DefaultListModel list3 = new DefaultListModel();
        
        jCheckBox2.setEnabled(false);

        
         if(jCheckBox2.isSelected()){
           
                
                newFriend = (String)jComboBox3.getSelectedItem();
                friend_arr[ctr1++] = newFriend;

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
                if(jTextField9.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter amount!");
                }
                else{
                    newFriend = (String)jComboBox3.getSelectedItem();
                    friend_arr[ctr1] = newFriend;
                    amount_Str =(String)jTextField9.getText();

                    amount_arr[ctr1]=Float.parseFloat(amount_Str);
                    ctr1++;
                    for(int i=0;i<ctr1;i++)
                    { list2.addElement(friend_arr[i]);


                    }
                    jList2.setModel(list2);
                    for(int i=0;i<ctr1;i++)
                        list3.addElement(amount_arr[i]);
                    jList3.setModel(list3);        // TODO add your handling code here:

                }
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ListModel model3 = jList3.getModel();
        size2= model3.getSize();
        ListModel model2 = jList2.getModel();
        size1 = model2.getSize();
        int sum = 0;
        for(int i=0;i<size2;i++){
            sum += (float)model3.getElementAt(i);
        }
        if(sum!=Integer.parseInt(jTextField3.getText().toString())){
            JOptionPane.showMessageDialog(null, "Total amount must match sum of individual amounts, retry!");
            jList2.removeAll();  // ***** NOT WORKING *****
            jList3.removeAll();  // ***** NOT WORKING *****
        }
        else{
        
        
            jList2.setEnabled(false);
            jList3.setEnabled(false);
            

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
        

        DefaultListModel list5 = new DefaultListModel();
        DefaultListModel list4 = new DefaultListModel();
        jCheckBox1.setEnabled(false);
        
        if(jCheckBox1.isSelected()){
                 
                 
                
                
                
                newFriend = (String)jComboBox4.getSelectedItem();
                friend_arr[ctr2++] = newFriend;

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
                }
                else{
        
                    newFriend = (String)jComboBox4.getSelectedItem();
                    friend_arr[ctr2] = newFriend;
                    amount_Str =(String)jTextField8.getText();

                    amount_arr[ctr2]=Float.parseFloat(amount_Str);
                    ctr2++;
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
        jList4.setEnabled(false);
        jList5.setEnabled(false);

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
        }         // TODO add your handling code here:
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
        int selectedIndex = jList2.getSelectedIndex();
        if(selectedIndex!=-1){
            l.remove(selectedIndex);// TODO add your handling code here:
            m.remove(selectedIndex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        DefaultListModel l = (DefaultListModel)jList1.getModel();
        int selectedIndex = jList1.getSelectedIndex();
        if(selectedIndex!=-1){
            l.remove(selectedIndex);// TODO add your handling code here:
            // TODO add your handling code here:
            for(int i=0;i<friend_arr.length;i++){
                if(friend_arr[selectedIndex].equals(friend_arr[i])){
                    for(int j=i;j<friend_arr.length-1;j++)
                        friend_arr[j]=friend_arr[j+1];
                    ctr--;
                }
            }
        }                // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        DefaultListModel l = (DefaultListModel)jList5.getModel();
        DefaultListModel m = (DefaultListModel)jList4.getModel();
        int selectedIndex = jList5.getSelectedIndex();
        if(selectedIndex!=-1){
            l.remove(selectedIndex);// TODO add your handling code here:
            m.remove(selectedIndex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

     void minCashflowRec(float[] amount) {
            // Find the indexes of minimum and maximum values in amount[]
            // amount[mxCredit] indicates the maximum amount to be given
            //                  (or credited) to any person .
            // And amount[mxDebit] indicates the maximum amount to be taken
            //                  (or debited) from any person.
            // So if there is a positive value in amount[], then there must
            // be a negative value
            final_string = new String[100];
            //for tracking transactional steps
            /*for(int i=0;i<size;i++)
             System.out.print(amount[i] + " "); //debug
             System.out.println();*/
            
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
            System.out.println(final_string[counter-1]);
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
}
   
