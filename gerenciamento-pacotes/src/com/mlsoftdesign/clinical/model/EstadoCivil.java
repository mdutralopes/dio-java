package com.mlsoftdesign.clinical.model;

public enum EstadoCivil {
    SOLTEIRO ("01", "Solteiro"),
    CASADO ("02", "Casado");

    private String codigo;
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private EstadoCivil(String codigo, String descricao)
    {
        this.codigo = codigo;
        this.descricao = descricao;
    }
}
