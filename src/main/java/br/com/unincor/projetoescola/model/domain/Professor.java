package br.com.unincor.projetoescola.model.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "professores")
@Getter
@Setter
public class Professor extends Pessoa {

    private String nroInscricao;
    private LocalDateTime dataCadastro;

}
