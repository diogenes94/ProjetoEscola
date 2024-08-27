package br.com.unincor.projetoescola.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.unincor.projetoescola.model.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    Optional<Professor> findByCpfAndAtivoTrue(String cpf);
    List<Professor> findByAtivoTrueOrderByNome();
}
