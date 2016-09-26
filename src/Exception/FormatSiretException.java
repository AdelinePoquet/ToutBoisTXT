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
public class FormatSiretException extends Exception {

    public FormatSiretException() {
        JOptionPane.showMessageDialog(null, "Format Siret Invalide : xxxxxxxxxxxxxx", "Erreur Siret", JOptionPane.ERROR_MESSAGE);
    }
    
}
