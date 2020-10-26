/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import com.sintecmedia.ratecard.constant.RatecardConstant;

/**
 * 
 * @author mrithunjaykumar
 * @date 10-Jul-2020
 *
 */
public class UnitRateTest {
  public static void main(String[] args) {
    Double unitRate = (double) 12345;
    DecimalFormat format = new DecimalFormat();
    format.applyPattern("#");
    format.setRoundingMode(RoundingMode.HALF_UP);
    String formattedUnitRate = format.format(unitRate);
    String unitRateWholeNumber =
        formattedUnitRate.split(RatecardConstant.METRIC_SPLIT_REGEX)[0];
    Integer unitRateWholeNumberLength = unitRateWholeNumber.length();
    boolean val = true;
    Boolean boolVal = Boolean.valueOf(val);
    System.out.println(boolVal);
    System.out.println(unitRateWholeNumber);
    System.out.println(unitRateWholeNumberLength);
  }
}
