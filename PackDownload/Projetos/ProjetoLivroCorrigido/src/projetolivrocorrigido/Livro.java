

package projetolivrocorrigido;


public class Livro implements Publicacao {
    
    private String titulo, autor;
    private int totPg;
    private int pgAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro  " + titulo + "\n, autor = " + autor + "\n, totPg = " + totPg + "\n, pgAtual = " 
                + pgAtual + "\n, aberto = " + aberto + "\n, leitor = " + leitor.getNome() + " - " + leitor.getIdade() + " - " + leitor.getSexo();
    }
    
    
   
    
    
    public Livro(String titulo, String autor, int totPg, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPg = totPg;
        this.aberto = false;
        this.pgAtual = 0;
        this.leitor = leitor;
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

    public int getTotPg() {
        return totPg;
    }

    public void setTotPg(int totPg) {
        this.totPg = totPg;
    }

    public int getPgAtual() {
        return pgAtual;
    }

    public void setPgAtual(int pgAtual) {
        this.pgAtual = pgAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
         this.aberto = true;
        
    }

    @Override
    public void fechar() {
        this.aberto = false;
       
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPg){
           
            this.pgAtual = 0;
        }else{
            this.pgAtual = p;
        }
        
    }

    @Override
    public void avancarPg() {
       this.pgAtual++;
    }

    @Override
    public void voltarPg() {
        this.pgAtual--;
       
    }
    
    
    
}
