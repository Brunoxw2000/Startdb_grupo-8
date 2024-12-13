package conectageracao.conectageracao.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import conectageracao.conectageracao.entities.Atividade;

@Repository
public interface AtividadeRepositorio extends JpaRepository<Atividade, Long> {
        // Os métodos padrão incluem:
        // - List<Atividade> findAll();
        // - Optional<Atividade> findById(Integer id);
        // - Atividade save(Atividade atividade);
        // - void deleteById(Integer id);

        List<Atividade> findByVoluntarioId(Long voluntarioId);

        List<Atividade> findByIdosoId(Long idosoId);
}
