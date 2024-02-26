/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Estudio;
import Clases.IA;
import javax.swing.JOptionPane;

/**
 *
 * @author Natalia
 */
public class Interfaz extends javax.swing.JFrame {
    //Global g;
    Estudio nick = new Estudio("Nickelodeon");
    Estudio cn = new Estudio("Cartoon Network");
    IA ia = new IA();
    boolean iniciado = false;


    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
         //this.g=new Global();
         Global.setCN(cn);
         Global.setNick(nick);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaGanadores = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prioridad1CN = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prioridad2CN = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Prioridad3CN = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Prioridad1Nick = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Prioridad2Nick = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Prioridad3Nick = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        RefuerzoNick = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        RefuerzoCN = new javax.swing.JTextArea();
        Velocidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        NombreNick.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NombreNick.setForeground(new java.awt.Color(0, 0, 0));
        NombreNick.setText("Nickelodeon");
        jPanel1.add(NombreNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        NombreCartoon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        NombreCartoon.setForeground(new java.awt.Color(0, 0, 0));
        NombreCartoon.setText("Cartoon Network");
        jPanel1.add(NombreCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("-");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 10, -1));

        marcadorNick.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        marcadorNick.setForeground(new java.awt.Color(0, 0, 0));
        marcadorNick.setText("0");
        jPanel1.add(marcadorNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        marcadorCartoon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        marcadorCartoon.setForeground(new java.awt.Color(0, 0, 0));
        marcadorCartoon.setText("0");
        jPanel1.add(marcadorCartoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Velocidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Prioridad 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Prioridad 2");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Prioridad 3");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        ListaGanadores.setColumns(20);
        ListaGanadores.setRows(5);
        jScrollPane1.setViewportView(ListaGanadores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 210, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 250, 330));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 250, 330));

        Prioridad1CN.setColumns(20);
        Prioridad1CN.setRows(5);
        jScrollPane2.setViewportView(Prioridad1CN);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 110));

        Prioridad2CN.setColumns(20);
        Prioridad2CN.setRows(5);
        jScrollPane3.setViewportView(Prioridad2CN);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 190, 110));

        Prioridad3CN.setColumns(20);
        Prioridad3CN.setRows(5);
        jScrollPane4.setViewportView(Prioridad3CN);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 190, 110));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Prioridad 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, -1, -1));

        Prioridad1Nick.setColumns(20);
        Prioridad1Nick.setRows(5);
        jScrollPane5.setViewportView(Prioridad1Nick);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 30, 190, 110));

        Prioridad2Nick.setColumns(20);
        Prioridad2Nick.setRows(5);
        jScrollPane6.setViewportView(Prioridad2Nick);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 180, 190, 110));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Prioridad 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Prioridad 3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 300, -1, -1));

        Prioridad3Nick.setColumns(20);
        Prioridad3Nick.setRows(5);
        jScrollPane7.setViewportView(Prioridad3Nick);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 320, 190, 110));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Refuerzo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 450, -1, -1));

        RefuerzoNick.setColumns(20);
        RefuerzoNick.setRows(5);
        jScrollPane8.setViewportView(RefuerzoNick);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 470, 190, 110));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Refuerzo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        RefuerzoCN.setColumns(20);
        RefuerzoCN.setRows(5);
        jScrollPane9.setViewportView(RefuerzoCN);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 190, 110));
        jPanel1.add(Velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 140, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Agilidad");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ganadores");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 570, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Objeto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Habilidad");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Fuerza");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("HP");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Objeto");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Habilidad");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Fuerza");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("HP");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Agilidad");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

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
            Global.getCN().CreateCharacter(Global.getCartoon()[i], Global.getObjetos()[random]);
            random=(int)(Math.random()*9);
            Global.getNick().CreateCharacter(Global.getNickelodeon()[i], Global.getObjetos()[random]);
            }
        
            System.out.println("Prioridad 1 Cartoon");
            Global.getCN().getPrioridad1().imprimir();

            System.out.println("Prioridad 2 Cartoon");
            Global.getCN().getPrioridad2().imprimir();

            System.out.println("Prioridad 3 Cartoon");
            Global.getCN().getPrioridad3().imprimir();

            System.out.println("Prioridad 1 Nick");
            Global.getNick().getPrioridad1().imprimir();

            System.out.println("Prioridad 2 Nick");
            Global.getNick().getPrioridad2().imprimir();

            System.out.println("Prioridad 3 Nick");
            Global.getNick().getPrioridad3().imprimir();
            
            ia.start();
        }else{
            JOptionPane.showMessageDialog(null, "Ya la simulación empezó!");
        }      
               
        
    }//GEN-LAST:event_InicioActionPerformed

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
    private javax.swing.JButton Inicio;
    private javax.swing.JTextArea ListaGanadores;
    private javax.swing.JLabel NombreCartoon;
    private javax.swing.JLabel NombreNick;
    private javax.swing.JTextArea Prioridad1CN;
    private javax.swing.JTextArea Prioridad1Nick;
    private javax.swing.JTextArea Prioridad2CN;
    private javax.swing.JTextArea Prioridad2Nick;
    private javax.swing.JTextArea Prioridad3CN;
    private javax.swing.JTextArea Prioridad3Nick;
    private javax.swing.JTextArea RefuerzoCN;
    private javax.swing.JTextArea RefuerzoNick;
    private javax.swing.JSpinner Velocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel marcadorCartoon;
    private javax.swing.JLabel marcadorNick;
    // End of variables declaration//GEN-END:variables
}
