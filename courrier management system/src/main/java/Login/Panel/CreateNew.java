/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login.Panel;

import SuperAdmin.ManageManagerAccountView;
import SuperAdmin.SuperAdminDashboard;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.*;
//import SuperAdmin.SuperAdminDashboard;



/**
 *
 * @author Arun x Gokul
 */



public class CreateNew extends javax.swing.JFrame {

    
    public CreateNew() {
        initComponents();
    }
    String login;
    public String setId(String id){login = id; return login;}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gender = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FnameTB = new javax.swing.JTextField();
        LnameTB = new javax.swing.JTextField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Others = new javax.swing.JRadioButton();
        Year = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Month = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Date = new javax.swing.JComboBox<>();
        PhoneTB = new javax.swing.JTextField();
        AddressTB = new javax.swing.JTextField();
        EmailTB = new javax.swing.JTextField();
        InvalidEM = new javax.swing.JLabel();
        InvalidN = new javax.swing.JLabel();
        InvalidLN = new javax.swing.JLabel();
        InvalidADD = new javax.swing.JLabel();
        InvalidL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        idTB = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Confirm = new javax.swing.JPasswordField();
        SignupBTN = new javax.swing.JButton();
        Output = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create New Account Panel");

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Poppins", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creating New Account for:");

        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "manager", "delevery-person" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel2.setText("Enter Your Personal Details");

        jLabel3.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel6.setText("Phone No:");

        jLabel7.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel9.setText("Date of birth:");

        FnameTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FnameTBKeyReleased(evt);
            }
        });

        LnameTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LnameTBKeyReleased(evt);
            }
        });

        Gender.add(Male);
        Male.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        Male.setText("Male");

        Gender.add(Female);
        Female.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        Gender.add(Others);
        Others.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        Others.setText("Others");

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027" }));
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel10.setText("Year:");

        jLabel11.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel11.setText("Month:");

        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));

        jLabel12.setFont(new java.awt.Font("Poppins", 2, 12)); // NOI18N
        jLabel12.setText("Date:");

        Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33" }));

        PhoneTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PhoneTBKeyReleased(evt);
            }
        });

        AddressTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTBActionPerformed(evt);
            }
        });
        AddressTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddressTBKeyReleased(evt);
            }
        });

        EmailTB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailTBKeyReleased(evt);
            }
        });

        InvalidEM.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        InvalidEM.setForeground(new java.awt.Color(255, 51, 0));

        InvalidN.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        InvalidN.setForeground(new java.awt.Color(255, 51, 0));

        InvalidLN.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        InvalidLN.setForeground(new java.awt.Color(255, 51, 0));

        InvalidADD.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        InvalidADD.setForeground(new java.awt.Color(255, 51, 0));

        InvalidL.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        InvalidL.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(FnameTB, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Male)
                                .addGap(25, 25, 25)
                                .addComponent(Female)
                                .addGap(18, 18, 18)
                                .addComponent(Others))
                            .addComponent(LnameTB)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddressTB)
                            .addComponent(EmailTB)
                            .addComponent(PhoneTB, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(InvalidN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InvalidL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(InvalidLN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvalidADD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvalidEM, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InvalidN, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(FnameTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LnameTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Male)
                            .addComponent(Female)
                            .addComponent(Others))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(InvalidL, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(InvalidLN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(InvalidADD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InvalidEM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PhoneTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(EmailTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel14.setText("ID:");

        idTB.setText("your id will be displayed here :)");

        jLabel15.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel15.setText("Enter a new password:");

        jLabel16.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel16.setText("Confirm password:");

        SignupBTN.setBackground(new java.awt.Color(0, 51, 255));
        SignupBTN.setFont(new java.awt.Font("Poppins", 3, 18)); // NOI18N
        SignupBTN.setForeground(new java.awt.Color(255, 255, 255));
        SignupBTN.setText("Sign Up");
        SignupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idTB)
                    .addComponent(Password)
                    .addComponent(Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(SignupBTN)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(idTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(SignupBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Output.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Output.setText("NOTIFICATION PANEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(117, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Output)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //back button for different users using condition
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            if(login.equals("0")){
                this.dispose();
                SuperAdminDashboard s = new SuperAdminDashboard();
                s.setId(login);
                s.setVisible(true);
            }else{
                this.dispose();
                new LoginTab().setVisible(true);
            }
        }catch(NullPointerException e){
            this.dispose();
            new LoginTab().setVisible(true);
        }//finally{
           // {
            
        //}
        //}
        
       /* if(login != null){
            this.dispose();
            ManageManagerAccountView fromSuperAdmin = new ManageManagerAccountView();
            fromSuperAdmin.setId(login);
            fromSuperAdmin.setVisible(true);
        }*/
        //else
        /*if(login == null){
            this.dispose();
            new LoginTab().setVisible(true);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void AddressTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTBActionPerformed
   
   
    
    private void SignupBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBTNActionPerformed
        // TODO add your handling code here:
        try{
            File f = new File("C:\\Users\\G0kul\\Desktop\\oodj\\OODJ\\src\\main\\java\\Login\\Panel\\employeeDTL.txt");
            String usr, fName, lName, eGender = null,dobY, dobM, dobD, ePhone, eAddress, eEmail, ePass, eConfirm;
            int eID;
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))){
                fName = FnameTB.getText();
                lName = LnameTB.getText();
                if(Male.isSelected()){
                    eGender = "Male";
                }
                if(Female.isSelected()){
                    eGender = "Female";
                }
                if(Others.isSelected()){
                    eGender = "Others";
                }
                //dobY = Year.getText();

                usr = user.getSelectedItem().toString();
                
                dobY = Year.getSelectedItem().toString();
                dobM = Month.getSelectedItem().toString();
                dobD = Date.getSelectedItem().toString();
                        
                ePhone = PhoneTB.getText();
                eAddress = AddressTB.getText();
                eEmail = EmailTB.getText();
                
                Random rand = new Random();
                eID = rand.nextInt(9999);
                this.idTB.setText(""+eID);
                setVisible(true);
                this.idTB.setEditable(false);
                //deliverystafffile
                if(usr.equals("delevery-person")){
                    try{
                        File file = new File("C:\\Users\\G0kul\\Desktop\\oodj\\OODJ\\src\\main\\java\\Login\\Panel\\DeliveryStaff.txt");
                        try(BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(file,true))){
                            String line = eID+" "+fName+" "+lName+" "+eGender+" "+ePhone+" "+eAddress+" "+eEmail + "\n";
                            bufferwriter.write(line); 
                            bufferwriter.close();
                        }
                    }catch(IOException e){System.out.println(e);}    
                }                               
                //deliiverystafffileclosed
                ePass = Password.getText();
                eConfirm = Confirm.getText();
                
                if(ePass.equals(eConfirm) ){
                     String line = eID + " " + ePass + " " + usr + " " +fName + " " + lName + " " + eGender + " " + ePhone + " " + eAddress + " " + eEmail + " " + dobY + " " + dobM + " " + dobD + "\n";// + " " + eCountry + " " + eGender + " " + eStatus; //
                     bw.write(line); 
                     bw.close();
                     this.Output.setText("Sucess :) go back to login panel to continue,& remember your id");
                     setVisible(true);
                     this.Output.setEditable(false);
                }else{
                    this.Output.setText("password missmatch!! retype your password");
                    setVisible(true);
                    this.Output.setEditable(false);
                }
                bw.close();
            }
            
        }catch(IOException e){System.out.println(e);}
        
    }//GEN-LAST:event_SignupBTNActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void FnameTBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FnameTBKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match = patt.matcher(FnameTB.getText());
        if(!match.matches()){
            InvalidN.setText("Invalid name");

}
        else{
            InvalidN.setText(null);
        }
    }//GEN-LAST:event_FnameTBKeyReleased

    private void LnameTBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LnameTBKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z]{3,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(LnameTB.getText());
        if(!match.matches()){
            InvalidL.setText("Invalid name");
}
        else{
            InvalidL.setText(null);
        }
    }//GEN-LAST:event_LnameTBKeyReleased

    private void PhoneTBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneTBKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{9,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(PhoneTB.getText());
        if(!match.matches()){
            InvalidLN.setText("Invalid phone!!");
}
        else{
            InvalidLN.setText(null);
        }
    }//GEN-LAST:event_PhoneTBKeyReleased

    private void AddressTBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressTBKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-z]{5,50}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(AddressTB.getText());
        if(!match.matches()){
            InvalidADD.setText("Enter full address!!");
}
        else{
            InvalidADD.setText(null);
        }  
    }//GEN-LAST:event_AddressTBKeyReleased

    private void EmailTBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailTBKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";       
        // String PATTERN = "^[a-zA-Z0-9](0,30)[@][a-zA-Z0-9](0,10)[.][a-zA-Z](0,5)$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EmailTB.getText());
        if(!match.matches()){
            InvalidEM.setText("Invalid Email!!");
}
        else{
            InvalidEM.setText(null);
        } 
    }//GEN-LAST:event_EmailTBKeyReleased

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
            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTB;
    private javax.swing.JPasswordField Confirm;
    private javax.swing.JComboBox<String> Date;
    private javax.swing.JTextField EmailTB;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField FnameTB;
    private javax.swing.ButtonGroup Gender;
    private javax.swing.JLabel InvalidADD;
    private javax.swing.JLabel InvalidEM;
    private javax.swing.JLabel InvalidL;
    private javax.swing.JLabel InvalidLN;
    private javax.swing.JLabel InvalidN;
    private javax.swing.JTextField LnameTB;
    private javax.swing.JRadioButton Male;
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JRadioButton Others;
    private javax.swing.JTextField Output;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField PhoneTB;
    private javax.swing.JButton SignupBTN;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField idTB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> user;
    // End of variables declaration//GEN-END:variables
}
