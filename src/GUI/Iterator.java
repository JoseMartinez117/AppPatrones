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


public class Iterator extends javax.swing.JFrame {

    int mouseX, mouseY;
    Fonts typeFont;
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    String pokemon [][] = new String[6][3];
    String who ="";
    
    
    
    public Iterator() {
        initComponents();
        decorator();
        obstacle();
        matriz();
        pokemon[0][0]="pkmn1";
        pokemon[1][0]="pkmn2";
        pokemon[2][0]="pkmn3";
        pokemon[3][0]="pkmn4";
        pokemon[4][0]="pkmn5";
        pokemon[5][0]="pkmn6";

    }

    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void decorator(){
        typeFont = new Fonts();
        
        setImageLabel(lblPkmn1,"src/Assets/IMG/Iterator/pkmn1_Icon.png");
        setImageLabel(lblPkmn2,"src/Assets/IMG/Iterator/pkmn2_Icon.png");
        setImageLabel(lblPkmn3,"src/Assets/IMG/Iterator/pkmn3_Icon.png");
        setImageLabel(lblPkmn4,"src/Assets/IMG/Iterator/pkmn4_Icon.png");
        setImageLabel(lblPkmn5,"src/Assets/IMG/Iterator/pkmn5_Icon.png");
        setImageLabel(lblPkmn6,"src/Assets/IMG/Iterator/pkmn6_Icon.png");
        setImageLabel(lblPkmn,"src/Assets/IMG/Iterator/missingNO_Img.png");
        btnAction.setOpaque(false);
        
        lblTittle1.setFont(typeFont.fontV(typeFont.instruments, 1, 14));
        lblTittle2.setFont(typeFont.fontV(typeFont.instruments, 1, 14));
        lblSubtittle1.setFont(typeFont.fontV(typeFont.instruments, 1, 11));
        lblSubtittle2.setFont(typeFont.fontV(typeFont.instruments, 1, 11));
        lblText.setFont(typeFont.fontV(typeFont.instruments, 1, 14));
        lblHm.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblMove.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblSave.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
    }
    
    private void obstacle(){
        int obstacle =(int) (Math.random() * (4)) + 1;
        System.out.println(obstacle);
        if(obstacle==1){
            setImageLabel(lblObstacle,"src/Assets/IMG/Iterator/Corte_Img.png");
            lblObstacle.setText("Corte");
            lblText.setText("Parece que puedes cortar este arbol");
            
        }else if(obstacle==2){
            setImageLabel(lblObstacle,"src/Assets/IMG/Iterator/fuerza_Img.png");
            lblObstacle.setText("Fuerza");
            lblText.setText("Parece que puedes mover esta roca");
        
        }else if(obstacle==3){
            setImageLabel(lblObstacle,"src/Assets/IMG/Iterator/Golpe Roca_Img.png"); 
            lblObstacle.setText("Golpe Roca");
            lblText.setText("Parece que puedes romper esta roca");
            
        }else if(obstacle==4){
            setImageLabel(lblObstacle,"src/Assets/IMG/Iterator/Trepa Rocas_Img.png"); 
            lblObstacle.setText("Trepa Rocas");
            lblText.setText("Parece que puedes escalar esta montaña");
        }
        
        
        
    }
    
    private void matriz(){
        for(int i=0; i<6; i++){ 
            for(int j=0; j<2; j++){

                this.pokemon[i][j]="";
                        

            }
        }
    }

    
    
    private void saveData(String pokemon, String hm, String custom){
        
       switch (pokemon){
       
           case "pkmn1":
               this.pokemon[0][1]=hm;
               this.pokemon[0][2]=custom;
               
               break;
           
            case "pkmn2":
               this.pokemon[1][1]=hm;
               this.pokemon[1][2]=custom;
                
               break;
               
            case "pkmn3":
               this.pokemon[2][1]=hm;
               this.pokemon[2][2]=custom;
                
               break;
               
            case "pkmn4":
               this.pokemon[3][1]=hm;
               this.pokemon[3][2]=custom;
           
               break;
               
            case "pkmn5":
               this.pokemon[4][1]=hm;
               this.pokemon[4][2]=custom;
               
               break;
               
               
            case "pkmn6":
               this.pokemon[5][1]=hm;
               this.pokemon[5][2]=custom;
               
               break;
           
       }
       
       JOptionPane.showMessageDialog(null, "Datos Guardados con exito"); 
    
    }
    
