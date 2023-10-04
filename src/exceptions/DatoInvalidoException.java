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
public class DatoInvalidoException extends RuntimeException{
    
    
    public DatoInvalidoException(String msg){
        super(msg);
        JOptionPane.showMessageDialog(null, "Datos ingresados no validos", "Error", JOptionPane.ERROR_MESSAGE);

    }
    
}
