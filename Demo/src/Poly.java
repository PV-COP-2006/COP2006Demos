
public class Poly {
  
  public void doPolyDemo() {
  // program that demonstrates classes
    Vehicle myHonda = new Vehicle();
    myHonda.setMake("Honda");
    myHonda.setColor("black");
    Vehicle myMini = new Vehicle();
    myMini.setMake("Mini");
    myMini.setColor("blue");
    ElectricCar myTesla = new ElectricCar();
    myTesla.setMake("Tesla");
    myTesla.setColor("black");
    System.out.println(myTesla.getClass().getSuperclass());
    Vehicle myGarage[] = new Vehicle[3];
    myGarage[0] = myHonda;
    myGarage[1] = myMini;
    myGarage[2] = myTesla;
    for (Vehicle vehicle : myGarage) {
      System.out.println(vehicle.getMake());
    }
  }
  
}

class ElectricCar extends Vehicle {
  private double eMPG;

  public double geteMPG() {
    return eMPG;
  }

  public void seteMPG(int eMPG) {
    this.eMPG = eMPG;
  }
  
  public void seteMPG(double eMPG) {
    this.eMPG = eMPG;
  }
  
  public void seteMPG() { // overloading
    eMPG = 0;
  }
  
  public void seteMPG(int mpg, String msg) { // overloading
    eMPG = 0;
  }
  
  public void seteMPG(String msg, int mpg) { // overloading
    eMPG = 0;
  }
  
  public String getMake() { // overriding
    return "The make of my electic car is " + make;
  }
}

class Vehicle extends Object{
  private int VIN;
  private String color;
  protected String make;
  private String model;
  
  public Vehicle() {
    VIN = 9999;
    color = "unknown";
    make = "not set";
    model = "not set";
  }
  
  public Vehicle(int vIn) {
    VIN = vIn;
    color = "unknown";
    make = "not set";
    model = "not set";
  }
  
  public Vehicle(int vIn, String c, String make, String mod) {
    VIN = vIn;
    color = c;
    this.make = make;
    model = mod;
  }
  
  public int getVIN() {
    return VIN;
  }
  final public void setVIN(int vIn) {
    VIN = vIn;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public String getMake() {
    return "The make of my vehicle is " + make;
  }
  public void setMake(String make) {
    this.make = make;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  
  
}