import java.util.Scanner;

public class Module08Strings {

  public static void do8(Scanner scan) {
    System.out.println("Module 08");
    //demoUnicode();
    //comparingStringsDemo(scanner);
    //stringsAreArraysOfCharacters();
    //stringsAreImmutable();
    //stringInitialValue();

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
    //str.charAt(0) = "A";
  }

  public static void stringInitialValue() {
    String str = new String();
    System.out.println(str);
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
}
