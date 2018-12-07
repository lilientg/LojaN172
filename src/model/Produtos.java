/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 181720019
 */
public class Produtos {
    private double preco;
    private int codigo;
    private String nome;
    private double quantidade;
    private Categoria categoria;
    
    public Produtos(){
    }
    
    public Produtos(double preco, int codigo, String nome, int quantidade ){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
    public Categoria getCategoria(){
        return categoria;
    }
    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    
}


