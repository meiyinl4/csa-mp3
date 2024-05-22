public class Main {
  public static void main(String[] args) {
    System.out.println("q1");
    Feeder f1 = new Feeder(500);
    System.out.println(f1.getCurrentFood());
    f1.simulateOneDay(12);
    System.out.println(f1.getCurrentFood());
  }

  
}
