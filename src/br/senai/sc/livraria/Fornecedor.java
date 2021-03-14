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
public class Fornecedor {
    private String cnpj;
    private String empresa;
    private String telefone;
    private String endereco;
    private String descricaovenda;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDescricaovenda(String descricaovenda) {
        this.descricaovenda = descricaovenda;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDescricaovenda() {
        return descricaovenda;
    }
}
