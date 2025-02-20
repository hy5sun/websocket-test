package tossiltossil.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WebsocketTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketTestApplication.class, args);
	}
}
