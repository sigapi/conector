package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;

public class RegistroNotaParcial {

    private Disciplina disciplina;
    private Collection<AvaliacaoParcial> avaliacoes = null;
    private float mediaFinal;
    private int quantidadeFaltas;
    private float percentualFrequencia;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(final Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Collection<AvaliacaoParcial> getAvaliacoes() {
        return avaliacoes;
    }

    public void addAvaliacao(final String tipo, final float nota) {

        if (StringUtils.isNotBlank(tipo) && nota >= 0) {

            if (avaliacoes == null) {
                avaliacoes = new ArrayList<>();
            }

            final AvaliacaoParcial ap = new AvaliacaoParcial();
            ap.setTipo(tipo);
            ap.setNota(nota);

            avaliacoes.add(ap);

        }

    }

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(final float mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public int getQuantidadeFaltas() {
        return quantidadeFaltas;
    }

    public void setQuantidadeFaltas(final int quantidadeFaltas) {
        this.quantidadeFaltas = quantidadeFaltas;
    }

    public float getPercentualFrequencia() {
        return percentualFrequencia;
    }

    public void setPercentualFrequencia(final float percentualFrequencia) {
        this.percentualFrequencia = percentualFrequencia;
    }

}
