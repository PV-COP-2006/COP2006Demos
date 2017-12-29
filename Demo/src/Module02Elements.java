import java.util.Scanner;

public class Module02Elements {

  public static void do2(Scanner scan) {

    System.out.println("Module 02");
    int num1; // variable declaration
    num1 = 1; // assignment
    int num2 = 2; // declaration + assignment = initialization
    System.out.println("num1 + num2 = " + (num1 + num2));

    String palindrome = "Dot saw I was Tod"; // String is a class
    // classes have methods
    System.out.println("The length of the string is " + palindrome.length());

    payProgram(scan);
    nextVsNextLine(scan);
    classDemo();

  }

  public static void payProgram(Scanner keyboard) {
    // Get Input
    String name;
    System.out.print("Enter your name: ");
    name = keyboard.nextLine();

    double payRate;
    System.out.print("Enter your hourly pay rate: ");
    payRate = keyboard.nextDouble();

    int hours;
    System.out.print("Enter the number of hours worked: ");
    hours = keyboard.nextInt();

    System.out.println("Here are the values that you entered:");
    System.out.println(name);
    System.out.println(payRate);
    System.out.println(hours);
  }

  public static void nextVsNextLine(Scanner keyboard) {
    // nextInt doesn't consume the Enter keystroke
    keyboard.nextLine(); // Consume left-over newline
    System.out.println("Enter another name:");
    String name = keyboard.nextLine();
    System.out.println("The name that you entered was " + name);
    System.out.println("Enter a number:");
    double rate = keyboard.nextDouble();
    System.out.println("The number that you entered was " + rate);
    System.out.println("Enter first name:");
    String firstName = keyboard.next(); // reads input until a space
    System.out.println("The name that you entered was " + firstName);
    System.out.println("Enter address:");
    String address = keyboard.nextLine(); // reads input including spaces
    // until the end of line \n
    System.out.println("The address that you entered was " + address);
  }

  public static void classDemo() {
    // Class Demonstration
    CellPhone myPhone = new CellPhone();
    myPhone.setManufacturer("Motorola");
    System.out.println(myPhone.getManufacturer());
  }
}

class CellPhone {

  private String manufacturer;

  public void setManufacturer(String manufact) {
    manufacturer = manufact;
  }

  public String getManufacturer() {
    return manufacturer;
  }
}
