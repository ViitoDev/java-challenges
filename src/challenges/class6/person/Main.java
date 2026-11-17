package challenges.class6.person;

public class Main {
    public static void main(String[] args) {
        PersonAge person1 = new PersonAge();
        PersonAge person2 = new PersonAge();

        person1.setName("Victor");
        person1.setAge(10);
        person1.checkAge();

        person2.setName("Annelise");
        person2.setAge(18);
        person2.checkAge();
    }
}
