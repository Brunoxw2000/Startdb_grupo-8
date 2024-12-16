package conectageracao.conectageracao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
=======
>>>>>>> gabriela
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConectageracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConectageracaoApplication.class, args);
	}
<<<<<<< HEAD

	@Bean
	public CommandLineRunner demo(Pessoasrepositorio repositorio) {
		return (args) -> {
			log.info("Inserindo pessoas...");
			var p1 = repositorio.save(new Pessoa("John Doe", "jon@email.com","senha","porto-alegre","voluntario"));
			log.info(p1.toString());
			var p2 = repositorio.save(new Pessoa("mary knows", "mkno@email.com","1234","pelotas","idoso"));
			log.info(p2.getNome());
			var p9 = new Log("email@hot.com","1234");
			log.info(p9.getemail());
			
			
			
		};
	}
=======
>>>>>>> gabriela
}
