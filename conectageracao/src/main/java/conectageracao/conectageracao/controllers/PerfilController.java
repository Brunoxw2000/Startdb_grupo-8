package conectageracao.conectageracao.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import conectageracao.conectageracao.entities.Pessoa;
import conectageracao.conectageracao.repositories.PessoaRepositorio;

import java.util.Optional;

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
public Optional<Pessoa> postMethodName(@RequestBody String nome) {
      

    
    return repositorio.findBynome(nome);
}




}