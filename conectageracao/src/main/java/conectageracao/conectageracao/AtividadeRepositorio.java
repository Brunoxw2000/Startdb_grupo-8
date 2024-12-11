package conectageracao.conectageracao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface para operações de acesso a dados relacionadas à entidade Atividade
@Repository
public interface AtividadeRepositorio extends JpaRepository<Atividade, Integer> {

        // Os métodos padrão incluem:
        // - List<Atividade> findAll();
        // - Optional<Atividade> findById(Integer id);
        // - Atividade save(Atividade atividade);
        // - void deleteById(Integer id);
}
