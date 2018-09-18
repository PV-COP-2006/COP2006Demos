import java.util.Scanner;

public class Module03Branching {

  public static void do3(Scanner scan) {
    System.out.println("Module 03");
    int testscore = 85;
    char grade;
    if (testscore >= 90) {
      grade = 'A';
    } else if (testscore >= 80) {
      grade = 'B';
    } else if (testscore >= 70) {
      grade = 'C';
    } else if (testscore >= 60) {
      grade = 'D';
    } else {
      grade = 'F';
    }
    System.out.println("Grade = " + grade);

    int value1 = 1;
    int value2 = 2;
    if ((value1 == 1) && (value2 == 2)) {
      System.out.println("value1 is 1 AND value2 is 2");
    }
    if ((value1 == 1) || (value2 == 1)) {
      System.out.println("value1 is 1 OR value2 is 1");
    }
  }
    
}
