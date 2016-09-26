/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import javax.swing.JOptionPane;

/**
 *
 * @author apoquet
 */
public class FormatPhoneException extends Exception{
     public FormatPhoneException() {
        JOptionPane.showMessageDialog(null, "Format Téléphone Invalide : xxxxxxxxxx", "Erreur Téléphone", JOptionPane.ERROR_MESSAGE);
    }
    
}
