/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import Assets.FONT.Fonts;
import java.awt.Image;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class TemplateMethod extends javax.swing.JFrame {

    int mouseX, mouseY;
    Fonts typeFont;
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    String [] colors = new String [10];
    boolean validate =false;
    
    public TemplateMethod() {
        initComponents();
        decorator();
        colors [0]="green";
        colors [1]="red";
        colors [2]="red";
        colors [3]="green";
        colors [4]="red";
        colors [5]="red";
        colors [6]="red";
        colors [7]="green";
        colors [8]="red";
        colors [9]="red";


    }

    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void decorator(){
        typeFont = new Fonts();
        setImageLabel(lblCook, "src\\Assets\\IMG\\TemplateMethod\\kitchen_Icon.png");
        setImageLabel(lblChemestry, "src\\Assets\\IMG\\TemplateMethod\\chemestry_Icon.png");
        setImageLabel(lblType, "src\\Assets\\IMG\\TemplateMethod\\idea_Icon.png");
        lblGame.setText("green");
        
        lblSubtittle1.setFont(typeFont.fontV(typeFont.instruments, 1, 12));
        lblSubtittle2.setFont(typeFont.fontV(typeFont.instruments, 1, 12));
        lblCreate.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        cmbItem1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        cmbItem2.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
    }
    
    
    private void setItem(String itemDef){
     
        if(this.validate){
           if(itemDef.startsWith("C")){
               setImageLabel(lblType, "src\\Assets\\IMG\\TemplateMethod\\combinations\\"+(itemDef.substring(1))+"_Icon.png");
               System.out.println(itemDef.substring(1));
           }else{
              JOptionPane.showMessageDialog(null, "Esta combinacion parece receta de alquimia, no crees?");
           }
        
        }else if(!this.validate){
            if(itemDef.startsWith("A")){
               System.out.println("alquimia "+itemDef.substring(1));
               setImageLabel(lblType, "src\\Assets\\IMG\\TemplateMethod\\combinations\\"+(itemDef.substring(1))+"_Icon.png");
            }else{
              JOptionPane.showMessageDialog(null, "Esta combinacion parece receta de comida, no crees?");
            }   
        }
            
        
    
    }
    
    private void combination(String item1, String item2){
        Map<Set<String>, String> combinations = new HashMap<>();

        combinations.put(new HashSet<>(Arrays.asList("Trigo", "Rosa")), "AaceiteDeFlora");
        combinations.put(new HashSet<>(Arrays.asList("Trigo", "Solsettia")), "Acebo1");
        combinations.put(new HashSet<>(Arrays.asList("Trigo", "Petalos")), "CtempuraCerezo");
        combinations.put(new HashSet<>(Arrays.asList("Pollo", "Rosa")), "Acebo2");
        combinations.put(new HashSet<>(Arrays.asList("Pollo", "Petalos")), "Acebo3");
        combinations.put(new HashSet<>(Arrays.asList("Pollo", "Solsettia")), "CpolloA");
        combinations.put(new HashSet<>(Arrays.asList("Baya", "Rosa")), "CensaladaTr");
        combinations.put(new HashSet<>(Arrays.asList("Baya", "Petalos")), "CmochisCere");
        combinations.put(new HashSet<>(Arrays.asList("Baya", "Solsettia")), "CteBayas");
        
        Set<String> conjuntoCombinaciones = new HashSet<>(Arrays.asList(item1, item2));
        
        String value =combinations.getOrDefault(conjuntoCombinaciones, "");
        setItem(value);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        pnlSeparator = new javax.swing.JPanel();
        pnlSeparator2 = new javax.swing.JPanel();
        btnCook = new javax.swing.JPanel();
        lblCook = new javax.swing.JLabel();
        btnChemestry = new javax.swing.JPanel();
        lblChemestry = new javax.swing.JLabel();
        cmbItem2 = new javax.swing.JComboBox<>();
        cmbItem1 = new javax.swing.JComboBox<>();
        lblGame = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        btnCreate = new javax.swing.JPanel();
        lblCreate = new javax.swing.JLabel();
        lblSubtittle2 = new javax.swing.JLabel();
        lblSubtittle1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("jLabel1");

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

        jPanel1.add(pnlSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 59, 2, 380));

        lblCook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCookMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCookMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCookLayout = new javax.swing.GroupLayout(btnCook);
        btnCook.setLayout(btnCookLayout);
        btnCookLayout.setHorizontalGroup(
            btnCookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCook, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnCookLayout.setVerticalGroup(
            btnCookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCook, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(btnCook, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        lblChemestry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblChemestry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChemestryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblChemestryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblChemestryMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnChemestryLayout = new javax.swing.GroupLayout(btnChemestry);
        btnChemestry.setLayout(btnChemestryLayout);
        btnChemestryLayout.setHorizontalGroup(
            btnChemestryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblChemestry, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnChemestryLayout.setVerticalGroup(
            btnChemestryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblChemestry, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(btnChemestry, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        cmbItem2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Rosa", "Petalos", "Solsettia" }));
        jPanel1.add(cmbItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 120, -1));

        cmbItem1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Trigo", "Pollo", "Baya" }));
        cmbItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbItem1MouseClicked(evt);
            }
        });
        jPanel1.add(cmbItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        lblGame.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        lblGame.setText("jLabel1");
        lblGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGameMouseEntered(evt);
            }
        });
        jPanel1.add(lblGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 110));

        lblType.setText("jLabel2");
        jPanel1.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 320, 290));

        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Crear");
        lblCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCreateMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCreateLayout = new javax.swing.GroupLayout(btnCreate);
        btnCreate.setLayout(btnCreateLayout);
        btnCreateLayout.setHorizontalGroup(
            btnCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnCreateLayout.setVerticalGroup(
            btnCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 150, 50));

        lblSubtittle2.setText("Items:");
        jPanel1.add(lblSubtittle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, -1));

        lblSubtittle1.setText("Items:");
        jPanel1.add(lblSubtittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 120, -1));

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

    private void lblCookMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCookMouseEntered
            btnCook.setOpaque(true);
            btnCook.setBackground(colorEntered);
    }//GEN-LAST:event_lblCookMouseEntered

    private void lblCookMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCookMouseExited
            btnCook.setOpaque(true);
            btnCook.setBackground(colorDefault);
    }//GEN-LAST:event_lblCookMouseExited

    private void lblChemestryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChemestryMouseEntered
            btnChemestry.setOpaque(true);
            btnChemestry.setBackground(colorEntered);
    }//GEN-LAST:event_lblChemestryMouseEntered

    private void lblChemestryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChemestryMouseExited
            btnChemestry.setOpaque(true);
            btnChemestry.setBackground(colorDefault);
    }//GEN-LAST:event_lblChemestryMouseExited

    private void lblCookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCookMouseClicked
        this.validate=true;
        setImageLabel(lblGame, "src\\Assets\\IMG\\TemplateMethod\\red_Img.png");
        lblGame.setText("red");
        JOptionPane.showMessageDialog(null, "Estas en modo cocina");
        
    }//GEN-LAST:event_lblCookMouseClicked

    private void lblChemestryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChemestryMouseClicked
        this.validate=false;
        lblGame.setIcon(null);
        JOptionPane.showMessageDialog(null, "Estas en modo alquimia");
        
    }//GEN-LAST:event_lblChemestryMouseClicked

    private void lblGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGameMouseEntered
        
        if(validate){
            int randomNumber = (int) (Math.random() * 10);
            
            setImageLabel(lblGame, "src\\Assets\\IMG\\TemplateMethod\\"+colors[randomNumber]+"_Img.png");
            lblGame.setText(colors[randomNumber]);
        }  
        
    }//GEN-LAST:event_lblGameMouseEntered

    private void lblCreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateMouseEntered
            btnCreate.setOpaque(true);
            btnCreate.setBackground(colorEntered);
    }//GEN-LAST:event_lblCreateMouseEntered

    private void lblCreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateMouseExited
            btnCreate.setOpaque(true);
            btnCreate.setBackground(colorDefault);
    }//GEN-LAST:event_lblCreateMouseExited

    private void lblCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateMouseClicked
        if(lblGame.getText().equals("green")){
            combination((String)cmbItem1.getSelectedItem(), (String)cmbItem2.getSelectedItem());
        }else{
           JOptionPane.showMessageDialog(null, "Tu comida salio bastante mal, debes hacerla cuando el cuadro este en verde!!");
        }
        
    }//GEN-LAST:event_lblCreateMouseClicked

    private void cmbItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbItem1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbItem1MouseClicked

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
            java.util.logging.Logger.getLogger(TemplateMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateMethod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemplateMethod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnChemestry;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnCook;
    private javax.swing.JPanel btnCreate;
    private javax.swing.JComboBox<String> cmbItem1;
    private javax.swing.JComboBox<String> cmbItem2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblChemestry;
    private javax.swing.JLabel lblCook;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblGame;
    private javax.swing.JLabel lblSubtittle1;
    private javax.swing.JLabel lblSubtittle2;
    private javax.swing.JLabel lblType;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JPanel pnlSeparator2;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
