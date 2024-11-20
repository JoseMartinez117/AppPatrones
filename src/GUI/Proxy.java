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


public class Proxy extends javax.swing.JFrame {
    
    int mouseX, mouseY, contRupias=0, rupiasxClick=1, x=0;
    Fonts typeFont;
    boolean i1=false, i2=false, i3=false, i4=false, i5=false, i6=false, notification=false;
    
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    
    
    public Proxy() {
        initComponents();
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
        setImageLabel(lblItem1, "src/Assets/IMG/Proxy/vacio_Icon.png");
        setImageLabel(lblItem2, "src/Assets/IMG/Proxy/vacio_Icon.png");
        setImageLabel(lblItem3, "src/Assets/IMG/Proxy/vacio_Icon.png");
        setImageLabel(lblItem4, "src/Assets/IMG/Proxy/vacio_Icon.png");
        setImageLabel(lblItem5, "src/Assets/IMG/Proxy/vacio_Icon.png");
        setImageLabel(lblItem6, "src/Assets/IMG/Proxy/vacio_Icon.png");
        setImageLabel(lblNotif, "src/Assets/IMG/Proxy/notification_Icon.png");

        lblCounter.setFont(typeFont.fontV(typeFont.instruments, 1, 14));
        lblSubtittle1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblSubtittle2.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblSubtittle3.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblSubtittle4.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblSubtittle5.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblSubtittle.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblGetrupias.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        pnlSeparator = new javax.swing.JPanel();
        lblItem3 = new javax.swing.JLabel();
        lblItem1 = new javax.swing.JLabel();
        lblItem2 = new javax.swing.JLabel();
        lblItem6 = new javax.swing.JLabel();
        lblItem5 = new javax.swing.JLabel();
        lblItem4 = new javax.swing.JLabel();
        btnGetRupias = new javax.swing.JPanel();
        lblGetrupias = new javax.swing.JLabel();
        lblCounter = new javax.swing.JLabel();
        lblRupias = new javax.swing.JLabel();
        lblSubtittle2 = new javax.swing.JLabel();
        lblSubtittle = new javax.swing.JLabel();
        lblSubtittle3 = new javax.swing.JLabel();
        lblSubtittle1 = new javax.swing.JLabel();
        lblSubtittle4 = new javax.swing.JLabel();
        lblSubtittle5 = new javax.swing.JLabel();
        btnNotif = new javax.swing.JPanel();
        lblNotif = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

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

        lblItem3.setText("jLabel1");
        lblItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItem3MouseClicked(evt);
            }
        });
        jPanel1.add(lblItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, 100));

        lblItem1.setText("jLabel1");
        lblItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItem1MouseClicked(evt);
            }
        });
        jPanel1.add(lblItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 100));

        lblItem2.setText("jLabel1");
        lblItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItem2MouseClicked(evt);
            }
        });
        jPanel1.add(lblItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, 100));

        lblItem6.setText("jLabel1");
        lblItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItem6MouseClicked(evt);
            }
        });
        jPanel1.add(lblItem6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 100, 100));

        lblItem5.setText("jLabel1");
        lblItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItem5MouseClicked(evt);
            }
        });
        jPanel1.add(lblItem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 100, 100));

        lblItem4.setText("jLabel1");
        lblItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblItem4MouseClicked(evt);
            }
        });
        jPanel1.add(lblItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 100, 100));

        lblGetrupias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGetrupias.setText("¡¡Da click para optener mas rupias!!");
        lblGetrupias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGetrupiasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGetrupiasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGetrupiasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGetRupiasLayout = new javax.swing.GroupLayout(btnGetRupias);
        btnGetRupias.setLayout(btnGetRupiasLayout);
        btnGetRupiasLayout.setHorizontalGroup(
            btnGetRupiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGetrupias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnGetRupiasLayout.setVerticalGroup(
            btnGetRupiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGetrupias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnGetRupias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 280, 40));

        lblCounter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCounter.setText("Dale actualmente tienes: 0 Rupias!!!");
        jPanel1.add(lblCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 280, 40));

        lblRupias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Proxy/colectingRupias_Gif.gif"))); // NOI18N
        lblRupias.setText("jLabel9");
        jPanel1.add(lblRupias, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 320, 320));

        lblSubtittle2.setText("<html>Necesitas 600 Rupias<html>");
        jPanel1.add(lblSubtittle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 60, 70));

        lblSubtittle.setText("<html>Necesitas 2600 Rupias<html>");
        jPanel1.add(lblSubtittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 60, 60));

        lblSubtittle3.setText("<html>Necesitas 200 Rupias<html>");
        jPanel1.add(lblSubtittle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, 60));

        lblSubtittle1.setText("<html>Necesitas 50 Rupias<html>");
        jPanel1.add(lblSubtittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 60, 50));

        lblSubtittle4.setText("<html>Necesitas 1200 Rupias<html>");
        jPanel1.add(lblSubtittle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 60, 60));

        lblSubtittle5.setText("<html>Necesitas 2000 Rupias<html>");
        jPanel1.add(lblSubtittle5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 70, 80));

        lblNotif.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNotif.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNotifMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblNotifMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblNotifMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNotifLayout = new javax.swing.GroupLayout(btnNotif);
        btnNotif.setLayout(btnNotifLayout);
        btnNotifLayout.setHorizontalGroup(
            btnNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNotif, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btnNotifLayout.setVerticalGroup(
            btnNotifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNotif, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnNotif, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 40, 40));

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

    private void lblGetrupiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGetrupiasMouseEntered
        btnGetRupias.setOpaque(true);
        btnGetRupias.setBackground(colorEntered);
    }//GEN-LAST:event_lblGetrupiasMouseEntered

    private void lblGetrupiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGetrupiasMouseExited
        btnGetRupias.setOpaque(true);
        btnGetRupias.setBackground(colorDefault);
    }//GEN-LAST:event_lblGetrupiasMouseExited

    private void lblGetrupiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGetrupiasMouseClicked
        
        contRupias+=rupiasxClick; 
        lblCounter.setText("Dale actualmente tienes: "+contRupias+" Rupias!!!");
        
        if(contRupias>=50 && notification==false){
            JOptionPane.showMessageDialog(null, "Puedes mejorar un item");
            
        }
            
        if(contRupias>=201 && notification==false){
            JOptionPane.showMessageDialog(null, "Puedes mejorar un item");      
        }
        
        if(contRupias>=600 && notification==false){
            
            JOptionPane.showMessageDialog(null, "Puedes mejorar un item");   
            
        }
        
        if(contRupias>=1200 && notification==false){
            
            JOptionPane.showMessageDialog(null, "Puedes mejorar un item");
        }
        
        if(contRupias>=1800 && notification==false){
            
            JOptionPane.showMessageDialog(null, "Puedes mejorar un item");
        }
        
        if(contRupias>=8000){
            JOptionPane.showMessageDialog(null, "¿Estas bien de la cabeza?");
        }
        
        
        
    }//GEN-LAST:event_lblGetrupiasMouseClicked

    private void lblItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItem1MouseClicked
        
        if(i1==false){
            if(contRupias>=50){
                if(i1==false){
                  contRupias=contRupias-50;
                    lblCounter.setText("Dale actualmente tienes: "+contRupias+" Rupias!!!");  
                }
                rupiasxClick=3;
                i1=true;
                setImageLabel(lblItem1, "src/Assets/IMG/Proxy/smallShield_Img.png");
                lblSubtittle1.setText("<html>Escudo Pequeño (+3 rupias)<html>");
            }else{
                JOptionPane.showMessageDialog(null, "Necesitas 50 Rupias para desbloquearlo"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya tienes este item");
        }      
        
    }//GEN-LAST:event_lblItem1MouseClicked

    private void lblItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItem2MouseClicked
        
        if(i2==false){
            if(contRupias>=200){
                if(i2==false){
                  contRupias=contRupias-200;
                    lblCounter.setText("Dale actualmente tienes: "+contRupias+" Rupias!!!");  
                }
                rupiasxClick=6;
                i2=true;
                setImageLabel(lblItem2, "src/Assets/IMG/Proxy/moleMitts_Img.png");
                lblSubtittle3.setText("<html>Guantes de mineria (+6 rupias)<html>");
            }else{
                JOptionPane.showMessageDialog(null, "Necesitas 200 Rupias para desbloquearlo"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya tienes este item"); 
        }
        

    }//GEN-LAST:event_lblItem2MouseClicked

    private void lblItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItem3MouseClicked
        if(i3==false){
            if(contRupias>=600){
                if(i3==false){
                  contRupias=contRupias-600;
                    lblCounter.setText("Dale actualmente tienes: "+contRupias+" Rupias!!!");  
                }
                rupiasxClick=9;
                i3=true;
                setImageLabel(lblItem3, "src/Assets/IMG/Proxy/flameLantern_Img.png");
                lblSubtittle2.setText("<html>Linterna de fuego (+9 rupias)<html>");
            }else{
                JOptionPane.showMessageDialog(null, "Necesitas 600 Rupias para desbloquearlo"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya tienes este item"); 
        }
    }//GEN-LAST:event_lblItem3MouseClicked

    private void lblItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItem4MouseClicked
        if(i4==false){
            if(contRupias>=1200){
                if(i4==false){
                  contRupias=contRupias-1200;
                  lblCounter.setText("Dale actualmente tienes: "+contRupias+" Rupias!!!");  
                }
                rupiasxClick=14;
                i4=true;
                setImageLabel(lblItem4, "src/Assets/IMG/Proxy/bowOfLight_Img.png");
                lblSubtittle4.setText("<html>Arco de luz (+14 rupias)<html>");
            }else{
                JOptionPane.showMessageDialog(null, "Necesitas 1200 Rupias para desbloquearlo"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya tienes este item"); 
        }

        
    }//GEN-LAST:event_lblItem4MouseClicked

    private void lblNotifMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotifMouseEntered
        btnNotif.setOpaque(true);
        btnNotif.setBackground(colorEntered);
    }//GEN-LAST:event_lblNotifMouseEntered

    private void lblNotifMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotifMouseExited
        btnNotif.setOpaque(true);
        btnNotif.setBackground(colorDefault);
    }//GEN-LAST:event_lblNotifMouseExited

    private void lblNotifMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNotifMouseClicked
            x++;
            if(!(x%2==0)){
                notification=true;
                setImageLabel(lblNotif, "src/Assets/IMG/Proxy/notification1_Icon.png");
            }else{
              notification=true;
              setImageLabel(lblNotif, "src/Assets/IMG/Proxy/notification_Icon.png");
            }
            
            
    }//GEN-LAST:event_lblNotifMouseClicked

    private void lblItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItem5MouseClicked
        if(i5==false){
            if(contRupias>=2000){
                if(i5==false){
                  contRupias=contRupias-2000;
                  lblCounter.setText("Dale actualmente tienes: "+contRupias+" Rupias!!!");  
                }
                rupiasxClick=24;
                i5=true;
                setImageLabel(lblItem5, "src/Assets/IMG/Proxy/roc'sCape_Img.png");
                lblSubtittle5.setText("<html>Capa de Roc's (+24 rupias)<html>");
            }else{
                JOptionPane.showMessageDialog(null, "Necesitas 2000 Rupias para desbloquearlo"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya tienes este item"); 
        }
    }//GEN-LAST:event_lblItem5MouseClicked

    private void lblItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblItem6MouseClicked
        
        if(i6==false){
            if(contRupias>=2600){
                if(i6==false){
                  contRupias=contRupias-2600;
                  lblCounter.setText("Dale actualmente tienes: "+contRupias+" Rupias!!!");  
                }
                rupiasxClick=50;
                i6=true;
                setImageLabel(lblItem6, "src/Assets/IMG/Proxy/masterSword_Img.png");
                lblSubtittle.setText("<html>Espada maestra (+50 rupias)<html>");
            }else{
                JOptionPane.showMessageDialog(null, "Necesitas 2600 Rupias para desbloquearlo"); 
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ya tienes este item"); 
        }
        
        
        
    }//GEN-LAST:event_lblItem6MouseClicked

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
            java.util.logging.Logger.getLogger(Proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proxy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Proxy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnGetRupias;
    private javax.swing.JPanel btnNotif;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCounter;
    private javax.swing.JLabel lblGetrupias;
    private javax.swing.JLabel lblItem1;
    private javax.swing.JLabel lblItem2;
    private javax.swing.JLabel lblItem3;
    private javax.swing.JLabel lblItem4;
    private javax.swing.JLabel lblItem5;
    private javax.swing.JLabel lblItem6;
    private javax.swing.JLabel lblNotif;
    private javax.swing.JLabel lblRupias;
    private javax.swing.JLabel lblSubtittle;
    private javax.swing.JLabel lblSubtittle1;
    private javax.swing.JLabel lblSubtittle2;
    private javax.swing.JLabel lblSubtittle3;
    private javax.swing.JLabel lblSubtittle4;
    private javax.swing.JLabel lblSubtittle5;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}