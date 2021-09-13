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
public class Produto {
    private String produtos;
    private String descricao;
    private String tipo;
    private String produtoKit;
    private double valorDia;

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
  
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getProdutoKit() {
        return produtoKit;
    }

    public void setProdutoKit(String produtoKit) {
        this.produtoKit = produtoKit;
    }
    
    
    
    
}
