

package projetocontaembanco;

import javax.swing.JOptionPane;


public class Conta {
    
    public int conta;
    protected String tipo;
    private String cliente;
    private double saldo;
    private boolean status;

    public Conta(double saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    void AbrirConta() {
       this.setStatus(true);
       do{
       this.setTipo(JOptionPane.showInputDialog("Digite o tipo de conta: \n cc - Conta Corrente \n cp - Poupança"));
       }while (!"cc".equals(this.getTipo()) && !"cp".equals(this.getTipo()));
       this.setConta(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:")));
       this.setCliente(JOptionPane.showInputDialog("Digite o nome do cliente"));
       if (null == this.getTipo()){
           JOptionPane.showMessageDialog(null, " Opção Invalida " );
       }else switch (this.getTipo()) {
            case "cc":
                this.setSaldo(50);
                break;
            case "cp":
                this.setSaldo(150);
                break;
            default:
                JOptionPane.showMessageDialog(null, " Opção Invalida " );
                break;
        }
    }
    
    void StatusConta(){
        System.out.println(this.getTipo());
         System.out.println(this.getConta());
          System.out.println(this.getCliente());
           System.out.println(this.getSaldo());
            System.out.println(this.isStatus());
    }
    
}
