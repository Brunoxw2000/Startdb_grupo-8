package conectageracao.conectageracao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/Login")
public class LoginController {

    final Pessoasrepositorio repositorio;

    public LoginController(Pessoasrepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @PostMapping("Log")
    public String postMethodName(@RequestBody Log log) {
        String token = "vazio";
        token = repositorio.autenticar(log);
        return token;
    }
}
