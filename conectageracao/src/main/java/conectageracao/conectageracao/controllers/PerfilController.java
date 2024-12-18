package conectageracao.conectageracao.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import conectageracao.conectageracao.entities.Pessoa;
import conectageracao.conectageracao.repositories.PessoaRepositorio;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/perfil")
public class PerfilController {

    final PessoaRepositorio repositorio;

    public PerfilController(PessoaRepositorio repositorio) {
        this.repositorio = repositorio;

    }

    @PostMapping("/dados")
    public Pessoa postMethodName(@RequestBody String idstring) {
        long id = Long.valueOf(idstring).longValue();
        return repositorio.findByid(id);
    }


    @PostMapping("/editarnome")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    



}