package conectageracao.conectageracao.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import conectageracao.conectageracao.entities.Pessoa;
import conectageracao.conectageracao.repositories.Pessoasrepositorio;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    final Pessoasrepositorio repositorio;

    public CadastroController(Pessoasrepositorio repositorio) {
        this.repositorio = repositorio;

    }

    @PostMapping("/formulario")
    public void postMethodName(@RequestBody Pessoa pessoa) {

        repositorio.inserir(new Pessoa(pessoa.getNome(), pessoa.getEmail(), pessoa.getSenha(), pessoa.getEndereco(),
                pessoa.getPapel()));

    }

}
