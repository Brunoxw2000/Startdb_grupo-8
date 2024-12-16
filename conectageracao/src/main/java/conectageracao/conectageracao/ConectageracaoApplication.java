package conectageracao.conectageracao;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import conectageracao.conectageracao.entities.Pessoa;
import conectageracao.conectageracao.repositories.PessoaRepositorio;

@SpringBootApplication
public class ConectageracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConectageracaoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PessoaRepositorio repositorio) {
		return (args) -> {
			
			
			
			
			
		};
	}
}
