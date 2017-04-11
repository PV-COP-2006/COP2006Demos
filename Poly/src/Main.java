import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
 
class Animal
{
  public void showSpecies()
  {
    System.out.println("Regular animal");
  }
  public void makeSound()
  {
    System.out.println("Grrrrr");
  }
}
 
class Dog extends Animal
{
  public void showSpecies()
  {
    System.out.println("Dog");
  }
  public void makeSound()
  {
    System.out.println("Woof");
  }
  
  public void beAnnoying() {
	  
  }
}
 
class Cat extends Animal
{
  public void showSpecies()
  {
    System.out.println("Cat");
  }
  public void makeSound()
  {
    System.out.println("Meow");
  } 
}
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int x1 = 0;
		float x3 = 0;
		
		try {		
			x1 = scanner.nextInt();
		}		
		catch (Exception e) {
			
		}
		finally {
			
		}
		
	}
	
}










