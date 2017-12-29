import java.util.Scanner;

public class Module05Classes {

  public static void do5(Scanner scan) {
    Player p1 = new Player();
    Player p2 = new Player();

    p1.setScore(100);
    p2.setScore(200);

    System.out.println("Player 1 score = " + p1.getScore());
    System.out.println("Player 2 score = " + p2.getScore());
  }
}