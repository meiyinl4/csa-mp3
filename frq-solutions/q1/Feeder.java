public class Feeder {
  private int currentFood;

  public Feeder(int f) {
    currentFood = f;
  }

  public void simulateOneDay(int numBirds) {
    boolean normal = (int) (Math.random() * 100 + 1) <= 95;
    if (normal) {
      int gramsEaten = (int) (Math.random() * (50 - 10 + 1) + 10);
      int totalEaten = gramsEaten * numBirds;
      if (totalEaten > currentFood) {
        currentFood = 0;
      } else {
        currentFood -= totalEaten;
      }
    } else {
      currentFood = 0;
    }
  }

  public int getCurrentFood() {
    return currentFood;
  }
}

