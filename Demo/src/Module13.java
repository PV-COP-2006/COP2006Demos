import java.util.EmptyStackException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Module13 {
  
  private static Stack<Character> palStack = new Stack<Character>();

  static void showpush(Stack<Integer> st, int a) {
    st.push(a);
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }

  static void showpop(Stack<Integer> st) {
    System.out.print("pop -> ");
    int a = st.pop();
    System.out.println(a);
    System.out.println("stack: " + st);
  }

  public static void do13() {
    palindromeChecker();
    
    Stack<Integer> st = new Stack<Integer>();
    System.out.println("stack: " + st);
    showpush(st, 42);
    showpush(st, 66);
    showpush(st, 99);
    // demoOutOfMemory(st);
    showpop(st);
    showpop(st);
    showpop(st);
    if (!st.isEmpty()) {
      showpop(st);
    }
    //showpop(st); // throws exception
    try {
      showpop(st);
    } catch (EmptyStackException e) {
      System.out.println("empty stack");
    } catch (Exception e) {
      System.out.println("Some other error");
    }

  }

  public static void demoOutOfMemory(Stack<Integer> st) {
    int i = 0;
    while (i++ < 999999999) {
      st.push(i);
    }
  }
  
  public static void palindromeChecker() {
  
    Scanner scan = new Scanner(System.in);
    System.out.println("Palindrome Checker");
    System.out.println("Enter string to check");
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    Module13 p = new Module13();
    
    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
        p.pushCharacter(c);
        p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length/2; i++) {
        if (p.popCharacter() != p.dequeueCharacter()) {
            isPalindrome = false;                
            break;
        }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.println( "The word, " + input + ", is " 
                       + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
}
    
    
  public static void pushCharacter(char c) {
    palStack.push(c);
  }
  
  public static void enqueueCharacter(char c) {
    
  }
  
  public static char popCharacter() {
    return 'a';
  }
  
  public static char dequeueCharacter() {
    return 'a';
  }

}
