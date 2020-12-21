/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula14vetores;

import java.util.Arrays;

/**
 *
 * @author Sgt Danilo
 */
public class Aula14Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   int n[]= {3,2,8,7,5,4};
    for (int i=0;i<=5;i++){
        System.out.println(n[i]);
    }
    */
    /* int n[]= {3,2,8,7,5,4};
        System.out.println("Total de casas de n são " + n.length);
    for (int i=0;i<=5;i++){
        System.out.println("O valor de n na posição " + i + " é o valor " + n[i]);
    }*/
    
    /*int n[]= {3,2,8,7,5,4};
        System.out.println("Total de casas de n são " + n.length);
    for (int i=0;i<=n.length - 1;i++){
        System.out.println("O valor de n na posição " + i + " é o valor " + n[i]);
    }
    */
    /*String mes[] = {"Jan","Fev","Mar","Abr", "Maio","Jun","Jul","Ago","Set","Out","Nov","Dez"};
    String tot[] = {"31","28","31","30","31","30","31","31","30","31","30","31"};
    for (int i=0;i < mes.length;i++){
        System.out.println("O mes de " + mes[i] + " tem " + tot[i] + " dias.");
        
    }
*/
    /*double num[] = {2,3,4,5,6};
    // Arrays.sort(num); - coloca o vetor em ordem
    // int pos = Arrays.binarySearch(num, 5); - localiza a posição de um valor
    for (double valor: num) {
        System.out.println(valor);
    
    }
    //    System.out.println(pos);
*/
    
    int num[] = new int[20];
    Arrays.fill(num,0); // colocar zero em todas as posições.
    for (int valor:num){
        System.out.println(valor);
    }
}

}