package conectageracao.conectageracao.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import conectageracao.conectageracao.entities.Login;
import conectageracao.conectageracao.entities.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository // permite identificar que temos um repositiorio
@Transactional //execucao do codigo no contexto de transacoes
public class PessoaRepositorioJpa implements Pessoasrepositorio {
    //aqui dentro vamos usar EntiyManager (é um objeto)
    //essa classe vai usar esse objeto, entao esse objeto deve ser injetado

    @PersistenceContext
    private EntityManager em;

    @Override
    public Pessoa inserir(Pessoa umPessoa){
        em.persist(umPessoa);
        return umPessoa;
    }
    @Override
    public Pessoa buscarPorId(long id){
            return em.find(Pessoa.class, id);
    }

    @Override
    public Pessoa remover(long id){
        var p = em.find(Pessoa.class, id);
        em.remove(p);
        return p;
    }

    @Override
    public void alterar(Pessoa umPessoa){
        em.merge(umPessoa);
    }

    @Override
    public List<Pessoa> buscarTodos(){
        return em
                .createQuery("from Pessoa p", Pessoa.class)
                .getResultList();
    }
 
    @Override
    public String autenticar(Login log){
        String Token = "vazio";
        return Token;
    }
}

