package JCreateAcc;
import Jlogin.LoginUser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Form extends javax.swing.JFrame  {
    public Form() {
        initComponents();
    }  
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=USERLOGIN;user=sa;password=26092005;encrypt= false;";
    String user = "sa"; 
    String password = "26092005"; 
    Statement st ; 
    ResultSet rs ; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtgmail = new javax.swing.JTextField();
        txtconfirm = new javax.swing.JPasswordField();
        create = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        showConfirm = new javax.swing.JCheckBox();
        showPass = new javax.swing.JCheckBox();
        Image = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabel1.setText("Create Account");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Confirm Pass:");

        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        jLabel3.setText("Gmail:");

        jLabel2.setText("User:");

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

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 51));
        jLabel6.setText("CREATE ACCOUNT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PassWord:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel10.setBackground(new java.awt.Color(204, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gmail:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel11.setText(" __");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 20, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 10, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CofirmPass:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        txtname.setBackground(new java.awt.Color(102, 255, 255));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 140, -1));

        txtpass.setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));

        txtgmail.setBackground(new java.awt.Color(51, 255, 255));
        txtgmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtgmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 164, 220, -1));

        txtconfirm.setBackground(new java.awt.Color(51, 255, 255));
        getContentPane().add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 140, -1));

        create.setBackground(new java.awt.Color(51, 51, 255));
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("CREATE!");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        getContentPane().add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CANCEL!");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        showConfirm.setBackground(new java.awt.Color(0, 0, 0));
        showConfirm.setText("jCheckBox1");
        showConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(showConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 20, -1));

        showPass.setBackground(new java.awt.Color(0, 0, 0));
        showPass.setText("jCheckBox2");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        getContentPane().add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 20, 20));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/IconLogin.jpg"))); // NOI18N
        getContentPane().add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       LoginUser a = new LoginUser();
       a.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtgmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgmailActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        int dk = JOptionPane.showConfirmDialog(this, "Yes to confirm","CONFIRM", JOptionPane.YES_NO_OPTION);
        if(dk!=JOptionPane.YES_OPTION){
        return ; 
    }     
          try { 
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url , user , password );
            String sql = "insert into ACCOUNT values (?,?,?,?)"; 
            PreparedStatement ps= conn.prepareStatement(sql); 
            ps.setString(1, txtname.getText().trim());
            ps.setString(2,txtpass.getText().trim());
            ps.setString(3, txtgmail.getText().trim());
            ps.setString(4, txtconfirm.getText().trim());
            int n  = ps.executeUpdate() ;             
          if(txtname.getText().equals("")| txtgmail.getText().equals("")| txtpass.getText().equals("")|txtconfirm.getText().equals("")){
          JOptionPane.showMessageDialog(this, "INFORMATION CAN'T BE EMPTY");             
          return ;          
          }          
          if(txtpass.getText() == null || !txtconfirm.getText().equals(txtpass.getText())){
             int b = JOptionPane.showConfirmDialog(this, " PASSWORD FALSE","CONFIRM", JOptionPane.CLOSED_OPTION);
             return ; 
          }
          
          else if(n != 0 ){
                   JOptionPane.showMessageDialog(this, "ACCOUNT CREATED SUCCESSFULLY");
                   int a = JOptionPane.showConfirmDialog(this, "BACK TO LOGIN","CONFIRM",JOptionPane.YES_NO_OPTION);
                   if(a == JOptionPane.YES_OPTION){
                   LoginUser lu = new LoginUser();
                   lu.setVisible(true);
                    this.dispose();
                   }
                   else{
                       return ;
                   }
                  }
          else{
              JOptionPane.showMessageDialog(this, "ERROR, CAN'T CREATE ACCOUNT"); 
          }
          ps.close();
          conn.close();
        }catch( Exception ex ){
            ex.printStackTrace();
        }        
    }//GEN-LAST:event_createActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
               int a = JOptionPane.showConfirmDialog(this, "STOP CREATING!","Confirm", JOptionPane.YES_NO_OPTION);
                if(a == JOptionPane.YES_OPTION){
                   txtname.setText("");
                   txtpass.setText("");
                   txtgmail.setText("");
                   txtconfirm.setText("");
                }
    }//GEN-LAST:event_jButton4MouseClicked

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
           txtname.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpass.requestFocus();
            txtgmail.requestFocus();
            txtconfirm.requestFocus();
            create.requestFocus();
        }
    }
});
txtname.addActionListener(e -> txtpass.requestFocus()); 
txtpass.addActionListener(e -> txtgmail.requestFocus()); 
txtgmail.addActionListener(e -> txtconfirm.requestFocus()); 
txtconfirm.addActionListener(e -> create.requestFocus());
    }//GEN-LAST:event_txtnameActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
      if(showPass.isSelected()){
          txtpass.setEchoChar((char)0);
      }    
      else{
          txtpass.setEchoChar('*');
      }
    }//GEN-LAST:event_showPassActionPerformed

    private void showConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showConfirmActionPerformed
       if(showConfirm.isSelected()){
           txtconfirm.setEchoChar((char)0);
       }
       else{
           txtconfirm.setEchoChar('*');
       }
    }//GEN-LAST:event_showConfirmActionPerformed
     public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton create;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JCheckBox showConfirm;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JPasswordField txtconfirm;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
