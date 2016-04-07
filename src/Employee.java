import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Employee {

  private int id;
  private String name;
  private String address;
  private double salary;

  public Employee(int id, String name, String address, double salary) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.salary = salary;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "ID:" + getId() + ", Name:" + getName() + ", Address:" + getAddress() + ", Salary:" + getSalary();
  }
}

class Main {

  public static void main(String args[]) {
    Employee ts1 = new Employee (10, "Sam", "Paris", 200.0);
    Employee ts2 = new Employee (11, "Amal", "Berlin", 600.0);
    Employee ts3 = new Employee (12, "Nik", "London", 250.0);
    Employee ts4 = new Employee (10, "Sam", "Paris", 200.0);
    Employee ts5 = new Employee (14, "Jasmin", "Damas", 210.0);

    ArrayList<Employee> list = new ArrayList<Employee>();

    list.add(ts1);
    list.add(ts2);
    list.add(ts3);
    list.add(ts4);
    list.add(ts5);

    System.out.println("List");
    System.out.println("===================================================");
    for (int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }

    Set<Employee> set = new HashSet<Employee>();

    set.add(ts1);
    set.add(ts2);
    set.add(ts3);
    set.add(ts4);
    set.add(ts5);

    System.out.println("");
    System.out.println("Set");
    System.out.println("===================================================");
    for(Employee item: set){
      System.out.println(item);
    }
  }
}