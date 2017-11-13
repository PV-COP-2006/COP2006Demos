import java.util.Scanner;

public class Module9 {

  public static void do9() {
    Scanner scanner = new Scanner(System.in);

    comparingStringsDemo(scanner);
    stringsAreArraysOfCharacters();
    stringsAreImmutable();
    stringInitialValue();

    scanner.close();
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

}