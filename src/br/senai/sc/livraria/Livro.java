/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.livraria;

/**
 *
 * @author felipe_baumgartel
 */
public class Livro {
     private String nomelivro;
     private double edicao;
     private String setor;
     private double precocompra;
     private double precovenda;
     private int codfornecedor;
     private String genero;

    public int getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(int codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }
     private int estoque;

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setNomelivro(String nomelivro) {
        this.nomelivro = nomelivro;
    }

    public void setEdicao(double edicao) {
        this.edicao = edicao;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNomelivro() {
        return nomelivro;
    }

    public double getEdicao() {
        return edicao;
    }

    public String getSetor() {
        return setor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
