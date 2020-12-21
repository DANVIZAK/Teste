/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodowhiile;

import javax.swing.JOptionPane;

/**
 *
 * @author Sgt Danilo
 */
public class ExemploDoWhiile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, soma=0;
        do{
           num = Integer.parseInt(JOptionPane.showInputDialog(" Digite um número"));
           if (num%2!=0){
               soma = soma + num;
           }
            
           }while(num!=0);
        JOptionPane.showMessageDialog(null, "A soma dos números ímpares é " + soma);
        
        }
        
    }
    

