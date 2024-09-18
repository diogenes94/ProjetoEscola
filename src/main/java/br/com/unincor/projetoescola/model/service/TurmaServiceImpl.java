package br.com.unincor.projetoescola.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unincor.projetoescola.exceptions.SalvarTurmaException;
import br.com.unincor.projetoescola.model.domain.Turma;
import br.com.unincor.projetoescola.model.repository.TurmaRepository;

@Service
public class TurmaServiceImpl implements TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    public Turma salvar(Turma turma)
            throws SalvarTurmaException {
                
        if (turmaRepository
                .existsByNomeAllIgnoreCase(turma.getNome())) {
            throw new SalvarTurmaException(
                "Já existe uma turma com este nome!");        
        }

        return turmaRepository.save(turma);
    }
}
