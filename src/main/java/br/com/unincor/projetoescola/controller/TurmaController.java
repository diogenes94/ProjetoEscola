package br.com.unincor.projetoescola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unincor.projetoescola.exceptions.SalvarTurmaException;
import br.com.unincor.projetoescola.model.domain.Turma;
import br.com.unincor.projetoescola.model.service.TurmaService;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    private TurmaService turmaService;

    @PostMapping
    public Turma salvar(@RequestBody Turma turma)
            throws SalvarTurmaException {
        return turmaService.salvar(turma);
    }
}
