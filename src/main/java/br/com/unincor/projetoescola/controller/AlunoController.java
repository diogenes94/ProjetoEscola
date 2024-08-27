package br.com.unincor.projetoescola.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unincor.projetoescola.exceptions.SalvarAlunoException;
import br.com.unincor.projetoescola.model.domain.Aluno;
import br.com.unincor.projetoescola.model.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) throws SalvarAlunoException {
        return alunoService.salvar(aluno);
    }

    @GetMapping
    public List<Aluno> listarAlunosAtivos() {
        return alunoService.buscarTodosAlunosAtivos();
    }
    
    
}
