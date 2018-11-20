package extra;
/**
 * @author svanselow
 *
 */
import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

public class LinkedList {
  
  public static Node insert(Node head, int data) {
    // Complete this method
    Node newNode = new Node(data); ////////////////////////////////////////////
    if (head == null) {
      head = newNode;
    } else {
      Node existingNode = head;
      while (existingNode.next != null) {
        existingNode = existingNode.next;
      }
      existingNode.next = newNode;
    }

    return head;
  }

  public static void display(Node head) {
    Node start = head;
    while (start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void doExercise() {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while (N-- > 0) {
      int ele = sc.nextInt();
      head = insert(head, ele);
    }
    display(head);
    sc.close();
  }
}
