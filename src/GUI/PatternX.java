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


public class PatternX extends javax.swing.JFrame {

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
    
    public PatternX() throws IOException, FileNotFoundException, ParseException {
        this.info = new JsonInformation();
        colorSelected = new Color(81,174,248);
        colorEntered = new Color(81,174,247);
        colorDefault = new Color(37, 133, 217);
        initComponents();
        decorator();
    }
    
    private void decorator(){
        typeFont = new Fonts();
        
        //Inicializando la fuente de la ventana.
        //-Titulos, subtitulos, definiciones
        lblTitle.setFont(typeFont.fontV(typeFont.instruments, 1, 40));
        lblTab.setFont(typeFont.fontV(typeFont.instruments, 1, 24));
        lblDefinition.setFont(typeFont.fontV(typeFont.instruments, 0, 18));
        lblAdvantages.setFont(typeFont.fontV(typeFont.instruments, 0, 18));
        lblAdvantages1.setFont(typeFont.fontV(typeFont.instruments, 0, 18));
        lblImplement.setFont(typeFont.fontV(typeFont.instruments, 0, 17));
        lblTextEx.setFont(typeFont.fontV(typeFont.instruments, 0, 18));
        lblExperience.setFont(typeFont.fontV(typeFont.instruments, 0, 18));
        lblReferences.setFont(typeFont.fontV(typeFont.instruments, 0, 18));
        lbltxtDefinition.setFont(typeFont.fontV(typeFont.instruments, 0, 11));
        LbltxtAdvantage.setFont(typeFont.fontV(typeFont.instruments, 0, 11));
        LbltxtImplement.setFont(typeFont.fontV(typeFont.instruments, 0, 11));
        LbltxtCodeExample.setFont(typeFont.fontV(typeFont.instruments, 0, 11));
        LbltxtExperience.setFont(typeFont.fontV(typeFont.instruments, 0, 11));
        LbltxtReferences.setFont(typeFont.fontV(typeFont.instruments, 0, 11));
        
    }
    
    public void setDato(String dato){
        this.dato=dato;
        lblTitle.setText(dato);
        lblDefinition.setText("<html>" + info.getInfo(dato, "Definicion") + "<html>");
        btnDefinition.setBackground(colorSelected);
    }
    
    private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(),Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void defaultButtons(){
        btnDefinition.setBackground(colorDefault);
        btnAdvantage.setBackground(colorDefault);
        btnImplement.setBackground(colorDefault);
        btnCodeExample.setBackground(colorDefault);
        btnExperience.setBackground(colorDefault);
        btnReferences.setBackground(colorDefault);
    }
    
    private void window(String nombre){
        
        switch(nombre){
            case "FactoryMethod":
                FactoryMethod newframe = new FactoryMethod();
                newframe.setVisible(true);
                break;
            case "AbstractFactory":
                AbstractFactory newframe1 = new AbstractFactory();
                newframe1.setVisible(true);
                break;
            case "Builder":
                Builder newframe2 = new Builder();
                newframe2.setVisible(true);
                break;
                
            case "Prototype":
                Prototype newframe3 = new Prototype();
                newframe3.setVisible(true);
                break;
                
            case "Singleton":
                Singleton newframe4 = new Singleton();
                newframe4.setVisible(true);
                break;   
        }
    
    }
    
