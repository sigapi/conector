package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Email {

    private String endereco;
    private final Collection<TipoEmail> tiposEmail = new LinkedHashSet<>();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(final String endereco) {
        this.endereco = endereco;
    }

    public Collection<TipoEmail> getTiposEmail() {
        return tiposEmail;
    }

    public void addTipoEmail(final TipoEmail t) {
        if (t != null) {
            tiposEmail.add(t);
        }
    }

}
