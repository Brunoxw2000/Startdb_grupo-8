package conectageracao.conectageracao.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import conectageracao.conectageracao.entities.Pessoa;
import conectageracao.conectageracao.repositories.PessoaRepositorio;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    final PessoaRepositorio repositorio;

    public CadastroController(PessoaRepositorio repositorio) {
        this.repositorio = repositorio;

    }

    @PostMapping("/formulario")
    public void postMethodName(@RequestBody Pessoa pessoa) {

        repositorio.save(new Pessoa(null, pessoa.getNome(), pessoa.getEmail(), pessoa.getSenha(), pessoa.getEndereco(),
                pessoa.getPapel()));

    }

}
