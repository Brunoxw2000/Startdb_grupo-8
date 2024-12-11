package conectageracao.conectageracao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import conectageracao.conectageracao.entities.Atividade;

// Interface para operações de acesso a dados relacionadas à entidade Atividade
@Repository
public interface AtividadeRepositorio extends JpaRepository<Atividade, Integer> {

        // Os métodos padrão incluem:
        // - List<Atividade> findAll();
        // - Optional<Atividade> findById(Integer id);
        // - Atividade save(Atividade atividade);
        // - void deleteById(Integer id);
}
