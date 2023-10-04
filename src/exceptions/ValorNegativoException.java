/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

import javax.swing.JOptionPane;

/**
 *
 * @author louis
 */
public class ValorNegativoException extends RuntimeException{
    
    
    public ValorNegativoException(String msg){
        super(msg);
        JOptionPane.showMessageDialog(null,"No se permiten cantidades negativas", "Error", JOptionPane.ERROR_MESSAGE);
    }
    

}
