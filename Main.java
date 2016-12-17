package bday;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Korey", 37);
        Person p2 = new Person("Korey", 37);
        Person p3 = new Person("Ginger",33);
        
        System.out.println(p1.celebrate());
        System.out.println(p1.motivate());
        System.out.println("p1 = p2? " + p1.equals(p2));
        System.out.println("p1 = p3? " + p1.equals(p3));
    }
}
