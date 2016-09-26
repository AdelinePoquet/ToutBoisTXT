/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toutbois;

import Entites.*;
import IHM.*;
import Traitements.*;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author ajugnon
 */
public class Application {
    //création des fiférentes collections
    public static List<Client> c = new ArrayList<>();
    public static List<Prospect> p = new ArrayList<>();
    public static List<Representant> r = new ArrayList<>();

    public Application() {
        FenetrePrincipale fp = new FenetrePrincipale();
        fp.setVisible(true);
    }
    
    

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        // TODO code application logic here
           
		/*UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);*/
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
                }
                Application application = new Application();
                }
    
}
