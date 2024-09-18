package br.com.unincor.projetoescola.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unincor.projetoescola.model.domain.Turma;

public interface TurmaRepository
        extends JpaRepository<Turma, Long> {

    public List<Turma> findByNomeAllIgnoreCaseOrderByNome(String nome);

    public boolean existsByNomeAllIgnoreCase(String nome);
}
