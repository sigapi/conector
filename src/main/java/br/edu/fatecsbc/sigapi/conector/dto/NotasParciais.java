package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.ArrayList;
import java.util.Collection;

public class NotasParciais {

    private Collection<RegistroNotaParcial> registros;

    public Collection<RegistroNotaParcial> getRegistros() {
        return registros;
    }

    public void addRegistro(final RegistroNotaParcial r) {

        if (r == null) {
            return;
        }

        if (registros == null) {
            registros = new ArrayList<>();
        }

        registros.add(r);

    }

}