    private void link(String wich) throws IOException, URISyntaxException{
        
        switch(wich){
            case "Github":
                Desktop enlace = Desktop.getDesktop();
                enlace.browse(new URI("https://github.com/BloodSlayer-404/"+dato));
                break;
            
            case "Diagram":
                 f = new File("src/Assets/IMG/Diagrams/DiagramaUml_"+dato+".png");
                 dt = Desktop.getDesktop();
                 dt.open(f);
            break;
            
            case "DiagramEx":
                f = new File("src/Assets/IMG/Diagrams/DiagramaUml_"+dato+"Ex.png");
                dt = Desktop.getDesktop();
                dt.open(f);
            break;
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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        LblHome = new javax.swing.JLabel();
        btnDefinition = new javax.swing.JPanel();
        lbltxtDefinition = new javax.swing.JLabel();
        LblDefinition = new javax.swing.JLabel();
        btnAdvantage = new javax.swing.JPanel();
        LbltxtAdvantage = new javax.swing.JLabel();
        LblAdvantege = new javax.swing.JLabel();
        btnImplement = new javax.swing.JPanel();
        LbltxtImplement = new javax.swing.JLabel();
        LblImplement = new javax.swing.JLabel();
        btnCodeExample = new javax.swing.JPanel();
        LbltxtCodeExample = new javax.swing.JLabel();
        LblCodeExample = new javax.swing.JLabel();
        btnExperience = new javax.swing.JPanel();
        LbltxtExperience = new javax.swing.JLabel();
        LblExperience = new javax.swing.JLabel();
        btnReferences = new javax.swing.JPanel();
        LbltxtReferences = new javax.swing.JLabel();
        LblReferences = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlDefinition = new javax.swing.JPanel();
        lblDefinition = new javax.swing.JLabel();
        pnlAdventage = new javax.swing.JPanel();
        lblAdvantages = new javax.swing.JLabel();
        lblAdvantages1 = new javax.swing.JLabel();
        pnlImplment = new javax.swing.JPanel();
        lblImplement = new javax.swing.JLabel();
        pnlCodeExample = new javax.swing.JPanel();
        btnDiagramEx = new javax.swing.JPanel();
        lblDiagramEx = new javax.swing.JLabel();
        btnGitHub = new javax.swing.JPanel();
        lblGitHub = new javax.swing.JLabel();
        btnDiagram = new javax.swing.JPanel();
        lblDiagram = new javax.swing.JLabel();
        lblTextEx = new javax.swing.JLabel();
        pnlExperience = new javax.swing.JPanel();
        lblExperience = new javax.swing.JLabel();
        pnlReferences = new javax.swing.JPanel();
        lblReferences = new javax.swing.JLabel();
        lblTab = new javax.swing.JLabel();

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
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addComponent(LblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnHomeLayout.createSequentialGroup()
                .addComponent(LblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        btnDefinition.setBackground(new java.awt.Color(37, 133, 217));
        btnDefinition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbltxtDefinition.setForeground(new java.awt.Color(255, 255, 255));
        lbltxtDefinition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltxtDefinition.setText("Definición");
        lbltxtDefinition.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbltxtDefinition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltxtDefinitionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltxtDefinitionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltxtDefinitionMouseExited(evt);
            }
        });

        LblDefinition.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblDefinition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/Definition_Icon.png"))); // NOI18N
        LblDefinition.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblDefinition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblDefinitionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblDefinitionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblDefinitionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDefinitionLayout = new javax.swing.GroupLayout(btnDefinition);
        btnDefinition.setLayout(btnDefinitionLayout);
        btnDefinitionLayout.setHorizontalGroup(
            btnDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDefinitionLayout.createSequentialGroup()
                .addComponent(LblDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lbltxtDefinition, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );
        btnDefinitionLayout.setVerticalGroup(
            btnDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDefinitionLayout.createSequentialGroup()
                .addComponent(LblDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDefinitionLayout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(lbltxtDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)))
        );

        jPanel1.add(btnDefinition, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 60, 110));

