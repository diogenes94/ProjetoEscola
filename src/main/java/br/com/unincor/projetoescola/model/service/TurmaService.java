package br.com.unincor.projetoescola.model.service;

import br.com.unincor.projetoescola.exceptions.SalvarTurmaException;
import br.com.unincor.projetoescola.model.domain.Turma;

public interface TurmaService {

    Turma salvar(Turma turma)
            throws SalvarTurmaException;
}
