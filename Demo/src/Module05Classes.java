import java.util.Random;

public class Module05Classes {

  public static void do5() {
    
    // Strings and StringBuilder
    stringDemo();
    // Random
    randomDemo();
    // Math
    
  }
  
  public static void stringDemo() {
    // %d decimal number
    // %n line break
    // %s a string
    
    System.out.format("the %s jumped %n over the %s, %d times %n", "cow", "moon", 2);
  }
  
  public static void randomDemo() {
    // create random object, only do this once
    Random randomGen = new Random();
    
    // get next int value, you can do this as many times as you want

    // nextInt will return an int between 0 (inclusive) and the specified value
    // (exclusive)

    // simulate the rolling of a 6 sided dice 3 times
    System.out.println(randomGen.nextInt(6) + 1);
    System.out.println(randomGen.nextInt(6) + 1);
    System.out.println(randomGen.nextInt(6) + 1);

  }

}