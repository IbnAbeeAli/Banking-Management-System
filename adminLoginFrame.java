package databaseproject;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author waniya_mustafa
 */
public class adminLoginFrame extends javax.swing.JFrame {

    String userName = "root";
    String password = "seecs@123";

    /**
     * Creates new form adminLoginFrame
     */
    public adminLoginFrame() {
        initComponents();
        ImageIcon background_img = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DatabaseProject\\src\\databaseproject\\admin.jpg", "");
        Image img = background_img.getImage();
        Image temp_img = img.getScaledInstance(1199, 722, Image.SCALE_SMOOTH);
        background_img = new ImageIcon(temp_img);
        JLabel backgrnd = new JLabel("", background_img, JLabel.CENTER);
        backgrnd.setBounds(0, 0, 1199, 722);
        this.add(backgrnd);
        AdminBtn.setOpaque(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminpasswordField = new javax.swing.JPasswordField();
        AdminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");

        adminpasswordField.setBackground(new java.awt.Color(204, 204, 204));
        adminpasswordField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        adminpasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        adminpasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminpasswordFieldActionPerformed(evt);
            }
        });

        AdminBtn.setBackground(new java.awt.Color(0, 153, 153));
        AdminBtn.setFont(new java.awt.Font("Arima Madurai", 1, 18)); // NOI18N
        AdminBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdminBtn.setText("Login");
        AdminBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(239, 121, 138), 3, true));
        AdminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Arima Madurai", 1, 22)); // NOI18N
        jLabel2.setText("Password");

        adminUsername.setBackground(new java.awt.Color(204, 204, 204));
        adminUsername.setFont(new java.awt.Font("Arima Madurai", 0, 18)); // NOI18N
        adminUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 3, true));
        adminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(adminUsername)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adminpasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addContainerGap(756, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminpasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminpasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminpasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminpasswordFieldActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        // TODO add your handling code here:
        try {
            if (!this.userName.equals(adminUsername.getText())) {
                throw new Exception();
            }
            if (!this.password.equals(adminpasswordField.getText())) {
                throw new Exception();
            }
            dispose();
            adminMainMenu ad1 = new adminMainMenu();
            ad1.setVisible(true);
        }
        catch (Exception e){
            dispose();
            JOptionPane.showMessageDialog(null, "Invalid Credentials");
            mainFrame m1 = new mainFrame();
            m1.setVisible(true);
        }

    }//GEN-LAST:event_AdminBtnActionPerformed

    private void adminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminUsernameActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminBtn;
    private javax.swing.JTextField adminUsername;
    private javax.swing.JPasswordField adminpasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
