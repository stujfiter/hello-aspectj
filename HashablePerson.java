package bday;

import java.util.Objects;

public aspect HashablePerson {

    public int Person.hashCode() {
        //Object[] objects = new Object[] {name, Integer.valueOf(age)};
        //return objects.hashCode();
        return Objects.hash(name, age);
    }

    public boolean Person.equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof Person))
            return false;

        Person person = (Person) o;
        return person.getName().equals(getName())
            && person.getAge() == getAge();
    }
}
