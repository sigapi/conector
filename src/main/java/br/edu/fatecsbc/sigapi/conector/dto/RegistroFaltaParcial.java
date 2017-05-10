package br.edu.fatecsbc.sigapi.conector.dto;

public class RegistroFaltaParcial {

    private Disciplina disciplina;
    private int quantidadeAusencias;
    private int quantidadePresencas;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(final Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantidadeAusencias() {
        return quantidadeAusencias;
    }

    public void setQuantidadeAusencias(final int quantidadeAusencias) {
        this.quantidadeAusencias = quantidadeAusencias;
    }

    public int getQuantidadePresencas() {
        return quantidadePresencas;
    }

    public void setQuantidadePresencas(final int quantidadePresencas) {
        this.quantidadePresencas = quantidadePresencas;
    }

}
