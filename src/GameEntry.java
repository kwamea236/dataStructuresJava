/*
*
* */

public class GameEntry {
  private String name;
  private int score;

  public GameEntry(String name, int score){
      this.name = name;
      this.score = score;
  }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
