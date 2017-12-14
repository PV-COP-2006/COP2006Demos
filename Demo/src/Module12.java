import java.util.InputMismatchException;
import java.util.Scanner;

public class Module12 {

  public static void do12() {
    Scanner scanner = new Scanner(System.in);
    int x1 = 0; 
    System.out.println("Enter x1");   
    x1 = getGoodIntInput(scanner);
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
      if (x1 < 0) {
        throw new Exception();
      }
    } catch (Exception ex) {
      System.out.println("no negatives");
    }
  }

}
