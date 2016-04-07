package home.trial.ds;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDayOfWeek {
  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    c.add(Calendar.DATE, -1);
    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE");
    String dayOfWeek = dateFormat.format(c.getTime());
    System.out.println(dayOfWeek);
  }
}
