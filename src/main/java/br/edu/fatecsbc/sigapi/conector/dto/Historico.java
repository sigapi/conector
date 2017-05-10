package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.Collection;

public class Historico {

    private Collection<RegistroHistorico> registros;

    public Collection<RegistroHistorico> getRegistros() {
        return registros;
    }

    public void setRegistros(final Collection<RegistroHistorico> registros) {
        this.registros = registros;
    }

}
