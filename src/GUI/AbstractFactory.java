/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Assets.FONT.Fonts;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AbstractFactory extends javax.swing.JFrame {

    int mouseX, mouseY;
    String [][] crafting = {{"","",""}, {"","",""}, {"","",""}};
    String material;
    Color colorEntered=new Color(128, 128, 128);
    Color colorSelected=new Color(128, 128, 129);
    Color colorDefault=new Color(214, 217, 223);
    Fonts typeFont;
    
    public AbstractFactory() {
        initComponents();
        defaultButtons();
        typeFont = new Fonts();
        
        //Ores para construir
        setImageLabel(lblDiamond, "src/Assets/IMG/Items/Materials/Diamond.png");
        setImageLabel(lblGold, "src/Assets/IMG/Items/Materials/Gold.png");
        setImageLabel(lblIron, "src/Assets/IMG/Items/Materials/Iron.png");
        setImageLabel(lblCobblestone, "src/Assets/IMG/Items/Materials/Cobblestone.png");
        setImageLabel(lblStick, "src/Assets/IMG/Items/Materials/Stick.png");
        
        //Ejemplos
        setImageLabel(lblExample1, "src/Assets/IMG/Recipes/Craft_Hoe.png");
        setImageLabel(lblExample2, "src/Assets/IMG/Recipes/Craft_Shovel.png");
        setImageLabel(lblExample3, "src/Assets/IMG/Recipes/Craft_Axe.png");
        setImageLabel(lblExample4, "src/Assets/IMG/Recipes/Craft_Pickaxe.png");
        
        //Crafteo
        setImageLabel(lblFactory, "src/Assets/IMG/Icons/Patterns/Fabric_Icon.png");
        
        
        lblSubtittle.setFont(typeFont.fontV(typeFont.instruments, 1, 18));
        lblSubtittle1.setFont(typeFont.fontV(typeFont.instruments, 1, 18));
        lblSubtittle2.setFont(typeFont.fontV(typeFont.instruments, 1, 18));
    }

    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void defaultButtons(){
        btnDiamond.setBackground(colorDefault);
        btnGold.setBackground(colorDefault);
        btnIron.setBackground(colorDefault);
        btnCobblestone.setBackground(colorDefault);
        btnStick.setBackground(colorDefault);
    }
    
    private void comparare(){
        
        if(crafting[1][1].equals("Stick")&&crafting[2][1].equals("Stick")){
           if(crafting[2][0].equals("") && crafting[1][2].equals("") && crafting[2][2].equals("")){
               if(!crafting[1][0].equals("")  && !crafting[1][0].equals("Stick")){
                   if(crafting[1][0].equals(crafting[0][0])&&crafting[1][0].equals(crafting[0][1]) && crafting[0][2].equals("")){
                       setImageLabel(lblResult, "src/Assets/IMG/Items/Tools/"+crafting[1][0]+"/Axe.png");
                       setImageLabel(lblFactory, "src/Assets/IMG/Icons/Patterns/Fabric"+crafting[1][0]+"_Icon.png");
                   }else{
                        lblResult.setIcon(null);
                    }
               } else if(!crafting[0][1].equals("") && !crafting[0][1].equals("Stick") ){
                   if(crafting[0][0].equals(crafting[0][1])){
                       if(crafting[0][2].equals(crafting[0][1])){
                          setImageLabel(lblResult, "src/Assets/IMG/Items/Tools/"+crafting[0][1]+"/Pickaxe.png");
                          setImageLabel(lblFactory, "src/Assets/IMG/Icons/Patterns/Fabric"+crafting[0][1]+"_Icon.png");
                       }else if(crafting[0][2].equals("")){
                          setImageLabel(lblResult, "src/Assets/IMG/Items/Tools/"+crafting[0][1]+"/Hoe.png"); 
                          setImageLabel(lblFactory, "src/Assets/IMG/Icons/Patterns/Fabric"+crafting[0][1]+"_Icon.png");
                       }else{
                            lblResult.setIcon(null);
                        }
                   }else if(crafting[0][0].equals("") && crafting[0][2].equals("")){
                       setImageLabel(lblResult, "src/Assets/IMG/Items/Tools/"+crafting[0][1]+"/Shovel.png");
                       setImageLabel(lblFactory, "src/Assets/IMG/Icons/Patterns/Fabric"+crafting[0][1]+"_Icon.png");
                   
                   }else{
                        lblResult.setIcon(null);
                    }
               }else{
                   lblResult.setIcon(null);
               }
               
           }else{
                   lblResult.setIcon(null);
               }
        }else{
                   lblResult.setIcon(null);
               }
        
        
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
        btnDiamond = new javax.swing.JPanel();
        lblDiamond = new javax.swing.JLabel();
        btnGold = new javax.swing.JPanel();
        lblGold = new javax.swing.JLabel();
        btnIron = new javax.swing.JPanel();
        lblIron = new javax.swing.JLabel();
        btnCobblestone = new javax.swing.JPanel();
        lblCobblestone = new javax.swing.JLabel();
        btnStick = new javax.swing.JPanel();
        lblStick = new javax.swing.JLabel();
        lblExample4 = new javax.swing.JLabel();
        lblExample2 = new javax.swing.JLabel();
        lblExample1 = new javax.swing.JLabel();
        lblExample3 = new javax.swing.JLabel();
        lblFactory = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbl00 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl21 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lbl11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbl01 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbl20 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lbl10 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbl12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        lbl02 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbl22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        lblResult = new javax.swing.JLabel();
        lblSubtittle = new javax.swing.JLabel();
        lblSubtittle1 = new javax.swing.JLabel();
        lblSubtittle2 = new javax.swing.JLabel();

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

        jPanel1.add(pnlSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 59, 2, 380));

        pnlSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlSeparator3Layout = new javax.swing.GroupLayout(pnlSeparator3);
        pnlSeparator3.setLayout(pnlSeparator3Layout);
        pnlSeparator3Layout.setHorizontalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        pnlSeparator3Layout.setVerticalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(pnlSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 380, 2));

        lblDiamond.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDiamond.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiamondMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDiamondMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDiamondMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDiamondLayout = new javax.swing.GroupLayout(btnDiamond);
        btnDiamond.setLayout(btnDiamondLayout);
        btnDiamondLayout.setHorizontalGroup(
            btnDiamondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiamond, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnDiamondLayout.setVerticalGroup(
            btnDiamondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiamond, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(btnDiamond, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 60, 60));

        lblGold.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGoldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGoldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGoldMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGoldLayout = new javax.swing.GroupLayout(btnGold);
        btnGold.setLayout(btnGoldLayout);
        btnGoldLayout.setHorizontalGroup(
            btnGoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGold, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnGoldLayout.setVerticalGroup(
            btnGoldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGold, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(btnGold, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, 60));

        lblIron.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIron.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIronMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblIronMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblIronMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnIronLayout = new javax.swing.GroupLayout(btnIron);
        btnIron.setLayout(btnIronLayout);
        btnIronLayout.setHorizontalGroup(
            btnIronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIron, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnIronLayout.setVerticalGroup(
            btnIronLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIron, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(btnIron, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, 60));

        lblCobblestone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCobblestone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCobblestoneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCobblestoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCobblestoneMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCobblestoneLayout = new javax.swing.GroupLayout(btnCobblestone);
        btnCobblestone.setLayout(btnCobblestoneLayout);
        btnCobblestoneLayout.setHorizontalGroup(
            btnCobblestoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCobblestone, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnCobblestoneLayout.setVerticalGroup(
            btnCobblestoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCobblestone, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(btnCobblestone, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, 60));

        lblStick.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblStick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStickMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStickMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStickMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnStickLayout = new javax.swing.GroupLayout(btnStick);
        btnStick.setLayout(btnStickLayout);
        btnStickLayout.setHorizontalGroup(
            btnStickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStick, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        btnStickLayout.setVerticalGroup(
            btnStickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStick, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(btnStick, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, -1, 60));

        lblExample4.setText("jLabel6");
        jPanel1.add(lblExample4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 175, 93));

        lblExample2.setText("jLabel6");
        jPanel1.add(lblExample2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 175, 93));

        lblExample1.setText("jLabel6");
        jPanel1.add(lblExample1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 175, 93));

        lblExample3.setText("jLabel6");
        jPanel1.add(lblExample3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 175, 93));

        lblFactory.setText("jLabel10");
        jPanel1.add(lblFactory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 170));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl00MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl00, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl00, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 50));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl21, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl21, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, 50));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl11, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 50, 50));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl01MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl01, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl01, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 50, 50));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl20MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl20, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl20, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 50));

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 50));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl12, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 50, 50));

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl02MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl02, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl02, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 50, 50));

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl22, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl22, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 50, 50));

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 75, 75));

        lblSubtittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtittle.setText("<html>Recetas<html>");
        jPanel1.add(lblSubtittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 160, 30));

        lblSubtittle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtittle1.setText("<html>Zona de Crafteo<html>");
        jPanel1.add(lblSubtittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 70, 160, 40));

        lblSubtittle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtittle2.setText("<html>Materiales<html>");
        jPanel1.add(lblSubtittle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 160, 30));

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

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtCerrarMouseClicked

    private void txtCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseEntered
        btnClose.setOpaque(true);
        btnClose.setBackground(Color.red);
    }//GEN-LAST:event_txtCerrarMouseEntered

    private void txtCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseExited
        btnClose.setBackground(Color.pink);
        btnClose.setOpaque(false);
    }//GEN-LAST:event_txtCerrarMouseExited

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void lblDiamondMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiamondMouseEntered
        if (btnDiamond.getBackground().equals(colorDefault)) {
            btnDiamond.setOpaque(true);
            btnDiamond.setBackground(colorEntered);
        }
    }//GEN-LAST:event_lblDiamondMouseEntered

    private void lblDiamondMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiamondMouseExited
        if(btnDiamond.getBackground().equals(colorEntered)){
            btnDiamond.setOpaque(true);
            btnDiamond.setBackground(colorDefault);
        }
    }//GEN-LAST:event_lblDiamondMouseExited

    private void lblGoldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoldMouseEntered
        if (btnGold.getBackground().equals(colorDefault)) {
            btnGold.setOpaque(true);
            btnGold.setBackground(colorEntered);
        }
    }//GEN-LAST:event_lblGoldMouseEntered

    private void lblGoldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoldMouseExited
        if(btnGold.getBackground().equals(colorEntered)){
            btnGold.setOpaque(true);
            btnGold.setBackground(colorDefault);
        }
    }//GEN-LAST:event_lblGoldMouseExited

    private void lblIronMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIronMouseEntered
        if (btnIron.getBackground().equals(colorDefault)) {
            btnIron.setOpaque(true);
            btnIron.setBackground(colorEntered);
        }
    }//GEN-LAST:event_lblIronMouseEntered

    private void lblIronMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIronMouseExited
        if(btnIron.getBackground().equals(colorEntered)){
            btnIron.setOpaque(true);
            btnIron.setBackground(colorDefault);
        }
    }//GEN-LAST:event_lblIronMouseExited

    private void lblCobblestoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobblestoneMouseEntered
        if (btnCobblestone.getBackground().equals(colorDefault)) {
            btnCobblestone.setOpaque(true);
            btnCobblestone.setBackground(colorEntered);
        }
    }//GEN-LAST:event_lblCobblestoneMouseEntered

    private void lblCobblestoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobblestoneMouseExited
        if(btnCobblestone.getBackground().equals(colorEntered)){
            btnCobblestone.setOpaque(true);
            btnCobblestone.setBackground(colorDefault);
        }
    }//GEN-LAST:event_lblCobblestoneMouseExited

    private void lblStickMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStickMouseEntered
        if (btnStick.getBackground().equals(colorDefault)) {
            btnStick.setOpaque(true);
            btnStick.setBackground(colorEntered);
        }

    }//GEN-LAST:event_lblStickMouseEntered

    private void lblStickMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStickMouseExited
        if(btnStick.getBackground().equals(colorEntered)){
            btnStick.setOpaque(true);
            btnStick.setBackground(colorDefault);
        }
    }//GEN-LAST:event_lblStickMouseExited

    private void lblDiamondMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiamondMouseClicked
        defaultButtons();
        btnDiamond.setBackground(colorSelected);
        material="Diamond";
    }//GEN-LAST:event_lblDiamondMouseClicked

    private void lblStickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStickMouseClicked
        defaultButtons();
        btnStick.setBackground(colorSelected);
        material="Stick";
    }//GEN-LAST:event_lblStickMouseClicked

    private void lblGoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGoldMouseClicked
        defaultButtons();
        btnGold.setBackground(colorSelected);
        material="Gold";
    }//GEN-LAST:event_lblGoldMouseClicked

    private void lblIronMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIronMouseClicked
        defaultButtons();
        btnIron.setBackground(colorSelected);
        material="Iron";
        
    }//GEN-LAST:event_lblIronMouseClicked

    private void lblCobblestoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCobblestoneMouseClicked
        defaultButtons();
        btnCobblestone.setBackground(colorSelected);
        material="Cobblestone";
    }//GEN-LAST:event_lblCobblestoneMouseClicked

    private void lbl00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl00MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl00, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[0][0]=material;
        }else{
            lbl00.setIcon(null);
            crafting[0][0]="";
        }
        comparare();
    }//GEN-LAST:event_lbl00MouseClicked

    private void lbl01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl01, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[0][1]=material;
        }else{
            crafting[0][1]="";
            lbl01.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl01MouseClicked

    private void lbl02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl02, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[0][2]=material;
        }else{
            crafting[0][2]="";
            lbl02.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl02MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl10, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[1][0]=material;
        }else{
            crafting[1][0]="";
            lbl10.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl10MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl11, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[1][1]=material;
        }else{
            crafting[1][1]="";
            lbl11.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl12, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[1][2]=material;
        }else{
            crafting[1][2]="";
            lbl12.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl20MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl20, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[2][0]=material;
        }else{
            crafting[2][0]="";
            lbl20.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl20MouseClicked

    private void lbl21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl21MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl21, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[2][1]=material;
        }else{
            crafting[2][1]="";
            lbl21.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl21MouseClicked

    private void lbl22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl22MouseClicked
        if(evt.getButton()==1){
           setImageLabel(lbl22, ("src/Assets/IMG/Items/Materials/"+material+".png"));
           crafting[2][2]=material;
        }else{
            crafting[2][2]="";
            lbl22.setIcon(null);
        }
        comparare();
    }//GEN-LAST:event_lbl22MouseClicked

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
            java.util.logging.Logger.getLogger(AbstractFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AbstractFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AbstractFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AbstractFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AbstractFactory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnCobblestone;
    private javax.swing.JPanel btnDiamond;
    private javax.swing.JPanel btnGold;
    private javax.swing.JPanel btnIron;
    private javax.swing.JPanel btnStick;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lblCobblestone;
    private javax.swing.JLabel lblDiamond;
    private javax.swing.JLabel lblExample1;
    private javax.swing.JLabel lblExample2;
    private javax.swing.JLabel lblExample3;
    private javax.swing.JLabel lblExample4;
    private javax.swing.JLabel lblFactory;
    private javax.swing.JLabel lblGold;
    private javax.swing.JLabel lblIron;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblStick;
    private javax.swing.JLabel lblSubtittle;
    private javax.swing.JLabel lblSubtittle1;
    private javax.swing.JLabel lblSubtittle2;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JPanel pnlSeparator2;
    private javax.swing.JPanel pnlSeparator3;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
