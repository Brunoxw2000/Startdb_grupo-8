
package conectageracao.conectageracao.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import conectageracao.conectageracao.entities.Login;
import conectageracao.conectageracao.entities.Pessoa;

@Repository
public interface PessoaRepositorio {
    // quer buscar os dados do banco inteiro pq so temos 2 objetos

    // metodo para retornar uma lista de objetos pessoas

    List<Pessoa> buscarTodos();
    // buscar uma pessoa especifica

    Pessoa buscarPorId(long id);

    // inserir uma nova pessoa , retonar a pessoa
    Pessoa inserir(Pessoa umPessoa);

    // remover uma pessoa do banco
    Pessoa remover(long id);

    // alterar o objeto
    void alterar(Pessoa umPessoa);

    String autenticar(Login log);

    Optional<Pessoa> findById(Long id);
}