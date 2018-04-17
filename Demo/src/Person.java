
/**
 * @author sdvansel
 *
 */
public class Person {

  /**
   * 
   */
  protected int age;

  public int getAge() {
    return age;
  }

  /**
   * Public method to set the private field value. 
   * @param age integer value for age of person
   */
  public void setAge(int age) {
    this.age = age;
  }
  
  /**
   * @param a integer value for age of person
   */
  public Person(int a) {
    age = a;
  }
  

}
