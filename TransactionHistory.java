package databaseproject;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class TransactionHistory extends javax.swing.JFrame {
    
    int accountID, userloginID, customerID, admin;

    /**
     * Creates new form TransactionHistory
     */
    public TransactionHistory(int accountID, int userloginID, int customerID, int admin) {
        initComponents();
            ImageIcon background_img= new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DatabaseProject\\src\\databaseproject\\TransactionHistory.jpg","");
          Image  img= background_img.getImage();
          Image temp_img=img.getScaledInstance(1200, 700,Image.SCALE_SMOOTH);
           background_img=new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
                     backgrnd.setBounds(0, 0, 1200,700);
                     this.add(backgrnd);
        this.accountID = accountID;
        this.userloginID = userloginID;
        this.customerID = customerID;
        this.admin = admin;
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(129, 228, 218));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Back to Main Menu");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 121, 138), 4));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction ID", "Transaction Date", "Transaction Type", "Transaction Amount", "From AccountID", "To AccountID", "Customer ID", "User Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Transaction History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(438, 438, 438))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (admin == 0) {
        dispose();
        MainMenuFrame mm1 = new MainMenuFrame(this.userloginID);
        mm1.setVisible(true);
        }
        else {
            dispose();
            adminMainMenu mm1 = new adminMainMenu();
            mm1.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    void updateTransactionTable(){
        try{
             //Getting connection to the database
            Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "seecs@123");
            // Creating a statement
            Statement myStmt = myCon.createStatement();
            //Result Statement
            ResultSet myRs;
            //storing the query result in the myRs statement
            myRs = myStmt.executeQuery("select * from transactionlog where accountid = " + this.accountID );
            
            //creating the variables for reading the data from the table 
            String transactionID = "";
            String transactionDate = "";
            String transactionType = "";
            String transactionAmount = "";
            String fromAccountID = "";
            String toAccountID = "";
            String customerID = "";
            String userLoginId = "";
            
            
            while (myRs.next()){
                int tmp;
                
                transactionID = String.valueOf(myRs.getInt("transactionid"));
                transactionDate = String.valueOf(myRs.getString("transactiondate"));
                transactionType = String.valueOf(myRs.getInt("transactiontypeid"));
                tmp = Integer.parseInt(transactionType);
                if (tmp == 0)
                    transactionType = "Withdrawl";
                if (tmp == 1)
                    transactionType = "Deposit";
                if (tmp == 2)
                    transactionType = "Check";
                if (tmp == 3)
                    transactionType = "Transfer Money";
                if (tmp == 4)
                    transactionType = "Loan Payment";
                
                transactionAmount = String.valueOf(myRs.getInt("transactionamount"));
                fromAccountID = String.valueOf(myRs.getInt("accountid"));
                toAccountID = String.valueOf(myRs.getInt("toaccountid"));
                customerID = String.valueOf(myRs.getInt("customerid"));
                userLoginId = String.valueOf(myRs.getInt("userloginid"));
                
                
                String tbData[] = {transactionID, transactionDate, transactionType, transactionAmount, fromAccountID, toAccountID, customerID, userLoginId};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(tbData);
                
                
            }
            
            
        }
        catch (Exception e){
            dispose();
            JOptionPane.showMessageDialog(null, "Error Occured while displaying transaction history");
            MainMenuFrame mm1 = new MainMenuFrame(this.userloginID);
            mm1. setVisible(true); 
        }
        
        
    }
    

}
