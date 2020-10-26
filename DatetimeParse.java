/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.time.LocalDateTime;

/**
 * 
 * @author mrithunjaykumar
 * @date 31-Mar-2020
 *
 */
public class DatetimeParse {
  
  public static void main(String[] args) {   
   String ingressCreatedDate = "2020-01-23";
   String ingressLastUpdatedDate = "2020-02-23";
   String ingressLastUpdatedDateTime = ingressLastUpdatedDate+"T00:00:00";
   String ingressCreatedDateTime = ingressCreatedDate+"T00:00:00";
   LocalDateTime ldt1 = java.time.LocalDateTime.parse(ingressCreatedDate);
   LocalDateTime ldt2 = java.time.LocalDateTime.parse(ingressLastUpdatedDate);
   System.out.println(ldt1);
   System.out.println(ldt2);
  }

}
