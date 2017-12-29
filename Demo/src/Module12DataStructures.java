import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Module12DataStructures {

  public static void do12(Scanner scan) {
    System.out.println("Module 12");
    demoStack();
    demoHashMap();
  }

  public static void demoStack() {
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

  static void showpush(Stack<Integer> st, int a) {
    st.push(Integer.valueOf(a));
    System.out.println("push(" + a + ")");
    System.out.println("stack: " + st);
  }

  static void showpop(Stack<Integer> st) {
    System.out.print("pop -> ");
    Integer a = (Integer) st.pop();
    System.out.println(a);
    System.out.println("stack: " + st);
  }

  public void demoOutOfMemory(Stack<Integer> st) {
    int i = 0;
    while (i < 999999999) {
      st.push(i);
      i++;
    }
  }

  public static void demoHashMap() {

    Map<String, Integer> m = new HashMap<String, Integer>();

    String[] args = { "1", "2", "2" };

    for (String a : args) {
      Integer freq = m.get(a);
      m.put(a, (freq == null) ? 1 : freq + 1);
    }

    System.out.println(m.size() + " distinct words:");
    System.out.println(m);

  }
}
