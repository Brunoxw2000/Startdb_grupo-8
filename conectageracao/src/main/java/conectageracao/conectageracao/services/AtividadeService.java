package conectageracao.conectageracao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import conectageracao.conectageracao.entities.Atividade;
import conectageracao.conectageracao.repositories.AtividadeRepositorio;

//Regras de negócio, testar 

@Service
public class AtividadeService {
    @Autowired
    private AtividadeRepositorio atividadeRepositorio;

    public List<Atividade> listarTodas() {
        // Retorna todas as atividades
        return atividadeRepositorio.findAll();
    }

    public Atividade buscarPorId(Integer id) {
        // Busca uma atividade pelo ID, retornando null se não for encontrada
        return atividadeRepositorio.findById(id).orElse(null);
    }

    public Atividade criar(Atividade atividade) {
        // Cria ou atualiza uma atividade
        return atividadeRepositorio.save(atividade);
    }

    public String remover(Integer id) {
        // Verifica se a atividade existe antes de remover
        Optional<Atividade> atividade = atividadeRepositorio.findById(id);
        if (atividade.isPresent()) {
            atividadeRepositorio.deleteById(id);
            return "Atividade removida com sucesso!";
        } else {
            return "Atividade não encontrada.";
        }
    }

    public Atividade atualizar(Atividade atividade) {
        // Atualiza uma atividade existente (ou cria uma nova se o ID não existir)
        return atividadeRepositorio.save(atividade);
    }
}