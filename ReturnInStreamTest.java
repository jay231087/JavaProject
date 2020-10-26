/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;
import org.springframework.util.CollectionUtils;

/**
 * 
 * @author mrithunjaykumar
 * @date 07-Oct-2020
 *
 */
public class ReturnInStreamTest {
  public static void main(String[] args) {
    Integer batchSize = 15;
    Map<String,List<String>> inputMap = new HashMap<>(); 
    List<String> childList2 = new ArrayList<>();
    childList2.add("bb");
    childList2.add("bbb");
    childList2.add("bbbb");
    inputMap.put("b", childList2);
    List<String> childList1 = new ArrayList<>();
    childList1.add("aa");
    childList1.add("aaa");
    childList1.add("aaaa");
    childList1.add("aaaaa");
    childList1.add("aa1");
    childList1.add("aaa2");
    childList1.add("aaaa3");
    childList1.add("aaaaa4");
    childList1.add("aa9");
    childList1.add("aaa10");
    childList1.add("aaaa11");
    childList1.add("aaaaa12");
    childList1.add("aa13");
    childList1.add("aaa14");
    childList1.add("aaaa15");
    childList1.add("aaaaa16");
    inputMap.put("a", childList1);  
    List<String> childList3 = new ArrayList<>();
    childList3.add("cc");
    childList3.add("ccc");
    childList3.add("cccc");
    childList3.add("ccccc");
    inputMap.put("c", childList3);   
    List<String> childList4 = new ArrayList<>();
    childList4.add("dd");
    childList4.add("ddd");
    childList4.add("dddd");
    childList4.add("ddddd");
    inputMap.put("d", childList4);
    List<String> childList5 = new ArrayList<>();
    childList5.add("ee");
    childList5.add("eee");
    childList5.add("eeee");
    childList5.add("eeeee");
    childList5.add("eeeeee");
    childList5.add("eeeeeee");
    childList5.add("eeeeeeee");
    childList5.add("eeeeeeeee");
    inputMap.put("e", childList5);
    List<List<String>> partitions = new ArrayList<>();
    Map<Integer,List<String>> multipleParentAndChildRatecardLinesInSameBatch = new HashMap<>();
    multipleParentAndChildRatecardLinesInSameBatch.put(batchSize, new ArrayList<>());
    if (!MapUtils.isEmpty(inputMap)) {
      inputMap.forEach((parentChar, childString) -> {
        List<String> batchedRatecardLines = new ArrayList<>();
        Boolean predicateResult = Arrays.asList("a", "b").stream()
            .anyMatch(inputParentChar -> parentChar.equals(inputParentChar));
        if (!predicateResult) {
          batchedRatecardLines.add(parentChar);
        }
        if (!CollectionUtils.isEmpty(childString)) {
          batchedRatecardLines.addAll(childString);
        }
        int mergedBatchSize = multipleParentAndChildRatecardLinesInSameBatch.get(batchSize).size();
        if ((mergedBatchSize + batchedRatecardLines.size()) <= batchSize) {
          multipleParentAndChildRatecardLinesInSameBatch.get(batchSize)
              .addAll(batchedRatecardLines);
          return;
        }
        if ((mergedBatchSize + batchedRatecardLines.size()) > batchSize) {
          partitions.add(multipleParentAndChildRatecardLinesInSameBatch.get(batchSize));
          multipleParentAndChildRatecardLinesInSameBatch.put(batchSize, batchedRatecardLines);
        }
      });
      partitions.add(multipleParentAndChildRatecardLinesInSameBatch.get(batchSize));
    }
    partitions.stream().forEach(batchedRCLines->{     
      if (!CollectionUtils.isEmpty(batchedRCLines)) {
        System.out.println("Number of objects in a batch "
            + batchedRCLines.size());
      }
    });
  }
}
