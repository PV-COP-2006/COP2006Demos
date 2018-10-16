import java.text.NumberFormat;
import java.util.Scanner;

public class Module07Looping {

  public static void do7() {
    Scanner scanner = new Scanner(System.in);
    
    double principle = 3000;
    double rate = 8;
    double time = 1;
    double interest;
    final int TOTAL_YEARS = 40;
    double monthlyIncrease = 450;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    String interestString;
    for (int year = 1; year <= TOTAL_YEARS; year++) {
      /* Calculate compound interest */
      interest = principle * (Math.pow((1 + rate / 100), time)) - principle; 
      principle += interest + monthlyIncrease * 12;
      interestString = formatter.format(interest);
      System.out.println("Compound interest for year " + year + " is " + interestString);
    }
    String principleString;
    principleString = formatter.format(principle);
    System.out.println("The principle after " + TOTAL_YEARS + " years is " + principleString);
    
    // Demonstration of a while loop to repeat your program
    boolean continueProgram = true;
    int menuChoice = 0;
    
    while (continueProgram) {

      // your program

      System.out.println("Press 1 to continue or 2 to quit.");
      menuChoice = scanner.nextInt();
      if (menuChoice == 2) {
        continueProgram = false;
      }

    }
    scanner.close();

  }

}
