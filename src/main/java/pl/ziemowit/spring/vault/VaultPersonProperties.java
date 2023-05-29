package pl.ziemowit.spring.vault;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Valid
@ConfigurationProperties("person")
public record VaultPersonProperties(@NotBlank String firstName,
                                    @NotBlank String lastName,
                                    @Positive int age) {
}
