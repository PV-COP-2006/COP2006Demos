package core;
import java.util.Scanner;

public class Module11Exceptions {

  public static void do11() {
    Scanner scanner = new Scanner(System.in);
    
    // You will be given two integers  and  as input, 
    // you have to compute . If  and  are not  bit signed
    // integers or if  is zero, exception will occur and 
    // you have to report it. 
    // Read sample Input/Output to know what to report 
    // in case of exceptions.
    
    try {
      System.out.println("Enter first number");
      int num1 = scanner.nextInt();
      System.out.println("Enter second number");
      int num2 = scanner.nextInt();
      System.out.println("Result = " + num1 / num2);
    } catch (Exception ex) {
      System.out.println(ex);
    }
    
    
    //int x1 = 0; 
    //manualThrow();
    //System.out.println("Enter x1");   
    //x1 = getGoodIntInput(scanner);
  }
  
    public static void do11(Scanner scan) {
    System.out.println("Module 11");
    int x1 = 0;
    System.out.println("Enter a number to test for good input");
    x1 = getGoodIntInput(scan);
    System.out.println(x1 + " must be good!");
    manualThrow();
  }

  public static void demonstratePassUp(Scanner scanner) {
    int x1 = 0;
    System.out.println("Enter x1");   
    x1 = scanner.nextInt();
  }
  public static int getGoodIntInput(Scanner scanner) {
    boolean gottenGoodInput = false;
    int num = 0;
    
    while (gottenGoodInput == false) {
      try {
        num = scanner.nextInt();
        gottenGoodInput = true;
      } catch (Exception ex) {
        System.out.println("Requires an integer");
        scanner.nextLine();
      }
    }
    return num;
  }

  public static void manualThrow() {
    int x1 = -5;
    
    try {
      int result = x1 / 0; // problem for Java
      if (x1 < 0) { // not a problem for Java
        throw new Exception();
      }
    } catch (ArithmeticException ex) {
      System.out.println("Cannot divide by 0");
    }
    catch (Exception ex) {
      System.out.println("no negatives");
    }
  }
}
