public class Scoreboard {
  private String team1;
  private String team2;
  private int score1;
  private int score2;
  private boolean active1;
  private boolean active2;

  public Scoreboard (String t1, String t2){
    team1 = t1;
    team2 = t2;
    score1 = 0;
    score2 = 0;
    active1 = true;
    active2 = false;
  }

  public void recordPlay (int points){
    if (points == 0){
      if(active1){
        active1 = false;
        active2 = true;
      }
      else if (active2){
        active1 = true;
        active2 = false;
      }
    }

    else{
      if (active1){
        score1 += points;
      }
      else{
        score2 += points;
      }
    }
  }
  
  public String getScore (){
    String result = score1 +"-" +score2 +"-";
    if (active1){
      result += team1;
    }
    else if (active2){
      result += team2;
    }
    return result;
  }
    
}

