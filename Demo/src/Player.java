public class Player {

  // fields (almost always private)
  private int score;
  private int health;
  private static int wins;

  public Player() {
    score = 0;
  }
  
  public Player(int sc) {
    score = sc;
    health = 100;
  }
  
  public void blockKick() {
    health -= 5;
  }
  
  public static int getWins() {
    return wins;
  }

  public static void setWins(int wins) {
    Player.wins = wins;
  }

  public void setScore(int sc) {
    score = sc;
  }

  public int getScore() {
    return score;
  }

}
