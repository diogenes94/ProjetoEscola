package br.com.unincor.projetoescola.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unincor.projetoescola.model.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
