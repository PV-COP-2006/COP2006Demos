package classes;

public class Bicycle {

  private int gears;

  public int getGears() {
    return gears;
  }

  public void setGears(int gears) {
    this.gears = gears;
  }

  public Bicycle(int g) {
    gears = g;
  }

  public Bicycle() {
    gears = 0;
  }
}
