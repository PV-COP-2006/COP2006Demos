import java.util.Scanner;

public class Module10OOP {

  public static void do10(Scanner scan) {
    System.out.println("Module 10");
    Cat felix = new Cat();
    Dog fido = new Dog();
    Animal[] myPets = { felix, fido };
    for (Animal anAnimal : myPets) {
      anAnimal.showSpecies();
      anAnimal.makeSound();
    }
  }
}

class Animal {

  public void showSpecies() {
    System.out.println("Animal");
  }

  public void makeSound() {
    System.out.println("Grrrrrrr");
  }
}

class Dog extends Animal {
  @Override
  public void showSpecies() {
    System.out.println("Dog");
  }

  public void makeSound() {
    System.out.println("Woof");
  }

}

class Cat extends Animal {
  public void showSpecies() {
    System.out.println("Cat");
  }

  public void makeSound() {
    System.out.println("Meow");
  }
}
