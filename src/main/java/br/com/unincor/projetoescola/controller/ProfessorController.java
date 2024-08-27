package br.com.unincor.projetoescola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unincor.projetoescola.exceptions.SalvarProfessorException;
import br.com.unincor.projetoescola.model.domain.Professor;
import br.com.unincor.projetoescola.model.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public Professor salvar(@RequestBody Professor professor) throws SalvarProfessorException {
        return professorService.salvar(professor);
    }

    @GetMapping
    public List<Professor> listarProfessoresAtivos() {
        return professorService.buscaProfessoresAtivos();
    }
}
