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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;




public class Command extends javax.swing.JFrame {

    int mouseX, mouseY, turno=0;
    Fonts typeFont;    
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    


    public Command() {
        initComponents();
        decorator();
this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
                switch(keyChar) {
                    case 'z':
                        JOptionPane.showMessageDialog(null, "Empoleon realiza su ataque utilizando su tipo");
                        attack("Empoleon");
                        JOptionPane.showMessageDialog(null, "Swampert realiza su ataque utilizando su tipo");
                        attack("Swampert");
                        break;
                    case 'x':
                        JOptionPane.showMessageDialog(null, "le tiras una poscion a Empoleon y se cura 30 de vida");
                        heal("Empoleon");
                        

                        break;
                    case 'c':
                        escape();

                        break;
                    

                }
            }
        });
    }

    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void decorator(){
        typeFont = new Fonts();

        setImageLabel(lblPkmnE, "src/Assets/IMG/Command/Swampert_Img.png" );
        lblName.setText("Nombre: Swampert");
        lblLife.setText("Vida: 1000");
        lblType.setText("Tipo: Agua");

        lblText.setText("<html>La pelea contra Swampert ha iniciado<html>");
        
        
        
        setImageLabel(lblPkmnA, "src/Assets/IMG/Command/empoleon_Img.png" );
        

        lblName1.setText("Nombre: Empoleon");
        lblLife1.setText("Vida: 500");
        lblType1.setText("Tipo: Agua");

        
        lblText.setFont(typeFont.fontV(typeFont.instruments, 0, 14));
        
        lblName.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblLife.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblType.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
        lblName1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblLife1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        lblType1.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
        lblCombat.setFont(typeFont.fontV(typeFont.instruments, 0, 12));
        
        
    }
    
    
   
    
    private void attack(String attacker){
        int life=0;
        if(attacker.equals("Swampert")){
            life=Integer.parseInt(lblLife1.getText().substring(6));
            life=life-90;
            if(life>0){
                lblLife1.setText("Vida: "+life);
            }else{
                setImageLabel(lblPkmnA, "src/Assets/IMG/Command/trophy_Img.png");
                JOptionPane.showMessageDialog(null, "Swampert ha ganado la pelea");
                this.dispose();
            }
        }else if(attacker.equals("Empoleon")){
            life=Integer.parseInt(lblLife.getText().substring(6));
            life=life-90;
            if(life>0){
                lblLife.setText("Vida: "+life);
            }else{
                setImageLabel(lblPkmnE, "src/Assets/IMG/Command/trophy_Img.png");
                JOptionPane.showMessageDialog(null, "Empoleon ha ganado la pelea");
                this.dispose();
            }
            
        
        }
        
    
    }
    
    private void heal(String pkmn){
        int life=0;
        if(pkmn.equals("Empoleon") && Integer.parseInt(lblLife1.getText().substring(6))<500){
            life=Integer.parseInt(lblLife1.getText().substring(6));
            life=life+30;
            lblLife1.setText("Vida: "+life);
        }else{
            JOptionPane.showMessageDialog(null, "ya estas full vida!!");
        }
        
        
    }
    
    private void escape(){
        int randomNumber = (int) (Math.random() * 10);
        if(randomNumber==6){
            JOptionPane.showMessageDialog(null, "Escapas de la pelea");
            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "No pudiste escapar");
            JOptionPane.showMessageDialog(null, "Swampert realiza su ataque utilizando su tipo");
            attack("Swampert");
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
        lblPkmn1.setText("Curar");
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
            .addComponent(lblPkmn1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnPkmn1Layout.setVerticalGroup(
            btnPkmn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        lblPkmn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPkmn2.setText("Huir");
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
            .addComponent(lblPkmn2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btnPkmn2Layout.setVerticalGroup(
            btnPkmn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPkmn2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCombat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPkmn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPkmn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnPkmn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPkmn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCombat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 390, 110));

        lblPkmnA.setText("jLabel1");
        jPanel1.add(lblPkmnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, 190));

        lblType.setText("jLabel3");
        jPanel1.add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 130, -1));

        lblName.setText("jLabel3");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 130, -1));

        lblType1.setText("jLabel3");
        jPanel1.add(lblType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, -1));

        lblName1.setText("jLabel3");
        jPanel1.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, -1));

        lblPkmnE.setText("jLabel1");
        jPanel1.add(lblPkmnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 190, 190));

        lblLife.setText("jLabel3");
        jPanel1.add(lblLife, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 130, -1));

        lblLife1.setText("jLabel3");
        jPanel1.add(lblLife1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        lblText.setText("jLabel1");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 190, 90));

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
        JOptionPane.showMessageDialog(null, "Empoleon realiza su ataque utilizando su tipo");
        attack("Empoleon");
        JOptionPane.showMessageDialog(null, "Swampert realiza su ataque utilizando su tipo");
        attack("Swampert");
        
        
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
        heal("Empoleon");


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
        escape();
        
        
    }//GEN-LAST:event_lblPkmn2MouseClicked

    private void lblPkmn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseEntered
        btnPkmn2.setOpaque(true);
        btnPkmn2.setBackground(colorEntered);
    }//GEN-LAST:event_lblPkmn2MouseEntered

    private void lblPkmn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPkmn2MouseExited
        btnPkmn2.setOpaque(true);
        btnPkmn2.setBackground(colorDefault);
    }//GEN-LAST:event_lblPkmn2MouseExited

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
            java.util.logging.Logger.getLogger(Command.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Command.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Command.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Command.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Command().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnCombat;
    private javax.swing.JPanel btnPkmn1;
    private javax.swing.JPanel btnPkmn2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCombat;
    private javax.swing.JLabel lblLife;
    private javax.swing.JLabel lblLife1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblPkmn1;
    private javax.swing.JLabel lblPkmn2;
    private javax.swing.JLabel lblPkmnA;
    private javax.swing.JLabel lblPkmnE;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblType1;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
