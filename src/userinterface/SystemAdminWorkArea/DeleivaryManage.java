/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import static java.lang.Boolean.TRUE;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import userinterface.CustomerRole.ViewCustomer;
import userinterface.DeliveryManRole.ViewDelievarMan;

/**
 *
 * @author akhil
 */
public class DeleivaryManage extends javax.swing.JPanel {

    /**
     * Creates new form DeleivaryManage
     */
   JPanel userProcessContainer;
    EcoSystem ecosystem;
    public DeleivaryManage(JPanel upc,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=upc;
        this.ecosystem=ecosystem;
        popData();
    }
    
     public void popData() {

        DefaultTableModel model = (DefaultTableModel) tblMan.getModel();

        model.setRowCount(0);

        
            for (DeliveryMan c : ecosystem.getDeliveryManDirectory().getDeliveryManList()) {
                Object row[] = new Object[2];
                row[0] = c;
                row[1] = c.getMobileNo();
                ((DefaultTableModel) tblMan.getModel()).addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        comboBoxRole = new javax.swing.JComboBox();
        txtAddress = new javax.swing.JTextField();
        txtuserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMan = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();

        setBackground(java.awt.SystemColor.activeCaption);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Manage Delivery Man");

        btnBack1.setText("<-Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(java.awt.SystemColor.activeCaption);
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Add a Delivery Man");

        jPanel1.setBackground(java.awt.SystemColor.activeCaption);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter the Delivery Man Details:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jLabel4.setText("Address");

        jLabel7.setText("Password");

        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delievary Man" }));
        comboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRoleActionPerformed(evt);
            }
        });

        jLabel5.setText("Role");

        jLabel6.setText("userName");

        jLabel2.setText("Name");

