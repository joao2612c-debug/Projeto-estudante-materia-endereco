package br.com.senai.infoa.backend.projeto_venda.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Endereco {
    @Id 
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    @Column  
    private Integer id;
    private String cidade;
    private String bairro;
    private String cep;
    
    
    
    public Endereco() {
    }



    public Endereco(Integer id, String cidade, String bairro, String cep) {
        this.id = id;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public String getCidade() {
        return cidade;
    }



    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



    public String getBairro() {
        return bairro;
    }



    public void setBairro(String bairro) {
        this.bairro = bairro;
    }



    public String getCep() {
        return cep;
    }



    public void setCep(String cep) {
        this.cep = cep;
    }
    

    
}
