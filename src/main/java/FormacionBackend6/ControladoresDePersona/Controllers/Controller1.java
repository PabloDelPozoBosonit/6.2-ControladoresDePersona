package FormacionBackend6.ControladoresDePersona.Controllers;

import FormacionBackend6.ControladoresDePersona.Persons.Person;
import FormacionBackend6.ControladoresDePersona.Persons.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @Autowired
    PersonService personService;

    @PostMapping("Controller1/addPerson")
    public Person addPerson(@RequestBody Person person) {

        personService.addPerson(person);
        return person;
    }

}