    private void iterator(String asset){
        
        for(int i=0; i<6; i++){ 
            for(int j=0; j<2; j++){
                
                if(!this.pokemon[i][j].isEmpty()){
                    if(this.pokemon[i][j].contentEquals(asset)){

                        int respuesta = JOptionPane.showConfirmDialog(
                            null,
                            this.pokemon[i][0]+" puede usar la MO: "+asset+" deseas usarla",
                            "Confirmación",
                            JOptionPane.YES_NO_OPTION
                        );

                        if (respuesta == JOptionPane.YES_OPTION) {
                            setImageLabel(lblObstacle,"src/Assets/IMG/Iterator/trophy_Img.png"); 
                            lblText.setText("Haz usado "+asset);
                            JOptionPane.showMessageDialog(null, "haz usado la MO");
                           
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "No usaste la MO con "+this.pokemon[i][0]);
                        }

                    }
                }
            }

            
        }
        
        try {
            Thread.sleep(4000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        obstacle();
        
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
        pnlSeparator2 = new javax.swing.JPanel();
        btnAction = new javax.swing.JPanel();
        lblObstacle = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        btnPkm1 = new javax.swing.JPanel();
        lblPkmn1 = new javax.swing.JLabel();
        btnPkm2 = new javax.swing.JPanel();
        lblPkmn2 = new javax.swing.JLabel();
        btnPkm3 = new javax.swing.JPanel();
        lblPkmn3 = new javax.swing.JLabel();
        btnPkm4 = new javax.swing.JPanel();
        lblPkmn4 = new javax.swing.JLabel();
        btnPkm5 = new javax.swing.JPanel();
        lblPkmn5 = new javax.swing.JLabel();
        btnPkm6 = new javax.swing.JPanel();
        lblPkmn6 = new javax.swing.JLabel();
        lblPkmn = new javax.swing.JLabel();
        cmbHM = new javax.swing.JComboBox<>();
        txtMove = new javax.swing.JTextField();
        lblMove = new javax.swing.JLabel();
        pnlSeparator3 = new javax.swing.JPanel();
        lblHm = new javax.swing.JLabel();
        btnSave = new javax.swing.JPanel();
        lblSave = new javax.swing.JLabel();
        lblTittle1 = new javax.swing.JLabel();
        lblSubtittle1 = new javax.swing.JLabel();
        lblSubtittle2 = new javax.swing.JLabel();
        lblTittle2 = new javax.swing.JLabel();

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

        jPanel1.add(pnlSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 59, 2, 380));

        btnAction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnActionLayout = new javax.swing.GroupLayout(btnAction);
        btnAction.setLayout(btnActionLayout);
        btnActionLayout.setHorizontalGroup(
            btnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        btnActionLayout.setVerticalGroup(
            btnActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(btnAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        lblObstacle.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        jPanel1.add(lblObstacle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 240));

        lblText.setText("jLabel2");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 260, 80));

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

        javax.swing.GroupLayout btnPkm1Layout = new javax.swing.GroupLayout(btnPkm1);
        btnPkm1.setLayout(btnPkm1Layout);
        btnPkm1Layout.setHorizontalGroup(
            btnPkm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnPkm1Layout.setVerticalGroup(
            btnPkm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPkm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 40, 40));

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

        javax.swing.GroupLayout btnPkm2Layout = new javax.swing.GroupLayout(btnPkm2);
        btnPkm2.setLayout(btnPkm2Layout);
        btnPkm2Layout.setHorizontalGroup(
            btnPkm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnPkm2Layout.setVerticalGroup(
            btnPkm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPkm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 40, -1));

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

        javax.swing.GroupLayout btnPkm3Layout = new javax.swing.GroupLayout(btnPkm3);
        btnPkm3.setLayout(btnPkm3Layout);
        btnPkm3Layout.setHorizontalGroup(
            btnPkm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnPkm3Layout.setVerticalGroup(
            btnPkm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPkm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 40, -1));

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

        javax.swing.GroupLayout btnPkm4Layout = new javax.swing.GroupLayout(btnPkm4);
        btnPkm4.setLayout(btnPkm4Layout);
        btnPkm4Layout.setHorizontalGroup(
            btnPkm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnPkm4Layout.setVerticalGroup(
            btnPkm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPkm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 40, -1));

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

        javax.swing.GroupLayout btnPkm5Layout = new javax.swing.GroupLayout(btnPkm5);
        btnPkm5.setLayout(btnPkm5Layout);
        btnPkm5Layout.setHorizontalGroup(
            btnPkm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnPkm5Layout.setVerticalGroup(
            btnPkm5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPkm5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 40, -1));

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

        javax.swing.GroupLayout btnPkm6Layout = new javax.swing.GroupLayout(btnPkm6);
        btnPkm6.setLayout(btnPkm6Layout);
        btnPkm6Layout.setHorizontalGroup(
            btnPkm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnPkm6Layout.setVerticalGroup(
            btnPkm6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnPkm6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 40, -1));
        jPanel1.add(lblPkmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 230, 210));

