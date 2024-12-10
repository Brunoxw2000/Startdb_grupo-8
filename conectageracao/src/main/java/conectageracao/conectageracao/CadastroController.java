package conectageracao.conectageracao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cadastro")


public class CadastroController {

final Pessoasrepositorio repositorio;

@Autowired
public CadastroController(Pessoasrepositorio repositorio) {
        this.repositorio = repositorio;

}


    
@PostMapping("formulario")
public void postMethodName(@RequestBody Pessoa pessoa) {
    
    
    repositorio.inserir(new Pessoa(pessoa.getNome(),pessoa.getEmail(),pessoa.getSenha(),pessoa.getEndereco(),pessoa.getPapel())); 
        

    
    return ;
}




}
