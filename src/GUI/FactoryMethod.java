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
public class FactoryMethod extends javax.swing.JFrame {

    int mouseX, mouseY, sldValue;
    String cmbBio, cmbDif;
    Color colorBase=Color.GRAY;
    Color colorCambi=new Color(214, 217, 223);
    
    public FactoryMethod() {
        initComponents();
        setImageLabel(lblFactory, "src/Assets/IMG/Icons/Patterns/fabrica_Icon.png");
        setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/body.png");
        setImageLabel(lblArrow, "src/Assets/IMG/Icons/Patterns/Arrow_Icon.png");
        
        //Separacion ejemplos
        setImageLabel(lblEnemy1, "src/Assets/IMG/Enemies/Zombie.png");
        setImageLabel(lblEnemy2, "src/Assets/IMG/Enemies/Drowned.png");
        setImageLabel(lblEnemy3, "src/Assets/IMG/Enemies/Husk.png");
        setImageLabel(lblEnemy4, "src/Assets/IMG/Enemies/Skeleton.png");
        setImageLabel(lblEnemy5, "src/Assets/IMG/Enemies/Stray.png");
        setImageLabel(lblEnemy6, "src/Assets/IMG/Enemies/Bogged.png");
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        pnlSeparator = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        pnlSeparator3 = new javax.swing.JPanel();
        pnlSeparator2 = new javax.swing.JPanel();
        cmbBiome = new javax.swing.JComboBox<>();
        cmbDifficulty = new javax.swing.JComboBox<>();
        btnBuildEnemy = new javax.swing.JPanel();
        lblBuildEnemy = new javax.swing.JLabel();
        lblLight = new javax.swing.JLabel();
        lblDifficulty = new javax.swing.JLabel();
        lblBiome = new javax.swing.JLabel();
        lblFactory = new javax.swing.JLabel();
        lblEnemy3 = new javax.swing.JLabel();
        lblArrow = new javax.swing.JLabel();
        lblEnemyx = new javax.swing.JLabel();
        lblEnemy1 = new javax.swing.JLabel();
        lblEnemy2 = new javax.swing.JLabel();
        lblDescription3 = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblDescription1 = new javax.swing.JLabel();
        lblEnemy4 = new javax.swing.JLabel();
        lblEnemy5 = new javax.swing.JLabel();
        lblEnemy6 = new javax.swing.JLabel();
        lblDescription4 = new javax.swing.JLabel();
        lblDescription5 = new javax.swing.JLabel();
        lblDescription6 = new javax.swing.JLabel();
        SldLight = new javax.swing.JSlider();

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

        pnlSeparator3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlSeparator3Layout = new javax.swing.GroupLayout(pnlSeparator3);
        pnlSeparator3.setLayout(pnlSeparator3Layout);
        pnlSeparator3Layout.setHorizontalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        pnlSeparator3Layout.setVerticalGroup(
            pnlSeparator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel1.add(pnlSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 340, 2));

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

        cmbBiome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planicie", "Oceano", "Desierto", "Tundra", "Pantano" }));
        jPanel1.add(cmbBiome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 90, 20));

        cmbDifficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Normal", "Dificil" }));
        jPanel1.add(cmbDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 90, -1));

        lblBuildEnemy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBuildEnemy.setText("Fabricar Enemigo");
        lblBuildEnemy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBuildEnemy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBuildEnemyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBuildEnemyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBuildEnemyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBuildEnemyLayout = new javax.swing.GroupLayout(btnBuildEnemy);
        btnBuildEnemy.setLayout(btnBuildEnemyLayout);
        btnBuildEnemyLayout.setHorizontalGroup(
            btnBuildEnemyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuildEnemy, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnBuildEnemyLayout.setVerticalGroup(
            btnBuildEnemyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBuildEnemy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(btnBuildEnemy, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 30));

        lblLight.setText("Luz");
        jPanel1.add(lblLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, -1));

        lblDifficulty.setText("Dificultad:");
        jPanel1.add(lblDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 90, -1));

        lblBiome.setText("Bioma:");
        jPanel1.add(lblBiome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, 20));

        lblFactory.setText("jLabel3");
        jPanel1.add(lblFactory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 120));

        lblEnemy3.setText("jLabel1");
        jPanel1.add(lblEnemy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 60, 100));

        lblArrow.setText("jLabel1");
        jPanel1.add(lblArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, 60));

        lblEnemyx.setText("jLabel1");
        jPanel1.add(lblEnemyx, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 110, 180));

        lblEnemy1.setText("jLabel1");
        jPanel1.add(lblEnemy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 60, 100));

        lblEnemy2.setText("jLabel1");
        jPanel1.add(lblEnemy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 60, 100));

        lblDescription3.setText("<html>Luz: ≤2<p>Bioma: Desierto<p>Dificultad: Difícil");
        jPanel1.add(lblDescription3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 100, 60));

        lblDescription.setText("<html>Luz: ≤4<p>Bioma: Planicie<p>Dificultad: Facil");
        jPanel1.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 100, 60));

        lblDescription1.setText("<html>Luz: ≤3<p>Bioma: Océano<p>Dificultad: Normal");
        jPanel1.add(lblDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 100, 60));

        lblEnemy4.setText("jLabel1");
        jPanel1.add(lblEnemy4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 60, 100));

        lblEnemy5.setText("jLabel1");
        jPanel1.add(lblEnemy5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 60, 100));

        lblEnemy6.setText("jLabel1");
        jPanel1.add(lblEnemy6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 60, 100));

        lblDescription4.setText("<html>Luz: ≤8<p>Bioma: Pantano<p>Dificultad: Difícil");
        jPanel1.add(lblDescription4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 100, 60));

        lblDescription5.setText("<html>Luz: ≤4<p>Bioma: Tundra<p>Dificultad: Difícil");
        jPanel1.add(lblDescription5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 100, 60));

        lblDescription6.setText("<html>Luz: ≤2<p>Bioma: Planicie<p>Dificultad: Normal");
        jPanel1.add(lblDescription6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 100, 60));

        SldLight.setMajorTickSpacing(3);
        SldLight.setMaximum(15);
        SldLight.setOrientation(javax.swing.JSlider.VERTICAL);
        SldLight.setPaintLabels(true);
        SldLight.setPaintTicks(true);
        SldLight.setValue(0);
        SldLight.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SldLightStateChanged(evt);
            }
        });
        jPanel1.add(SldLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblBuildEnemyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuildEnemyMouseEntered
        btnBuildEnemy.setOpaque(true);
        btnBuildEnemy.setBackground(colorBase);
    }//GEN-LAST:event_lblBuildEnemyMouseEntered

    private void lblBuildEnemyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuildEnemyMouseExited
        btnBuildEnemy.setOpaque(true);
        btnBuildEnemy.setBackground(colorCambi);
    }//GEN-LAST:event_lblBuildEnemyMouseExited

    private void lblBuildEnemyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBuildEnemyMouseClicked
        sldValue=SldLight.getValue();
        cmbBio=cmbBiome.getSelectedItem().toString();
        cmbDif=cmbDifficulty.getSelectedItem().toString();
        
        if(sldValue<=3 && cmbBio.equals("Oceano") && cmbDif.equals("Normal")){
            setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/Drowned.png");
        }else if(sldValue<=4 && cmbBio.equals("Planicie") && cmbDif.equals("Facil")){
            setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/Zombie.png");
        }else if(sldValue<=2 && cmbBio.equals("Desierto") && cmbDif.equals("Dificil")){
            setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/Husk.png");
        }else if(sldValue<=2 && cmbBio.equals("Planicie") && cmbDif.equals("Normal")){
            setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/Skeleton.png");
        }else if(sldValue<=4 && cmbBio.equals("Tundra") && cmbDif.equals("Dificil")){
            setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/Stray.png");
        }else if(sldValue<=8 && cmbBio.equals("Pantano") && cmbDif.equals("Dificil")){
            setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/Bogged.png");
        }else{
            setImageLabel(lblEnemyx, "src/Assets/IMG/Enemies/body.png");
        }
        
        
        
        
        
    }//GEN-LAST:event_lblBuildEnemyMouseClicked

    private void SldLightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SldLightStateChanged
        
    }//GEN-LAST:event_SldLightStateChanged

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
            java.util.logging.Logger.getLogger(FactoryMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactoryMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactoryMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactoryMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FactoryMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JSlider SldLight;
    private javax.swing.JPanel btnBuildEnemy;
    private javax.swing.JPanel btnClose;
    private javax.swing.JComboBox<String> cmbBiome;
    private javax.swing.JComboBox<String> cmbDifficulty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblArrow;
    private javax.swing.JLabel lblBiome;
    private javax.swing.JLabel lblBuildEnemy;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDescription1;
    private javax.swing.JLabel lblDescription3;
    private javax.swing.JLabel lblDescription4;
    private javax.swing.JLabel lblDescription5;
    private javax.swing.JLabel lblDescription6;
    private javax.swing.JLabel lblDifficulty;
    private javax.swing.JLabel lblEnemy1;
    private javax.swing.JLabel lblEnemy2;
    private javax.swing.JLabel lblEnemy3;
    private javax.swing.JLabel lblEnemy4;
    private javax.swing.JLabel lblEnemy5;
    private javax.swing.JLabel lblEnemy6;
    private javax.swing.JLabel lblEnemyx;
    private javax.swing.JLabel lblFactory;
    private javax.swing.JLabel lblLight;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JPanel pnlSeparator2;
    private javax.swing.JPanel pnlSeparator3;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
