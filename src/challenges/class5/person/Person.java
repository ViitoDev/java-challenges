package challenges.class5.person;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }
}