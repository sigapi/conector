package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.Collection;

public class CalendarioProvas {

    private Collection<RegistroCalendarioProva> registros;

    public Collection<RegistroCalendarioProva> getRegistros() {
        return registros;
    }

    public void setRegistros(final Collection<RegistroCalendarioProva> registros) {
        this.registros = registros;
    }

}