        cmbHM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MO's", "Golpe Roca", "Fuerza", "Corte", "Trepa Rocas", "Ninguna" }));
        cmbHM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cmbHM, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, -1));
        jPanel1.add(txtMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 110, -1));

        lblMove.setText("Ataque: ???");
        jPanel1.add(lblMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 150, -1));

        pnlSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlSeparator3Layout = new javax.swing.GroupLayout(pnlSeparator3);
        pnlSeparator3.setLayout(pnlSeparator3Layout);
        pnlSeparator3Layout.setHorizontalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        pnlSeparator3Layout.setVerticalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(pnlSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 420, 2));

        lblHm.setText("MO: ???");
        jPanel1.add(lblHm, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 150, -1));

        lblSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSave.setText("Guardar Datos");
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
            .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSave, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 150, 40));

        lblTittle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittle1.setText("Interfaz Obstaculo");
        jPanel1.add(lblTittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 130, -1));

        lblSubtittle1.setText("Maquina Oculta");
        jPanel1.add(lblSubtittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 110, -1));

        lblSubtittle2.setText("Ataque pesonalizado");
        jPanel1.add(lblSubtittle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 120, -1));

        lblTittle2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTittle2.setText("Interfaz Pokemon");
        jPanel1.add(lblTittle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 130, -1));

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

    private void lblSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseEntered
            btnSave.setOpaque(true);
            btnSave.setBackground(colorEntered);
    }//GEN-LAST:event_lblSaveMouseEntered

    private void lblSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseExited
            btnSave.setOpaque(true);
            btnSave.setBackground(colorDefault);
    }//GEN-LAST:event_lblSaveMouseExited

    private void lblPkmn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn1MouseEntered
            btnPkm1.setOpaque(true);
            btnPkm1.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn1MouseEntered

    private void lblPkmn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn1MouseExited
            btnPkm1.setOpaque(true);
            btnPkm1.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn1MouseExited

    private void lblPkmn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseEntered
            btnPkm2.setOpaque(true);
            btnPkm2.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn2MouseEntered

    private void lblPkmn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseExited
            btnPkm2.setOpaque(true);
            btnPkm2.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn2MouseExited

    private void lblPkmn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn3MouseEntered
            btnPkm3.setOpaque(true);
            btnPkm3.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn3MouseEntered

    private void lblPkmn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn3MouseExited
            btnPkm3.setOpaque(true);
            btnPkm3.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn3MouseExited

    private void lblPkmn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn4MouseEntered
            btnPkm4.setOpaque(true);
            btnPkm4.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn4MouseEntered

    private void lblPkmn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn4MouseExited
            btnPkm4.setOpaque(true);
            btnPkm4.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn4MouseExited

    private void lblPkmn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn5MouseEntered
            btnPkm5.setOpaque(true);
            btnPkm5.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn5MouseEntered

    private void lblPkmn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn5MouseExited
            btnPkm5.setOpaque(true);
            btnPkm5.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn5MouseExited

    private void lblPkmn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn6MouseEntered
            btnPkm6.setOpaque(true);
            btnPkm6.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn6MouseEntered

    private void lblPkmn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn6MouseExited
            btnPkm6.setOpaque(true);
            btnPkm6.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn6MouseExited

    private void lblPkmn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn1MouseClicked
        who="pkmn1";
        setImageLabel(lblPkmn,"src/Assets/IMG/Iterator/pkmn1_Img.png");
        
    }//GEN-LAST:event_lblPkmn1MouseClicked

    private void lblPkmn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseClicked
        
        who="pkmn2";
        setImageLabel(lblPkmn,"src/Assets/IMG/Iterator/pkmn2_Img.png");
             
    }//GEN-LAST:event_lblPkmn2MouseClicked

    private void lblPkmn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn3MouseClicked
        who="pkmn3";
        setImageLabel(lblPkmn,"src/Assets/IMG/Iterator/pkmn3_Img.png");
    }//GEN-LAST:event_lblPkmn3MouseClicked

    private void lblPkmn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn4MouseClicked
        who="pkmn4";
        setImageLabel(lblPkmn,"src/Assets/IMG/Iterator/pkmn4_Img.png");
    }//GEN-LAST:event_lblPkmn4MouseClicked

    private void lblPkmn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn5MouseClicked
        who="pkmn5";
        setImageLabel(lblPkmn,"src/Assets/IMG/Iterator/pkmn5_Img.png");
    }//GEN-LAST:event_lblPkmn5MouseClicked

    private void lblPkmn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn6MouseClicked
        who="pkmn6";
        setImageLabel(lblPkmn,"src/Assets/IMG/Iterator/pkmn6_Img.png");
    }//GEN-LAST:event_lblPkmn6MouseClicked

    private void lblSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaveMouseClicked
        
        if(!cmbHM.getSelectedItem().toString().equals("MO's")){
            if(!who.equals("")){
                if(!txtMove.getText().equals("")){
                    
                    lblHm.setText("MO: "+cmbHM.getSelectedItem().toString());
                    lblMove.setText("Ataque: "+txtMove.getText());
                    saveData(who, cmbHM.getSelectedItem().toString(), txtMove.getText());
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Debes rellenar el campo de ataque"); 
                }
            }else{
              JOptionPane.showMessageDialog(null, "Debes seleccionar un Pokemon");  
            }    
        }else{
            JOptionPane.showMessageDialog(null, "Debes seleccionar una MO");
        }    
        
        
    }//GEN-LAST:event_lblSaveMouseClicked

    private void btnActionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActionMouseClicked
        iterator(lblObstacle.getText());
    }//GEN-LAST:event_btnActionMouseClicked

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
            java.util.logging.Logger.getLogger(Iterator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iterator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iterator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iterator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iterator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnAction;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnPkm1;
    private javax.swing.JPanel btnPkm2;
    private javax.swing.JPanel btnPkm3;
    private javax.swing.JPanel btnPkm4;
    private javax.swing.JPanel btnPkm5;
    private javax.swing.JPanel btnPkm6;
    private javax.swing.JPanel btnSave;
    private javax.swing.JComboBox<String> cmbHM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHm;
    private javax.swing.JLabel lblMove;
    private javax.swing.JLabel lblObstacle;
    private javax.swing.JLabel lblPkmn;
    private javax.swing.JLabel lblPkmn1;
    private javax.swing.JLabel lblPkmn2;
    private javax.swing.JLabel lblPkmn3;
    private javax.swing.JLabel lblPkmn4;
    private javax.swing.JLabel lblPkmn5;
    private javax.swing.JLabel lblPkmn6;
    private javax.swing.JLabel lblSave;
    private javax.swing.JLabel lblSubtittle1;
    private javax.swing.JLabel lblSubtittle2;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTittle1;
    private javax.swing.JLabel lblTittle2;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JPanel pnlSeparator2;
    private javax.swing.JPanel pnlSeparator3;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JTextField txtMove;
    // End of variables declaration//GEN-END:variables
}
