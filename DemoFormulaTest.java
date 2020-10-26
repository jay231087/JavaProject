/*
 * Copyright (c) 2020 Operative. All Rights Reserved. THE AUTHOR MAKES NO REPRESENTATIONS OR
 * WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT. THE AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author mrithunjaykumar
 * @date 10-Jun-2020
 *
 */
public class DemoFormulaTest {

  public static void main(String[] args) {
    List<String> demoIdsFromDemoFormula = getDemoIdsFromDemoFormula("[D1]+[D2]+[D6]");
    String output = demoIdsFromDemoFormula.stream().collect(Collectors.joining(","));
    System.out.println(output);
  }

  private static List<String> getDemoIdsFromDemoFormula(final String formula) {
    final String[] demoArray = formula.substring(1, formula.length() - 1).split("]");
    final List<String> demoIdsFromDemoFormula = new ArrayList<>();
    for (final String associatedDemoId : Arrays.asList(demoArray)) {
      final String associatedDemo = associatedDemoId.replace("+[", "");
      demoIdsFromDemoFormula.add(associatedDemo);
    }
    return demoIdsFromDemoFormula;
  }

}
