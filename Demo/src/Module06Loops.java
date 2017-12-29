import java.util.Scanner;

public class Module06Loops {

  public static void do6(Scanner scan) {
    System.out.println("Module 06");
    boolean continueProgram = true;
    int menuChoice = 0;
    while (continueProgram) {

      // your program

      System.out.println("Press 1 to continue or 2 to quit.");
      menuChoice = scan.nextInt();
      if (menuChoice == 2) {
        continueProgram = false;
      }

    }

  }

}
