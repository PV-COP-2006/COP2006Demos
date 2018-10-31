//Nice demos

import java.util.Scanner;

/**
 * @author svanselow
 *
 */
class Main {
  public static void main(String[] args) throws java.lang.Exception {

    // Display menu
    System.out.println("Enter a menu selection");
    System.out.println("1. Hello World");
    System.out.println("2. Classes");
    System.out.println("3. Strings, Casting, Input");
    System.out.println("4. Classes and Methods");
    System.out.println("5. Library Classes");
    System.out.println("6. Operators, Condition Statements and Branching");
    System.out.println("7. Loops");
    System.out.println("8. ");
    System.out.println("9. Inheritance and Polymorphism");
    System.out.println("10. ");
    System.out.println("11. ");
    System.out.println("13. Quality");
    
    
    int selection;

    // Create a scanner
    Scanner scan = new Scanner(System.in);
    
    selection = scan.nextInt();

    switch (selection) {
      case 1:
        Module01Hello.do1(); // Hello World
        break;
      case 2:
        Module02Elements.do2(); // Classes, Data Types, Variables
        break;
      case 3:
        Module03Strings.do3(); // Strings, Casting, Input
        break;
      case 4:
        Module04Methods.do4(); // Classes and Methods
        break;
      case 5:
        Module05Classes.do5(); // Library Classes
        break;
      case 6:
        Module06Conditions.do6(); // Operators, Condition Statements and Branching
        break;
      case 7:
        Module07Looping.do7(); // Loops
        break;
      case 8:
        Module08OOP.do8(); //
        break;
      case 9:
        Module09OOP2.do9(); // Inheritance and Polymorphism
        break;
      case 10:
        Module10Arrays.do10(); //
        break;
      case 11:
        Module11Exceptions.do11(); //
        break;
      case 13:
        Module13Quality.do13(); //
        break;
      default:
        System.out.println("Invalid selection");

    }

    //
    // LinkedList.doExercise();

  }

}
