
package projetolivro;

import java.util.Scanner;


public class Pessoa {
    
    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    
    
    public void cadLeitor(){
        Scanner ler = new Scanner(System.in);   
        System.out.println("Qual o nome do leitor?");
        this.setNome(ler.next());
        System.out.println("Qual o gênero do leitor?");
        this.setSexo(ler.next());
        System.out.println("Qual idade do leitor?");
        this.setIdade(ler.nextInt());
    }
    
    
    public void fazerAniver(){
        this.idade += 1;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
