package br.com.unincor.projetoescola.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unincor.projetoescola.model.domain.Disciplina;

public interface DisciplinaRepository
        extends JpaRepository<Disciplina, Long> {
    
    
}
