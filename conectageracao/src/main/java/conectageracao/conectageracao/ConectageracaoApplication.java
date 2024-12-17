package conectageracao.conectageracao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
