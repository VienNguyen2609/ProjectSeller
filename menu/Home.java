package menu;

import AccountData.Account;
import Production.Shoes;
import Jlogin.LoginUser;
import data.AccountManager;
import data.ProductManager;
import java.awt.Image;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    boolean isFound = false;

    public void OnOff(boolean a, boolean b) {
        this.btnSaveP.show(b);
        this.btnCancel.show(b);
        this.btnAddP.show(a);
        this.btnDeleteP.show(a);
        this.btnFindP.show(a);
        this.btnEditP.show(a);
    }
    private static int pos = 0;
    private static int stateAddEdit = 0;
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final static String url = "jdbc:sqlserver://localhost:1433;databaseName=USERLOGIN;user=sa;password=26092005;encrypt= false;";
    private final static String user = "sa";
    private final static String password = "26092005";
    private static Statement st;
    private static ResultSet rs;

    public Home() {
        this.setLocationByPlatform(true);
        initComponents();
        OnOff(true, false);
        try {
            ViewProduct();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassCastException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        scaleImage();
    }

    public boolean View() {
        this.txtID.setText("");
        this.txtNameProduct.setText("");
        this.txtSize.setText("");
        this.txtPrice.setText("");
        this.txtQuantity.setText("");
        this.txtColor.setText("");
        OnOff(true, false);
        return true;
    }
    public void scaleImage(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/IconProduct/result_homepage interface for a shoe store.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(Productshop1.getWidth(), Productshop1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon acalledIcon = new ImageIcon(imgScale );
        homeLabel.setIcon(acalledIcon);
    }
    public void scaleImage1(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.png"));
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(ProductShop1.getWidth(), ProductShop1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon acalledIcon = new ImageIcon(imgScale );
        ProductShop1.setIcon(acalledIcon);
    }
    public void ViewProduct() throws SQLException, ClassCastException {

        ProductManager.Init();
        //load data tu cai instance
        ProductManager.instance.LoadData();
        LoadTableProduct();
    }

    private void LoadTableProduct() {
        DefaultTableModel model = (DefaultTableModel) this.tbProduct.getModel();
        model.setNumRows(0);
        var data = ProductManager.instance.GetDataProduct();
        int n = 1;
        for (Shoes shoes : data) {
            double totalPrice = shoes.getPrice() * shoes.getQuantity();
            model.addRow(new Object[]{n++, shoes.getIdProduct(), shoes.getName(), (double) shoes.getSize(), shoes.getPrice(), shoes.getQuantity(), shoes.getColor(), totalPrice});
        }
    }

    @Override
    public void layout() {
        super.layout(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public void ViewAccount() throws SQLException, ClassCastException {
        AccountManager.Init();
        AccountManager.instance.LoadAccount();
        loadTableAccount();
    }
    public void loadTableAccount(){
        DefaultTableModel model = (DefaultTableModel) this.tbAccount.getModel();
        model.setNumRows(0);
        var data = AccountManager.instance.getDataAccount();
        int n = 1 ;
         for (Account account : data) {
            model.addRow(new Object[]{n++,account.getIdUser(),account.getName(), account.getPass(), account.getGmail()});
        }
    }
    void openMenuBar() {
        int width = 182, height = 650;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < width; i++) {
                    pnMenu.setSize(i, height);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    void closeMenuBar() {
        int width = 182, height = 650;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = width; i > 0; i--) {
                    pnMenu.setSize(i, height);
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        Productshop1 = new javax.swing.JPanel();
        threesoc = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        pnContainer = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        homeLabel = new javax.swing.JLabel();
        Account = new javax.swing.JPanel();
        tbSQLAccount = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        homeShop = new javax.swing.JPanel();
        ProductShop1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        editProduct = new javax.swing.JPanel();
        homeEdit = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        homeEditP = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtNameProduct = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnAddP = new javax.swing.JButton();
        btnDeleteP = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSaveP = new javax.swing.JButton();
        btnFindP = new javax.swing.JButton();
        btnEditP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        tableList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel28.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Productshop1.setBackground(new java.awt.Color(153, 153, 153));
        Productshop1.setForeground(new java.awt.Color(255, 255, 255));
        Productshop1.setPreferredSize(new java.awt.Dimension(1000, 550));
        Productshop1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        threesoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/logoshop1.jpeg"))); // NOI18N
        threesoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threesocMouseClicked(evt);
            }
        });
        Productshop1.add(threesoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 31, 35));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        Productshop1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 0, 20, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" __");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        Productshop1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 0, 30, 30));

        pnMenu.setBackground(new java.awt.Color(51, 51, 51));
        pnMenu.setForeground(new java.awt.Color(255, 255, 255));
        pnMenu.setPreferredSize(new java.awt.Dimension(212, 550));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/logoShop.jpeg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 120));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pnMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton2.setText("Home");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pnMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton3.setText("Shopping");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        pnMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 190, 110, -1));

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setText("Product Manger");
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
        pnMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton5.setText("Bill");
        pnMenu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton6.setText("Login Out");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        pnMenu.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jButton7.setBackground(new java.awt.Color(204, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton7.setText("Account");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        pnMenu.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        jButton8.setBackground(new java.awt.Color(204, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton8.setText("Introduce");
        pnMenu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jButton9.setBackground(new java.awt.Color(204, 255, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton9.setText("Product Data");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        pnMenu.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 130, -1));

        Productshop1.add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1, 550));

        pnContainer.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(153, 153, 153));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/result_homepage interface for a shoe store.png"))); // NOI18N
        homeLabel.setText("jLabel3");
        home.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 590));

        pnContainer.add(home, "card2");

        Account.setBackground(new java.awt.Color(153, 153, 153));
        Account.setForeground(new java.awt.Color(153, 153, 153));

        tbSQLAccount.setBackground(new java.awt.Color(0, 0, 0));

        tbAccount.setBackground(new java.awt.Color(204, 255, 255));
        tbAccount.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "IDUSER", "NAME", "PASSWORD", "GMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbAccount);
        if (tbAccount.getColumnModel().getColumnCount() > 0) {
            tbAccount.getColumnModel().getColumn(0).setMinWidth(50);
            tbAccount.getColumnModel().getColumn(0).setPreferredWidth(10);
            tbAccount.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout tbSQLAccountLayout = new javax.swing.GroupLayout(tbSQLAccount);
        tbSQLAccount.setLayout(tbSQLAccountLayout);
        tbSQLAccountLayout.setHorizontalGroup(
            tbSQLAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbSQLAccountLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 360, Short.MAX_VALUE))
        );
        tbSQLAccountLayout.setVerticalGroup(
            tbSQLAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout AccountLayout = new javax.swing.GroupLayout(Account);
        Account.setLayout(AccountLayout);
        AccountLayout.setHorizontalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbSQLAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        AccountLayout.setVerticalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbSQLAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnContainer.add(Account, "card3");

        homeShop.setBackground(new java.awt.Color(204, 204, 204));
        homeShop.setForeground(new java.awt.Color(255, 204, 204));
        homeShop.setPreferredSize(new java.awt.Dimension(190, 150));

        ProductShop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        ProductShop1.setText("jLabel5");
        ProductShop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductShop1MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("SIZE 36 / 100.000Đ");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel9.setText("jLabel5");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel13.setText("jLabel5");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel14.setText("jLabel5");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel22.setText("jLabel5");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel23.setText("jLabel5");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel24.setText("jLabel5");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel25.setText("jLabel5");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel26.setText("jLabel5");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel27.setText("jLabel5");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel29.setText("jLabel5");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel35.setText("jLabel5");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel36.setText("jLabel5");

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel37.setText("jLabel5");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel32.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setText("SIZE 36 / 100.000Đ");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText("SIZE 36 / 100.000Đ");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setText("SIZE 36 / 100.000Đ");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setText("SIZE 36 / 100.000Đ");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel44.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel45.setText("GIÀY NAM NIKE  "); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconProduct/Screenshot_19-2-2025_153650_nhaxinhplaza.vn_1.jpeg"))); // NOI18N
        jLabel46.setText("jLabel5");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel47.setText("SIZE 36 / 100.000Đ");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel48.setText("SIZE 36 / 100.000Đ");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel49.setText("SIZE 36 / 100.000Đ");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel50.setText("SIZE 36 / 100.000Đ");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel51.setText("SIZE 36 / 100.000Đ");

        javax.swing.GroupLayout homeShopLayout = new javax.swing.GroupLayout(homeShop);
        homeShop.setLayout(homeShopLayout);
        homeShopLayout.setHorizontalGroup(
            homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeShopLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeShopLayout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeShopLayout.createSequentialGroup()
                        .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductShop1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel6)))
                        .addGap(72, 72, 72)
                        .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(jLabel44)
                            .addComponent(jLabel51)))
                    .addComponent(jLabel45)
                    .addComponent(jLabel50))
                .addGap(74, 74, 74)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homeShopLayout.createSequentialGroup()
                        .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel39)
                            .addComponent(jLabel43))
                        .addGap(57, 57, 57)
                        .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel38)
                            .addComponent(jLabel41)
                            .addComponent(jLabel49)))
                    .addComponent(jLabel48))
                .addGap(66, 66, 66)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31)
                    .addComponent(jLabel34)
                    .addComponent(jLabel42)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeShopLayout.setVerticalGroup(
            homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeShopLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductShop1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel34))
                .addGap(57, 57, 57)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel47))
                .addGap(36, 36, 36)
                .addGroup(homeShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pnContainer.add(homeShop, "card4");

        editProduct.setBackground(new java.awt.Color(255, 255, 255));
        editProduct.setForeground(new java.awt.Color(255, 255, 255));
        editProduct.setPreferredSize(new java.awt.Dimension(840, 550));
        editProduct.setLayout(new java.awt.CardLayout());

        homeEdit.setBackground(new java.awt.Color(0, 0, 0));

        jLabel15.setBackground(new java.awt.Color(204, 204, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 255));
        jLabel15.setText("PRODUCT MANAGEMENT");

        homeEditP.setBackground(new java.awt.Color(0, 0, 0));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Name:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Size:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Price:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Color:");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Quantity:");

        txtNameProduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnAddP.setBackground(new java.awt.Color(204, 255, 255));
        btnAddP.setText("ADD");
        btnAddP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPActionPerformed(evt);
            }
        });

        btnDeleteP.setBackground(new java.awt.Color(204, 255, 255));
        btnDeleteP.setText("DELETE");
        btnDeleteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(204, 255, 255));
        btnCancel.setText("CANCEL!");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSaveP.setBackground(new java.awt.Color(204, 255, 255));
        btnSaveP.setText("SAVE");
        btnSaveP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePActionPerformed(evt);
            }
        });

        btnFindP.setBackground(new java.awt.Color(204, 255, 255));
        btnFindP.setText("FIND");
        btnFindP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPActionPerformed(evt);
            }
        });

        btnEditP.setBackground(new java.awt.Color(204, 255, 255));
        btnEditP.setText("EDIT");
        btnEditP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homeEditPLayout = new javax.swing.GroupLayout(homeEditP);
        homeEditP.setLayout(homeEditPLayout);
        homeEditPLayout.setHorizontalGroup(
            homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeEditPLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnFindP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteP)
                    .addComponent(btnEditP)
                    .addComponent(btnSaveP))
                .addContainerGap())
            .addGroup(homeEditPLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeEditPLayout.createSequentialGroup()
                        .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homeEditPLayout.createSequentialGroup()
                                .addComponent(txtNameProduct)
                                .addGap(16, 16, 16))
                            .addGroup(homeEditPLayout.createSequentialGroup()
                                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(txtColor)
                                    .addComponent(txtQuantity)
                                    .addComponent(txtPrice))
                                .addContainerGap(80, Short.MAX_VALUE))))
                    .addGroup(homeEditPLayout.createSequentialGroup()
                        .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homeEditPLayout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(homeEditPLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        homeEditPLayout.setVerticalGroup(
            homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeEditPLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(4, 4, 4)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSaveP))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteP)
                    .addComponent(btnAddP))
                .addGap(18, 18, 18)
                .addGroup(homeEditPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindP)
                    .addComponent(btnEditP))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tableList.setBackground(new java.awt.Color(0, 0, 0));
        tableList.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout tableListLayout = new javax.swing.GroupLayout(tableList);
        tableList.setLayout(tableListLayout);
        tableListLayout.setHorizontalGroup(
            tableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        tableListLayout.setVerticalGroup(
            tableListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        tbProduct.setBackground(new java.awt.Color(204, 255, 255));
        tbProduct.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID", "NAME", "SIZE", "PRICE", "QUANTITY", "COLOR", "TOTALTAX"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbProduct.setRowHeight(30);
        tbProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbProductMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbProduct);
        if (tbProduct.getColumnModel().getColumnCount() > 0) {
            tbProduct.getColumnModel().getColumn(0).setResizable(false);
            tbProduct.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbProduct.getColumnModel().getColumn(2).setMinWidth(160);
            tbProduct.getColumnModel().getColumn(2).setPreferredWidth(160);
            tbProduct.getColumnModel().getColumn(2).setMaxWidth(160);
        }

        javax.swing.GroupLayout homeEditLayout = new javax.swing.GroupLayout(homeEdit);
        homeEdit.setLayout(homeEditLayout);
        homeEditLayout.setHorizontalGroup(
            homeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeEditLayout.createSequentialGroup()
                .addGroup(homeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeEditLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(homeEditP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(tableList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeEditLayout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeEditLayout.setVerticalGroup(
            homeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(homeEditLayout.createSequentialGroup()
                        .addGroup(homeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(homeEditP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(3, 3, 3))
        );

        editProduct.add(homeEdit, "card2");

        pnContainer.add(editProduct, "card6");

        Productshop1.add(pnContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 33, 1120, 590));

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FOOTWEAR FUSION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 250, -1));

        Productshop1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -30, 1090, 80));

        getContentPane().add(Productshop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        closeMenuBar();
        threesoc.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void threesocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threesocMouseClicked
        openMenuBar();
        threesoc.setVisible(false);
        
    }//GEN-LAST:event_threesocMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Account.setVisible(false);
        home.setVisible(true);
        editProduct.setVisible(false);
        threesoc.setVisible(true);
        homeShop.setVisible(false);
        homeEdit.setVisible(false);
        homeEditP.setVisible(false);
        tableList.setVisible(false);
        tbSQLAccount.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Account.setVisible(false);
        home.setVisible(false);
        editProduct.setVisible(false);
        threesoc.setVisible(true);
        homeShop.setVisible(true);
        homeEdit.setVisible(false);
        homeEditP.setVisible(false);
        tableList.setVisible(false);
        tbSQLAccount.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        Account.setVisible(false);
        home.setVisible(false);
        editProduct.setVisible(true);
        threesoc.setVisible(true);
        homeShop.setVisible(false);
        homeEdit.setVisible(true);
        homeEditP.setVisible(true);
        tableList.setVisible(true);
        tbSQLAccount.setVisible(false);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        int dk = JOptionPane.showConfirmDialog(this, "SIGNOUT ACCOUNT CURRENTLY ?", "CONFIRM", JOptionPane.YES_NO_OPTION);
        if (dk == JOptionPane.YES_OPTION) {
            new LoginUser().setVisible(true);
            new Home().setVisible(false);
        } else {
            return;
        }
        this.dispose();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        Account.setVisible(true);
        home.setVisible(false);
        editProduct.setVisible(false);
        threesoc.setVisible(true);
        homeShop.setVisible(false);
        homeEdit.setVisible(false);
        homeEditP.setVisible(false);
        tableList.setVisible(false);
        tbSQLAccount.setVisible(true);
        tbAccount.setVisible(true);
        try {
            ViewAccount();
        } catch (ClassCastException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void tbProductMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductMouseReleased
        int selectedRow = tbProduct.getSelectedRow();
        if (selectedRow != -1) {
            String id = tbProduct.getValueAt(selectedRow, 1).toString();
            String name = tbProduct.getValueAt(selectedRow, 2).toString();
            double size = (Double) tbProduct.getValueAt(selectedRow, 3);
            double price = (Double) tbProduct.getValueAt(selectedRow, 4);
            int quantity = (Integer) tbProduct.getValueAt(selectedRow, 5);
            String color = tbProduct.getValueAt(selectedRow, 6).toString();
            txtID.setText(id);
            txtNameProduct.setText(name);
            txtSize.setText((int) size + "");
            txtPrice.setText((int) price + "");
            txtQuantity.setText(quantity + "");
            txtColor.setText(color);
        }
    }//GEN-LAST:event_tbProductMouseReleased

    private void btnSavePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePActionPerformed
        try {
            String id = this.txtID.getText().trim();
            String name = this.txtNameProduct.getText().trim();
            int size = Integer.parseInt(this.txtSize.getText().trim());
            double price = Double.parseDouble(this.txtPrice.getText().trim());
            int quantity = Integer.parseInt(this.txtQuantity.getText().trim());
            String coler = this.txtColor.getText().trim();
            if (stateAddEdit == 1) {
                if (ProductManager.instance.addProduct(id, name, size, price, quantity, coler)) {
                    LoadTableProduct();
                    View();
                    OnOff(true, false);
                    JOptionPane.showMessageDialog(this, "PRODUCT ADDED SUCCESSFULLY");
                }
            }
            if (stateAddEdit == -1) {
                if (ProductManager.instance.EditProduct(name, size, price, quantity, coler, id)) {
                    LoadTableProduct();
                    View();
                    OnOff(true, false);
                    JOptionPane.showMessageDialog(this, "PRODUCT EDITED SUCCESSFULLY");

                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Size, Price, and Quantity!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSavePActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        View();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeletePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePActionPerformed
        try {
            String id = this.txtID.getText().trim();
            String name = this.txtNameProduct.getText().trim();
            int size = Integer.parseInt(this.txtSize.getText().trim());
            double price = Double.parseDouble(this.txtPrice.getText().trim());
            int quantity = Integer.parseInt(this.txtQuantity.getText().trim());
            String coler = this.txtColor.getText().trim();
            int dk = JOptionPane.showConfirmDialog(this, "DELETE THIS PRODUCT!?", "CONFIRM!?", JOptionPane.YES_NO_OPTION);
            if (dk == JOptionPane.YES_OPTION) {
                if (ProductManager.instance.DeleteProduct(id, name, size, price, quantity, coler)) {
                    JOptionPane.showMessageDialog(this, "DELETE SUCCESSFULLY PRODUCT: " + id);
                    LoadTableProduct();
                    View();
                }
            } else {
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Size, Price, and Quantity!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnDeletePActionPerformed

    private void btnAddPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPActionPerformed
        OnOff(false, true);
        stateAddEdit = 1;
    }//GEN-LAST:event_btnAddPActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnFindPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPActionPerformed
        try {
            String id = this.txtID.getText().trim();
            String name = this.txtNameProduct.getText().trim();
            int size = Integer.parseInt(this.txtSize.getText().trim());
            double price = Double.parseDouble(this.txtPrice.getText().trim());
            int quantity = Integer.parseInt(this.txtQuantity.getText().trim());
            String coler = this.txtColor.getText().trim();
            if (ProductManager.instance.FindProduct(id, name, size, price, quantity, coler)) {
                View();
            } else {
                JOptionPane.showMessageDialog(this, "NOT FOUNDED PRODUCT ID : " + id);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Size, Price, and Quantity!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFindPActionPerformed

    private void btnEditPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPActionPerformed
        OnOff(false, true);
        stateAddEdit = -1;
    }//GEN-LAST:event_btnEditPActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked

    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ProductShop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductShop1MouseClicked
        JOptionPane.showConfirmDialog(this, "BUY THIS PRODUCT", "COFIRM", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_ProductShop1MouseClicked

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JLabel ProductShop1;
    private javax.swing.JPanel Productshop1;
    private javax.swing.JButton btnAddP;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteP;
    private javax.swing.JButton btnEditP;
    private javax.swing.JButton btnFindP;
    private javax.swing.JButton btnSaveP;
    private javax.swing.JPanel editProduct;
    private javax.swing.JPanel home;
    private javax.swing.JPanel homeEdit;
    private javax.swing.JPanel homeEditP;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel homeShop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pnContainer;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel tableList;
    private javax.swing.JTable tbAccount;
    private javax.swing.JTable tbProduct;
    private javax.swing.JPanel tbSQLAccount;
    private javax.swing.JLabel threesoc;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNameProduct;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSize;
    // End of variables declaration//GEN-END:variables
}
