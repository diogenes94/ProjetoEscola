package br.com.unincor.projetoescola.model.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno extends Pessoa {

    private String matricula;
    private LocalDateTime dataMatricula;
    
    @ManyToMany(mappedBy = "alunos")
    private List<Turma> turmas = new ArrayList<>();
}
