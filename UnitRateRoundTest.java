/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import com.sintecmedia.ratecard.constant.Metric;
import com.sintecmedia.ratecard.constant.RatecardConstant;

/**
 * 
 * @author mrithunjaykumar
 * @date 26-Aug-2020
 *
 */
public class UnitRateRoundTest { 
  public static void main(String[] args) {
    Double d=truncateDecimal(new BigDecimal(304.5234), Metric.UNIT_RATE.getDisplayName(), new HashMap<String, Map<String,Integer>>());
    System.out.println(d);
  }
  
  protected static Double truncateDecimal(BigDecimal inputValue, String metricKey,
      Map<String, Map<String, Integer>> tenantDecimalSettings) {
    int decimalConfigValue = tenantDecimalSettings
        .getOrDefault(RatecardConstant.DECIMAL_NUMBER, new HashMap<String, Integer>())
        .getOrDefault(metricKey, RatecardConstant.DECIMAL_NUMBER_LIMIT);
    return inputValue.setScale(0, RoundingMode.HALF_UP).doubleValue();
  }

}
