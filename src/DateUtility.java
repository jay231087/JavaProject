package com.geekofgeek.in;

import java.sql.Date;

public class DateUtility {
  
  public enum InvoiceProcessingCycle {
    sunday, monday, tuesday, wednesday, thursday, friday, saturday
  }
  
  public static void main(String[] args) {
    Date dt = new java.sql.Date(new java.util.Date().getTime());
    @SuppressWarnings("deprecation")
    int month = dt.getMonth();
    Date dt1 = new java.sql.Date(new java.util.Date().getTime() + 24*60*60*1000);
    @SuppressWarnings("deprecation")
    int month1 = dt1.getMonth();
    System.out.println(month+ "sdsds" + month1);
  }
}
