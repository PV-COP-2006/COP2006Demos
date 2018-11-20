package classes;
public class Player {

  // fields (almost always private)
  private int score;

  public Player(int sc) {
    System.out.println("I'm in the overloaded constructor");
    score = sc;
  }
  
  public Player() {
    System.out.println("I'm in the default constructor");
    score = 0;
  }
  
  public void setScore(int sc) {
    score = sc;
  }

  public int getScore() {
    return score;
  }

}
