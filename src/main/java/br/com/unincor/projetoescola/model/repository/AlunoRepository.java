package br.com.unincor.projetoescola.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;
import br.com.unincor.projetoescola.model.domain.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Optional<Aluno> findByCpfAndAtivoTrue(String cpf);
    List<Aluno> findByAtivoTrueOrderByNome();
}
