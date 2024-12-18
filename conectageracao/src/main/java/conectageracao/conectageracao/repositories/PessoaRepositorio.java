
package conectageracao.conectageracao.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import conectageracao.conectageracao.entities.Login;
import conectageracao.conectageracao.entities.Pessoa;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {

    Optional<Pessoa> findBynome(String nome);

    // String autenticar(Login log);

}