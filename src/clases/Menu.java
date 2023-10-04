/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clases;

/**
 *
 * @author louis
 */
public class Menu extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenido = new javax.swing.JLabel();
        boton_temperatura = new javax.swing.JLabel();
        boton_divisa = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));
        setForeground(new java.awt.Color(245, 245, 245));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvenido.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        bienvenido.setText("Bienvenido");
        getContentPane().add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 62, -1, -1));

        boton_temperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton_temperatura.png"))); // NOI18N
        boton_temperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_temperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_temperaturaMouseClicked(evt);
            }
        });
        getContentPane().add(boton_temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 175, -1, -1));

        boton_divisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botn_divisas.png"))); // NOI18N
        boton_divisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_divisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_divisaMouseClicked(evt);
            }
        });
        getContentPane().add(boton_divisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 175, -1, -1));

        panel.setBackground(new java.awt.Color(245, 245, 245));
        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_divisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_divisaMouseClicked
        
        Divisas divisa = new Divisas();
        divisa.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_boton_divisaMouseClicked

    private void boton_temperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_temperaturaMouseClicked
       Temperatura temperatura = new Temperatura();
       temperatura.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_boton_temperaturaMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel boton_divisa;
    private javax.swing.JLabel boton_temperatura;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
