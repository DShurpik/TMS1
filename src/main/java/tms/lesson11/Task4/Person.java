package tms.lesson11.Task4;

import java.util.Objects;

public class Person {
    String name;

    Person (String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
