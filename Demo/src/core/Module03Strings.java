package core;
import java.util.Scanner;

public class Module03Strings {

  public static void do3() {
    
    // String methods
    String palindrome = "Dot saw I was Tod"; // String is a class
    int len = palindrome.length(); // classes have methods
    System.out.println("The length of the string is " + len);
    
    Scanner keyboard = new Scanner(System.in);
    
    payProgram(keyboard); // demonstrates input
    
    nextVsNextLine(keyboard); // demonstrates input
    
    demoUnicode();
    //comparingStringsDemo(keyboard);
    //stringsAreArraysOfCharacters();
    //stringsAreImmutable();
    //stringInitialValue();

    keyboard.close();
  }

  public static void comparingStringsDemo(Scanner scanner) {

    // Comparing Strings
    // https://docs.google.com/document/d/1ADJVs_9gzYJgoTsuU0pgAW2vWwtw6DWZ5psspidvtYk/pub

    System.out.println("Enter a or b");
    String answer = scanner.next();

    System.out.println("With user input and ==");
    if (answer.toLowerCase() == "a") {
      System.out.println("== a is true");
    } else {
      System.out.println("== a is false");
    }

    System.out.println("With user input and .equals");
    if (answer.equals("a")) {
      System.out.println(".equals a is true");
    } else {
      System.out.println(".equals a is false");
    }

    answer = "a";

    System.out.println("With assignment and ==");
    if (answer == "a") {
      System.out.println("== a is true");
    } else {
      System.out.println("== a is false");
    }

    System.out.println("With assignment and .equals");
    if (answer.equals("a")) {
      System.out.println(".equals a is true");
    } else {
      System.out.println(".equals a is false");
    }
  }

  public static void stringsAreArraysOfCharacters() {
    // Strings are a sequence of characters (like an array).
    String str = "I am really an array of characters.";
    // System.out.println(str[0]);
    System.out.println(str.charAt(0));
    char[] characters = str.toCharArray();
    characters[0] = 'z';
    System.out.println(characters);
  }

  public static void stringsAreImmutable() {
    String str = "I am immutable.";
    str = "different string";
    // Cannot be overwritten
    // str.charAt(0) = "A";
  }

  public static void stringInitialValue() {
    String str = new String();
    int num1 = 0;
    if (str.isEmpty()) {
      System.out.println("Empty");
    } else {
      System.out.println(str);
    }
    System.out.println("here");
  }
  
  public static void demoUnicode() {
    String str = "JAVA";
    System.out.println("String = " + str);

    // codepoint at index 1
    int retval1 = str.codePointAt(1);
    int retval2 = str.codePointAt(2);

    if (retval1 == 65) {
      System.out.println("skipping");
    }
    // prints character at index1 in string
    System.out.println("Character(unicode point) = " + retval2);
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
