package desafio.dio.padraoprojeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioPadraoProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPadraoProjetoApplication.class, args);
	}

}
