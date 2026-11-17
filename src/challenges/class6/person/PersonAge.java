package challenges.class6.person;

public class PersonAge {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age.");
            return;
        }
        this.age = age;
    }

    public void checkAge() {
        if (age < 18) {
            System.out.println(name + " is a minor.");
        } else {
            System.out.println(name + " is of legal age.");
        }
    }
}
