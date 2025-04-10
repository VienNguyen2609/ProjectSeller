package JCreateAcc;

import DataFromSQL.AccountManager;
import Jlogin.LoginUser;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormCreateAcc extends javax.swing.JFrame {

    public FormCreateAcc() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        addPlaceHolderStyle(txtname);
        addPlaceHolderStyle(txtpass);
        addPlaceHolderStyle(txtgmail);
        addPlaceHolderStyle(txtconfirm);

    }

    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.darkGray);
    }

    public void removePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.darkGray);
    }

    // bắt lổi tiếng việt 
    public static boolean containsVietnameseCharacters(String text) {
        String vietnamesePattern = ".*[àáảãạăắằẳẵặâấầẩẫậèéẻẽẹêếềểễệìíỉĩịòóỏõọôốồổỗộơớờởỡợùúủũụưứừửữựỳýỷỹỵđ].*";
        return text.matches(vietnamesePattern);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cr = new javax.swing.JLabel();
        txtconfirm = new javax.swing.JPasswordField();
        txtname = new javax.swing.JTextField();
        txtgmail = new javax.swing.JTextField();
        showPass = new javax.swing.JCheckBox();
        showConfirm = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cr.setBackground(new java.awt.Color(153, 255, 153));
        cr.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        cr.setForeground(new java.awt.Color(153, 255, 153));
        cr.setText("CREATE ACCOUNT");
        getContentPane().add(cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 20));

        txtconfirm.setBackground(new java.awt.Color(153, 255, 255));
        txtconfirm.setText("ReEnterPass....");
        txtconfirm.setEchoChar('\u0000');
        txtconfirm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtconfirmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtconfirmFocusLost(evt);
            }
        });
        getContentPane().add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 160, -1));

        txtname.setBackground(new java.awt.Color(153, 255, 255));
        txtname.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtname.setText("Name....");
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 160, 20));

        txtgmail.setBackground(new java.awt.Color(153, 255, 255));
        txtgmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtgmail.setText("Gmail.....");
        txtgmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtgmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtgmailFocusLost(evt);
            }
        });
        getContentPane().add(txtgmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 162, 200, 20));

        showPass.setBackground(new java.awt.Color(0, 0, 0));
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        getContentPane().add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        showConfirm.setBackground(new java.awt.Color(0, 0, 0));
        showConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(showConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREATE....NOW ! ");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCEL!");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 10, 10, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("__");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HIDE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("HIDE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, 20));

        txtpass.setBackground(new java.awt.Color(153, 255, 255));
        txtpass.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtpass.setText("Password....");
        txtpass.setEchoChar('\u0000');
        txtpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpassFocusLost(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 160, 20));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/IconLogin.jpg"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showConfirmActionPerformed
        if (showConfirm.isSelected())
            txtconfirm.setEchoChar((char) 0);
        else
            txtconfirm.setEchoChar('*');
    }//GEN-LAST:event_showConfirmActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int dk = JOptionPane.showConfirmDialog(this, "COFIRM CREATING", "CONFIRM", JOptionPane.YES_NO_OPTION);
        if (dk != JOptionPane.YES_OPTION) {
            return;
        }
        AccountManager.Init();
        AccountManager.instance.LoadAccount();
        try {
            String name = this.txtname.getText().trim();
            String pass = this.txtpass.getText().trim();
            String gmail = this.txtgmail.getText().trim();
            if (name.equalsIgnoreCase("") || pass.equalsIgnoreCase("") || gmail.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "INFORMATION CAN NOT  BE EMPTY");
                return;
            }
            if (pass.isEmpty() || !txtconfirm.getText().equalsIgnoreCase(pass)) {
                JOptionPane.showConfirmDialog(this, " PASSWORD DO NOT MATCH", "CONFIRM", JOptionPane.CLOSED_OPTION);
                return;
            }
            if (!gmail.contains("@gmail.com")) {
                JOptionPane.showMessageDialog(this, "GMAIL FALSE ! ");
                return;
            }
            String inputText = name;
            if (containsVietnameseCharacters(inputText)) {
                JOptionPane.showMessageDialog(this, "USER NAME ERROR! ");
                return;
            }
            if (AccountManager.instance.addAccount(name, pass, gmail)) {
                JOptionPane.showMessageDialog(this, "CREATE ACCOUNT SUCCESFULLY!");
                int a = JOptionPane.showConfirmDialog(this, "GO TO LOGIN!", "CONFIRM", JOptionPane.YES_NO_OPTION);
                if (a == JOptionPane.YES_OPTION) {
                    new LoginUser().setVisible(true);
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        if (showPass.isSelected())
            txtpass.setEchoChar((char) 0);
        else
            txtpass.setEchoChar('*');
    }//GEN-LAST:event_showPassMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int a = JOptionPane.showConfirmDialog(this, "STOP CREATING!", "Confirm", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            txtname.setText("");
            txtpass.setText("");
            txtgmail.setText("");
            txtconfirm.setText("");
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new LoginUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        txtname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    txtpass.requestFocus();
                    txtgmail.requestFocus();
                    txtconfirm.requestFocus();
                }
            }
        });
        txtname.addActionListener(e -> txtpass.requestFocus());
        txtpass.addActionListener(e -> txtgmail.requestFocus());
        txtgmail.addActionListener(e -> txtconfirm.requestFocus());
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusGained
        if (txtname.getText().equals("Name....")) {
            txtname.setText(null);
            txtname.requestFocus();
            removePlaceHolderStyle(txtname);
        }
    }//GEN-LAST:event_txtnameFocusGained

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        if (txtname.getText().length() == 0) {
            addPlaceHolderStyle(txtname);
            txtname.setText("Name....");
        }
    }//GEN-LAST:event_txtnameFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusGained
        if (txtpass.getText().equals("Password....")) {
            txtpass.setText(null);
            txtpass.requestFocus();
            //txtpass.setEchoChar();
            removePlaceHolderStyle(txtpass);
        }
    }//GEN-LAST:event_txtpassFocusGained

    private void txtpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpassFocusLost
        if (txtpass.getText().length() == 0) {
            addPlaceHolderStyle(txtpass);
            txtpass.setText("Password....");
            txtpass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtpassFocusLost

    private void txtgmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgmailFocusGained
        if (txtgmail.getText().equals("Gmail.....")) {
            txtgmail.setText(null);
            txtgmail.requestFocus();
            //txtpass.setEchoChar();
            removePlaceHolderStyle(txtgmail);
        }
    }//GEN-LAST:event_txtgmailFocusGained

    private void txtgmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgmailFocusLost
        if (txtgmail.getText().length() == 0) {
            addPlaceHolderStyle(txtgmail);
            txtgmail.setText("Gmail.....");
        }
    }//GEN-LAST:event_txtgmailFocusLost

    private void txtconfirmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconfirmFocusGained
        if (txtconfirm.getText().equals("ReEnterPass....")) {
            txtconfirm.setText(null);
            txtconfirm.requestFocus();
            //txtpass.setEchoChar();
            removePlaceHolderStyle(txtconfirm);
        }
    }//GEN-LAST:event_txtconfirmFocusGained

    private void txtconfirmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtconfirmFocusLost
        if (txtconfirm.getText().length() == 0) {
            addPlaceHolderStyle(txtconfirm);
            txtconfirm.setText("ReEnterPass....");
            txtconfirm.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtconfirmFocusLost
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCreateAcc fca = new FormCreateAcc();
                fca.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cr;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox showConfirm;
    private javax.swing.JCheckBox showPass;
    private javax.swing.JPasswordField txtconfirm;
    private javax.swing.JTextField txtgmail;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}
