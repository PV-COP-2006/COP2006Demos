import java.util.EmptyStackException;
import java.util.Stack;

public class Module13 {

  static void showpush(Stack<Integer> st, int a) {
    st.push(new Integer(a));
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }

  static void showpop(Stack<Integer> st) {
    System.out.print("pop -> ");
    Integer a = (Integer) st.pop();
    System.out.println(a);
    System.out.println("stack: " + st);
  }

  public static void do13() {
    Stack<Integer> st = new Stack<Integer>();
    System.out.println("stack: " + st);
    showpush(st, 42);
    showpush(st, 66);
    showpush(st, 99);
    // demoOutOfMemory();
    showpop(st);
    showpop(st);
    showpop(st);
    try {
      showpop(st);
    } catch (EmptyStackException e) {
      System.out.println("empty stack");
    }
  }

  public void demoOutOfMemory(Stack<Integer> st) {
    int i = 0;
    while (i < 999999999) {
      st.push(i);
    }
  }

}
