public class Main {
  public static void main(String[] args) {
    System.out.println("2024 Question 2!");
  }
  public class Scoreboard {
    private String team1;
    private String team2;
    private int score1;
    private int score2;
    private boolean team1Active;

    public Scoreboard(String team1, String team2){
      this.team1 = team1;
      this.team2 = team2;
      score1 = 0;
      score2 = 0;
      team1Active = true;
    }

    public void recordPlay(int points){
      if(points != 0){
        if(team1Active){
          score1 += points;
        } else {
          score2 += points;
        }
      } else {
        team1Active = !team1Active;
      }
    }

    public String getScore(){
      String activeTeamName = team1;
      if(!team1Active)
        activeTeamName = team2;
      return score1 + "-" + score2 + "_" + activeTeamName;
    }
  }

    // String info;
    // Scoreboard game = new Scoreboard("Red", "Blue");
    // info = game.getScore(); 
    
    // game.recordPlay(1); 
    // info = game.getScore(); 
    
    // game.recordPlay(0); 
    // info = game.getScore(); 
    // info = game.getScore(); 
    
    // game.recordPlay(3); 
    // info = game.getScore(); 
    
    // game.recordPlay(1); 
    // game.recordPlay(0);
    // info = game.getScore();
    
    // game.recordPlay(0); 
    // game.recordPlay(4); 
    // game.recordPlay(0); 
    // info = game.getScore();
    
    // Scoreboard match =new Scoreboard("Lions", "Tigers");
    // info = match.getScore(); "0-0-Lions"
    // info = game.getScore(); 
  
}
