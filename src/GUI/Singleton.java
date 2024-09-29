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
import javax.swing.table.DefaultTableModel;

public class Singleton extends javax.swing.JFrame {
    DefaultTableModel modelo;
    
    int mouseX, mouseY, i=0;
    String cmbW="", name="", memory;
    Color colorEntered=new Color(128, 128, 128);
    Color colorDefault=new Color(214, 217, 223);
    
    
    
    public Singleton() {
        initComponents();
        modelo=new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccción en memoria");
        this.tbRegister.setModel(modelo);
        
        //Mundo
        setImageLabel(lblWorlds, "src/Assets/IMG/Singleton/Overworld.png");
        //Steve
        setImageLabel(lblPlayer, "src/Assets/IMG/Singleton/Player.png");
        
        memory=Integer.toHexString(System.identityHashCode(lblWorlds));
        
    }

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
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        pnlSeparator = new javax.swing.JPanel();
        cmbWorld = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JPanel();
        lblRegister = new javax.swing.JLabel();
        lblPlayer = new javax.swing.JLabel();
        btnResetWorlds = new javax.swing.JPanel();
        lblResetWorlds = new javax.swing.JLabel();
        btnPlayers = new javax.swing.JPanel();
        lblPlayers = new javax.swing.JLabel();
        lblWorlds = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRegister = new javax.swing.JTable();

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

        cmbWorld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OverWorld", "Nether", "End" }));
        cmbWorld.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWorldItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbWorld, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 100, -1));

        lblRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegister.setText("Registrar en mundos");
        lblRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegisterMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegisterLayout = new javax.swing.GroupLayout(btnRegister);
        btnRegister.setLayout(btnRegisterLayout);
        btnRegisterLayout.setHorizontalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        btnRegisterLayout.setVerticalGroup(
            btnRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 140, 50));

        lblPlayer.setText("jLabel1");
        jPanel1.add(lblPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 100, 225));

        lblResetWorlds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResetWorlds.setText("Restablecer Mundos");
        lblResetWorlds.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblResetWorlds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblResetWorldsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblResetWorldsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblResetWorldsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnResetWorldsLayout = new javax.swing.GroupLayout(btnResetWorlds);
        btnResetWorlds.setLayout(btnResetWorldsLayout);
        btnResetWorldsLayout.setHorizontalGroup(
            btnResetWorldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnResetWorldsLayout.createSequentialGroup()
                .addComponent(lblResetWorlds, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnResetWorldsLayout.setVerticalGroup(
            btnResetWorldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblResetWorlds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnResetWorlds, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 380, 140, -1));

        lblPlayers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayers.setText("Ver jugadores registrados");
        lblPlayers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPlayers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPlayersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPlayersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPlayersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPlayersLayout = new javax.swing.GroupLayout(btnPlayers);
        btnPlayers.setLayout(btnPlayersLayout);
        btnPlayersLayout.setHorizontalGroup(
            btnPlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(btnPlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPlayersLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnPlayersLayout.setVerticalGroup(
            btnPlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(btnPlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnPlayersLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(btnPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        lblWorlds.setText("jLabel2");
        jPanel1.add(lblWorlds, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 250));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Seleccionar Mundo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        tbRegister.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero", "Nombre", "Dirección en memoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbRegister);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 410, 120));

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

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void lblRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseEntered
        btnRegister.setOpaque(true);
        btnRegister.setBackground(colorEntered);
    }//GEN-LAST:event_lblRegisterMouseEntered

    private void lblRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseExited
        btnRegister.setOpaque(true);
        btnRegister.setBackground(colorDefault);
    }//GEN-LAST:event_lblRegisterMouseExited

    private void lblResetWorldsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetWorldsMouseEntered
        btnResetWorlds.setOpaque(true);
        btnResetWorlds.setBackground(colorEntered);
    }//GEN-LAST:event_lblResetWorldsMouseEntered

    private void lblResetWorldsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetWorldsMouseExited
        btnResetWorlds.setOpaque(true);
        btnResetWorlds.setBackground(colorDefault);
    }//GEN-LAST:event_lblResetWorldsMouseExited

    private void lblPlayersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayersMouseEntered
        btnPlayers.setOpaque(true);
        btnPlayers.setBackground(colorEntered);
    }//GEN-LAST:event_lblPlayersMouseEntered

    private void lblPlayersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayersMouseExited
        btnPlayers.setOpaque(true);
        btnPlayers.setBackground(colorDefault);
    }//GEN-LAST:event_lblPlayersMouseExited

    private void lblRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegisterMouseClicked
        cmbW=cmbWorld.getSelectedItem().toString();
        if(name.equals("")){
            name=txtName.getText();
            JOptionPane.showMessageDialog(null, "Registrado exitosamente");
        }else{
            JOptionPane.showMessageDialog(null, "Solo se permite 1 jugador");
        }
        
    }//GEN-LAST:event_lblRegisterMouseClicked

    private void lblResetWorldsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblResetWorldsMouseClicked
        for(int j=0; j<tbRegister.getRowCount();i++){
            modelo.removeRow(j);
        }
        
        JOptionPane.showMessageDialog(null, "Registro reseteado");
        name="";
        i=0;
    }//GEN-LAST:event_lblResetWorldsMouseClicked

    private void lblPlayersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPlayersMouseClicked
        String[] info = new String[3];
        info[0]=""+(i+1);
        info[1]=name;
        info[2]=memory;
        modelo.addRow(info);
        i++;
    }//GEN-LAST:event_lblPlayersMouseClicked

    private void cmbWorldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWorldItemStateChanged
        cmbW=cmbWorld.getSelectedItem().toString();
        setImageLabel(lblWorlds, "src/Assets/IMG/Singleton/"+cmbW+".png");
    }//GEN-LAST:event_cmbWorldItemStateChanged

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
            java.util.logging.Logger.getLogger(Singleton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Singleton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Singleton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Singleton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Singleton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnPlayers;
    private javax.swing.JPanel btnRegister;
    private javax.swing.JPanel btnResetWorlds;
    private javax.swing.JComboBox<String> cmbWorld;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlayer;
    private javax.swing.JLabel lblPlayers;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblResetWorlds;
    private javax.swing.JLabel lblWorlds;
    private javax.swing.JPanel pnlSeparator;
    private javax.swing.JTable tbRegister;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
