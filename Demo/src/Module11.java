

public class Module11 {

	class Animal {
		public void showSpecies() {
			System.out.println("Regular animal");
		}

		public void makeSound() {
			System.out.println("Grrrrrrr");
		}
	}

	class Dog extends Animal {
		public void showSpecies() {
			System.out.println("Dog");
		}

		public void makeSound() {
			System.out.println("Woof");
		}

		public void beAnnoying() {

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

	public static void do11() {
		{
		    Module11 mod11 = new Module11();
		    mod11.runIt();
		  }
		
	}

	private void runIt() {
		Cat felix = new Cat();
	    Dog fido = new Dog();
	    Animal[] myPets = { felix, fido };
	    for (Animal anAnimal : myPets)
	    {
	      anAnimal.showSpecies();
	      anAnimal.makeSound();
	    }    
		
	}

}
