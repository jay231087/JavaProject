package home.trial.ds;

public class Doubleton1 {
  private static final Doubleton1 instances[] = new Doubleton1[2];
  private static int index;
  private String name;
  private double weight;
  private float length;
  static {
    instances[0] = new Doubleton1("Tiger", 95, 5.5f);
    instances[1] = new Doubleton1("Lion", 85, 5.2f);
  }

  private Doubleton1(String name, double weight, float length) {
    this.name = name;
    this.weight = weight;
    this.length = length;
  }

  public static Doubleton1 getInstance() {
    return instances[(index++) % 2];
  }

  @Override
  public String toString() {
    return "Doubleton1 [name=" + name + ", weight=" + weight + ", length=" + length + "]";
  }
}
