package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.ArrayList;
import java.util.Collection;

public class FaltasParciais {

    private final Collection<RegistroFaltaParcial> registros = new ArrayList<>();

    public Collection<RegistroFaltaParcial> getRegistros() {
        return registros;
    }

    public void add(final RegistroFaltaParcial registro) {
        if (registro != null) {
            registros.add(registro);
        }
    }

}
