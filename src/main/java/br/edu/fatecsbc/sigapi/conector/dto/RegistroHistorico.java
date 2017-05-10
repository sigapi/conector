package br.edu.fatecsbc.sigapi.conector.dto;

public class RegistroHistorico {

    private Disciplina disciplina;
    private int quantidadeAulasSemanais;
    private Periodo periodo;
    private boolean aprovado;
    private float mediaFinal;
    private float frequencia;
    private String observacao;

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(final Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getQuantidadeAulasSemanais() {
        return quantidadeAulasSemanais;
    }

    public void setQuantidadeAulasSemanais(final int quantidadeAulasSemanais) {
        this.quantidadeAulasSemanais = quantidadeAulasSemanais;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(final Periodo periodo) {
        this.periodo = periodo;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(final boolean aprovado) {
        this.aprovado = aprovado;
    }

    public float getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(final float mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(final float frequencia) {
        this.frequencia = frequencia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(final String observacao) {
        this.observacao = observacao;
    }

}
