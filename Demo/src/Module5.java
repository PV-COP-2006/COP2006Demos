public class Module5 {

  public static void do5() {
    CellPhone myPhone = new CellPhone();
    myPhone.setManufacturer("Motorola");
  }
}

class CellPhone {
  private String manufacturer;

  public void setManufacturer(String manufact) {
    manufacturer = manufact;
  }

  public String getManufacturer() {
    return manufacturer;
  }

}