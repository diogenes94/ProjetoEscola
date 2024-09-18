package br.com.unincor.projetoescola.model.service;

import br.com.unincor.projetoescola.exceptions.SalvarDisciplinaException;
import br.com.unincor.projetoescola.model.domain.Disciplina;

public interface DisciplinaService {

    Disciplina salvar(Disciplina disciplina) 
        throws SalvarDisciplinaException;
}