        btnAdvantage.setBackground(new java.awt.Color(37, 133, 217));
        btnAdvantage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbltxtAdvantage.setForeground(new java.awt.Color(255, 255, 255));
        LbltxtAdvantage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbltxtAdvantage.setText("<html>Ventaja y <p> Desventaja<html>");
        LbltxtAdvantage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbltxtAdvantage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbltxtAdvantageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbltxtAdvantageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbltxtAdvantageMouseExited(evt);
            }
        });

        LblAdvantege.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblAdvantege.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/Advantages_Icon.png"))); // NOI18N
        LblAdvantege.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblAdvantege.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblAdvantegeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblAdvantegeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblAdvantegeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnAdvantageLayout = new javax.swing.GroupLayout(btnAdvantage);
        btnAdvantage.setLayout(btnAdvantageLayout);
        btnAdvantageLayout.setHorizontalGroup(
            btnAdvantageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdvantageLayout.createSequentialGroup()
                .addComponent(LblAdvantege, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(btnAdvantageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnAdvantageLayout.createSequentialGroup()
                    .addComponent(LbltxtAdvantage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        btnAdvantageLayout.setVerticalGroup(
            btnAdvantageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblAdvantege, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(btnAdvantageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAdvantageLayout.createSequentialGroup()
                    .addContainerGap(78, Short.MAX_VALUE)
                    .addComponent(LbltxtAdvantage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel1.add(btnAdvantage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 60, 110));

        btnImplement.setBackground(new java.awt.Color(37, 133, 217));
        btnImplement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbltxtImplement.setForeground(new java.awt.Color(255, 255, 255));
        LbltxtImplement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbltxtImplement.setText("<html>Ejecucion<html>");
        LbltxtImplement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbltxtImplement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbltxtImplementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbltxtImplementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbltxtImplementMouseExited(evt);
            }
        });

        LblImplement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblImplement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/Implement_Icon.png"))); // NOI18N
        LblImplement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblImplement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblImplementMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblImplementMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblImplementMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnImplementLayout = new javax.swing.GroupLayout(btnImplement);
        btnImplement.setLayout(btnImplementLayout);
        btnImplementLayout.setHorizontalGroup(
            btnImplementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnImplementLayout.createSequentialGroup()
                .addComponent(LblImplement, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(btnImplementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnImplementLayout.createSequentialGroup()
                    .addComponent(LbltxtImplement, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        btnImplementLayout.setVerticalGroup(
            btnImplementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblImplement, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(btnImplementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnImplementLayout.createSequentialGroup()
                    .addContainerGap(79, Short.MAX_VALUE)
                    .addComponent(LbltxtImplement, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jPanel1.add(btnImplement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 60, 110));

        btnCodeExample.setBackground(new java.awt.Color(37, 133, 217));
        btnCodeExample.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbltxtCodeExample.setForeground(new java.awt.Color(255, 255, 255));
        LbltxtCodeExample.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbltxtCodeExample.setText("Código");
        LbltxtCodeExample.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbltxtCodeExample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbltxtCodeExampleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbltxtCodeExampleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbltxtCodeExampleMouseExited(evt);
            }
        });

        LblCodeExample.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCodeExample.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/CodeExample_Icon.png"))); // NOI18N
        LblCodeExample.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblCodeExample.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCodeExampleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblCodeExampleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblCodeExampleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCodeExampleLayout = new javax.swing.GroupLayout(btnCodeExample);
        btnCodeExample.setLayout(btnCodeExampleLayout);
        btnCodeExampleLayout.setHorizontalGroup(
            btnCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCodeExampleLayout.createSequentialGroup()
                .addComponent(LblCodeExample, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LbltxtCodeExample, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );
        btnCodeExampleLayout.setVerticalGroup(
            btnCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblCodeExample, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(btnCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCodeExampleLayout.createSequentialGroup()
                    .addContainerGap(74, Short.MAX_VALUE)
                    .addComponent(LbltxtCodeExample)
                    .addGap(20, 20, 20)))
        );

        jPanel1.add(btnCodeExample, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 60, 110));

        btnExperience.setBackground(new java.awt.Color(37, 133, 217));
        btnExperience.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbltxtExperience.setForeground(new java.awt.Color(255, 255, 255));
        LbltxtExperience.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbltxtExperience.setText("<html>Ejemplo<html>");
        LbltxtExperience.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbltxtExperience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbltxtExperienceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbltxtExperienceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbltxtExperienceMouseExited(evt);
            }
        });

        LblExperience.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblExperience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/Experiencia_Icon.png"))); // NOI18N
        LblExperience.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblExperience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblExperienceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblExperienceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblExperienceMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExperienceLayout = new javax.swing.GroupLayout(btnExperience);
        btnExperience.setLayout(btnExperienceLayout);
        btnExperienceLayout.setHorizontalGroup(
            btnExperienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExperienceLayout.createSequentialGroup()
                .addComponent(LblExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnExperienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(LbltxtExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE))
        );
        btnExperienceLayout.setVerticalGroup(
            btnExperienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LblExperience, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(btnExperienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExperienceLayout.createSequentialGroup()
                    .addContainerGap(76, Short.MAX_VALUE)
                    .addComponent(LbltxtExperience)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        jPanel1.add(btnExperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 60, 110));

        btnReferences.setBackground(new java.awt.Color(37, 133, 217));
        btnReferences.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LbltxtReferences.setForeground(new java.awt.Color(255, 255, 255));
        LbltxtReferences.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbltxtReferences.setText("<html>Referencia<html>");
        LbltxtReferences.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LbltxtReferences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbltxtReferencesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbltxtReferencesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbltxtReferencesMouseExited(evt);
            }
        });

        LblReferences.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblReferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/References_Icon.png"))); // NOI18N
        LblReferences.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LblReferences.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblReferencesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblReferencesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblReferencesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReferencesLayout = new javax.swing.GroupLayout(btnReferences);
        btnReferences.setLayout(btnReferencesLayout);
        btnReferencesLayout.setHorizontalGroup(
            btnReferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReferencesLayout.createSequentialGroup()
                .addComponent(LblReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btnReferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnReferencesLayout.createSequentialGroup()
                    .addComponent(LbltxtReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnReferencesLayout.setVerticalGroup(
            btnReferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReferencesLayout.createSequentialGroup()
                .addComponent(LblReferences, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(btnReferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReferencesLayout.createSequentialGroup()
                    .addContainerGap(74, Short.MAX_VALUE)
                    .addComponent(LbltxtReferences)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        jPanel1.add(btnReferences, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 60, 120));

        lblTitle.setFont(new java.awt.Font("Instrument Sans", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("<html>texto ejemplo<html>");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 430, 60));

        tabs.setBackground(new java.awt.Color(255, 255, 255));
        tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        pnlDefinition.setBackground(new java.awt.Color(255, 255, 255));

        lblDefinition.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDefinition.setText("Text");
        lblDefinition.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlDefinitionLayout = new javax.swing.GroupLayout(pnlDefinition);
        pnlDefinition.setLayout(pnlDefinitionLayout);
        pnlDefinitionLayout.setHorizontalGroup(
            pnlDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDefinitionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblDefinition, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDefinitionLayout.setVerticalGroup(
            pnlDefinitionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDefinitionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        tabs.addTab("", pnlDefinition);

        pnlAdventage.setBackground(new java.awt.Color(255, 255, 255));

        lblAdvantages.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAdvantages.setText("Text");
        lblAdvantages.setToolTipText("");
        lblAdvantages.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblAdvantages1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblAdvantages1.setText("Text");
        lblAdvantages1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlAdventageLayout = new javax.swing.GroupLayout(pnlAdventage);
        pnlAdventage.setLayout(pnlAdventageLayout);
        pnlAdventageLayout.setHorizontalGroup(
            pnlAdventageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdventageLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblAdvantages, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lblAdvantages1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAdventageLayout.setVerticalGroup(
            pnlAdventageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdventageLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(pnlAdventageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdvantages, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdvantages1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        tabs.addTab("", pnlAdventage);

        pnlImplment.setBackground(new java.awt.Color(255, 255, 255));

        lblImplement.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblImplement.setText("Text");
        lblImplement.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlImplmentLayout = new javax.swing.GroupLayout(pnlImplment);
        pnlImplment.setLayout(pnlImplmentLayout);
        pnlImplmentLayout.setHorizontalGroup(
            pnlImplmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImplmentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblImplement, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlImplmentLayout.setVerticalGroup(
            pnlImplmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlImplmentLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblImplement, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tabs.addTab("", pnlImplment);

        pnlCodeExample.setBackground(new java.awt.Color(255, 255, 255));

        lblDiagramEx.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDiagramEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/DiagramB_Icon.png"))); // NOI18N
        lblDiagramEx.setText("text");
        lblDiagramEx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDiagramEx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiagramExMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDiagramExMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDiagramExMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDiagramExLayout = new javax.swing.GroupLayout(btnDiagramEx);
        btnDiagramEx.setLayout(btnDiagramExLayout);
        btnDiagramExLayout.setHorizontalGroup(
            btnDiagramExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiagramEx, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        btnDiagramExLayout.setVerticalGroup(
            btnDiagramExLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiagramEx, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        lblGitHub.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblGitHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/Github_Icon.png"))); // NOI18N
        lblGitHub.setText("GitHub");
        lblGitHub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGitHubMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGitHubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGitHubMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGitHubLayout = new javax.swing.GroupLayout(btnGitHub);
        btnGitHub.setLayout(btnGitHubLayout);
        btnGitHubLayout.setHorizontalGroup(
            btnGitHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGitHub, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        btnGitHubLayout.setVerticalGroup(
            btnGitHubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblGitHub, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        lblDiagram.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDiagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/IMG/Icons/Patterns/DiagramC_Icon.png"))); // NOI18N
        lblDiagram.setText("text");
        lblDiagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDiagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDiagramMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDiagramMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDiagramMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDiagramLayout = new javax.swing.GroupLayout(btnDiagram);
        btnDiagram.setLayout(btnDiagramLayout);
        btnDiagramLayout.setHorizontalGroup(
            btnDiagramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiagram, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );
        btnDiagramLayout.setVerticalGroup(
            btnDiagramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDiagram, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        lblTextEx.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTextEx.setText("<html>Haciendo click en los siguientes botones podras abrir el repositorio en donde se encuentra el codigo de ejemplo y los diagramas de clase del patrón de diseño como el del ejemplo realizado para el patron de diseño.<html>");
        lblTextEx.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlCodeExampleLayout = new javax.swing.GroupLayout(pnlCodeExample);
        pnlCodeExample.setLayout(pnlCodeExampleLayout);
        pnlCodeExampleLayout.setHorizontalGroup(
            pnlCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCodeExampleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(pnlCodeExampleLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextEx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlCodeExampleLayout.createSequentialGroup()
                        .addComponent(btnDiagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btnDiagramEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        pnlCodeExampleLayout.setVerticalGroup(
            pnlCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCodeExampleLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTextEx, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGitHub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(pnlCodeExampleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDiagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiagramEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        tabs.addTab("", pnlCodeExample);

        pnlExperience.setBackground(new java.awt.Color(255, 255, 255));

        lblExperience.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblExperience.setText("Text");
        lblExperience.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlExperienceLayout = new javax.swing.GroupLayout(pnlExperience);
        pnlExperience.setLayout(pnlExperienceLayout);
        pnlExperienceLayout.setHorizontalGroup(
            pnlExperienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlExperienceLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblExperience, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlExperienceLayout.setVerticalGroup(
            pnlExperienceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlExperienceLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lblExperience, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        tabs.addTab("", pnlExperience);

        pnlReferences.setBackground(new java.awt.Color(255, 255, 255));

        lblReferences.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblReferences.setText("Text");
        lblReferences.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout pnlReferencesLayout = new javax.swing.GroupLayout(pnlReferences);
        pnlReferences.setLayout(pnlReferencesLayout);
        pnlReferencesLayout.setHorizontalGroup(
            pnlReferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReferencesLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlReferencesLayout.setVerticalGroup(
            pnlReferencesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReferencesLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lblReferences, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        tabs.addTab("", pnlReferences);

        jPanel1.add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 860, 550));

        lblTab.setBackground(new java.awt.Color(255, 255, 255));
        lblTab.setFont(new java.awt.Font("Instrument Sans", 1, 12)); // NOI18N
        lblTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTab.setText("<html>Definición<html>");
        jPanel1.add(lblTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 540, 40));

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
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
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

    private void LblDefinitionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblDefinitionMouseEntered
        if (btnDefinition.getBackground().equals(colorDefault)) {
            btnDefinition.setOpaque(true);
            btnDefinition.setBackground(colorEntered);
        }
    }//GEN-LAST:event_LblDefinitionMouseEntered

    private void LblDefinitionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblDefinitionMouseExited
        if (btnDefinition.getBackground().equals(colorEntered)) {
            btnDefinition.setOpaque(true);
            btnDefinition.setBackground(colorDefault);
        }
    }//GEN-LAST:event_LblDefinitionMouseExited

    private void LblAdvantegeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblAdvantegeMouseEntered
        if(btnAdvantage.getBackground().equals(colorDefault)){
            btnAdvantage.setOpaque(true);
            btnAdvantage.setBackground(colorEntered);
        }
    }//GEN-LAST:event_LblAdvantegeMouseEntered

    private void LblAdvantegeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblAdvantegeMouseExited
        if(btnAdvantage.getBackground().equals(colorEntered)){
            btnAdvantage.setOpaque(true);
            btnAdvantage.setBackground(colorDefault);
        }
    }//GEN-LAST:event_LblAdvantegeMouseExited

    private void LblImplementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImplementMouseEntered
        if (btnImplement.getBackground().equals(colorDefault)) {
            btnImplement.setOpaque(true);
            btnImplement.setBackground(colorEntered);
        }
    }//GEN-LAST:event_LblImplementMouseEntered

    private void LblImplementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImplementMouseExited
        if (btnImplement.getBackground().equals(colorEntered)) {
            btnImplement.setOpaque(true);
            btnImplement.setBackground(colorDefault);   
        }
    }//GEN-LAST:event_LblImplementMouseExited

    private void LblCodeExampleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCodeExampleMouseEntered
        if (btnCodeExample.getBackground().equals(colorDefault)) {
            btnCodeExample.setOpaque(true);
            btnCodeExample.setBackground(colorEntered);
        }
    }//GEN-LAST:event_LblCodeExampleMouseEntered

    private void LblCodeExampleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCodeExampleMouseExited
        if (btnCodeExample.getBackground().equals(colorEntered)) {
            btnCodeExample.setOpaque(true);
            btnCodeExample.setBackground(colorDefault);
        }
    }//GEN-LAST:event_LblCodeExampleMouseExited

    private void LblExperienceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExperienceMouseEntered
        if (btnExperience.getBackground().equals(colorDefault)) {
            btnExperience.setOpaque(true);
            btnExperience.setBackground(colorEntered);
        }
    }//GEN-LAST:event_LblExperienceMouseEntered

    private void LblExperienceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExperienceMouseExited
        if (btnExperience.getBackground().equals(colorEntered)) {
            btnExperience.setOpaque(true);
            btnExperience.setBackground(colorDefault);
        }
    }//GEN-LAST:event_LblExperienceMouseExited

    private void LblReferencesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblReferencesMouseEntered
        if (btnReferences.getBackground().equals(colorDefault)) {
            btnReferences.setOpaque(true);
            btnReferences.setBackground(colorEntered);
        }
    }//GEN-LAST:event_LblReferencesMouseEntered

    private void LblReferencesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblReferencesMouseExited
        if (btnReferences.getBackground().equals(colorEntered)) {
            btnReferences.setOpaque(true);
            btnReferences.setBackground(colorDefault);
        }
    }//GEN-LAST:event_LblReferencesMouseExited

    private void LblDefinitionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblDefinitionMouseClicked
        tabs.setSelectedIndex(0);
        lblTab.setText("Definición");
        defaultButtons();
        btnDefinition.setBackground(colorSelected);
        lblDefinition.setText("<html>" + info.getInfo(dato, "Definicion") + "<html>");
    }//GEN-LAST:event_LblDefinitionMouseClicked

    private void LblAdvantegeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblAdvantegeMouseClicked
        tabs.setSelectedIndex(1);
        lblTab.setText("Ventajas y Desventajas");
        defaultButtons();
        btnAdvantage.setBackground(colorSelected);
        lblAdvantages.setText("<html>"+info.getList(dato, "Ventajas")+"<html>");
        lblAdvantages1.setText("<html>"+info.getList(dato, "Desventajas")+"<html>");
    }//GEN-LAST:event_LblAdvantegeMouseClicked

    private void LblImplementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblImplementMouseClicked
        tabs.setSelectedIndex(2);
        lblTab.setText("Pasos de Ejecución");
        defaultButtons();
        btnImplement.setBackground(colorSelected);
        lblImplement.setText("<html>"+info.getList(dato, "Implementacion")+"<html>");
        
    }//GEN-LAST:event_LblImplementMouseClicked

    private void LblCodeExampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCodeExampleMouseClicked
        tabs.setSelectedIndex(3);
        lblTab.setText("Ejemplo en Código");
        lblDiagram.setText("<html>Diagrama de clases de "+dato+"<html>");
        lblDiagramEx.setText("<html>Diagrama de ejemplo de "+dato+"<html>");
        defaultButtons();
        btnCodeExample.setBackground(colorSelected);
        
    }//GEN-LAST:event_LblCodeExampleMouseClicked

    private void LblExperienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblExperienceMouseClicked
        tabs.setSelectedIndex(4);
        lblTab.setText("Experiencia Interactiva");
        lblExperience.setText("<html>"+info.getInfo(dato, "Experiencia"));
        defaultButtons();
        btnExperience.setBackground(colorSelected);
        window(dato);
    }//GEN-LAST:event_LblExperienceMouseClicked

    private void LblReferencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblReferencesMouseClicked
        tabs.setSelectedIndex(5);
        lblTab.setText("Referencias");
        defaultButtons();
        btnReferences.setBackground(colorSelected);
        lblReferences.setText("<html>"+info.getList(dato, "Referencias")+"<html>");
    }//GEN-LAST:event_LblReferencesMouseClicked

    private void lblGitHubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitHubMouseEntered
            btnGitHub.setOpaque(true);
            btnGitHub.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblGitHubMouseEntered

    private void lblGitHubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitHubMouseExited
            btnGitHub.setOpaque(true);
            btnGitHub.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_lblGitHubMouseExited

    private void lblDiagramMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiagramMouseEntered
            btnDiagram.setOpaque(true);
            btnDiagram.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblDiagramMouseEntered

    private void lblDiagramMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiagramMouseExited
            btnDiagram.setOpaque(true);
            btnDiagram.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_lblDiagramMouseExited

    private void lblDiagramExMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiagramExMouseExited
            btnDiagramEx.setOpaque(true);
            btnDiagramEx.setBackground(new Color(214, 217, 223));
    }//GEN-LAST:event_lblDiagramExMouseExited

    private void lblDiagramExMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiagramExMouseEntered
            btnDiagramEx.setOpaque(true);
            btnDiagramEx.setBackground(Color.GRAY);
    }//GEN-LAST:event_lblDiagramExMouseEntered

    private void lblGitHubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGitHubMouseClicked
        try {
            link("Github");
        } catch (IOException ex) {
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblGitHubMouseClicked

    private void lblDiagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiagramMouseClicked
        try {
            link("Diagram");
        } catch (IOException ex) {
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblDiagramMouseClicked

    private void lblDiagramExMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDiagramExMouseClicked
        try {
            link("DiagramEx");
        } catch (IOException ex) {
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblDiagramExMouseClicked

    private void lbltxtDefinitionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltxtDefinitionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbltxtDefinitionMouseClicked

    private void lbltxtDefinitionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltxtDefinitionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbltxtDefinitionMouseEntered

    private void lbltxtDefinitionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltxtDefinitionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbltxtDefinitionMouseExited

    private void LbltxtAdvantageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtAdvantageMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtAdvantageMouseClicked

    private void LbltxtAdvantageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtAdvantageMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtAdvantageMouseEntered

    private void LbltxtAdvantageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtAdvantageMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtAdvantageMouseExited

    private void LbltxtImplementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtImplementMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtImplementMouseClicked

    private void LbltxtImplementMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtImplementMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtImplementMouseEntered

    private void LbltxtImplementMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtImplementMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtImplementMouseExited

    private void LbltxtCodeExampleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtCodeExampleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtCodeExampleMouseClicked

    private void LbltxtCodeExampleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtCodeExampleMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtCodeExampleMouseEntered

    private void LbltxtCodeExampleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtCodeExampleMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtCodeExampleMouseExited

    private void LbltxtExperienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtExperienceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtExperienceMouseClicked

    private void LbltxtExperienceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtExperienceMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtExperienceMouseEntered

    private void LbltxtExperienceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtExperienceMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtExperienceMouseExited

    private void LbltxtReferencesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtReferencesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtReferencesMouseClicked

    private void LbltxtReferencesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtReferencesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtReferencesMouseEntered

    private void LbltxtReferencesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbltxtReferencesMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_LbltxtReferencesMouseExited

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
            java.util.logging.Logger.getLogger(PatternX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatternX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatternX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatternX.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PatternX().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(PatternX.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LblAdvantege;
    private javax.swing.JLabel LblCodeExample;
    private javax.swing.JLabel LblDefinition;
    private javax.swing.JLabel LblExperience;
    private javax.swing.JLabel LblHome;
    private javax.swing.JLabel LblImplement;
    private javax.swing.JLabel LblReferences;
    private javax.swing.JLabel LbltxtAdvantage;
    private javax.swing.JLabel LbltxtCodeExample;
    private javax.swing.JLabel LbltxtExperience;
    private javax.swing.JLabel LbltxtImplement;
    private javax.swing.JLabel LbltxtReferences;
    private javax.swing.JPanel btnAdvantage;
    private javax.swing.JPanel btnClose;
    private javax.swing.JPanel btnCodeExample;
    private javax.swing.JPanel btnDefinition;
    private javax.swing.JPanel btnDiagram;
    private javax.swing.JPanel btnDiagramEx;
    private javax.swing.JPanel btnExperience;
    private javax.swing.JPanel btnGitHub;
    private javax.swing.JPanel btnHome;
    private javax.swing.JPanel btnImplement;
    private javax.swing.JPanel btnReferences;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAdvantages;
    private javax.swing.JLabel lblAdvantages1;
    private javax.swing.JLabel lblDefinition;
    private javax.swing.JLabel lblDiagram;
    private javax.swing.JLabel lblDiagramEx;
    private javax.swing.JLabel lblExperience;
    private javax.swing.JLabel lblGitHub;
    private javax.swing.JLabel lblImplement;
    private javax.swing.JLabel lblReferences;
    private javax.swing.JLabel lblTab;
    private javax.swing.JLabel lblTextEx;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbltxtDefinition;
    private javax.swing.JPanel pnlAdventage;
    private javax.swing.JPanel pnlCodeExample;
    private javax.swing.JPanel pnlDefinition;
    private javax.swing.JPanel pnlExperience;
    private javax.swing.JPanel pnlImplment;
    private javax.swing.JPanel pnlReferences;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel txtCerrar;
    // End of variables declaration//GEN-END:variables
}
