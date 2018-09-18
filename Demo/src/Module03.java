import java.util.Scanner;

public class Module03 {

  public static void do3() {
    String palindrome = "Dot saw I was Tod"; // String is a class
    int len = palindrome.length(); // classes have methods
    
    
    Scanner keyboard = new Scanner(System.in);
    payProgram(keyboard);
    nextVsNextLine(keyboard);
  

  }

  public static void payProgram(Scanner keyboard) {
    // Get Input
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
  }

  public static void nextVsNextLine(Scanner keyboard) {
    // nextInt doesn't consume the Enter keystroke
    keyboard.nextLine(); // Consume left-over newline
    System.out.println("Enter another name:");
    String name = keyboard.nextLine();
    System.out.println("The name that you entered was " + name);
    double rate = keyboard.nextDouble();
    String firstName = keyboard.next(); // reads input until a space
    String address = keyboard.nextLine(); // reads input including spaces
    // until the end of line \n
  }

}
