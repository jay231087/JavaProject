/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

/**
 * 
 * @author mrithunjaykumar
 * @date 04-Sep-2020
 *
 */
public class StringSubstringTest {
  
  public static void main(String[] args) {
    String rcLineKey = "5e72eb269e7b363fb9aaf21c5e622cb984fad70228450c07NpoMaUppQZWb9tk6Cp5bPA5ddd75707909549403a305c8dHkOX80ITw6rxU4ETApLMg";
    String ratecardId = rcLineKey.substring(0, 24);
    String productUniqueKey = rcLineKey.substring(24, rcLineKey.length());
    System.out.println(ratecardId);
    System.out.println(productUniqueKey);
  }

}
