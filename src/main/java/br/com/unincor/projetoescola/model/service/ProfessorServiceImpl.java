package br.com.unincor.projetoescola.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unincor.projetoescola.exceptions.SalvarProfessorException;
import br.com.unincor.projetoescola.model.domain.Professor;
import br.com.unincor.projetoescola.model.repository.ProfessorRepository;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository fessorRepository;

    @Override
    public Professor salvar(Professor professor) throws SalvarProfessorException {
        var fessorFindCpf = fessorRepository
        .findByCpfAndAtivoTrue(professor.getCpf());
        if(professor.getId() == null && fessorFindCpf.isPresent()) {
            throw new SalvarProfessorException("O Cpf informado já se encontra salvo!");
        }

        return fessorRepository.save(professor);
    }

    @Override
    public List<Professor> buscaProfessoresAtivos() {
        return fessorRepository.findByAtivoTrueOrderByNome();
    }

}
