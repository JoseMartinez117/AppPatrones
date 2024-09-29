/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Prototype extends javax.swing.JFrame {

    int mouseX, mouseY;
    String cmbH="N", cmbC="N", cmbL="N", cmbB="N", cmbW="N", root="Z_HN_CN_LN_BN_WN.png";
    
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    
    public Prototype() {
        initComponents();
        
        //Armadura
        setImageLabel(lblHelmet, "src/Assets/IMG/Items/Armor/Helmet/Nothing.png");
        setImageLabel(lblChesplate, "src/Assets/IMG/Items/Armor/Chestplate/Nothing.png");
        setImageLabel(lblLeggins, "src/Assets/IMG/Items/Armor/Leggings/Nothing.png");
        setImageLabel(lblBoots, "src/Assets/IMG/Items/Armor/Boots/Nothing.png");
        setImageLabel(lblWeapon, "src/Assets/IMG/Items/Armor/Weapon/Nothing.png");
        
        //Enemy
        setImageLabel(lblEnemy, "src/Assets/IMG/Enemies/Zombie_Combinations/Z_HN_CN_LN_BN_WN.png");
        
        lblMemory.setText("Dirección en memoria: "+Integer.toHexString(System.identityHashCode(lblMemory)));
    }

    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    
    private void dressUp(JLabel lable){
        root="Z_H"+cmbH.charAt(0)+"_C"+cmbC.charAt(0)+"_L"+cmbL.charAt(0)+"_B"+cmbB.charAt(0)+"_W"+cmbW.charAt(0)+".png";
        setImageLabel(lable, "src/Assets/IMG/Enemies/Zombie_Combinations/"+root);
    
    }
    
    private String english(String word){
        String translate=" ";
        
        switch(word){
            case "Diamante":
                translate="Diamond";
                break;
            case "Hierro":
                translate="Iron";
                break;
            case "Oro":
                translate="Gold";
                break;
            case "Nada":
                translate="Nothing";
                break;
            case "Tridente":
                translate="Trident";
                break;
            case "Escudo":
                translate="Shield";
                break;
        }

        return translate;
        
    }
    
    private void pass(){  

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        pnlSeparator = new javax.swing.JPanel();
        pnlSeparator2 = new javax.swing.JPanel();
        lblEnemy2 = new javax.swing.JLabel();
        lblMemory = new javax.swing.JLabel();
        cmbHelmet = new javax.swing.JComboBox<>();
        cmbChesplate = new javax.swing.JComboBox<>();
        cmbWeapon = new javax.swing.JComboBox<>();
        cmbBoots = new javax.swing.JComboBox<>();
        cmbLeggins = new javax.swing.JComboBox<>();
        btnPrototype = new javax.swing.JPanel();
        lblPrototype = new javax.swing.JLabel();
        lblEnemy = new javax.swing.JLabel();
        pnWepon = new javax.swing.JPanel();
        lblWeapon = new javax.swing.JLabel();
        pnlBoots = new javax.swing.JPanel();
        lblBoots = new javax.swing.JLabel();
        pnlLeggins = new javax.swing.JPanel();
        lblLeggins = new javax.swing.JLabel();
        pnlChesplate = new javax.swing.JPanel();
        lblChesplate = new javax.swing.JLabel();
        pnlHelmet = new javax.swing.JPanel();
        lblHelmet = new javax.swing.JLabel();
        cmbWeapon1 = new javax.swing.JComboBox<>();
        cmbBoots1 = new javax.swing.JComboBox<>();
        cmbChesplate1 = new javax.swing.JComboBox<>();
        pnlHelmet1 = new javax.swing.JPanel();
        lblHelmet1 = new javax.swing.JLabel();
        pnlChesplate1 = new javax.swing.JPanel();
        lblChesplate1 = new javax.swing.JLabel();
        cmbLeggins1 = new javax.swing.JComboBox<>();
        pnlBoots1 = new javax.swing.JPanel();
        lblBoots1 = new javax.swing.JLabel();
        pnWepon1 = new javax.swing.JPanel();
        lblWeapon1 = new javax.swing.JLabel();
        cmbHelmet1 = new javax.swing.JComboBox<>();
        pnlLeggins1 = new javax.swing.JPanel();
        lblLeggins1 = new javax.swing.JLabel();
        lblMemory2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(217, 152, 141));
        btnClose.setToolTipText("");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setOpaque(false);

        txtCerrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerrar.setText("X");
        txtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCloseLayout = new javax.swing.GroupLayout(btnClose);
        btnClose.setLayout(btnCloseLayout);
        btnCloseLayout.setHorizontalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtCerrar)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCloseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, 60));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 60));

        pnlSeparator.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlSeparatorLayout = new javax.swing.GroupLayout(pnlSeparator);
        pnlSeparator.setLayout(pnlSeparatorLayout);
        pnlSeparatorLayout.setHorizontalGroup(
            pnlSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlSeparatorLayout.setVerticalGroup(
            pnlSeparatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(pnlSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 865, 3));

        pnlSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlSeparator2Layout = new javax.swing.GroupLayout(pnlSeparator2);
        pnlSeparator2.setLayout(pnlSeparator2Layout);
        pnlSeparator2Layout.setHorizontalGroup(
            pnlSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        pnlSeparator2Layout.setVerticalGroup(
            pnlSeparator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jPanel1.add(pnlSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 59, 2, 380));
        jPanel1.add(lblEnemy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 220, 300));

        lblMemory.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(lblMemory, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, -1));

        cmbHelmet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbHelmet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHelmetItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbHelmet, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 115, -1, -1));

        cmbChesplate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbChesplate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbChesplateItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbChesplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 165, -1, -1));

        cmbWeapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Tridente", "Escudo" }));
        cmbWeapon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWeaponItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbWeapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 315, -1, -1));

        cmbBoots.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbBoots.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBootsItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbBoots, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 265, -1, -1));

        cmbLeggins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbLeggins.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLegginsItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbLeggins, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 215, -1, -1));

        lblPrototype.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrototype.setText("Prototipar");
        lblPrototype.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPrototype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrototypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPrototypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPrototypeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPrototypeLayout = new javax.swing.GroupLayout(btnPrototype);
        btnPrototype.setLayout(btnPrototypeLayout);
        btnPrototypeLayout.setHorizontalGroup(
            btnPrototypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(btnPrototypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPrototypeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblPrototype, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnPrototypeLayout.setVerticalGroup(
            btnPrototypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnPrototypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPrototypeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblPrototype, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(btnPrototype, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 120, 40));
        jPanel1.add(lblEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 220, 300));

        pnWepon.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnWeponLayout = new javax.swing.GroupLayout(pnWepon);
        pnWepon.setLayout(pnWeponLayout);
        pnWeponLayout.setHorizontalGroup(
            pnWeponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnWeponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnWeponLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnWeponLayout.setVerticalGroup(
            pnWeponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnWeponLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnWeponLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnWepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, 50));

        pnlBoots.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlBootsLayout = new javax.swing.GroupLayout(pnlBoots);
        pnlBoots.setLayout(pnlBootsLayout);
        pnlBootsLayout.setHorizontalGroup(
            pnlBootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlBootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBootsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblBoots, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlBootsLayout.setVerticalGroup(
            pnlBootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlBootsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBootsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblBoots, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlBoots, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 50));

        pnlLeggins.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlLegginsLayout = new javax.swing.GroupLayout(pnlLeggins);
        pnlLeggins.setLayout(pnlLegginsLayout);
        pnlLegginsLayout.setHorizontalGroup(
            pnlLegginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlLegginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLegginsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLeggins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlLegginsLayout.setVerticalGroup(
            pnlLegginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlLegginsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLegginsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLeggins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlLeggins, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        pnlChesplate.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlChesplateLayout = new javax.swing.GroupLayout(pnlChesplate);
        pnlChesplate.setLayout(pnlChesplateLayout);
        pnlChesplateLayout.setHorizontalGroup(
            pnlChesplateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlChesplateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlChesplateLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblChesplate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlChesplateLayout.setVerticalGroup(
            pnlChesplateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlChesplateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlChesplateLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblChesplate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlChesplate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 50));

        pnlHelmet.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlHelmetLayout = new javax.swing.GroupLayout(pnlHelmet);
        pnlHelmet.setLayout(pnlHelmetLayout);
        pnlHelmetLayout.setHorizontalGroup(
            pnlHelmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlHelmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlHelmetLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHelmet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlHelmetLayout.setVerticalGroup(
            pnlHelmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlHelmetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlHelmetLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHelmet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlHelmet, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 50));

        cmbWeapon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Tridente", "Escudo" }));
        cmbWeapon1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWeapon1ItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbWeapon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        cmbBoots1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbBoots1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBoots1ItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbBoots1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, -1, -1));

        cmbChesplate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbChesplate1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbChesplate1ItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbChesplate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 180, -1, -1));

        pnlHelmet1.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlHelmet1Layout = new javax.swing.GroupLayout(pnlHelmet1);
        pnlHelmet1.setLayout(pnlHelmet1Layout);
        pnlHelmet1Layout.setHorizontalGroup(
            pnlHelmet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlHelmet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlHelmet1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHelmet1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlHelmet1Layout.setVerticalGroup(
            pnlHelmet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlHelmet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlHelmet1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHelmet1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlHelmet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 50, 50));

        pnlChesplate1.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlChesplate1Layout = new javax.swing.GroupLayout(pnlChesplate1);
        pnlChesplate1.setLayout(pnlChesplate1Layout);
        pnlChesplate1Layout.setHorizontalGroup(
            pnlChesplate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlChesplate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlChesplate1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblChesplate1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlChesplate1Layout.setVerticalGroup(
            pnlChesplate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlChesplate1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlChesplate1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblChesplate1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlChesplate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 50, 50));

        cmbLeggins1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbLeggins1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLeggins1ItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbLeggins1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, -1, -1));

        pnlBoots1.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlBoots1Layout = new javax.swing.GroupLayout(pnlBoots1);
        pnlBoots1.setLayout(pnlBoots1Layout);
        pnlBoots1Layout.setHorizontalGroup(
            pnlBoots1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlBoots1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBoots1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblBoots1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlBoots1Layout.setVerticalGroup(
            pnlBoots1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlBoots1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlBoots1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblBoots1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlBoots1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 270, 50, 50));

        pnWepon1.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnWepon1Layout = new javax.swing.GroupLayout(pnWepon1);
        pnWepon1.setLayout(pnWepon1Layout);
        pnWepon1Layout.setHorizontalGroup(
            pnWepon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnWepon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnWepon1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblWeapon1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnWepon1Layout.setVerticalGroup(
            pnWepon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnWepon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnWepon1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblWeapon1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnWepon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 50, 50));

        cmbHelmet1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nada", "Diamante", "Hierro", "Oro" }));
        cmbHelmet1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHelmet1ItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbHelmet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, -1));

        pnlLeggins1.setBackground(new java.awt.Color(138, 138, 138));

        javax.swing.GroupLayout pnlLeggins1Layout = new javax.swing.GroupLayout(pnlLeggins1);
        pnlLeggins1.setLayout(pnlLeggins1Layout);
        pnlLeggins1Layout.setHorizontalGroup(
            pnlLeggins1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlLeggins1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLeggins1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLeggins1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnlLeggins1Layout.setVerticalGroup(
            pnlLeggins1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnlLeggins1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLeggins1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblLeggins1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(pnlLeggins1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, -1, -1));

        lblMemory2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel1.add(lblMemory2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 290, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseExited
        btnClose.setBackground(Color.pink);
        btnClose.setOpaque(false);
    }//GEN-LAST:event_txtCerrarMouseExited

    private void txtCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseEntered
        btnClose.setOpaque(true);
        btnClose.setBackground(Color.red);
    }//GEN-LAST:event_txtCerrarMouseEntered

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_HeaderMouseDragged

    private void lblPrototypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrototypeMouseClicked
        lblEnemy2.setIcon(lblEnemy.getIcon());
        lblHelmet1.setIcon(lblHelmet.getIcon());
        lblChesplate1.setIcon(lblChesplate.getIcon());
        lblLeggins1.setIcon(lblLeggins.getIcon());
        lblBoots1.setIcon(lblBoots.getIcon());
        lblWeapon1.setIcon(lblWeapon.getIcon());
        lblMemory2.setText("Dirección en memoria: "+Integer.toHexString(System.identityHashCode(lblMemory2)));
     
    }//GEN-LAST:event_lblPrototypeMouseClicked

    private void lblPrototypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrototypeMouseEntered
        btnPrototype.setOpaque(true);
        btnPrototype.setBackground(colorEntered);
    }//GEN-LAST:event_lblPrototypeMouseEntered

    private void lblPrototypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrototypeMouseExited
        btnPrototype.setOpaque(true);
        btnPrototype.setBackground(colorDefault);
    }//GEN-LAST:event_lblPrototypeMouseExited

    private void cmbHelmetItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHelmetItemStateChanged
        cmbH=cmbHelmet.getSelectedItem().toString();
        cmbH=english(cmbH);
        setImageLabel(lblHelmet, "src/Assets/IMG/Items/Armor/Helmet/"+cmbH+".png");
        dressUp(lblEnemy);        
    }//GEN-LAST:event_cmbHelmetItemStateChanged

    private void cmbChesplateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChesplateItemStateChanged
        cmbC=cmbChesplate.getSelectedItem().toString();
        cmbC=english(cmbC);
        setImageLabel(lblChesplate, "src/Assets/IMG/Items/Armor/Chestplate/"+cmbC+".png");
        dressUp(lblEnemy);
    }//GEN-LAST:event_cmbChesplateItemStateChanged

    private void cmbLegginsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLegginsItemStateChanged
        cmbL=cmbLeggins.getSelectedItem().toString();
        cmbL=english(cmbL);
        setImageLabel(lblLeggins, "src/Assets/IMG/Items/Armor/Leggings/"+cmbL+".png");
        dressUp(lblEnemy);
    }//GEN-LAST:event_cmbLegginsItemStateChanged

    private void cmbBootsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBootsItemStateChanged
        cmbB=cmbBoots.getSelectedItem().toString();
        cmbB=english(cmbB);
        setImageLabel(lblBoots, "src/Assets/IMG/Items/Armor/Boots/"+cmbB+".png");
        dressUp(lblEnemy);
    }//GEN-LAST:event_cmbBootsItemStateChanged

    private void cmbWeaponItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWeaponItemStateChanged
        cmbW=cmbWeapon.getSelectedItem().toString();
        cmbW=english(cmbW);
        setImageLabel(lblWeapon, "src/Assets/IMG/Items/Armor/Weapon/"+cmbW+".png");
        dressUp(lblEnemy);
    }//GEN-LAST:event_cmbWeaponItemStateChanged

    private void cmbWeapon1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWeapon1ItemStateChanged
        cmbW=cmbWeapon1.getSelectedItem().toString();
        cmbW=english(cmbW);
        setImageLabel(lblWeapon1, "src/Assets/IMG/Items/Armor/Weapon/"+cmbW+".png");
        dressUp(lblEnemy2);
    }//GEN-LAST:event_cmbWeapon1ItemStateChanged

    private void cmbBoots1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBoots1ItemStateChanged
        cmbB=cmbBoots1.getSelectedItem().toString();
        cmbB=english(cmbB);
        setImageLabel(lblBoots1, "src/Assets/IMG/Items/Armor/Boots/"+cmbB+".png");
        dressUp(lblEnemy2);
    }//GEN-LAST:event_cmbBoots1ItemStateChanged

    private void cmbChesplate1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChesplate1ItemStateChanged
        cmbC=cmbChesplate1.getSelectedItem().toString();
        cmbC=english(cmbC);
        setImageLabel(lblChesplate1, "src/Assets/IMG/Items/Armor/Chestplate/"+cmbC+".png");
        dressUp(lblEnemy2);
    }//GEN-LAST:event_cmbChesplate1ItemStateChanged

    private void cmbLeggins1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLeggins1ItemStateChanged
        cmbL=cmbLeggins1.getSelectedItem().toString();
        cmbL=english(cmbL);
        setImageLabel(lblLeggins1, "src/Assets/IMG/Items/Armor/Leggings/"+cmbL+".png");
        dressUp(lblEnemy2);
    }//GEN-LAST:event_cmbLeggins1ItemStateChanged

    private void cmbHelmet1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHelmet1ItemStateChanged
        cmbH=cmbHelmet1.getSelectedItem().toString();
        cmbH=english(cmbH);
        setImageLabel(lblHelmet1, "src/Assets/IMG/Items/Armor/Helmet/"+cmbH+".png");
        dressUp(lblEnemy2); 
    }//GEN-LAST:event_cmbHelmet1ItemStateChanged

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
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prototype.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prototype().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnPrototype;
    private javax.swing.JComboBox<String> cmbBoots;
    private javax.swing.JComboBox<String> cmbBoots1;
    private javax.swing.JComboBox<String> cmbChesplate;
    private javax.swing.JComboBox<String> cmbChesplate1;
    private javax.swing.JComboBox<String> cmbHelmet;
    private javax.swing.JComboBox<String> cmbHelmet1;
    private javax.swing.JComboBox<String> cmbLeggins;
    private javax.swing.JComboBox<String> cmbLeggins1;
    private javax.swing.JComboBox<String> cmbWeapon;
    private javax.swing.JComboBox<String> cmbWeapon1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBoots;
    private javax.swing.JLabel lblBoots1;
    private javax.swing.JLabel lblChesplate;
    private javax.swing.JLabel lblChesplate1;
    private javax.swing.JLabel lblEnemy;
    private javax.swing.JLabel lblEnemy2;
    private javax.swing.JLabel lblHelmet;
    private javax.swing.JLabel lblHelmet1;
    private javax.swing.JLabel lblLeggins;
    private javax.swing.JLabel lblLeggins1;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblMemory2;
    private javax.swing.JLabel lblPrototype;
    private javax.swing.JLabel lblWeapon;
    private javax.swing.JLabel lblWeapon1;
    private javax.swing.JPanel pnWepon;
    private javax.swing.JPanel pnWepon1;
    private javax.swing.JPanel pnlBoots;
    private javax.swing.JPanel pnlBoots1;
    private javax.swing.JPanel pnlChesplate;
    private javax.swing.JPanel pnlChesplate1;
    private javax.swing.JPanel pnlHelmet;
    private javax.swing.JPanel pnlHelmet1;
    private javax.swing.JPanel pnlLeggins;
    private javax.swing.JPanel pnlLeggins1;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JPanel pnlSeparator2;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
