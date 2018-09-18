import java.util.Scanner;

public class Module04Methods {

  public static void do4(Scanner scan) {
    System.out.println("Module 04");
    printIntro();
    
    double livingRoomLength = 20;
    double livingRoomWidth = 30;
    System.out.println("The area of the living room is "
        + getArea(livingRoomLength, livingRoomWidth));
    
    double bedoomLength = 15;
    double bedroomWidth = 25;
    System.out.println("The area of the bedroom room is "
        + getArea(bedoomLength, bedroomWidth));
    
  }

  public static void printIntro() {
    System.out.println("Methods!");
  }
  
  public static double getArea(double length, double width) {
    return length * width;
  }

}
