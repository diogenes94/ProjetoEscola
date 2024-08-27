package br.com.unincor.projetoescola.model.service;

import java.util.List;

import br.com.unincor.projetoescola.exceptions.SalvarProfessorException;
import br.com.unincor.projetoescola.model.domain.Professor;

public interface ProfessorService {

    Professor salvar(Professor professor) throws SalvarProfessorException;

    List<Professor> buscaProfessoresAtivos();
}
