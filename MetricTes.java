/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import com.sintecmedia.ratecard.constant.Metric;

/**
 * 
 * @author mrithunjaykumar
 * @date 07-Jul-2020
 *
 */
public class MetricTes {
  
  public static void main(String[] args) {
    String metric = "UE_National";
    Metric metricEnum = Metric.fromString(metric);
    String mrdFieldName = metricEnum.getMrdfieldName();
    System.out.println(mrdFieldName);
  }

}
