/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppoaula02;

/**
 *
 * @author Sgt Danilo
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    
    public void rabiscar() {
    if (this.tampada == true){
        System.out.println("Erro! Não posso rabiscar!");
    }else{
        System.out.println("Rabisco");
    }
        
    }
    
    protected void tampar() {
        this.tampada = true;
        
    }
    
    protected void destampar() {
        this.tampada = false;
        
    }
}        

    
