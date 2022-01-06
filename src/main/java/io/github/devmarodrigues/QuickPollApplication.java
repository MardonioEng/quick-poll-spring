package io.github.devmarodrigues;

import io.github.devmarodrigues.domain.Option;
import io.github.devmarodrigues.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class QuickPollApplication {

	@Bean
	public CommandLineRunner init(@Autowired OptionRepository optionRepository) {
		return args -> {
			Option op = new Option();
			op.setValue("Opcao Teste");

			optionRepository.save(op);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(QuickPollApplication.class, args);
	}

}
