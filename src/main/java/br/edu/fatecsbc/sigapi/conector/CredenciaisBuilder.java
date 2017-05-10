package br.edu.fatecsbc.sigapi.conector;

import java.util.HashMap;
import java.util.Map;

import br.edu.fatecsbc.sigapi.conector.dto.Credenciais;

public abstract class CredenciaisBuilder<T extends Credenciais> {

    private final Map<String, String> parametros = new HashMap<>();

    public Map<String, String> getParametros() {
        return parametros;
    }

    public void adicionar(final String nome, final String valor) {
        parametros.put(nome, valor);
    }

    public abstract T build();

}
