
public class Module07 {

  public static void do7() {

    int[] anArray = { 100, 200, 300 };

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
}
