package conectageracao.conectageracao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/atividades")
class AtividadeController {

    @Autowired
    private AtividadeRepositorio atividadeRepositorio;

    @GetMapping
    public List<Atividade> listarTodas() {
        // Retorna todas as atividades
        return atividadeRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public Atividade buscarPorId(@PathVariable Integer id) {
        // Busca uma atividade pelo ID, retornando null se não for encontrada
        return atividadeRepositorio.findById(id).orElse(null);
    }

    @PostMapping
    public Atividade criar(@RequestBody Atividade atividade) {
        // Cria ou atualiza uma atividade
        return atividadeRepositorio.save(atividade);
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Integer id) {
        // Verifica se a atividade existe antes de remover
        Optional<Atividade> atividade = atividadeRepositorio.findById(id);
        if (atividade.isPresent()) {
            atividadeRepositorio.deleteById(id);
            return "Atividade removida com sucesso!";
        } else {
            return "Atividade não encontrada.";
        }
    }

    @PutMapping
    public Atividade atualizar(@RequestBody Atividade atividade) {
        // Atualiza uma atividade existente (ou cria uma nova se o ID não existir)
        return atividadeRepositorio.save(atividade);
    }
}
