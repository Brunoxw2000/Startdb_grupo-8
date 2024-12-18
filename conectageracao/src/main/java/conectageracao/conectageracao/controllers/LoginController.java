package conectageracao.conectageracao.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import conectageracao.conectageracao.entities.Login;
import conectageracao.conectageracao.entities.Pessoa;
import conectageracao.conectageracao.repositories.PessoaRepositorio;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/login")
public class LoginController {

    final PessoaRepositorio repositorio;

    public LoginController(PessoaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @PostMapping
    public String postMethodName(@RequestBody Login log) {
        Long token = (long) 0;
        
        Pessoa Pessoabusca = repositorio.findByemail(log.getEmail());
        token = Pessoabusca.getId();
        return token.toString();
    }
}