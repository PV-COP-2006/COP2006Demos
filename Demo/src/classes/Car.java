package classes;

public class Car extends Object{

  private static int numWheels;
  
  public int getNumWheels() {
    return numWheels;
  }
  
  public void setNumWheels(int numWheels) {
    this.numWheels = numWheels;
  }
  
  @ Override
  public String toString() {
    return "Car has " + numWheels;
  }
}
