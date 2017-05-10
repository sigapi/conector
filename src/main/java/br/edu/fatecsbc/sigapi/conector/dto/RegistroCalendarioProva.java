package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.Collection;

public class RegistroCalendarioProva {

    private Disciplina disciplina;
    private Collection<AvaliacaoCalendarioProva> avaliacoes;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(final Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Collection<AvaliacaoCalendarioProva> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(final Collection<AvaliacaoCalendarioProva> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

}
