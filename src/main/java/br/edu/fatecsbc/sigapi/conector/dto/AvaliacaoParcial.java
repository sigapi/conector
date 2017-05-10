package br.edu.fatecsbc.sigapi.conector.dto;

public class AvaliacaoParcial {

    private String tipo;
    private float nota;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(final float nota) {
        this.nota = nota;
    }

}
