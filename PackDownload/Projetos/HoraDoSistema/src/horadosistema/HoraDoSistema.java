/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
import static javafx.scene.input.KeyCode.J;
import javax.swing.JOptionPane;

/**
 *
 * @author Sgt Danilo
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A hora di sistema é:");
        System.out.println(relogio.toString());
        Locale locale = Locale.getDefault();
        System.out.println(" Seus Windows esta em " + locale.getDisplayLanguage()); // Imprime a linguagem do sistema operacional, "Português" 
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    
    }
}
