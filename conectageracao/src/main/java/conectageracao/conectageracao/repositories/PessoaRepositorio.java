
package conectageracao.conectageracao.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import conectageracao.conectageracao.entities.Pessoa;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

    // quer buscar os dados do banco inteiro pq so temos 2 objetos

    // metodo para retornar uma lista de objetos pessoas

    List<Pessoa> findAll();
    // buscar uma pessoa especifica

    // Pessoa findById(long id);

    // inserir uma nova pessoa , retonar a pessoa
    // void save(Pessoa umPessoa);

    // remover uma pessoa do banco
    // Pessoa delete(long id);

    // alterar o objeto
    // void alterar(Pessoa umPessoa);

    // String autenticar(Login log);

    Optional<Pessoa> findById(Long id);
}