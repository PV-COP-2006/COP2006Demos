
public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if (initialAge > 0) {
            age = initialAge;
        } else 
        {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }
	}
}