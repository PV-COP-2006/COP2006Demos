import java.util.Scanner;

/**
 * @author svanselow
 *
 */
class Main {

  public static void main(String[] args) throws java.lang.Exception {
    
    Playerr player1 = new Playerr();
    player1.setName("Mario");
    System.out.println(player1.getName());
    
    int selection;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a menu selection");
    System.out.println("1. Hello World");
    System.out.println("2. Classes");
    selection = scan.nextInt();
    
    switch(selection) {
    case 1:
    	Module01Hello.do1();
    	break;
    case 2:
    	Module02Elements.do2();
    	break;
    default:
    	System.out.println("Invalid selection");
    
    }

    
    //Module01Hello.do1(); // Hello World
    //Module02Elements.do2(); // Classes, Data Types, Variables
    //Module03Strings.do3(); // Strings, Casting, Input
    //Module04Methods.do4(); // Classes and Methods
    //Module05Classes.do5(); // Library Classes
    Module06Conditions.do6(); // Operators, Condition Statements and Branching
    //Module07Looping.do7(); // Loops
    //Module08OOP.do8(); // 
    //Module09OOP2.do9(); // Inheritance and Polymorphism
    //Module10Arrays.do10(); // 
    //Module11Exceptions.do11(); // 
    //Module13Quality.do13(); // 
    //LinkedList.doExercise();

  }

}
