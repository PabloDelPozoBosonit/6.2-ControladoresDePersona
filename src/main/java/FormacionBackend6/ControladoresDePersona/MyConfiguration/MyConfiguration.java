package FormacionBackend6.ControladoresDePersona.MyConfiguration;

import FormacionBackend6.ControladoresDePersona.Persons.PersonService;
import FormacionBackend6.ControladoresDePersona.Persons.PersonServiceImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public PersonService createPersonService() {

        return new PersonServiceImplement();
    }
}
