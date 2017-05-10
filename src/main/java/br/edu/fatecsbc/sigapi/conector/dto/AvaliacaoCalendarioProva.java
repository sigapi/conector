package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.Date;

public class AvaliacaoCalendarioProva {

    private Date data;
    private String descricao;

    public Date getData() {
        return data;
    }

    public void setData(final Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }

}
