/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Sgt Danilo
 */
public class ExemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double media, soma = 0;
        int num, qtde = 0;
        char resp = 's';
        while (resp=='s' || resp=='S'){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            soma = soma + num;
            qtde = qtde + 1;
            resp = JOptionPane.showInputDialog("Deseja continuar?").charAt(0);
        }
        media = soma/qtde;
        JOptionPane.showMessageDialog(null, "A média dos números é: " + media);
    }
    
    
}
