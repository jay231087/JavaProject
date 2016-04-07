package home.trial.ds;

public class Doubleton2 {
  private static Doubleton2 instance1;
  private static Doubleton2 instance2;
  private String name;
  private double weight;
  private float length;

  private Doubleton2(String name, double weight, float length) {
    this.name = name;
    this.weight = weight;
    this.length = length;
  }

  public static Doubleton2 getInstance() {
    if (instance1 == null) {
      instance1 = new Doubleton2("Cheetah", 120, 5.5f);
      return instance1;
    } else if (instance2 == null) {
      instance2 = new Doubleton2("Elephant", 300, 7.2f);
      return instance2;
    } else {
      if (Math.random() < 0.5) {
        return instance1;
      } else {
        return instance2;
      }
    }
  }

  @Override
  public String toString() {
    return "Doubleton2 [name=" + name + ", weight=" + weight + ", length=" + length + "]";
  }
}