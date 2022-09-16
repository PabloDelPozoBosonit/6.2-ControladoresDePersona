package FormacionBackend6.ControladoresDePersona.Persons;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Person {

    String name,
            city;
    int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public Person(){};

}
