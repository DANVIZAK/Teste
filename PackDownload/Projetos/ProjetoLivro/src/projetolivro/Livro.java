
package projetolivro;

import java.util.Random;
import java.util.Scanner;

public class Livro implements Publicacao {
    
    private String titulo, autor, aboufc;
    private Pessoa leitor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
    }
    
    
    
    public void detalhes(){
        System.out.println("Nome do livro: "+ this.titulo);
        System.out.println("Autor do livro: "+ this.autor);
        System.out.println("Total de paginas: "+ this.totPaginas);
        System.out.println("O livro está: "+ this.aboufc);
        System.out.println("O livro esta sendo lendo por: "+ this.leitor);
    }

     @Override
    public void cadasrar() {
        Scanner ler = new Scanner(System.in);   
        System.out.println("Qual o titulo do livro?");
        this.setTitulo(ler.next());
        System.out.println("Qual o autor do livro?");
        this.setAutor(ler.next());
        System.out.println("Qual o número de páginas do livro?");
        this.setTotPaginas(ler.nextInt());
    }
    
    
    
    @Override
    public void abrir() {
        this.aberto = true;
        this.aboufc = "aberto";
        
    }

    @Override
    public void fechar() {
        this.aberto = false;
        this.aboufc = "fechado";
        
    }

    @Override
    public void folhear() {
        Random aleatorio = new Random();
        int folha = aleatorio.nextInt(this.totPaginas);
        this.pagAtual = folha;
        System.out.println("Pagina atual é: " + this.pagAtual);
    }

    @Override
    public void avancarPag() {
        this.pagAtual += 1;
        System.out.println("Pagina atual é: " + this.pagAtual);
        
    }

    @Override
    public void voltarPa() {
        this.pagAtual -= 1;
        System.out.println("Pagina atual é: " + this.pagAtual);
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public String getAboufc() {
        return aboufc;
    }

    public void setAboufc(String aboufc) {
        this.aboufc = aboufc;
    }

   
}