        jLabel3.setText("Mobile Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(txtMobileNo)
                    .addComponent(txtAddress)
                    .addComponent(txtpassword)
                    .addComponent(txtuserName))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtuserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(124, 124, 124))
        );

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(java.awt.SystemColor.activeCaption);
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Mobile Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMan);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Available Delivery Man");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(122, 122, 122))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(557, 557, 557))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow =  tblMan.getSelectedRow();
        UserAccount c = null;
        Employee d = null;
        boolean x = false;
        boolean y = false;
        if(selectedRow >=0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult= JOptionPane.showConfirmDialog(null,"Would you like to delete deleivary man details?","Warning",dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {

                DeliveryMan a = (DeliveryMan) tblMan.getValueAt(selectedRow, 0);
                
                for (UserAccount b : ecosystem.getUserAccountDirectory().getUserAccountList()) {
                    x =b.getEmployee().getName().equals(a.getName());
                    System.out.println(b.getEmployee().getName());
                    System.out.println(a.getName());
                    if(x==true) {c =b;}
                }
                
                if (x==true) {
                    System.out.println(x);
                    System.out.println(ecosystem.getUserAccountDirectory().getUserAccountList());
                    UserAccountDirectory u = ecosystem.getUserAccountDirectory();
                    u.deleteUserAccount(c);   
                    System.out.println(ecosystem.getUserAccountDirectory().getUserAccountList());
                }
                for (Employee e : ecosystem.getEmployeeDirectory().getEmployeeList()) {
                    y =e.getName().equals(a.getName());
                    if(y==true) {d =e;}
                }
                
                if (y==true) {
                    System.out.println(x);
                    EmployeeDirectory ed = ecosystem.getEmployeeDirectory();
                    ed.deleteEmployee(d);   
                    
                }
                ecosystem.getDeliveryManDirectory().deleteDeliveryMan(a);
                
            }
            popData();

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Pleasse select a row","Warning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void comboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRoleActionPerformed

    }//GEN-LAST:event_comboBoxRoleActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
       String error = "";
        if((txtName.getText().equalsIgnoreCase("")) ||
            (txtMobileNo.getText().equalsIgnoreCase(""))||
            (txtAddress.getText().equalsIgnoreCase("")) ||(txtuserName.getText().equalsIgnoreCase(""))||(txtpassword.getText().equalsIgnoreCase(""))){
            error="\nAll the fields are Mandatory!!!";
            //Highligting the unfilled blocks to RED
            if((txtName.getText().equalsIgnoreCase(""))){
                txtName.setBorder(new LineBorder(Color.RED,2));
            }
            if((txtMobileNo.getText().equalsIgnoreCase(""))){
                txtMobileNo.setBorder(new LineBorder(Color.RED,2));  
            }
            if((txtAddress.getText().equalsIgnoreCase(""))){
                txtAddress.setBorder(new LineBorder(Color.RED,2));
                
            }
             if((txtuserName.getText().equalsIgnoreCase(""))){
                txtuserName.setBorder(new LineBorder(Color.RED,2));
                
            }
              if((txtpassword.getText().equalsIgnoreCase(""))){
                txtpassword.setBorder(new LineBorder(Color.RED,2));
                
            }
        }
        if(!error.equals("")){
            JOptionPane.showMessageDialog(null,error);
            return;
        }else{
                String pwdRegex = "((?=.*[a-z])(?=.*)(?=.*[$*#&])(?=.*[A-Z]).{6})";
                Pattern pwdPattern = Pattern.compile(pwdRegex);
                Matcher pwdCheck = pwdPattern.matcher(txtpassword.getText());
                boolean checkPwd = pwdCheck.matches();
                if(!(checkPwd == TRUE)){
                    error+="\nPassword needs to match below criteria:\n"
                    + "Password must be 6 characters only.\nIt Must have atleast one upper character.\nIt must have atleast one lower character."
                            + "\nIt must have atleast one digit.\nIt must have atleast one special character[#$&*]. ";
            txtpassword.setBorder(new LineBorder(Color.RED,2));
                }
            
            String usernamePattern = "[0-9A-za-z]{6}";
            Pattern userPat = Pattern.compile(usernamePattern);
            Matcher checkUser = userPat.matcher(txtuserName.getText());
            boolean userMatch = checkUser.matches();
            if(!(userMatch == TRUE)){
                error+="\nUsername needs to be 6 characters only-combination of characters and digits!";
                txtuserName.setBorder(new LineBorder(Color.RED,2));
                
            }
            
            String userCheck = txtuserName.getText();
            boolean check = ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(userCheck);
            if(check==false){error+="\nUsername needs to be unique!";
                txtuserName.setBorder(new LineBorder(Color.RED,2));               
            }
            
             String nameCheck = txtName.getText();
            boolean check1 = ecosystem.getDeliveryManDirectory().checkIfUsernameIsUnique(nameCheck);
            if(check1==false){error+="\nDeliveryMan name needs to be unique!";
                txtName.setBorder(new LineBorder(Color.RED,2));               
            }
            
        String phoneRegex = "^\\d{10}$";
        Pattern phonePattern = Pattern.compile(phoneRegex);       
        Matcher checkPhone = phonePattern.matcher(txtMobileNo.getText());
        boolean checkPhoneMatch = checkPhone.matches();
        if(!(checkPhoneMatch == TRUE)){
            
            error="\nFor Phone number - Please enter only 10 digits!";
            txtMobileNo.setBorder(new LineBorder(Color.RED,2)); 
        }
            
            
            
        }
            if(!error.equals("")){
            JOptionPane.showMessageDialog(null,error);
        }else{
                
                 txtName.setBorder(new LineBorder(Color.WHITE,2));
                txtMobileNo.setBorder(new LineBorder(Color.WHITE,2));
                txtAddress.setBorder(new LineBorder(Color.WHITE,2));
                txtuserName.setBorder(new LineBorder(Color.WHITE,2));
                txtpassword.setBorder(new LineBorder(Color.WHITE,2));

        String name = txtName.getText();
        String number = txtMobileNo.getText();
        String address = txtAddress.getText();
        String userName = txtuserName.getText();
        String password = txtpassword.getText();
        Role role = new DeliverManRole();

        DeliveryMan c =ecosystem.getDeliveryManDirectory().addDeliveryMan();
        
        c.setName(name);
        c.setMobileNo(number);
        c.setAddress(address);
        String s=c.getName();
        Employee employee=ecosystem.getEmployeeDirectory().createEmployee(s);
        UserAccountDirectory ua = ecosystem.getUserAccountDirectory();
        UserAccount u = ua.createUserAccount(userName, password, employee, role);

        popData();

        txtName.setText("");
        txtMobileNo.setText("");
        txtAddress.setText("");
        txtuserName.setText("");
        txtpassword.setText("");
            }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sawa = (SystemAdminWorkAreaJPanel) component;
        sawa.populateTree();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow =  tblMan.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null,"Pleasse select a row","Warning", JOptionPane.WARNING_MESSAGE);

        }

        else
        {
            DeliveryMan c = (DeliveryMan) tblMan.getValueAt(selectedRow, 0);
            ViewDelievarMan panel = new ViewDelievarMan(userProcessContainer,ecosystem,c);
            userProcessContainer.add("ViewDelievarMan",panel);
            CardLayout layout =(CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMan;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtuserName;
    // End of variables declaration//GEN-END:variables
}