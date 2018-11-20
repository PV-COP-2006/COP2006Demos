package classes;

public class Person {
  private int age;

  public int getAge() {
    return age;
  }
  
  public void setAge(int ageToSet) {
    if (ageToSet > 0) {
      age = ageToSet;
    } else {
      System.out.println("Age is not valid, setting age to 0.");
      age = 0;
    }
  }
  
  public void yearPasses() {
    age = age + 1;
  }
}