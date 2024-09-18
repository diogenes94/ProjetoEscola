package br.com.unincor.projetoescola.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unincor.projetoescola.exceptions.SalvarDisciplinaException;
import br.com.unincor.projetoescola.model.domain.Disciplina;
import br.com.unincor.projetoescola.model.repository.DisciplinaRepository;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    public Disciplina salvar(Disciplina disciplina)
            throws SalvarDisciplinaException {

        return disciplinaRepository.save(disciplina);
    }

}
