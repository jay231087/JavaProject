/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author mrithunjaykumar
 * @date 16-Oct-2019
 *
 */
public class DateAdjuster {

  public static void main(String[] args) {
    // Quarterly breakdown example
    LocalDate startDate = LocalDate.of(2019, 12, 31);
    LocalDate endDate = LocalDate.of(2020, 06, 28);
    int dayOfMonth = startDate.getDayOfMonth();
    System.out.println(dayOfMonth);
    LocalDate firstDayOfQuarter = startDate.with(startDate.getMonth().firstMonthOfQuarter())
        .with(TemporalAdjusters.firstDayOfMonth());
    int diffFirstDateQuarterly = 0;
    if (!firstDayOfQuarter.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
      diffFirstDateQuarterly = firstDayOfQuarter.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();
    }
    LocalDate firstDayQuarterlyResult = firstDayOfQuarter.minusDays(diffFirstDateQuarterly);
    LocalDate lastDayOfQuarter = endDate.with(endDate.getMonth().firstMonthOfQuarter()).plusMonths(2)
        .with(TemporalAdjusters.lastDayOfMonth());
    int diffLastDateQuarterly = 0;
    if (!lastDayOfQuarter.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
      diffLastDateQuarterly = 7 - (DayOfWeek.SUNDAY.getValue() - lastDayOfQuarter.getDayOfWeek().getValue());
    }
    LocalDate lastDayQuarterlyResult = lastDayOfQuarter.minusDays(diffLastDateQuarterly);
    System.out.println("Quarterly Result");
    System.out.println(firstDayQuarterlyResult);
    System.out.println(lastDayQuarterlyResult);
    // Monthly breakdown example
    LocalDate firstDayOfMonth = startDate.with(startDate.getMonth()).with(TemporalAdjusters.firstDayOfMonth());
    int diffFirstDateMonthly = 0;
    if (!firstDayOfMonth.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
      diffFirstDateMonthly = firstDayOfMonth.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue();
    }
    LocalDate firstDayMonthlyResult = firstDayOfMonth.minusDays(diffFirstDateMonthly);
    LocalDate lastDayOfMonth = endDate.with(endDate.getMonth()).with(TemporalAdjusters.lastDayOfMonth());
    int diffLastDateMonthly = 0;
    if (!lastDayOfMonth.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
      diffLastDateMonthly = 7 - (DayOfWeek.SUNDAY.getValue() - lastDayOfMonth.getDayOfWeek().getValue());
    }
    LocalDate lastDayMonthlyResult = lastDayOfMonth.minusDays(diffLastDateMonthly);
    System.out.println("Monthly Result");
    System.out.println(firstDayMonthlyResult);
    System.out.println(lastDayMonthlyResult);
    // Weekly breakdown example
    LocalDate firstDayOfWeekly = startDate.with(DayOfWeek.MONDAY);
    LocalDate lastDayOfWeekly = endDate.with(DayOfWeek.SUNDAY);
    System.out.println("Weekly Result");
    System.out.println(firstDayOfWeekly);
    System.out.println(lastDayOfWeekly);
  }

}
