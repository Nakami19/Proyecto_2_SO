/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Administrador;
import Clases.Estudio;
import Clases.IA;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

/**
 *
 * @author Natalia
 */
public class Interfaz extends javax.swing.JFrame {
    //Global g;
    Estudio nick = new Estudio("Nickelodeon");
    Estudio cn = new Estudio("Cartoon Network");
    IA ia = new IA();
    Administrador admin = new Administrador(ia);
    boolean iniciado = false;


    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
         //this.g=new Global();
         Global.setCN(cn);
         Global.setNick(nick);
         this.setLocationRelativeTo(null); 
    }

    public static JLabel getCharacter_Icon_Cn() {
        return Character_Icon_Cn;
    }

    public static void setCharacter_Icon_Cn(JLabel Character_Icon_Cn) {
        Interfaz.Character_Icon_Cn = Character_Icon_Cn;
    }

    public static JLabel getCharacter_Icon_Nick() {
        return Character_Icon_Nick;
    }

    public static void setCharacter_Icon_Nick(JLabel Character_Icon_Nick) {
        Interfaz.Character_Icon_Nick = Character_Icon_Nick;
    }

    
    
    public static JLabel getAbility_Cn() {
        return Ability_Cn;
    }

    public static JLabel getMarcadorCartoon() {
        return marcadorCartoon;
    }

    public static void setMarcadorCartoon(JLabel marcadorCartoon) {
        Interfaz.marcadorCartoon = marcadorCartoon;
    }

    public static JLabel getMarcadorNick() {
        return marcadorNick;
    }

    public static void setMarcadorNick(JLabel marcadorNick) {
        Interfaz.marcadorNick = marcadorNick;
    }
    
    

    public static void setAbility_Cn(JLabel Ability_Cn) {
        Interfaz.Ability_Cn = Ability_Cn;
    }

    public static JLabel getAbility_Nick() {
        return Ability_Nick;
    }

    public static void setAbility_Nick(JLabel Ability_Nick) {
        Interfaz.Ability_Nick = Ability_Nick;
    }

    public static JLabel getAgility_Cn() {
        return Agility_Cn;
    }

    public static void setAgility_Cn(JLabel Agility_Cn) {
        Interfaz.Agility_Cn = Agility_Cn;
    }

    public static JLabel getAgility_Nick() {
        return Agility_Nick;
    }

    public static void setAgility_Nick(JLabel Agility_Nick) {
        Interfaz.Agility_Nick = Agility_Nick;
    }

    public static JLabel getHP_Cn() {
        return HP_Cn;
    }

    public static void setHP_Cn(JLabel HP_Cn) {
        Interfaz.HP_Cn = HP_Cn;
    }

    public static JLabel getHP_Nick() {
        return HP_Nick;
    }

    public static void setHP_Nick(JLabel HP_Nick) {
        Interfaz.HP_Nick = HP_Nick;
    }

    public static JTextArea getListaGanadores() {
        return ListaGanadores;
    }

    public static void setListaGanadores(JTextArea ListaGanadores) {
        Interfaz.ListaGanadores = ListaGanadores;
    }

    public static JLabel getObject_Cn() {
        return Object_Cn;
    }

    public static void setObject_Cn(JLabel Object_Cn) {
        Interfaz.Object_Cn = Object_Cn;
    }

    public static JLabel getObject_Nick() {
        return Object_Nick;
    }

    public static void setObject_Nick(JLabel Object_Nick) {
        Interfaz.Object_Nick = Object_Nick;
    }

    public static JTextArea getPrioridad1CN() {
        return Prioridad1CN;
    }

    public static void setPrioridad1CN(JTextArea Prioridad1CN) {
        Interfaz.Prioridad1CN = Prioridad1CN;
    }

    public static JTextArea getPrioridad1Nick() {
        return Prioridad1Nick;
    }

    public static void setPrioridad1Nick(JTextArea Prioridad1Nick) {
        Interfaz.Prioridad1Nick = Prioridad1Nick;
    }

    public static JTextArea getPrioridad2CN() {
        return Prioridad2CN;
    }

    public static void setPrioridad2CN(JTextArea Prioridad2CN) {
        Interfaz.Prioridad2CN = Prioridad2CN;
    }

    public static JTextArea getPrioridad2Nick() {
        return Prioridad2Nick;
    }

    public static void setPrioridad2Nick(JTextArea Prioridad2Nick) {
        Interfaz.Prioridad2Nick = Prioridad2Nick;
    }

    public static JTextArea getPrioridad3CN() {
        return Prioridad3CN;
    }

    public static void setPrioridad3CN(JTextArea Prioridad3CN) {
        Interfaz.Prioridad3CN = Prioridad3CN;
    }

    public static JTextArea getPrioridad3Nick() {
        return Prioridad3Nick;
    }

    public static void setPrioridad3Nick(JTextArea Prioridad3Nick) {
        Interfaz.Prioridad3Nick = Prioridad3Nick;
    }

    public static JTextArea getRefuerzoCN() {
        return RefuerzoCN;
    }

    public static void setRefuerzoCN(JTextArea RefuerzoCN) {
        Interfaz.RefuerzoCN = RefuerzoCN;
    }

    public static JTextArea getRefuerzoNick() {
        return RefuerzoNick;
    }

    public static void setRefuerzoNick(JTextArea RefuerzoNick) {
        Interfaz.RefuerzoNick = RefuerzoNick;
    }

    public static JLabel getStrength_Cn() {
        return Strength_Cn;
    }

    public static void setStrength_Cn(JLabel Strength_Cn) {
        Interfaz.Strength_Cn = Strength_Cn;
    }

    public static JLabel getStrength_Nick() {
        return Strength_Nick;
    }

    public static void setStrength_Nick(JLabel Strength_Nick) {
        Interfaz.Strength_Nick = Strength_Nick;
    }

    public static JLabel getIA_State() {
        return IA_State;
    }

    public static void setIA_State(JLabel IA_State) {
        Interfaz.IA_State = IA_State;
    }

    public static JLabel getResultado_Combate() {
        return Resultado_Combate;
    }

    public static void setResultado_Combate(JLabel Resultado_Combate) {
        Interfaz.Resultado_Combate = Resultado_Combate;
    }

    public JSpinner getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(JSpinner Velocidad) {
        this.Velocidad = Velocidad;
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
        Inicio = new javax.swing.JButton();
        NombreNick = new javax.swing.JLabel();
        NombreCartoon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        marcadorNick = new javax.swing.JLabel();
        marcadorCartoon = new javax.swing.JLabel();
        Character_Icon_Nick = new javax.swing.JLabel();
        Character_Icon_Cn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaGanadores = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prioridad1CN = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prioridad2CN = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Prioridad3CN = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        Prioridad1Nick = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Prioridad2Nick = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        Prioridad3Nick = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        RefuerzoNick = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        RefuerzoCN = new javax.swing.JTextArea();
        Velocidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Agility_Cn = new javax.swing.JLabel();
        Ability_Cn = new javax.swing.JLabel();
        Object_Cn = new javax.swing.JLabel();
        Strength_Cn = new javax.swing.JLabel();
        HP_Cn = new javax.swing.JLabel();
        Object_Nick = new javax.swing.JLabel();
        Ability_Nick = new javax.swing.JLabel();
        Strength_Nick = new javax.swing.JLabel();
        HP_Nick = new javax.swing.JLabel();
        Agility_Nick = new javax.swing.JLabel();
        IA_State = new javax.swing.JLabel();
        Resultado_Combate2 = new javax.swing.JLabel();
        Resultado_Combate = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        Resultado_Combate1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Inicio.setText("Iniciar");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        jPanel1.add(Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 160, 40));

        NombreNick.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NombreNick.setForeground(new java.awt.Color(0, 0, 0));
        NombreNick.setText("Nickelodeon");
        jPanel1.add(NombreNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        NombreCartoon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        NombreCartoon.setForeground(new java.awt.Color(0, 0, 0));
        NombreCartoon.setText("Cartoon Network");
        jPanel1.add(NombreCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 10, -1));

        marcadorNick.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        marcadorNick.setForeground(new java.awt.Color(0, 0, 0));
        marcadorNick.setText("0");
        jPanel1.add(marcadorNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        marcadorCartoon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        marcadorCartoon.setForeground(new java.awt.Color(0, 0, 0));
        marcadorCartoon.setText("0");
        jPanel1.add(marcadorCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        Character_Icon_Nick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png"))); // NOI18N
        jPanel1.add(Character_Icon_Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        Character_Icon_Cn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png"))); // NOI18N
        jPanel1.add(Character_Icon_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Velocidad (s)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

        ListaGanadores.setEditable(false);
        ListaGanadores.setColumns(20);
        ListaGanadores.setRows(5);
        jScrollPane1.setViewportView(ListaGanadores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 240, 80));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0, 90));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 250, 330));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0, 90));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 250, 330));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0, 90));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 250, 330));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 250, 330));

        Prioridad1CN.setEditable(false);
        Prioridad1CN.setColumns(20);
        Prioridad1CN.setRows(5);
        jScrollPane2.setViewportView(Prioridad1CN);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 110));

        Prioridad2CN.setEditable(false);
        Prioridad2CN.setColumns(20);
        Prioridad2CN.setRows(5);
        jScrollPane3.setViewportView(Prioridad2CN);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 110));

        Prioridad3CN.setEditable(false);
        Prioridad3CN.setColumns(20);
        Prioridad3CN.setRows(5);
        jScrollPane4.setViewportView(Prioridad3CN);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, 110));

        Prioridad1Nick.setEditable(false);
        Prioridad1Nick.setColumns(20);
        Prioridad1Nick.setRows(5);
        jScrollPane5.setViewportView(Prioridad1Nick);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 190, 110));

        Prioridad2Nick.setEditable(false);
        Prioridad2Nick.setColumns(20);
        Prioridad2Nick.setRows(5);
        jScrollPane6.setViewportView(Prioridad2Nick);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 190, 110));

        Prioridad3Nick.setEditable(false);
        Prioridad3Nick.setColumns(20);
        Prioridad3Nick.setRows(5);
        jScrollPane7.setViewportView(Prioridad3Nick);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, 190, 110));

        RefuerzoNick.setEditable(false);
        RefuerzoNick.setColumns(20);
        RefuerzoNick.setRows(5);
        jScrollPane8.setViewportView(RefuerzoNick);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 470, 190, 110));

        RefuerzoCN.setEditable(false);
        RefuerzoCN.setColumns(20);
        RefuerzoCN.setRows(5);
        jScrollPane9.setViewportView(RefuerzoCN);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 190, 110));

        Velocidad.setValue(1);
        Velocidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                VelocidadStateChanged(evt);
            }
        });
        jPanel1.add(Velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, 140, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Agilidad:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ganadores");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Habilidad:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fuerza:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("HP:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Objeto:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Habilidad:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Fuerza:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("HP:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Agilidad:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Objeto:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        Agility_Cn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Agility_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Agility_Cn.setText("-");
        jPanel1.add(Agility_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, -1, -1));

        Ability_Cn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ability_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Ability_Cn.setText("-");
        jPanel1.add(Ability_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        Object_Cn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Object_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Object_Cn.setText("-");
        jPanel1.add(Object_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        Strength_Cn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Strength_Cn.setForeground(new java.awt.Color(255, 255, 255));
        Strength_Cn.setText("-");
        jPanel1.add(Strength_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        HP_Cn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HP_Cn.setForeground(new java.awt.Color(255, 255, 255));
        HP_Cn.setText("-");
        jPanel1.add(HP_Cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        Object_Nick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Object_Nick.setForeground(new java.awt.Color(255, 255, 255));
        Object_Nick.setText("-");
        jPanel1.add(Object_Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, -1, -1));

        Ability_Nick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Ability_Nick.setForeground(new java.awt.Color(255, 255, 255));
        Ability_Nick.setText("-");
        jPanel1.add(Ability_Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        Strength_Nick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Strength_Nick.setForeground(new java.awt.Color(255, 255, 255));
        Strength_Nick.setText("-");
        jPanel1.add(Strength_Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        HP_Nick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HP_Nick.setForeground(new java.awt.Color(255, 255, 255));
        HP_Nick.setText("-");
        jPanel1.add(HP_Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        Agility_Nick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Agility_Nick.setForeground(new java.awt.Color(255, 255, 255));
        Agility_Nick.setText("-");
        jPanel1.add(Agility_Nick, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, -1, -1));

        IA_State.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IA_State.setForeground(new java.awt.Color(255, 255, 255));
        IA_State.setText("Esperando...");
        jPanel1.add(IA_State, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 520, -1, -1));

        Resultado_Combate2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resultado_Combate2.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_Combate2.setText("Estado de la IA:");
        jPanel1.add(Resultado_Combate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, -1, -1));

        Resultado_Combate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resultado_Combate.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_Combate.setText("Decidiendo...");
        jPanel1.add(Resultado_Combate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0, 95));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 270, 110));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0, 95));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 270, 110));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0, 95));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 270, 110));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 95));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 270, 110));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prioridad 1");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prioridad 2");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prioridad 3");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Refuerzo");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 210, 590));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0, 90));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Refuerzo");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prioridad 3");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prioridad 2");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prioridad 1");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 210, 590));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0, 95));

        Resultado_Combate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Resultado_Combate1.setForeground(new java.awt.Color(255, 255, 255));
        Resultado_Combate1.setText("Resultado:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Resultado_Combate1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Resultado_Combate1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 140, 90));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0, 95));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 310, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceImages/ClashBg.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
        //se crean los personajes
        if(iniciado == false){
            iniciado = true;
            
            for (int i = 0; i < 20; i++) {
            int random=(int)(Math.random()*9);
            Global.getCN().CreateCharacter(Global.getCartoon()[i], Global.getObjetos()[random],admin.getIdCh());
            admin.setIdCh(admin.getIdCh()+1);
            random=(int)(Math.random()*9);
            Global.getNick().CreateCharacter(Global.getNickelodeon()[i], Global.getObjetos()[random],admin.getIdCh());
            admin.setIdCh(admin.getIdCh()+1);
            }
            getPrioridad1CN().setText(Global.getCN().getPrioridad1().imprimir());
            getPrioridad2CN().setText(Global.getCN().getPrioridad2().imprimir());
            getPrioridad3CN().setText(Global.getCN().getPrioridad3().imprimir());
            getRefuerzoCN().setText(Global.getCN().getRefuerzo().imprimir());
            
            getPrioridad1Nick().setText(Global.getNick().getPrioridad1().imprimir());
            getPrioridad2Nick().setText(Global.getNick().getPrioridad2().imprimir());
            getPrioridad3Nick().setText(Global.getNick().getPrioridad3().imprimir());
            getRefuerzoNick().setText(Global.getNick().getRefuerzo().imprimir());

        
//            System.out.println("Prioridad 1 Cartoon");
//            Global.getCN().getPrioridad1().imprimir();
//
//            System.out.println("Prioridad 2 Cartoon");
//            Global.getCN().getPrioridad2().imprimir();
//
//            System.out.println("Prioridad 3 Cartoon");
//            Global.getCN().getPrioridad3().imprimir();
//
//            System.out.println("Prioridad 1 Nick");
//            Global.getNick().getPrioridad1().imprimir();
//
//            System.out.println("Prioridad 2 Nick");
//            Global.getNick().getPrioridad2().imprimir();
//
//            System.out.println("Prioridad 3 Nick");
//            Global.getNick().getPrioridad3().imprimir();
            
            this.Velocidad.setValue(10);
            admin.ia.setWaitingTime(((int)this.Velocidad.getValue())*1000);
            admin.start();
            //ia.start();
        }else{
            JOptionPane.showMessageDialog(null, "Ya la simulación empezó!");
        }      
               
        
    }//GEN-LAST:event_InicioActionPerformed

    private void VelocidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VelocidadStateChanged
        // TODO add your handling code here:
        if(iniciado == true){
            if((int)this.Velocidad.getValue() <= 0){
                this.Velocidad.setValue(1);
                this.repaint();
            }else{
                //Aqui va a estar el codigo para que el tiempo cambie justo cuando el user lo cambie
                admin.ia.setWaitingTime(((int)this.Velocidad.getValue())*1000);
            }
        }else{
            this.Velocidad.setValue(1);
            this.repaint();
        }
    }//GEN-LAST:event_VelocidadStateChanged

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Ability_Cn;
    private static javax.swing.JLabel Ability_Nick;
    private static javax.swing.JLabel Agility_Cn;
    private static javax.swing.JLabel Agility_Nick;
    private javax.swing.JLabel Background;
    private static javax.swing.JLabel Character_Icon_Cn;
    private static javax.swing.JLabel Character_Icon_Nick;
    private static javax.swing.JLabel HP_Cn;
    private static javax.swing.JLabel HP_Nick;
    private static javax.swing.JLabel IA_State;
    private javax.swing.JButton Inicio;
    private static javax.swing.JTextArea ListaGanadores;
    private javax.swing.JLabel NombreCartoon;
    private javax.swing.JLabel NombreNick;
    private static javax.swing.JLabel Object_Cn;
    private static javax.swing.JLabel Object_Nick;
    private static javax.swing.JTextArea Prioridad1CN;
    private static javax.swing.JTextArea Prioridad1Nick;
    private static javax.swing.JTextArea Prioridad2CN;
    private static javax.swing.JTextArea Prioridad2Nick;
    private static javax.swing.JTextArea Prioridad3CN;
    private static javax.swing.JTextArea Prioridad3Nick;
    private static javax.swing.JTextArea RefuerzoCN;
    private static javax.swing.JTextArea RefuerzoNick;
    private static javax.swing.JLabel Resultado_Combate;
    private javax.swing.JLabel Resultado_Combate1;
    private javax.swing.JLabel Resultado_Combate2;
    private static javax.swing.JLabel Strength_Cn;
    private static javax.swing.JLabel Strength_Nick;
    private javax.swing.JSpinner Velocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private static javax.swing.JLabel marcadorCartoon;
    private static javax.swing.JLabel marcadorNick;
    // End of variables declaration//GEN-END:variables
}
