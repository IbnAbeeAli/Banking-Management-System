package databaseproject;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author waniya_mustafa
 */
public class userSignUpFrame extends javax.swing.JFrame {

    //radio button
    int radioButtonStatus = 0;

    public userSignUpFrame() {
        initComponents();

        ImageIcon background_img = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DatabaseProject\\src\\databaseproject\\userSignUp.jpg", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(749, 859, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 749, 859);
        this.add(backgrnd);
        SignUpBtn.setOpaque(true);

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
        userPassword = new javax.swing.JPasswordField();
        SignUpBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userContactNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        userCity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userDeposit = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userEmailAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        userLoginID_TF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CNIC_TF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        userAddress = new javax.swing.JTextField();
        savingsRadio = new javax.swing.JRadioButton();
        currentRadioB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        userPassword.setBackground(new java.awt.Color(204, 204, 204));
        userPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        userPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });

        SignUpBtn.setBackground(new java.awt.Color(129, 228, 218));
        SignUpBtn.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 121, 138), 3, true));
        SignUpBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("First Name");

        jLabel2.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Password");

        userFirstName.setBackground(new java.awt.Color(204, 204, 204));
        userFirstName.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        userFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        userFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFirstNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Contact Number");

        userLastName.setBackground(new java.awt.Color(204, 204, 204));
        userLastName.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        userLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        userLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLastNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Last Name");

        userContactNumber.setBackground(new java.awt.Color(204, 204, 204));
        userContactNumber.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        userContactNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        userContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userContactNumberActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("City");

        userCity.setBackground(new java.awt.Color(204, 204, 204));
        userCity.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        userCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        userCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userCityActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Account Type");

        userDeposit.setBackground(new java.awt.Color(204, 204, 204));
        userDeposit.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        userDeposit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        userDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDepositActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Initial Deposit");

        userEmailAddress.setBackground(new java.awt.Color(204, 204, 204));
        userEmailAddress.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        userEmailAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        userEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEmailAddressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Email Address");

        userLoginID_TF.setBackground(new java.awt.Color(204, 204, 204));
        userLoginID_TF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));
        userLoginID_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginID_TFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel9.setText("User Login ID");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setText("CNIC");

        CNIC_TF.setBackground(new java.awt.Color(204, 204, 204));
        CNIC_TF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel11.setText("Address");

        userAddress.setBackground(new java.awt.Color(204, 204, 204));
        userAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 4));
        userAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userAddressActionPerformed(evt);
            }
        });

        buttonGroup1.add(savingsRadio);
        savingsRadio.setText("Savings Account");
        savingsRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savingsRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(currentRadioB);
        currentRadioB.setText("Current Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(userFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userPassword)
                        .addComponent(userCity)
                        .addComponent(userContactNumber)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(userDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(savingsRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(currentRadioB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(userLastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                        .addComponent(userLoginID_TF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CNIC_TF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLoginID_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNIC_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userContactNumber)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(savingsRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentRadioB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        // TODO add your handling code here:
        this.createUser();
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void userFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFirstNameActionPerformed

    private void userLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userLastNameActionPerformed

    private void userContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userContactNumberActionPerformed

    private void userCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userCityActionPerformed

    private void userDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userDepositActionPerformed

    private void userEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailAddressActionPerformed

    private void userLoginID_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginID_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userLoginID_TFActionPerformed

    private void savingsRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_savingsRadioActionPerformed

    private void userAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CNIC_TF;
    private javax.swing.JButton SignUpBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton currentRadioB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton savingsRadio;
    private javax.swing.JTextField userAddress;
    private javax.swing.JTextField userCity;
    private javax.swing.JTextField userContactNumber;
    private javax.swing.JTextField userDeposit;
    private javax.swing.JTextField userEmailAddress;
    private javax.swing.JTextField userFirstName;
    private javax.swing.JTextField userLastName;
    private javax.swing.JTextField userLoginID_TF;
    private javax.swing.JPasswordField userPassword;
    // End of variables declaration//GEN-END:variables

    //method to read the values from the form and update
    void createUser() {

        try {
            //Getting connection to the database
            Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "seecs@123");
            // Creating a statement
            Statement myStmt = myCon.createStatement();
            //Result Statement
            ResultSet myRs;
            int accountType = -1;
            String firstName = this.userFirstName.getText();
            String lastName = this.userLastName.getText();
            String city = this.userCity.getText();
            String contact = this.userContactNumber.getText();
            String initialDeposit = this.userDeposit.getText();
            String email = this.userEmailAddress.getText();
            String userName = this.userLoginID_TF.getText();
            String password = this.userPassword.getText();
            String SSN = this.CNIC_TF.getText();
            String userAddress = this.userAddress.getText();

            if (currentRadioB.isSelected()) {
                accountType = 1;
            } else if (savingsRadio.isSelected()) {
                accountType = 0;
            }

            //Checking if any of the fields are empty
            if (this.userFirstName.getText().equals("")
                    || this.userLastName.getText().equals("")
                    || this.userCity.getText().equals("")
                    || this.userContactNumber.getText().equals("")
                    || this.userDeposit.getText().equals("")
                    || this.userEmailAddress.getText().equals("")
                    || this.userLoginID_TF.getText().equals("")
                    || this.userPassword.getText().equals("")
                    || this.CNIC_TF.getText().equals("")
                    || this.userAddress.getText().equals("")
                    || !onlyDigits(this.userDeposit.getText())
                    || !onlyDigits(this.userContactNumber.getText())
                    || !onlyDigits(this.CNIC_TF.getText())
                    || accountType == -1) {
                dispose();
                JOptionPane.showMessageDialog(null, "Either Some Fields are empty or wrong value is entered.\nPlease fill all the fields and try again");
                throw new Exception();
            }

            //username check if the user is already existing in the database
            String checkQuery = "select userlogin from userlogins where userlogin = '" + userName + "';";
            myRs = myStmt.executeQuery(checkQuery);
            if (myRs.next()) {
                System.out.println("Invalid Username");
                JOptionPane.showMessageDialog(null, "Invalid Username");
                throw new Exception();
                //show dialogue box; 
                //go back to main menu
            }
            //Checking if the SSN is already existing in the customer database
            checkQuery = "select SSN from customer where ssn = '" + SSN + "';";
            myRs = myStmt.executeQuery(checkQuery);
            if (myRs.next()) {
                System.out.println("Invalid CNIC");
                JOptionPane.showMessageDialog(null, "Invalid CNIC");
                throw new Exception();
            }
            
            //Checking for the phone Number
            checkQuery = "select cellphone from customer where cellphone = '" + contact + "';";
            myRs = myStmt.executeQuery(checkQuery);
            if (myRs.next()) {
                System.out.println("Phone Number Already Taken!");
                JOptionPane.showMessageDialog(null, "Phone Number Already Taken!");
                throw new Exception();
            }

            //Query to insert the data into the database
            String query = "INSERT INTO `project`.`customer`"
                    + "(`CustomerAddress1`,"
                    + "`CustomerFirstName`,"
                    + "`CustomerLastName`,"
                    + "`City`,"
                    + "`EmailAddress`,"
                    + "`CellPhone`,"
                    + "`SSN`)"
                    + "VALUES"
                    + "('" + userAddress + "','" + firstName + "','" + lastName + "','" + city + "','" + email + "','"
                    + contact + "','" + SSN + "');";
            //updating the data in the database with the query
            myStmt.executeUpdate(query);

            //Inserting into account table
            myRs = myStmt.executeQuery("select customerid from customer where SSN = '" + SSN + "'");
            System.out.println("ssn executed");

            int customerID = -1;

            while (myRs.next()) {
                customerID = myRs.getInt("customerid");
                System.out.println(customerID);
            }

            query = "INSERT INTO `project`.`account`"
                    + "(`CustomerID`,`AccountTypeID`,`AccountStatusTypeID`,`InterestSavingsRateID`,`CurrentBalance`,`dateCreated`)\n"
                    + "VALUES"
                    + "(" + customerID + "," + accountType + "," + 0 + "," + 0 + "," + Integer.parseInt(initialDeposit) + "," + "CURRENT_TIMESTAMP())";

            myStmt.executeUpdate(query);
            System.out.println("update query");

            //Inserting into userLogins
            myRs = myStmt.executeQuery("select accountid from account where customerid = " + customerID + ";");
            int accountID = -1;
            while (myRs.next()) {
                accountID = myRs.getInt("accountid");
                System.out.println(accountID);
            }

            query = "INSERT INTO userlogins"
                    + "(`UserLogin`,`UserPassword`,`AccountID`)"
                    + "VALUES('" + userName + "','" + password + "'," + accountID + " );";
            myStmt.executeUpdate(query);

            //getting the userloginID from the userloginTable
            int userLoginID = -1;
            myRs = myStmt.executeQuery("select userloginId from userlogins where userlogin = '" + userName + "';");
            if (myRs.next()) {
                userLoginID = myRs.getInt("userloginID");
            }

            //updating the query in the transaction log the intial deposit
            myStmt.executeUpdate("INSERT INTO `project`.`transactionlog`"
                    + "(`TransactionDate`,`TransactionTypeID`,`TransactionAmount`,`AccountID`,`toaccountid`,`CustomerID`,`UserLoginID`)"
                    + "VALUES"
                    + "(CURRENT_TIMESTAMP()," + 1 + "," + initialDeposit + "," + accountID + "," + accountID + "," + customerID + "," + userLoginID + ");");

            dispose();
            JOptionPane.showMessageDialog(null, "Account Created Successfully!");
            mainFrame m1 = new mainFrame();
            m1.setVisible(true);

        } catch (Exception e) {
            dispose();
            mainFrame m1 = new mainFrame();
            m1.setVisible(true);
            e.printStackTrace();
        }
    }

    boolean onlyDigits(String str) {
        // Traverse the string from
        // start to end
        int n = str.length();
        for (int i = 0; i < n; i++) {

            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (str.charAt(i) >= '0'
                    && str.charAt(i) <= '9') {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}

