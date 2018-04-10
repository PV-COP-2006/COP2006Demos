import java.util.Scanner;

public class Module11Exceptions {

  public static void do11(Scanner scan) {
    System.out.println("Module 11");
    int x1 = 0;
    System.out.println("Enter a number to test for good input");
    x1 = getGoodIntInput(scan);
    System.out.println(x1 + " must be good!");
    manualThrow();
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
      if (x1 < 0) { // not a problem for Java
        throw new Exception();
      }
    } catch (Exception ex) {
      System.out.println("must not be negative");
    }
  }
}
