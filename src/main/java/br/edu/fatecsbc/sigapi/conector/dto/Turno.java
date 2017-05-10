package br.edu.fatecsbc.sigapi.conector.dto;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.lang3.StringUtils;

public enum Turno {

    MANHA("manhã", "matutino"),
    TARDE("tarde", "vespertino"),
    NOITE("noite", "noturno");

    private final Collection<String> sinonimos = new ArrayList<>();

    private Turno(final String... sinonimos) {

        if (sinonimos != null && sinonimos.length > 0) {

            for (final String s : sinonimos) {
                String temp = StringUtils.trimToNull(s);
                if (temp != null) {
                    temp = StringUtils.stripAccents(temp).toLowerCase();
                    this.sinonimos.add(temp);
                }
            }

        }

    }

    public Collection<String> getSinonimos() {
        return sinonimos;
    }

    public static final Turno getBySinonimo(final String sinonimo) {

        String temp = StringUtils.trimToNull(sinonimo);
        if (temp != null) {

            temp = StringUtils.stripAccents(temp).toLowerCase();

            for (final Turno t : values()) {
                if (t.getSinonimos().contains(temp)) {
                    return t;
                }
            }
        }

        return null;

    }

}
