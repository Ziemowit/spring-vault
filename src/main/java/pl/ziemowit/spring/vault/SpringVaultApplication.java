package pl.ziemowit.spring.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({VaultPersonProperties.class})
public class SpringVaultApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringVaultApplication.class, args);
  }

}
