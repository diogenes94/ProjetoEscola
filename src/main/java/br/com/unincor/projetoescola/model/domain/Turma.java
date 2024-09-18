package br.com.unincor.projetoescola.model.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "turmas")
public class Turma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Informe um nome para a turma")
    @Size(min = 5, max = 100, 
        message = "O nome deve ter entre 5 e 100 caracteres!")
    private String nome;

    @NotNull(message = "A disciplina não foi informada!")
    @ManyToOne
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

    @ManyToMany
    @JoinTable(name = "turmas_alunos", 
    joinColumns = @JoinColumn(name = "id_turma"), 
    inverseJoinColumns = @JoinColumn(name = "id_aluno"))
    private List<Aluno> alunos = new ArrayList<>();

}
