public class Java8Tester {

   /**
   * 
   */
  public static void java8demo() {
      Java8Tester tester = new Java8Tester();
    
     // A lambda expression consists of the following: 
     //  A comma-separated list of formal parameters enclosed in parentheses. 
     //  Note: You can omit the data type of the parameters in a lambda expression. 
     //  In addition, you can omit the parentheses if there is only one parameter. 
     //  The arrow token, ->
     //  A body, which consists of a single expression or a statement block.
     //  (parameter_list) -> {function_body}
     //  n -> n % 2 != 0;
      
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
    
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
    
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
    
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
    
      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
    
   }
  
   interface MathOperation {
      int operation(int a, int b);
   }
  
   private int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }
}