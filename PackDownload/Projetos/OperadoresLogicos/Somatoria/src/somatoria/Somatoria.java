/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somatoria;

import javax.swing.JOptionPane;

/**
 *
 * @author Sgt Danilo
 */
public class Somatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double soma = 0;
        double num;
        int i;
        for (i=1;i<=10;i++){
            num = Double.parseDouble(JOptionPane.showInputDialog(" Digitite o " + i + "º número "));
            soma = soma + num;
        }
        JOptionPane.showMessageDialog(null," A somatória é: " + soma);
    }
    
}
