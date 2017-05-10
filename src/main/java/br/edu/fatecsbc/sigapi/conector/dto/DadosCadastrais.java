package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.ArrayList;
import java.util.List;

public class DadosCadastrais {

    private String nome;
    private String foto;
    private String ra;
    private String instituicao;
    private Turno turno;
    private final List<Email> emails = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(final String foto) {
        this.foto = foto;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(final String ra) {
        this.ra = ra;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(final String instituicao) {
        this.instituicao = instituicao;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(final Turno turno) {
        this.turno = turno;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void addEmail(final Email e) {
        if (e != null) {
            emails.add(e);
        }
    }

}
