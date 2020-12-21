/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambalhotaaula12;

import java.util.Scanner;

/**
 *
 * @author Sgt Danilo
 */
public class CambalhotaAula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int cc = 1;
        do{
            System.out.println("Cambalhota 0" +cc);
            cc++;
            
        }while (cc<=4);
        */
        
        int n , soma = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Digite um numero:");
            n = teclado.nextInt();
            soma += n;
            System.out.println("Deseja continuar? [S/N]");
            resp = teclado.next( );
        } while(resp.equals ("S"));
            System.out.println("A soma dos números é igual a: " + soma);
        
        
    }
    
}
