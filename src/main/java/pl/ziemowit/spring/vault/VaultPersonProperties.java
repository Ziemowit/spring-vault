package pl.ziemowit.spring.vault;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties("person")
public record VaultPersonProperties(@NotBlank String firstName,
                                    @NotBlank String lastName,
                                    @Positive int age) {
}
