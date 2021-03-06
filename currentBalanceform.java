package databaseproject;
import java.awt.Image;
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
public class currentBalanceform extends javax.swing.JFrame {

    int accountID, userloginID, customerID;

    /**
     * Creates new form currentBalanceform
     */
    public currentBalanceform(int accountID, int userloginId, int customerID) {
        initComponents();
        ImageIcon background_img = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DatabaseProject\\src\\databaseproject\\Current Balance.jpg", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(868, 485, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 868, 485);
        this.add(backgrnd);
        YesBtn.setOpaque(true);
        NoBtn.setOpaque(true);
        this.accountID = accountID;
        this.userloginID = userloginId;
        this.customerID = customerID;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NoBtn = new javax.swing.JButton();
        currentBalance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        YesBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Balance Inquiry");

        jLabel1.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel1.setText("Available Balance");

        NoBtn.setBackground(new java.awt.Color(255, 51, 51));
        NoBtn.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        NoBtn.setForeground(new java.awt.Color(255, 255, 255));
        NoBtn.setText("No");
        NoBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        NoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoBtnActionPerformed(evt);
            }
        });

        currentBalance.setBackground(new java.awt.Color(204, 204, 204));
        currentBalance.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        currentBalance.setText("Balance will show here");
        currentBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 102), 2, true));

        jLabel3.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel3.setText("Do you want to perform another transaction?");

        YesBtn.setBackground(new java.awt.Color(0, 153, 153));
        YesBtn.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        YesBtn.setForeground(new java.awt.Color(255, 255, 255));
        YesBtn.setText("Yes");
        YesBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 121, 138), 3, true));
        YesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        YesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(YesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YesBtn))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        mainFrame m1 = new mainFrame();
        m1.setVisible(true);

    }//GEN-LAST:event_NoBtnActionPerformed

    private void YesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        MainMenuFrame m1 = new MainMenuFrame(this.userloginID);
        m1.setVisible(true);

    }//GEN-LAST:event_YesBtnActionPerformed

    //In this method we write the query to retreive the balance of the user from the database
    void updateFields() {

        try {
            //selecting account from userloginid
            String user = "root";
            String password = "seecs@123";

            //Getting connection to the database
            Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", user, password);
            // Creating a statement
            Statement myStmt = myCon.createStatement();
            ResultSet myrs;
            
            myrs = myStmt.executeQuery("select currentbalance from account where accountid = " + this.accountID);
            int balance = 0; // = select from the query
            if (myrs.next())
                balance = myrs.getInt("currentbalance");
            this.currentBalance.setText(balance + " ");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NoBtn;
    private javax.swing.JButton YesBtn;
    private javax.swing.JLabel currentBalance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
