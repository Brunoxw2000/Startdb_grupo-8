package conectageracao.conectageracao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import conectageracao.conectageracao.entities.Atividade;
import conectageracao.conectageracao.services.AtividadeService;

//controller --> service --> repository (MVC)

@RestController
@RequestMapping("/atividades")
class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @GetMapping("/")
    public List<Atividade> listarTodas() {
        // Retorna todas as atividades
        return atividadeService.listarTodas();
    }

    //buscar o id da pessoa e puxa a lista de atividades relacionada com ela

    @GetMapping("/{id}")
    public Atividade buscarPorId(@PathVariable Integer id) {
        // Busca uma atividade pelo ID, retornando null se não for encontrada
        return atividadeService.buscarPorId(id);
    }

    @PostMapping
    public Atividade criar(@RequestBody Atividade atividade) {
        // Cria ou atualiza uma atividade
        return atividadeService.criar(atividade);
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Integer id) {
        // Verifica se a atividade existe antes de remover
        return atividadeService.remover(id);
    }

    @PutMapping("/")
    public Atividade atualizar(@RequestBody Atividade atividade) {
        // Atualiza uma atividade existente (ou cria uma nova se o ID não existir)
        return atividadeService.atualizar(atividade);
    }
}
