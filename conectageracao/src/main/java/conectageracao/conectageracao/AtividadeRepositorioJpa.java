/* 
package conectageracao.conectageracao;

import java.util.List;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AtividadeRepositorioJpa {

    @PersistenceContext
    private EntityManager em;

    public Atividade inserir(Atividade umaAtividade) {
        em.persist(umaAtividade);
        return umaAtividade;
    }

    public Atividade buscarPorId(long id) {
        return em.find(Atividade.class, id);
    }

    public Atividade remover(long id) {
        var atividade = em.find(Atividade.class, id);
        em.remove(atividade);
        return atividade;
    }

    public void alterar(Atividade umaAtividade) {
        em.merge(umaAtividade);
    }

    public List<Atividade> buscarTodas() {
        return em.createQuery("from Atividade a", Atividade.class).getResultList();
    }
}*/