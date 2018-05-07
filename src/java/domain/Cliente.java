/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author renatosalinas
 */
public class Cliente {
    private Long   id_cliente;
    private String razao_social;
    private String nome_fantasia;
    private String cpf_cgc;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private Long telefone;
    private Long fax;
    private Long telefone_2;
    private Long cep;
    private String email;
    private Date   data_cadastro;
    private Long ativo;
    private Long numero_endereco;

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getCpf_cgc() {
        return cpf_cgc;
    }

    public void setCpf_cgc(String cpf_cgc) {
        this.cpf_cgc = cpf_cgc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public Long getFax() {
        return fax;
    }

    public void setFax(Long fax) {
        this.fax = fax;
    }

    public Long getTelefone_2() {
        return telefone_2;
    }

    public void setTelefone_2(Long telefone_2) {
        this.telefone_2 = telefone_2;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Long getAtivo() {
        return ativo;
    }

    public void setAtivo(Long ativo) {
        this.ativo = ativo;
    }

    public Long getNumero_endereco() {
        return numero_endereco;
    }

    public void setNumero_endereco(Long numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

   
    
}
