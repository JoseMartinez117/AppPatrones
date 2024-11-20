/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;



import java.awt.Color;
import Assets.FONT.Fonts;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import Assets.IMG.ChainOfResponsability.types;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class ChainOfResponsability extends javax.swing.JFrame {

    int mouseX, mouseY, turno=0, cont=0;
    Fonts typeFont;    
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    String [][] pkmnA = new String[6][3];
    String [][] pkmnE = new String[6][3];



    public ChainOfResponsability() {
        initComponents();
        pkmnE[0][0]="Sceptile";
        pkmnE[0][1]="500";
        pkmnE[0][2]="Planta";
        
        pkmnE[1][0]="Swampert";
        pkmnE[1][1]="500";
        pkmnE[1][2]="Agua";
        
        pkmnE[2][0]="Blaziken";
        pkmnE[2][1]="500";
        pkmnE[2][2]="Fuego";
        
        pkmnE[3][0]="Lanturn";
        pkmnE[3][1]="500";
        pkmnE[3][2]="Electrico";
        
        pkmnE[4][0]="Metagross";
        pkmnE[4][1]="500";
        pkmnE[4][2]="Acero";
        
        pkmnE[5][0]="Salamance";
        pkmnE[5][1]="500";
        pkmnE[5][2]="Dragon";
        
        //Agua - fuego - planta - eléctrico - acero - dragon
  
        pkmnA[0][0]="Infernape";
        pkmnA[0][1]="500";
        pkmnA[0][2]="Fuego";
        
        pkmnA[1][0]="Empoleon";
        pkmnA[1][1]="500";
        pkmnA[1][2]="Agua";
        
        pkmnA[2][0]="Torterra";
        pkmnA[2][1]="500";
        pkmnA[2][2]="Planta";
        
        pkmnA[3][0]="Luxray";
        pkmnA[3][1]="500";
        pkmnA[3][2]="Electrico";
        
        pkmnA[4][0]="Lucario";
        pkmnA[4][1]="500";
        pkmnA[4][2]="Acero";
        
        pkmnA[5][0]="Garchomp";
        pkmnA[5][1]="500";
        pkmnA[5][2]="Dragon";
        decorator();

    }

    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void decorator(){
        typeFont = new Fonts();
        
        setImageLabel(lblPkmn1, "src\\Assets\\IMG\\ChainOfResponsability\\Infernape_Icon.png");
        setImageLabel(lblPkmn2, "src\\Assets\\IMG\\ChainOfResponsability\\Empoleon_Icon.png");
        setImageLabel(lblPkmn3, "src\\Assets\\IMG\\ChainOfResponsability\\Torterra_Icon.png");
        setImageLabel(lblPkmn4, "src\\Assets\\IMG\\ChainOfResponsability\\Luxray_Icon.png");
        setImageLabel(lblPkmn5, "src\\Assets\\IMG\\ChainOfResponsability\\Lucario_Icon.png");
        setImageLabel(lblPkmn6, "src\\Assets\\IMG\\ChainOfResponsability\\Garchomp_Icon.png");
        
        setImageLabel(lblPkmnA, "src\\Assets\\IMG\\ChainOfResponsability\\Infernape_Img.png");
        setImageLabel(lblPkmnE, "src\\Assets\\IMG\\ChainOfResponsability\\Sceptile_Img.png");
        
        lblName.setText("Nombre: "+pkmnE[0][0]);
        lblLife.setText("Vida: "+pkmnE[0][1]);
        lblType.setText("Tipo: "+pkmnE[0][2]);
        
        lblName1.setText("Nombre: "+pkmnA[0][0]);
        lblLife1.setText("Vida: "+pkmnA[0][1]);
        lblType1.setText("Tipo: "+pkmnA[0][2]);
        
        
        
        lblText.setFont(typeFont.fontV(typeFont.instruments, 0, 14));
        
        lblName.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblLife.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblType.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
        lblName1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblLife1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblType1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
        lblCombat.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
        
    }
    
    private void validatePkmn(String typePA, String typePE){

        
        if(typePA.equals("Fuego") && !typePE.equals("Agua")){
            
            change("Agua");
        }
        
        if(typePA.equals("Agua") && !typePE.equals("Dragon")){
           
            change("Dragon");
        }
        
        if(typePA.equals("Dragon") && !typePE.equals("Acero")){
           
            change("Acero");
        }
        
        if(typePA.equals("Acero") && !typePE.equals("Electrico")){
           
            change("Electrico");
        }
        
        if(typePA.equals("Electrico") && !typePE.equals("Planta")){
           
            change("Planta");
        }
        
        if(typePA.equals("Planta") && !typePE.equals("Fuego")){
           
            change("Fuego");
        }

    }
    
    private void change(String typePE){

        for (int i = 0; i < 6; i++) {
            
            if(typePE.equals(pkmnE[i][2])){
                String value=pkmnE[i][0];
                setImageLabel(lblPkmnE, "src\\Assets\\IMG\\ChainOfResponsability\\"+value+"_Img.png");
                lblName.setText("Nombre: "+pkmnE[i][0]);
                lblLife.setText("Vida: "+pkmnE[i][1]);
                lblType.setText("Tipo: "+pkmnE[i][2]);
            }
            
        }
        
        
    }

    
    private void attack(String pkmnA, String pkmnE){
        turno++;
        
        if(turno%2!=0){
            
            validatePkmn(pkmnA, pkmnE);
            for (int i = 0; i < 6; i++) {
                if(this.pkmnE[i][0].equals(lblName.getText().substring(8))){
                    int value=Integer.parseInt(this.pkmnE[i][1])-30;
                
                    this.pkmnE[i][1]= Integer.toString(value);
                    lblLife.setText("Vida: "+this.pkmnE[i][1]);
                  
                }
            }
            
            
        }else if(turno%2==0){
           for (int i = 0; i < 6; i++) {
                if(this.pkmnA[i][0].equals(lblName1.getText().substring(8))){
                    
                    int value=Integer.parseInt(this.pkmnA[i][1])-50;
                    this.pkmnA[i][1]= Integer.toString(value);
                    lblLife1.setText("Vida: "+this.pkmnA[i][1]);
                    if(value<=0){
                        lblPkmnA.setIcon(null);
                        JOptionPane.showMessageDialog(null, this.pkmnA[i][0] +" Fue Derrotado");
                        this.cont++;
                    }
                    
                }
            } 
        
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

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        pnlSeparator = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCombat = new javax.swing.JPanel();
        lblCombat = new javax.swing.JLabel();
        btnPkmn1 = new javax.swing.JPanel();
        lblPkmn1 = new javax.swing.JLabel();
        btnPkmn2 = new javax.swing.JPanel();
        lblPkmn2 = new javax.swing.JLabel();
        btnPkmn3 = new javax.swing.JPanel();
        lblPkmn3 = new javax.swing.JLabel();
        btnPkmn4 = new javax.swing.JPanel();
        lblPkmn4 = new javax.swing.JLabel();
        btnPkmn5 = new javax.swing.JPanel();
        lblPkmn5 = new javax.swing.JLabel();
        btnPkmn6 = new javax.swing.JPanel();
        lblPkmn6 = new javax.swing.JLabel();
        lblPkmnA = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblType1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblPkmnE = new javax.swing.JLabel();
        lblLife = new javax.swing.JLabel();
        lblLife1 = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Opciones"));

        lblCombat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCombat.setText("Combate");
        lblCombat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCombat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCombatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCombatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCombatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCombatLayout = new javax.swing.GroupLayout(btnCombat);
        btnCombat.setLayout(btnCombatLayout);
        btnCombatLayout.setHorizontalGroup(
            btnCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCombat, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnCombatLayout.setVerticalGroup(
            btnCombatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCombat, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        lblPkmn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPkmn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPkmn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPkmn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPkmn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPkmn1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPkmn1Layout = new javax.swing.GroupLayout(btnPkmn1);
        btnPkmn1.setLayout(btnPkmn1Layout);
        btnPkmn1Layout.setHorizontalGroup(
            btnPkmn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        btnPkmn1Layout.setVerticalGroup(
            btnPkmn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblPkmn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPkmn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPkmn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPkmn2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPkmn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPkmn2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPkmn2Layout = new javax.swing.GroupLayout(btnPkmn2);
        btnPkmn2.setLayout(btnPkmn2Layout);
        btnPkmn2Layout.setHorizontalGroup(
            btnPkmn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        btnPkmn2Layout.setVerticalGroup(
            btnPkmn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblPkmn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPkmn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPkmn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPkmn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPkmn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPkmn3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPkmn3Layout = new javax.swing.GroupLayout(btnPkmn3);
        btnPkmn3.setLayout(btnPkmn3Layout);
        btnPkmn3Layout.setHorizontalGroup(
            btnPkmn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        btnPkmn3Layout.setVerticalGroup(
            btnPkmn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblPkmn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPkmn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPkmn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPkmn4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPkmn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPkmn4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPkmn4Layout = new javax.swing.GroupLayout(btnPkmn4);
        btnPkmn4.setLayout(btnPkmn4Layout);
        btnPkmn4Layout.setHorizontalGroup(
            btnPkmn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        btnPkmn4Layout.setVerticalGroup(
            btnPkmn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn4, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblPkmn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPkmn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPkmn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPkmn5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPkmn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPkmn5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPkmn5Layout = new javax.swing.GroupLayout(btnPkmn5);
        btnPkmn5.setLayout(btnPkmn5Layout);
        btnPkmn5Layout.setHorizontalGroup(
            btnPkmn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        btnPkmn5Layout.setVerticalGroup(
            btnPkmn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        lblPkmn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPkmn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPkmn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPkmn6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPkmn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPkmn6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPkmn6Layout = new javax.swing.GroupLayout(btnPkmn6);
        btnPkmn6.setLayout(btnPkmn6Layout);
        btnPkmn6Layout.setHorizontalGroup(
            btnPkmn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
        btnPkmn6Layout.setVerticalGroup(
            btnPkmn6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCombat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPkmn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPkmn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPkmn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPkmn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPkmn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPkmn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPkmn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPkmn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPkmn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPkmn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPkmn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPkmn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCombat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 550, 110));
        jPanel1.add(lblPkmnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, 190));

        lblType.setText("jLabel3");
        jPanel1.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 130, -1));

        lblName.setText("jLabel3");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 130, -1));

        lblType1.setText("jLabel3");
        jPanel1.add(lblType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        lblName1.setText("jLabel3");
        jPanel1.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));
        jPanel1.add(lblPkmnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 190, 190));

        lblLife.setText("jLabel3");
        jPanel1.add(lblLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 130, -1));

        lblLife1.setText("jLabel3");
        jPanel1.add(lblLife1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 130, 90));

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

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_HeaderMouseDragged

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        mouseX=evt.getX();
        mouseY=evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

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

    private void lblCombatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCombatMouseClicked
        
        if(Integer.parseInt(lblLife1.getText().substring(6))>0){
            JOptionPane.showMessageDialog(null, lblName1.getText().substring(8)+" realiza su ataque utilizando su tipo");
            attack(lblType1.getText().substring(6),lblType.getText().substring(6));
    
            JOptionPane.showMessageDialog(null, lblName.getText().substring(8)+" realiza su ataque utilizando su tipo");
            attack(lblType.getText().substring(6),lblType1.getText().substring(6));
        }else{
                JOptionPane.showMessageDialog(null, "Debes seleccionar otro pokemon");

        }
        
        if(this.cont==6){
            setImageLabel(lblPkmnA, "src\\Assets\\IMG\\ChainOfResponsability\\trophy_Img.png");
            JOptionPane.showMessageDialog(null, "Haz sido derrotado");
        }
     

 
     
        
    }//GEN-LAST:event_lblCombatMouseClicked

    private void lblCombatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCombatMouseEntered
        btnCombat.setOpaque(true);
        btnCombat.setBackground(colorEntered);
    }//GEN-LAST:event_lblCombatMouseEntered

    private void lblCombatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCombatMouseExited
        btnCombat.setOpaque(true);
        btnCombat.setBackground(colorDefault);
    }//GEN-LAST:event_lblCombatMouseExited

    private void lblPkmn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn1MouseClicked
        
        if(Integer.parseInt(pkmnA[0][1])>0){
            if(lblName1.getText().contains(pkmnA[0][0])){
                JOptionPane.showMessageDialog(null, "Ya este pokemon esta en campo!!");   
            }else{
                setImageLabel(lblPkmnA, "src/Assets/IMG/ChainOfResponsability/Infernape_Img.png" );

                lblName1.setText("Nombre: "+pkmnA[0][0]);
                lblLife1.setText("Vida: "+pkmnA[0][1]);
                lblType1.setText("Tipo: "+pkmnA[0][2]);
                lblText.setText("<html>Haz cambiado a "+pkmnA[0][0]+"<html>");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya este pokemon esta muerto!!");   
        }

    }//GEN-LAST:event_lblPkmn1MouseClicked

    private void lblPkmn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn1MouseEntered
        btnPkmn1.setOpaque(true);
        btnPkmn1.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn1MouseEntered

    private void lblPkmn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn1MouseExited
        btnPkmn1.setOpaque(true);
        btnPkmn1.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn1MouseExited

    private void lblPkmn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseClicked
        if(Integer.parseInt(pkmnA[1][1])>0){
            if(lblName1.getText().contains(pkmnA[1][0])){
                JOptionPane.showMessageDialog(null, "Ya este pokemon esta en campo!!");    
            }else{
                setImageLabel(lblPkmnA, "src/Assets/IMG/ChainOfResponsability/Empoleon_Img.png" );

                lblName1.setText("Nombre: "+pkmnA[1][0]);
                lblLife1.setText("Vida: "+pkmnA[1][1]);
                lblType1.setText("Tipo: "+pkmnA[1][2]);

                lblText.setText("<html>Haz cambiado a "+pkmnA[1][0]+"<html>");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya este pokemon esta muerto!!");   
        }
        
    }//GEN-LAST:event_lblPkmn2MouseClicked

    private void lblPkmn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseEntered
        btnPkmn2.setOpaque(true);
        btnPkmn2.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn2MouseEntered

    private void lblPkmn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseExited
        btnPkmn2.setOpaque(true);
        btnPkmn2.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn2MouseExited

    private void lblPkmn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn3MouseClicked
        if(Integer.parseInt(pkmnA[2][1])>0){
            if(lblName1.getText().contains(pkmnA[2][0])){
                JOptionPane.showMessageDialog(null, "Ya este pokemon esta en campo!!");    
            }else{
                setImageLabel(lblPkmnA, "src/Assets/IMG/ChainOfResponsability/Torterra_Img.png" );

                lblName1.setText("Nombre: "+pkmnA[2][0]);
                lblLife1.setText("Vida: "+pkmnA[2][1]);
                lblType1.setText("Tipo: "+pkmnA[2][2]);

                lblText.setText("<html>Haz cambiado a "+pkmnA[2][0]+"<html>");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya este pokemon esta muerto!!");   
        }
    }//GEN-LAST:event_lblPkmn3MouseClicked

    private void lblPkmn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn3MouseEntered
        btnPkmn3.setOpaque(true);
        btnPkmn3.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn3MouseEntered

    private void lblPkmn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn3MouseExited
        btnPkmn3.setOpaque(true);
        btnPkmn3.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn3MouseExited

    private void lblPkmn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn4MouseClicked
        if(Integer.parseInt(pkmnA[3][1])>0){
            if(lblName1.getText().contains(pkmnA[3][0])){
                JOptionPane.showMessageDialog(null, "Ya este pokemon esta en campo!!");   
            }else{
                setImageLabel(lblPkmnA, "src/Assets/IMG/ChainOfResponsability/Luxray_Img.png" );

                lblName1.setText("Nombre: "+pkmnA[3][0]);
                lblLife1.setText("Vida: "+pkmnA[3][1]);
                lblType1.setText("Tipo: "+pkmnA[3][2]);
                lblText.setText("<html>Haz cambiado a "+pkmnA[3][0]+"<html>");

            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya este pokemon esta muerto!!");   
        }
    }//GEN-LAST:event_lblPkmn4MouseClicked

    private void lblPkmn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn4MouseEntered
        btnPkmn4.setOpaque(true);
        btnPkmn4.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn4MouseEntered

    private void lblPkmn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn4MouseExited
        btnPkmn4.setOpaque(true);
        btnPkmn4.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn4MouseExited

    private void lblPkmn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn5MouseClicked
        if(Integer.parseInt(pkmnA[4][1])>0){
            if(lblName1.getText().contains(pkmnA[4][0])){
                JOptionPane.showMessageDialog(null, "Ya este pokemon esta en campo!!");   
            }else{
                setImageLabel(lblPkmnA, "src/Assets/IMG/ChainOfResponsability/Lucario_Img.png" );

                lblName1.setText("Nombre: "+pkmnA[4][0]);
                lblLife1.setText("Vida: "+pkmnA[4][1]);
                lblType1.setText("Tipo: "+pkmnA[4][2]);
                lblText.setText("<html>Haz cambiado a "+pkmnA[4][0]+"<html>");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya este pokemon esta muerto!!");   
        }
    }//GEN-LAST:event_lblPkmn5MouseClicked

    private void lblPkmn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn5MouseEntered
        btnPkmn5.setOpaque(true);
        btnPkmn5.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn5MouseEntered

    private void lblPkmn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn5MouseExited
        btnPkmn5.setOpaque(true);
        btnPkmn5.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn5MouseExited

    private void lblPkmn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn6MouseClicked
        if(Integer.parseInt(pkmnA[5][1])>0){
            if(lblName1.getText().contains(pkmnA[5][0])){
                JOptionPane.showMessageDialog(null, "Ya este pokemon esta en campo!!");   
            }else{
                setImageLabel(lblPkmnA, "src/Assets/IMG/ChainOfResponsability/Garchomp_Img.png" );

                lblName1.setText("Nombre: "+pkmnA[5][0]);
                lblLife1.setText("Vida: "+pkmnA[5][1]);
                lblType1.setText("Tipo: "+pkmnA[5][2]);
                lblText.setText("<html>Haz cambiado a "+pkmnA[5][0]+"<html>");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya este pokemon esta muerto!!");   
        }
    }//GEN-LAST:event_lblPkmn6MouseClicked

    private void lblPkmn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn6MouseEntered
        btnPkmn6.setOpaque(true);
        btnPkmn6.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn6MouseEntered

    private void lblPkmn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn6MouseExited
        btnPkmn6.setOpaque(true);
        btnPkmn6.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn6MouseExited

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
            java.util.logging.Logger.getLogger(ChainOfResponsability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChainOfResponsability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChainOfResponsability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChainOfResponsability.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChainOfResponsability().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnCombat;
    private javax.swing.JPanel btnPkmn1;
    private javax.swing.JPanel btnPkmn2;
    private javax.swing.JPanel btnPkmn3;
    private javax.swing.JPanel btnPkmn4;
    private javax.swing.JPanel btnPkmn5;
    private javax.swing.JPanel btnPkmn6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCombat;
    private javax.swing.JLabel lblLife;
    private javax.swing.JLabel lblLife1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPkmn1;
    private javax.swing.JLabel lblPkmn2;
    private javax.swing.JLabel lblPkmn3;
    private javax.swing.JLabel lblPkmn4;
    private javax.swing.JLabel lblPkmn5;
    private javax.swing.JLabel lblPkmn6;
    private javax.swing.JLabel lblPkmnA;
    private javax.swing.JLabel lblPkmnE;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblType1;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
