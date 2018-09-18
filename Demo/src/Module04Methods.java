
public class Module04Methods {

  public static void do4() {

    // void method - nothing returned, results not used (not on right side of assignment or
    // anything)
    printIntro();

    // good method design
    // get values with specific variable names in main, send values to method, output returned value
    double livingRoomLength = 20;
    double livingRoomWidth = 30;
    System.out
        .println("The area of the living room is " + getArea(livingRoomLength, livingRoomWidth));

    double bedoomLength = 15;
    double bedroomWidth = 25;
    System.out.println("The area of the bedroom room is " + getArea(bedoomLength, bedroomWidth));

    // class demonstration
    classDemo();
  }

  public static void printIntro() {
    System.out.println("Methods!");
  }

  public static double getArea(double length, double width) {
    return length * width;
  }

  public static void classDemo() {
    // Class Demonstration
    CellPhone myPhone = new CellPhone();
    myPhone.setManufacturer("Motorola");
    System.out.println(myPhone.getManufacturer());
  }
}

// class, really should be in a separate file
class CellPhone {

  // field
  private String manufacturer;

  // methods
  // set
  public void setManufacturer(String manufact) {
    manufacturer = manufact;
  }

  // get
  public String getManufacturer() {
    return manufacturer;
  }
}

