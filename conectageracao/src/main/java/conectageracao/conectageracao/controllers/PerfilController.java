package conectageracao.conectageracao.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import conectageracao.conectageracao.entities.Pessoa;
import conectageracao.conectageracao.repositories.PessoaRepositorio;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

    final PessoaRepositorio repositorio;

    public PerfilController(PessoaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @PostMapping("/dados")
    public Pessoa getDados(@RequestBody Long id) {
        return repositorio.findByid(id);
    }

    @PostMapping("/editar")
    public Pessoa editarPerfil(@RequestBody Pessoa pessoaEditada) {
        Pessoa pessoa = repositorio.findByid(pessoaEditada.getId());
        if (pessoa == null) {
            throw new RuntimeException("Usuário não encontrado!");
        }

        pessoa.setEndereco(pessoaEditada.getEndereco());
        pessoa.setPapel(pessoaEditada.getPapel());
        return repositorio.save(pessoa);
    }
}