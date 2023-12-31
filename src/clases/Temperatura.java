/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;
import java.text.DecimalFormat;
import java.time.LocalDate;
/**
 *
 * @author louis
 */
public class Temperatura extends javax.swing.JFrame {
       
    private double dato_entrada, valor;
    private String temp_entrada, opcion_entrada, opcion_salida;
   
  
    
     /**
     * Creates new form 
     */
    public Temperatura() {
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        entrada.setBackground(new java.awt.Color(0,0,0,1));
        opciones_entrada.setBackground(new java.awt.Color(0,0,0,0));
        opciones_salida.setBackground(new java.awt.Color(0,0,0,0));
        
        LocalDate fechaActual = LocalDate.now();
        fecha.setText(String.valueOf(fechaActual));

        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        convertir = new javax.swing.JLabel();
        texto_abajo = new javax.swing.JLabel();
        texto_arriba = new javax.swing.JLabel();
        parte_inferior = new javax.swing.JPanel();
        salida = new javax.swing.JTextField();
        opciones_salida = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        parte_superior = new javax.swing.JPanel();
        atras = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        opciones_entrada = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        convertir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/convertir_temperatura.png"))); // NOI18N
        convertir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertirMouseClicked(evt);
            }
        });
        getContentPane().add(convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 215, -1, -1));

        texto_abajo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        texto_abajo.setText("(Grados celsius × 9/5) + 32");
        getContentPane().add(texto_abajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        texto_arriba.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        texto_arriba.setText("Formula de Celsius a Fehrenheit");
        getContentPane().add(texto_arriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 279, -1, -1));

        parte_inferior.setBackground(new java.awt.Color(255, 255, 255));
        parte_inferior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salida.setEditable(false);
        salida.setBackground(new java.awt.Color(255, 255, 255));
        salida.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        salida.setForeground(new java.awt.Color(0, 165, 255));
        salida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        salida.setBorder(null);
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        parte_inferior.add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 146, 158, 31));

        opciones_salida.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        opciones_salida.setForeground(new java.awt.Color(251, 9, 9));
        opciones_salida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));
        opciones_salida.setBorder(null);
        opciones_salida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opciones_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opciones_salidaActionPerformed(evt);
            }
        });
        parte_inferior.add(opciones_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 144, 136, 31));

        jPanel2.setBackground(new java.awt.Color(251, 9, 9));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        parte_inferior.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 158, -1));

        getContentPane().add(parte_inferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 350, 250));

        parte_superior.setBackground(new java.awt.Color(255, 255, 255));
        parte_superior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        parte_superior.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, 29, 30));

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("July 18, 2023");
        parte_superior.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 7, -1, -1));

        titulo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Temperatura");
        parte_superior.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 37, -1, -1));

        entrada.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        entrada.setForeground(new java.awt.Color(255, 255, 255));
        entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        entrada.setBorder(null);
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });
        parte_superior.add(entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, 158, 31));

        opciones_entrada.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        opciones_entrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        opciones_entrada.setBorder(null);
        opciones_entrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opciones_entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opciones_entradaActionPerformed(evt);
            }
        });
        parte_superior.add(opciones_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 125, 132, 31));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        parte_superior.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 164, 159, 2));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_temperaturas.png"))); // NOI18N
        parte_superior.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 250));

        getContentPane().add(parte_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opciones_entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opciones_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opciones_entradaActionPerformed

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaActionPerformed

    private void opciones_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opciones_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opciones_salidaActionPerformed

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salidaActionPerformed

    private void convertirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertirMouseClicked
        try{

            opcion_entrada = String.valueOf(opciones_entrada.getSelectedItem());
            opcion_salida = String.valueOf(opciones_salida.getSelectedItem());
            dato_entrada = Double.parseDouble(entrada.getText());

            if("Celsius".equals(opcion_entrada)&& "Fahrenheit".equals(opcion_salida)){
                valor = ((dato_entrada * 9/5) + 32);
                texto_arriba.setText("Formula de Celsius a Fahrenheit");
                texto_abajo.setText("(Grados celsius * 9/5) + 32");
                salida.setText(String.format("%.2f", valor));


            }else if("Celsius".equals(opcion_entrada)&& "Kelvin".equals(opcion_salida)){
                valor = (dato_entrada + 273.15);
                texto_arriba.setText("Formula de Celsius a Kelvin");
                texto_abajo.setText("Grados celsius + 273.15");
                salida.setText(String.format("%.2f", valor));


            }else if("Fahrenheit".equals(opcion_entrada)&& "Celsius".equals(opcion_salida)){
                valor = (dato_entrada - 32) * 5/9;
                texto_arriba.setText("Formula de Fahrenheit a Celsius");
                texto_abajo.setText("(Grados Fahrenheit - 32) * 5/9");
                salida.setText(String.format("%.2f", valor));


            }else if("Fahrenheit".equals(opcion_entrada)&& "Kelvin".equals(opcion_salida)){
                valor = (dato_entrada - 32) * 5/9 + 273.15;
                texto_arriba.setText("Formula de Fahrenheit a Kelvin");
                texto_abajo.setText("(Grados Fahrenheit - 32) * 5/9 + 273.15");
                salida.setText(String.format("%.2f", valor));

            }else if("Kelvin".equals(opcion_entrada)&& "Celsius".equals(opcion_salida)){
                valor = (dato_entrada - 273.15);
                texto_arriba.setText("Formula de Kelvin a Celsius");
                texto_abajo.setText("(Grados Kelvin - 273.15)");
                salida.setText(String.format("%.2f", valor));

            }else if("Kelvin".equals(opcion_entrada)&& "Fahrenheit".equals(opcion_salida)){
                valor = (dato_entrada - 273.15) * 9/5 + 32;
                texto_arriba.setText("Formula de Kelvin a Fahrenheit");
                texto_abajo.setText("(Grados Kelvin - 273.15) * 9/5 + 32");
                salida.setText(String.format("%.2f", valor));


            }else{
                texto_arriba.setText("Formula de " + opcion_entrada + " a " + opcion_salida);
                texto_abajo.setText("(Grados " + opcion_entrada + " * 1)");
                salida.setText(String.format("%.2f", dato_entrada));
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros", "Error" , JOptionPane.ERROR_MESSAGE);
            entrada.setText("");
            salida.setText("");
        }

    }//GEN-LAST:event_convertirMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasMouseClicked


    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel convertir;
    private javax.swing.JTextField entrada;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> opciones_entrada;
    private javax.swing.JComboBox<String> opciones_salida;
    private javax.swing.JPanel parte_inferior;
    private javax.swing.JPanel parte_superior;
    private javax.swing.JTextField salida;
    private javax.swing.JLabel texto_abajo;
    private javax.swing.JLabel texto_arriba;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
