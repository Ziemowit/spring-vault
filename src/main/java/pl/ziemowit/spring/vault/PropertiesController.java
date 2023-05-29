package pl.ziemowit.spring.vault;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/properties")
public class PropertiesController {

  private final VaultPersonProperties vaultPersonProperties;

  @GetMapping("/person")
  public PersonDTO getProperties() {
    return PersonDTO.from(vaultPersonProperties);
  }


  record PersonDTO(String firstName, String lastName, int age) {

    static PersonDTO from(VaultPersonProperties properties) {
      return new PersonDTO(properties.firstName(), properties.lastName(), properties.age());
    }

  }

}
