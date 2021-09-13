/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.ForRent1;

/**
 *
 * @author Carolina
 */
public class CadastrarAluguel {
    private double tempoAluguel;
    private String observacao;
    private double preco;
    private String avaria;
    private String produtoAlug;

    public String getProdutoAlug() {
        return produtoAlug;
    }

    public void setProdutoAlug(String produtoAlug) {
        this.produtoAlug = produtoAlug;
    }
   
    public double getTempoAluguel() {
        return tempoAluguel;
    }

    public void setTempoAluguel(double tempoAluguel) {
        this.tempoAluguel = tempoAluguel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAvaria() {
        return avaria;
    }

    public void setAvaria(String avaria) {
        this.avaria = avaria;
    }
    
    public double estimativaAluguel(){
       if(this.tempoAluguel!=0){
          return (this.preco * this.tempoAluguel);  
       }
        return 0;
       
    }
    
}


