
package conectageracao.conectageracao;

import java.util.List;

public interface Pessoasrepositorio {
    //quer buscar os dados do banco inteiro pq so temos 2 objetos

    //metodo para retornar uma lista de objetos pessoas

    List<Pessoa> buscarTodos();
    //buscar uma pessoa especifica

    Pessoa buscarPorId(long id);

    //inserir uma nova pessoa , retonar a pessoa
    Pessoa inserir(Pessoa umPessoa);

    //remover uma pessoa do banco
    Pessoa remover(long id);

    //alterar o objeto
    void alterar(Pessoa umPessoa);

    String autenticar(Log log);
}