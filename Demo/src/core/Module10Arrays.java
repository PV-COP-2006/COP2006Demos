package core;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Exhibits code utilized in Module 10.
 * <p>Two dimensional arrays</p>
 * <p>Array lists</p>
 * <p>Generics</p>
 * @author Prof. Vanselow
 *
 */
public class Module10Arrays {
  
  /**
   * The main method of the Module 10 class.
   */
  public static void do10() {
    
    twoDArrayDemo();
    arrayListDemo();
    genericsDemo();
    
    
    System.out.println("Module 07");
    int[] anArray = { 100, 200, 300 };

    int size = 4; // or input from user 
    int[] scores = new int[size];
    scores[1] = Integer.parseInt("4");
    scores[4] = 4;
    

    for (int i = 0; i < anArray.length; i++) {
      System.out.println(anArray[i]);
    }

    // while not found and i < anArray.length
    for (int i = 0; i < anArray.length; i++) {
      if (anArray[i] == 250) {
        // not found = false
        // location where found = i
        System.out.println("Found");
      }

    }
    // if not found
    System.out.println("Not Found");
    // else found at location i
  }
  
  public static void twoDArrayDemo() {

    int[][] boxscore = new int[2][9]; // 2D integer array with 2 rows and 9
                                      // columns
    // how to initialize two dimensional array in Java
    // using for loop
    int[][] board = new int[3][3];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = i + j;
      }
    }

    String[][] words = new String[2][];

  }

  public static void arrayListDemo() {
    ArrayList<String> list = new ArrayList<String>(); // creates ArrayList
    list.add("Item1"); // adds item
    list.add("Item2"); // adds item
    int pos = list.indexOf("Item1"); // gets the position that matches argument
    int size = list.size(); // returns the size
    System.out.println("Size is " + size);
    list.add("Item3"); // adds item
    size = list.size(); // returns the size
    System.out.println("Size is " + size);
    boolean element = list.contains("Item5"); // finds
    String item = list.get(0); // returns element at index location
    list.remove(0); // removes element at index location
    System.out.println("list.get(0) = " + list.get(0));
    list.remove("Item2"); // removes match

    list.add("Item1"); // adds item
    list.add("Item2"); // adds item
    
    for (int i = 0; i < list.size(); i++) {
      System.out.println("Index: " + i + " - Item: " + list.get(i));
    }

    for (String str : list) {
      System.out.println("Item is: " + str);
    }
  }

  public static void genericsDemo() {
    // Elimination of casts.
    // The following code snippet without generics requires casting:
    List list = new ArrayList();
    list.add("hello");
    String s = (String) list.get(0);
    // When re-written to use generics, the code does not require casting:
    List<String> stringList = new ArrayList<String>();
    stringList.add("hello");
    s = stringList.get(0); // no cast

    genericMethodDemo(); // http://www.tutorialspoint.com/java/java_generics.htm
  }

  public static void genericMethodDemo() {
    // Create arrays of Integer, Double and Character
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
   // Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println("Array integerArray contains:");
    printArray(intArray); // pass an Integer array

    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray); // pass a Double array

    System.out.println("\nArray characterArray contains:");
   // printArray(charArray); // pass a Character array
  }
  
  /**
   * @param inputArray the array that is received to be printed
   */
  public static <E> void printArray(E[] inputArray) {
    // Display array elements
    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }
}
