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
import Assets.FONT.Fonts;


public class Builder extends javax.swing.JFrame {

    int mouseX, mouseY;
    String cmbH="N", cmbC="N", cmbL="N", cmbB="N", cmbW="N", root="Z_HN_CN_LN_BN_WN.png";
    String[] saves = new String[4];
    Fonts typeFont;
    
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    
    public Builder() {
        initComponents();
        decorator();
        
        //Armadura
        setImageLabel(lblHelmet, "src/Assets/IMG/Items/Armor/Helmet/Nothing.png");
        setImageLabel(lblChesplate, "src/Assets/IMG/Items/Armor/Chestplate/Nothing.png");
        setImageLabel(lblLeggins, "src/Assets/IMG/Items/Armor/Leggings/Nothing.png");
        setImageLabel(lblBoots, "src/Assets/IMG/Items/Armor/Boots/Nothing.png");
        setImageLabel(lblWeapon, "src/Assets/IMG/Items/Armor/Weapon/Nothing.png");
        
        //Enemy
        setImageLabel(lblEnemy, "src/Assets/IMG/Enemies/Zombie_Combinations/Z_HN_CN_LN_BN_WN.png");
        
        
    }

    
    private void decorator(){
        typeFont = new Fonts();
        
        lblSubtittle.setFont(typeFont.fontV(typeFont.instruments, 1, 18));
        lblSubtittle1.setFont(typeFont.fontV(typeFont.instruments, 1, 18));
        lblGenerator1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblGenerator2.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblGenerator3.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblGenerator4.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblSave.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        cmbHelmet.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        cmbChesplate.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        cmbLeggins.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        cmbBoots.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        cmbSaveState.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
  
    
    }
    
    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    
    private void dressUp(){
        root="Z_H"+cmbH.charAt(0)+"_C"+cmbC.charAt(0)+"_L"+cmbL.charAt(0)+"_B"+cmbB.charAt(0)+"_W"+cmbW.charAt(0)+".png";
        setImageLabel(lblEnemy, "src/Assets/IMG/Enemies/Zombie_Combinations/"+root);
    
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
        lblGenerate3.setIcon(lblGenerate2.getIcon());
        lblGenerate2.setIcon(lblGenerate1.getIcon());
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
        pnlSeparator3 = new javax.swing.JPanel();
        btnGenerator1 = new javax.swing.JPanel();
        lblGenerator1 = new javax.swing.JLabel();
        btnGenerator3 = new javax.swing.JPanel();
        lblGenerator3 = new javax.swing.JLabel();
        btnGenerator2 = new javax.swing.JPanel();
        lblGenerator2 = new javax.swing.JLabel();
        btnGenerator4 = new javax.swing.JPanel();
        lblGenerator4 = new javax.swing.JLabel();
        lblGenerate3 = new javax.swing.JLabel();
        lblGenerate1 = new javax.swing.JLabel();
        lblGenerate2 = new javax.swing.JLabel();
        lblSubtittle = new javax.swing.JLabel();
        cmbHelmet = new javax.swing.JComboBox<>();
        cmbChesplate = new javax.swing.JComboBox<>();
        cmbWeapon = new javax.swing.JComboBox<>();
        cmbBoots = new javax.swing.JComboBox<>();
        cmbLeggins = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JPanel();
        lblSave = new javax.swing.JLabel();
        cmbSaveState = new javax.swing.JComboBox<>();
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
        lblSubtittle1 = new javax.swing.JLabel();

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

        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 60));

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
            .addGap(0, 670, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 60));

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

        jPanel1.add(pnlSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 720, 3));

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

        jPanel1.add(pnlSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 59, 2, 380));

        pnlSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlSeparator3Layout = new javax.swing.GroupLayout(pnlSeparator3);
        pnlSeparator3.setLayout(pnlSeparator3Layout);
        pnlSeparator3Layout.setHorizontalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        pnlSeparator3Layout.setVerticalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(pnlSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 320, 2));

        lblGenerator1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenerator1.setText("Generar Configuración 1");
        lblGenerator1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGenerator1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGenerator1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGenerator1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGenerator1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGenerator1Layout = new javax.swing.GroupLayout(btnGenerator1);
        btnGenerator1.setLayout(btnGenerator1Layout);
        btnGenerator1Layout.setHorizontalGroup(
            btnGenerator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnGenerator1Layout.setVerticalGroup(
            btnGenerator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(btnGenerator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 138, 46));

        lblGenerator3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenerator3.setText("Generar Configuración 3");
        lblGenerator3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGenerator3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGenerator3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGenerator3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGenerator3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGenerator3Layout = new javax.swing.GroupLayout(btnGenerator3);
        btnGenerator3.setLayout(btnGenerator3Layout);
        btnGenerator3Layout.setHorizontalGroup(
            btnGenerator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnGenerator3Layout.setVerticalGroup(
            btnGenerator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator3, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(btnGenerator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        lblGenerator2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenerator2.setText("Generar Configuración 2");
        lblGenerator2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGenerator2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGenerator2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGenerator2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGenerator2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGenerator2Layout = new javax.swing.GroupLayout(btnGenerator2);
        btnGenerator2.setLayout(btnGenerator2Layout);
        btnGenerator2Layout.setHorizontalGroup(
            btnGenerator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnGenerator2Layout.setVerticalGroup(
            btnGenerator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(btnGenerator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        lblGenerator4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenerator4.setText("Generar Configuración 4");
        lblGenerator4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGenerator4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGenerator4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGenerator4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGenerator4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGenerator4Layout = new javax.swing.GroupLayout(btnGenerator4);
        btnGenerator4.setLayout(btnGenerator4Layout);
        btnGenerator4Layout.setHorizontalGroup(
            btnGenerator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnGenerator4Layout.setVerticalGroup(
            btnGenerator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGenerator4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(btnGenerator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));
        jPanel1.add(lblGenerate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 275, 90, 160));
        jPanel1.add(lblGenerate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 275, 90, 160));
        jPanel1.add(lblGenerate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 275, 90, 160));

        lblSubtittle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSubtittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtittle.setText("Editor de Enemigos");
        jPanel1.add(lblSubtittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 300, -1));

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

        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setText("Guardar Configuración en:");
        lblSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSaveMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 165, 46));

        cmbSaveState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slot 01", "Slot 02", "Slot 03", "Slot 04" }));
        jPanel1.add(cmbSaveState, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        lblEnemy.setText("jLabel2");
        jPanel1.add(lblEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 220, 300));

        pnWepon.setBackground(new java.awt.Color(138, 138, 138));

        lblWeapon.setText("jLabel2");

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

        lblBoots.setText("jLabel2");

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

        lblLeggins.setText("jLabel2");

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

        lblChesplate.setText("jLabel2");

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

        lblHelmet.setText("jLabel2");

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

        lblSubtittle1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSubtittle1.setText("Enemigos Generados:");
        jPanel1.add(lblSubtittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 250, 300, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
       saves[cmbSaveState.getSelectedIndex()]="src/Assets/IMG/Enemies/Zombie_Combinations/"+root;
       JOptionPane.showMessageDialog(null, "Guardado exitosamente en "+cmbSaveState.getSelectedItem().toString());
    }//GEN-LAST:event_lblSaveMouseClicked

    private void lblSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseEntered
        btnSave.setOpaque(true);
        btnSave.setBackground(colorEntered);
    }//GEN-LAST:event_lblSaveMouseEntered

    private void lblSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseExited
        btnSave.setOpaque(true);
        btnSave.setBackground(colorDefault);
    }//GEN-LAST:event_lblSaveMouseExited

    private void lblGenerator1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator1MouseEntered
        btnGenerator1.setOpaque(true);
        btnGenerator1.setBackground(colorEntered);
    }//GEN-LAST:event_lblGenerator1MouseEntered

    private void lblGenerator1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator1MouseExited
        btnGenerator1.setOpaque(true);
        btnGenerator1.setBackground(colorDefault);
    }//GEN-LAST:event_lblGenerator1MouseExited

    private void lblGenerator2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator2MouseEntered
        btnGenerator2.setOpaque(true);
        btnGenerator2.setBackground(colorEntered);
    }//GEN-LAST:event_lblGenerator2MouseEntered

    private void lblGenerator2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator2MouseExited
        btnGenerator2.setOpaque(true);
        btnGenerator2.setBackground(colorDefault);
    }//GEN-LAST:event_lblGenerator2MouseExited

    private void lblGenerator3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator3MouseEntered
        btnGenerator3.setOpaque(true);
        btnGenerator3.setBackground(colorEntered);
    }//GEN-LAST:event_lblGenerator3MouseEntered

    private void lblGenerator3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator3MouseExited
        btnGenerator3.setOpaque(true);
        btnGenerator3.setBackground(colorDefault);
    }//GEN-LAST:event_lblGenerator3MouseExited

    private void lblGenerator4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator4MouseEntered
        btnGenerator4.setOpaque(true);
        btnGenerator4.setBackground(colorEntered);
    }//GEN-LAST:event_lblGenerator4MouseEntered

    private void lblGenerator4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator4MouseExited
        btnGenerator4.setOpaque(true);
        btnGenerator4.setBackground(colorDefault);
    }//GEN-LAST:event_lblGenerator4MouseExited

    private void cmbHelmetItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHelmetItemStateChanged
        cmbH=cmbHelmet.getSelectedItem().toString();
        cmbH=english(cmbH);
        setImageLabel(lblHelmet, "src/Assets/IMG/Items/Armor/Helmet/"+cmbH+".png");
        dressUp();        
    }//GEN-LAST:event_cmbHelmetItemStateChanged

    private void cmbChesplateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbChesplateItemStateChanged
        cmbC=cmbChesplate.getSelectedItem().toString();
        cmbC=english(cmbC);
        setImageLabel(lblChesplate, "src/Assets/IMG/Items/Armor/Chestplate/"+cmbC+".png");
        dressUp();
    }//GEN-LAST:event_cmbChesplateItemStateChanged

    private void cmbLegginsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLegginsItemStateChanged
        cmbL=cmbLeggins.getSelectedItem().toString();
        cmbL=english(cmbL);
        setImageLabel(lblLeggins, "src/Assets/IMG/Items/Armor/Leggings/"+cmbL+".png");
        dressUp();
    }//GEN-LAST:event_cmbLegginsItemStateChanged

    private void cmbBootsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBootsItemStateChanged
        cmbB=cmbBoots.getSelectedItem().toString();
        cmbB=english(cmbB);
        setImageLabel(lblBoots, "src/Assets/IMG/Items/Armor/Boots/"+cmbB+".png");
        dressUp();
    }//GEN-LAST:event_cmbBootsItemStateChanged

    private void cmbWeaponItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWeaponItemStateChanged
        cmbW=cmbWeapon.getSelectedItem().toString();
        cmbW=english(cmbW);
        setImageLabel(lblWeapon, "src/Assets/IMG/Items/Armor/Weapon/"+cmbW+".png");
        dressUp();
    }//GEN-LAST:event_cmbWeaponItemStateChanged

    private void lblGenerator1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator1MouseClicked
        pass();
        setImageLabel(lblGenerate1, saves[0]);
    }//GEN-LAST:event_lblGenerator1MouseClicked

    private void lblGenerator2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator2MouseClicked
        pass();
        setImageLabel(lblGenerate1, saves[1]);
    }//GEN-LAST:event_lblGenerator2MouseClicked

    private void lblGenerator3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator3MouseClicked
        pass();
        setImageLabel(lblGenerate1, saves[2]);
    }//GEN-LAST:event_lblGenerator3MouseClicked

    private void lblGenerator4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerator4MouseClicked
        pass();
        setImageLabel(lblGenerate1, saves[3]);
    }//GEN-LAST:event_lblGenerator4MouseClicked

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
            java.util.logging.Logger.getLogger(Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Builder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Builder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnGenerator1;
    private javax.swing.JPanel btnGenerator2;
    private javax.swing.JPanel btnGenerator3;
    private javax.swing.JPanel btnGenerator4;
    private javax.swing.JPanel btnSave;
    private javax.swing.JComboBox<String> cmbBoots;
    private javax.swing.JComboBox<String> cmbChesplate;
    private javax.swing.JComboBox<String> cmbHelmet;
    private javax.swing.JComboBox<String> cmbLeggins;
    private javax.swing.JComboBox<String> cmbSaveState;
    private javax.swing.JComboBox<String> cmbWeapon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBoots;
    private javax.swing.JLabel lblChesplate;
    private javax.swing.JLabel lblEnemy;
    private javax.swing.JLabel lblGenerate1;
    private javax.swing.JLabel lblGenerate2;
    private javax.swing.JLabel lblGenerate3;
    private javax.swing.JLabel lblGenerator1;
    private javax.swing.JLabel lblGenerator2;
    private javax.swing.JLabel lblGenerator3;
    private javax.swing.JLabel lblGenerator4;
    private javax.swing.JLabel lblHelmet;
    private javax.swing.JLabel lblLeggins;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblSubtittle;
    private javax.swing.JLabel lblSubtittle1;
    private javax.swing.JLabel lblWeapon;
    private javax.swing.JPanel pnWepon;
    private javax.swing.JPanel pnlBoots;
    private javax.swing.JPanel pnlChesplate;
    private javax.swing.JPanel pnlHelmet;
    private javax.swing.JPanel pnlLeggins;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JPanel pnlSeparator2;
    private javax.swing.JPanel pnlSeparator3;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
