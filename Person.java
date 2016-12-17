package bday;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String celebrate() {
        return "Happy " + age + "th birthday, " + name + "!";
    }

    public String motivate() {
        return "You can do it!";
    }
}
