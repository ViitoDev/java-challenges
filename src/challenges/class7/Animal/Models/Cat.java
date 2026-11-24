package challenges.class7.Animal.Models;

public class Cat extends Animal{
    @Override
    public void animalSound() {
        System.out.println("Meow!");
    }

    public void scratchingFurniture(){
        System.out.println("The cat scratched the piece of furniture.");
    }

    public void showSpecs(){
        animalSound();
        scratchingFurniture();
    }
}
