
public class Module3 {

  public static void do3() {
    printIntro();
    
    double livingRoomLength = 20;
    double livingRoomWidth = 30;
    System.out.println("The area of the living room is "
        + getArea(livingRoomLength, livingRoomWidth));
    
    double bedoomLength = 15;
    double bedroomWidth = 25;
    System.out.println("The area of the bedroom room is "
        + getArea(bedoomLength, bedroomWidth));
    
    Player player1 = new Player();
  }

  public static void printIntro() {
    System.out.println("Methods!");
  }
  
  public static double getArea(double length, double width) {
    return length * width;
  }

}
