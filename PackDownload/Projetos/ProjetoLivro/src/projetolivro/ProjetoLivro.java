package projetolivro;

import java.util.Scanner;

public class ProjetoLivro {

    public static void main(String[] args) {
        
        String cadastro, menu1 ;
        int menu;
        Scanner ler = new Scanner(System.in);
        int cad,cod = 0, codnome = 0;
        Livro l[] = new Livro[5];
        Pessoa p[] = new Pessoa[3];
        
        
        l[0] = new Livro ( "Alice " , "Danilo", 1220);
        l[1] = new Livro ( "Pais das Maravilhas" , "Danhhilo", 1720);
        l[2] = new Livro ( "Alice das Maravilhas" , "Vanilo", 1270);
        l[3] = new Livro ( "Maravilhas" , "Danio", 120);
        l[4] = new Livro ( "Alicevilhas" , "Nilo", 133);
        
        p[0] = new Pessoa ( "Danilo", "Masc", 38);
        p[1] = new Pessoa ( "Dilo", "Masc", 38);
        p[2] = new Pessoa ( "Nilo", "Masc", 38);
    
   /*do {
        
        
        System.out.println("O que deseja cadastrar? - \n digite 1 para Livro \n digite 2 para Leitor ");
        
        cad = ler.nextInt();
        if (cad == 1){
           cod += 1; 
            
           l[cod] = new Livro();
           l[cod].cadasrar();
           //l[cod].detalhes();
           
           
             
        } else if (cad== 2) {
            codnome += 1;
            
            p[codnome] = new Pessoa();
            p[codnome].cadLeitor();
                    
                   
        } 
        
        //System.out.println("Para continuar cadastrando digite < S >, \n para sair pressione qualquer outra letra ");
        //cadastro = ler.next();
        
    //} while ("S".equals(cadastro));
    */
        System.out.println(" Escolha um livro: ");
    for (int i=0; i<5; i++){
        cod = i;
        
        System.out.println(" Para: " + l[cod].getTitulo() + " Digite: " + cod);
    }
        
       
    
    
    
    
    System.out.println("Olá!!! O que deseja fazer? \n"
                + " 1 para abrir o livro \n"
                + " 2 para fechar o livro \n"
                + " 3 folhear o livro \n"
                + " 4 avançar uma página do livro \n"
                + " 5 voltar uma página do livro \n"
                + "");    
     
        menu = ler.nextInt();
        switch  (menu) {
            
            case 1:
                l[cod].abrir();
                break;
            case 2:
                l[cod].fechar();
                break;
            case 3: 
                l[cod].folhear();
                break;
            case 4:
                l[cod].avancarPag();
                break;
            case 5:
                l[cod].voltarPa();
                break;
        }        
            
        }
        
    
    
    
    }
    
    
    

