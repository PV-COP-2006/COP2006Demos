import java.util.Scanner;

public class Module10Oop {

  public static void do10(Scanner scan) {
    System.out.println("Module 10");
    Cat felix = new Cat();
    Dog fido = new Dog();
    Animal[] myPets = { felix, fido }; // this is polymorphism
    for (Animal anAnimal : myPets) {
      System.out.println(anAnimal.showSpecies());
      anAnimal.makeSound();
    }
  }
}

class Animal {

  protected String species;

  public String showSpecies() {
    return "Animal";
  }

  public void makeSound() {
    System.out.println("Grrrrrrr");
  }
}

class Dog extends Animal {

  public Dog() {
    species = "Canine";  // this demonstrates inheritance
  }

  public String showSpecies() {
    return "Dog";
  }

  public void makeSound() {
    System.out.println("Woof");
  }

}

class Cat extends Animal {

  public Cat() {
    species = "Feline";
  }

  public String showSpecies() {
    return species;
  }

  public void makeSound() {
    System.out.println("Meow");
  }
}
