import java.util.Scanner;

public class Module2 {

  public static void do2() {

    int num1; // variable declaration
    num1 = 1; // assignment
    int num2 = 2; // declaration + assignment = initialization

    String palindrome = "Dot saw I was Tod"; // String is a class
    int len = palindrome.length(); // classes have methods

    // Get Input
    Scanner keyboard = new Scanner(System.in);
    String name;
    double payRate;
    int hours;

    System.out.print("Enter your name: ");
    name = keyboard.nextLine();

    System.out.print("Enter your hourly pay rate: ");
    payRate = keyboard.nextDouble();

    System.out.print("Enter the number of hours worked: ");
    hours = keyboard.nextInt();

    System.out.println("Here are the values that you entered:");
    System.out.println(name);
    System.out.println(payRate);
    System.out.println(hours);

    // nextInt doesn't consume the Enter keystroke
    keyboard.nextLine(); // Consume left-over newline
    System.out.println("Enter another name:");
    name = keyboard.nextLine();
    System.out.println("The name that you entered was " + name);

    keyboard.close();
    
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
