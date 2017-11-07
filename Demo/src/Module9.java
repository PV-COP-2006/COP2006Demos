import java.util.Scanner;

public class Module9 {
  
  public static void do9() {
    Scanner scanner = new Scanner(System.in);
    
    comparingStringsDemo(scanner);
    stringsAreArraysOfCharacters(scanner);
    stringsAreImmutable(scanner);
    
    
    scanner.close();
  }
  
  public static void comparingStringsDemo(Scanner scanner) {
    
    // Comparing Strings
    //https://docs.google.com/document/d/1ADJVs_9gzYJgoTsuU0pgAW2vWwtw6DWZ5psspidvtYk/pub
    
    System.out.println("Enter a or b");
    String answer = scanner.next();
    
    System.out.println("With user input and ==");
    if (answer.toLowerCase() == "a") {
      System.out.println("You entered a");
    } else {
      System.out.println("You did not enter a");
    }
    
    System.out.println("With user input and .equals");
    if (answer.equals("a")) {
      System.out.println("You entered a");
    } else {
      System.out.println("You did not enter a");
    }
    
    System.out.println("With assignment and ==");
    if (answer == "a") {
      System.out.println("You entered a");
    } else {
      System.out.println("You did not enter a");
    }
    
    System.out.println("With assignment and .equals");
    if (answer.equals("a")) {
      System.out.println("You entered a");
    } else {
      System.out.println("You did not enter a");
    }
  }

  public static void stringsAreArraysOfCharacters(Scanner scanner) {
    // Strings are a sequence of characters (like an array). 

  }
  
  public static void stringsAreImmutable(Scanner scanner) {
  }
}