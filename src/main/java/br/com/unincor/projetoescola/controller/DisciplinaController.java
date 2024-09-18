package br.com.unincor.projetoescola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unincor.projetoescola.exceptions.SalvarDisciplinaException;
import br.com.unincor.projetoescola.model.domain.Disciplina;
import br.com.unincor.projetoescola.model.service.DisciplinaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @PostMapping
    public Disciplina salvar(@RequestBody Disciplina disciplina)
            throws SalvarDisciplinaException {
        return disciplinaService.salvar(disciplina);
    }

}
