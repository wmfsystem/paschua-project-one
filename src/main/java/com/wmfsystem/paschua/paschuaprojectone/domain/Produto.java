package com.wmfsystem.paschua.paschuaprojectone.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by wmfsystem on 4/22/17.
 */
public class Produto extends Generic<Long>{

    private String descricao;

    private Double valor;

    public Produto() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
