/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Json.JsonInformation;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.simple.parser.ParseException;
import Assets.FONT.Fonts;
import java.net.URI;
import java.net.URISyntaxException;


public class Glosario extends javax.swing.JFrame {

    int mouseX, mouseY;
    JsonInformation info;
    Home newFrame;
    Color colorSelected;
    Color colorEntered;
    Color colorDefault;
    private String dato="";
    File f;
    Desktop dt;
    Fonts typeFont;
    
    public Glosario() throws IOException, FileNotFoundException, ParseException {
        this.info = new JsonInformation("src/Assets/Patrones.json");
        colorSelected = new Color(81,174,248);
        colorEntered = new Color(81,174,247);
        colorDefault = new Color(37, 133, 217);
        initComponents();
        decorator();
    }
    
    private void decorator(){
        typeFont = new Fonts();
        lblText.setFont(typeFont.fontV(typeFont.instruments, 0, 15));
        lblTitle.setFont(typeFont.fontV(typeFont.instruments, 1, 40));

    }
    

    
    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    

    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        LblHome = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 3, 725));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 830, 3));

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
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCloseLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtCerrar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnCloseLayout.setVerticalGroup(
            btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(btnCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnCloseLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtCerrar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 50, 60));

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
            .addGap(0, 780, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 780, 60));

        btnHome.setBackground(new java.awt.Color(37, 133, 217));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/Home_Icon.png"))); // NOI18N
        LblHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblHomeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnHomeLayout.createSequentialGroup()
                .addComponent(LblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(LblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 730));

        lblTitle.setFont(new java.awt.Font("Instrument Sans", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Glosario");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 830, 60));

        lblText.setText("<html>Principio de responsabilidad única: Establece que cada módulo o clase debe tener responsabilidad sobre una sola parte de la funcionalidad proporcionada por el software y esta responsabilidad debe estar encapsulada en su totalidad por la clase.\n" +
            "<p><p>\n" +
            "Principio de abierto/cerrado: Establece que «una entidad de software (clase, módulo, función, etc.) debe quedarse abierta para su extensión, pero cerrada para su modificación». Es decir, se debe poder extender el comportamiento de tal entidad, pero sin modificar su código fuente.\n" +
            "<p><p>\n" +
            "Principio de sustitución de Liskov: Cada clase que hereda de otra puede usarse como su padre sin necesidad de conocer las diferencias entre ellas.\n" +
            "<p><p>\n" +
            "Double Dispatch (envío doble): Es un truco que permite el uso de la vinculación dinámica junto a métodos sobrecargados.\n" +
            "<p><p>\n" +
            "Patrones Creacionales: Proporcionan mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización de código existente.\n" +
            "<p><p>\n" +
            "Patrones Estructurales: Explican cómo ensamblar objetos y clases en estructuras más grandes a la vez que se mantiene la flexibilidad y eficiencia de la estructura.\n" +
            "<p><p>\n" +
            "Patrones Comportamentales: Se encargan de una comunicación efectiva y la asignación de responsabilidades entre objetos.\n" +
            "<p><p>\n" +
            "Herencia: Es el mecanismo por el cual una clase permite heredar las características (atributos y métodos) de otra clase.\n" +
            "<p><p>\n" +
            "Composición: Es el mecanismo en el cual una clase se construye a partir de otros objetos de igual o distinto tipo, pudiéndolos combinar para obtener la funcionalidad deseada.\n" +
            "<p><p>\n" +
            "Polimorfismo: Es la capacidad de que distintos objetos respondan de manera diferente a un mismo mensaje o invocación.<html>");
        jPanel1.add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 810, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCerrarMouseClicked
        System.exit(0);
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

    private void LblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblHomeMouseClicked
        try {
            newFrame = new Home();
        } catch (IOException ex) {
            Logger.getLogger(Glosario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Glosario.class.getName()).log(Level.SEVERE, null, ex);
        }
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LblHomeMouseClicked

    private void LblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblHomeMouseEntered
        btnHome.setOpaque(true);
        btnHome.setBackground(colorEntered);
    }//GEN-LAST:event_LblHomeMouseEntered

    private void LblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblHomeMouseExited
        btnHome.setOpaque(true);
        btnHome.setBackground(colorDefault);
    }//GEN-LAST:event_LblHomeMouseExited

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
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Glosario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Glosario().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Glosario.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(Glosario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LblHome;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
