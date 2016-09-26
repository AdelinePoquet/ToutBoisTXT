/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import javax.swing.JOptionPane;

/**
 *
 * @author ajugnon
 */
public class LigneSelectionException extends Exception{

    public LigneSelectionException() {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner une ligne svp", "Erreur ligne", JOptionPane.ERROR_MESSAGE);
    }
    
    
}
