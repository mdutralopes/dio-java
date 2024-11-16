package com.mlsoftdesign.clinical.model;

import java.sql.Date;

public class Cliente {
    
    private String nome;
    private Date dtNascimento;
    private String cpf;
    private EstadoCivil estadoCivil;
    
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        //this.dtNascimento = dtNascimento;
        this.cpf = cpf;
    }

    
}
