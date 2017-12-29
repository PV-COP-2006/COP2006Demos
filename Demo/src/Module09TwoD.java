import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module09TwoD {

  public static void do9(Scanner scan) {
    System.out.println("Module 09");
    twoDArrayDemo();
    arrayListDemo();
    genericsDemo();
  }

  public static void twoDArrayDemo() {

    int[][] boxscore = new int[2][9]; // 2D array with 2 rows and 9 columns
    // how to populate a two dimensional array in Java
    // using for loop
    for (int i = 0; i < boxscore.length; i++) {
      for (int j = 0; j < boxscore[i].length; j++) {
        boxscore[i][j] = i + j;
      }
    }
    // the code to loop through the 2d array is always the exact same,
    // just change what is inside the loop
    for (int i = 0; i < boxscore.length; i++) {
      for (int j = 0; j < boxscore[i].length; j++) {
        System.out.print(boxscore[i][j] + " ");
      }
      System.out.println();
    }

    // String[][] words = new String[2][]; // this is legal

  }

  public static void arrayListDemo() {
    ArrayList<String> list = new ArrayList<String>(); // creates ArrayList
    list.add("Item1"); // adds item
    list.add("Item2"); // adds item
    // gets the position that matches argument
    System.out.println("Index of 'Item1' is " + list.indexOf("Item1"));
    int size = list.size(); // returns the size
    System.out.println("Size is " + size);
    list.add("Item3"); // adds item
    size = list.size(); // returns the size
    System.out.println("Size is " + size);
    // find value in list
    System.out.println("'Item5' is in the list: " + list.contains("Item5"));
    // get element at index location
    System.out.println("Element at 0 is " + list.get(0));
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
    System.out.println("Must cast to assign string " + s + " to variable s.");
    // When re-written to use generics, the code does not require casting:
    List<String> stringList = new ArrayList<String>();
    stringList.add("hello");
    System.out.println("Get without cast: " + stringList.get(0)); // no cast

    genericMethodDemo(); // http://www.tutorialspoint.com/java/java_generics.htm
  }

  public static void genericMethodDemo() {
    // Create arrays of Integer, Double and Character
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    System.out.println("Array integerArray contains:");
    printArray(intArray); // pass an Integer array

    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
    System.out.println("\nArray doubleArray contains:");
    printArray(doubleArray); // pass a Double array

    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
    System.out.println("\nArray characterArray contains:");
    printArray(charArray); // pass a Character array
  }

  public static <E> void printArray(E[] inputArray) {
    // Display array elements
    for (E element : inputArray) {
      System.out.printf("%s ", element);
    }
    System.out.println();
  }
}