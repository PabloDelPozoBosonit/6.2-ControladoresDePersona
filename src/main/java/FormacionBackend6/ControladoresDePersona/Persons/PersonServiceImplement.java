package FormacionBackend6.ControladoresDePersona.Persons;

//@Component
public class PersonServiceImplement implements PersonService {


    Person p;


    @Override
    public Person getPerson() {
        return p;
    }

    @Override
    public Person addPerson(Person p) {
        this.p=p;
        return p;
    }
}
