package conectageracao.conectageracao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ConectageracaoApplication {

	private static final Logger log = LoggerFactory.getLogger(ConectageracaoApplication.class);



	public static void main(String[] args) {
		SpringApplication.run(ConectageracaoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(Pessoasrepositorio repositorio) {
		return (args) -> {
			log.info("Inserindo pessoas...");
			var p1 = repositorio.inserir(new Pessoa("John Doe", "jon@email.com","senha","porto-alegre","voluntario"));
			log.info(p1.toString());
			var p2 = repositorio.inserir(new Pessoa("mary knows", "mkno@email.com","1234","pelotas","idoso"));
			log.info(p2.toString());
			
			log.info("Alterando pessoa...");
			var p3 = repositorio.buscarPorId(2);
			p3.setEndereco("porto alegre");
			repositorio.alterar(p3);
			log.info(p3.toString());

			log.info("Removendo pessoa...");
			var p4 = repositorio.remover(1);
			log.info(p4.toString());

			log.info("Consultando pessoas");
			List<Pessoa> pessoas = repositorio.buscarTodos();
			for (var pessoa : pessoas) {
				log.info(pessoa.toString());
			}
		};
	}
}










