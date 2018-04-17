import java.util.EmptyStackException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Module12DataStructures {

  public static void do12(Scanner scan) {
    System.out.println("Module 12");
    demoQueue();
    demoStack();
    demoHashMap();
    // hDemo();
    // ransom(scan);
  }

  public static void demoQueue() {
      
      Queue<Integer> queue = new LinkedList<Integer>();

      //queue.remove();
      
      for (int i = 1000; i >= 0; i--) {
          queue.add(i);
      }
  }
  
  public static void ransom(Scanner in) {

    System.out.println("Enter number of words in magazine");
    int numWordsMag = in.nextInt();
    System.out.println("Enter number of words in ransom note");
    int numWordsNote = in.nextInt();
    String magazine[] = new String[numWordsMag];
    // read in magazine words
    for (int magazine_i = 0; magazine_i < numWordsMag; magazine_i++) {
      System.out.println("Enter word in magazine");
      magazine[magazine_i] = in.next();
    }
    // read in ransom note words
    String ransom[] = new String[numWordsNote];
    for (int ransom_i = 0; ransom_i < numWordsNote; ransom_i++) {
      System.out.println("Enter word in ransom note");
      ransom[ransom_i] = in.next();
    }

    Map<String, Integer> magazineMap = new HashMap<String, Integer>();

    for (String a : magazine) {
      Integer freq = magazineMap.get(a);
      magazineMap.put(a, (freq == null) ? 1 : freq + 1);
    }

    boolean canMakeNote = true;
    for (String a : ransom) {
      Integer freq = magazineMap.get(a);
      if (freq == null) {
        System.out.println("no match for ransom word in magazine");
        canMakeNote = false;
      } else {
        magazineMap.put(a, freq - 1);
      }
    }
    System.out.println(canMakeNote);
  }

  // http://www.tutorialspoint.com/java/java_stack_class.htm
  public static void demoStack() {
    Stack<Integer> st = new Stack<Integer>();
    System.out.println("stack: " + st);
    showpush(st, 42);
    showpush(st, 66);
    showpush(st, 99);
    //demoOutOfMemory(st);
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

  public static void demoOutOfMemory(Stack<Integer> st) {
    int i = 0;
    while (i < 999999999) {
      
      st.push(i);
      
    }
  }

  public static void demoHashMap() {

    HashMap<String, Integer> m = new HashMap<String, Integer>();

    String[] args = { "3", "4", "4", "5" };

    for (String a : args) {
      Integer freq = m.get(a);
      m.put(a, (freq == null) ? 1 : freq + 1);
    }

    System.out.println(m.size() + " distinct words:");
    System.out.println(m);

  }

  public static void hDemo() {
    // Create a hash map
    Hashtable balance = new Hashtable();
    Enumeration names;
    String str;
    double bal;

    balance.put("Zara", new Double(3434.34));
    balance.put("Mahnaz", new Double(123.22));
    balance.put("Ayan", new Double(1378.00));
    balance.put("Daisy", new Double(99.22));
    balance.put("Qadir", new Double(-19.08));

    // Show all balances in hash table.
    names = balance.keys();

    while (names.hasMoreElements()) {
      str = (String) names.nextElement();
      System.out.println(str + ": " + balance.get(str));
    }
    System.out.println();

    // Deposit 1,000 into Zara's account
    bal = ((Double) balance.get("Zara")).doubleValue();
    balance.put("Zara", new Double(bal + 1000));
    System.out.println("Zara's new balance: " + balance.get("Zara"));
  }

}
