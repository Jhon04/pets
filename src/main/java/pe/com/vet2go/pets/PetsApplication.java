package pe.com.vet2go.pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PetsApplication {
	//CAMBIO
	public static void main(String[] args) {
		SpringApplication.run(PetsApplication.class, args);
	}

}
