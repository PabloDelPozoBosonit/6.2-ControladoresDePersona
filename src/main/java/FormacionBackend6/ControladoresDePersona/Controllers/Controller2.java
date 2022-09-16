package FormacionBackend6.ControladoresDePersona.Controllers;

import FormacionBackend6.ControladoresDePersona.Persons.Person;
import FormacionBackend6.ControladoresDePersona.Persons.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @Autowired
    PersonService personService;

    @GetMapping("Controller2/getPerson")
    public Person getPerson() {

        return personService.getPerson();

    }
}
