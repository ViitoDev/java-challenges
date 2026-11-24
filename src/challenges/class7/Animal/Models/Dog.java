package challenges.class7.Animal.Models;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Woof woof!");
    }

    public void wagTail(){
        System.out.println("The dog wagged its tail.");
    }

    public void showSpecs(){
        animalSound();
        wagTail();
    }
}
