package challenges.class7.Animal;

import challenges.class7.Animal.Models.Cat;
import challenges.class7.Animal.Models.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.showSpecs();
        cat.showSpecs();
    }
}
