package br.edu.fatecsbc.sigapi.conector;

import br.edu.fatecsbc.sigapi.conector.dto.CalendarioProvas;
import br.edu.fatecsbc.sigapi.conector.dto.Credenciais;
import br.edu.fatecsbc.sigapi.conector.dto.DadosCadastrais;
import br.edu.fatecsbc.sigapi.conector.dto.DadosDesempenho;
import br.edu.fatecsbc.sigapi.conector.dto.FaltasParciais;
import br.edu.fatecsbc.sigapi.conector.dto.Historico;
import br.edu.fatecsbc.sigapi.conector.dto.NotasParciais;

public interface Conector<T extends Credenciais> {

    CredenciaisBuilder<T> getCredenciaisBuilder();

    boolean autenticar(T credenciais);

    DadosCadastrais getDadosCadastrais(T credenciais);

    DadosDesempenho getDadosDesempenho(T credenciais);

    Historico getHistorico(T credenciais);

    NotasParciais getNotasParciais(T credenciais);

    FaltasParciais getFaltasParciais(T credenciais);

    CalendarioProvas getCalendarioProvas(T credenciais);

}
