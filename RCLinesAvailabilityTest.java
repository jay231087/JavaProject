/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO REPRESENTATIONS OR
 * WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
 * NON-INFRINGEMENT. THE AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.util.CollectionUtils;
import com.sintecmedia.ratecard.dto.ProductRecordAvailability;
import com.sintecmedia.ratecard.dto.cablenet.CommercialTypePeriodFilterTO;
import com.sintecmedia.ratecard.util.KeyGeneratorUtil;

/**
 * 
 * @author mrithunjaykumar
 * @date 17-May-2020
 *
 */
public class RCLinesAvailabilityTest {

  public static void main(String[] args) {
    Map<String, CommercialTypePeriodFilterTO> productChannelvsCommTypesAndPeriodsMap =
        new HashMap();
    CommercialTypePeriodFilterTO commercialTypePeriodFilterTO = new CommercialTypePeriodFilterTO();
    Set<String> commTypeIds = new HashSet<>();
//    commTypeIds.add("commTypeId1");
//    commTypeIds.add("commTypeId2");
    Set<String> periodsIds = new HashSet<>();
//    periodsIds.add("periodId1");
//    periodsIds.add("periodId2");
    commercialTypePeriodFilterTO.setCommTypes(commTypeIds);
    commercialTypePeriodFilterTO.setPeriods(periodsIds);
    productChannelvsCommTypesAndPeriodsMap.put("product1channel1", commercialTypePeriodFilterTO);
    String key = KeyGeneratorUtil.getKeyByProductIdAndChannelId("product1", "channel1");
    List<String> commercialTypeIds = new ArrayList<>();
    commercialTypeIds.add("commTypeId1");
    commercialTypeIds.add("commTypeId2");
    List<String> periodIds = new ArrayList<>();
    periodIds.add("periodId1");
    periodIds.add("periodId2");
    if (!CollectionUtils.isEmpty(productChannelvsCommTypesAndPeriodsMap)) {
      Boolean isAllProductRecordsExists = productChannelvsCommTypesAndPeriodsMap.get(key) != null
          && !CollectionUtils.isEmpty(commercialTypeIds) && !CollectionUtils.isEmpty(periodIds)
              ? productChannelvsCommTypesAndPeriodsMap.get(key).getCommTypes()
                  .containsAll(commercialTypeIds)
                  && productChannelvsCommTypesAndPeriodsMap.get(key).getPeriods()
                      .containsAll(periodIds)
              : Boolean.FALSE;
      Boolean isProductRecordsPartiallyExists = !isAllProductRecordsExists
          && productChannelvsCommTypesAndPeriodsMap.get(key) != null
          && !CollectionUtils.isEmpty(commercialTypeIds) && !CollectionUtils.isEmpty(periodIds)
              ? CollectionUtils.containsAny(
                  productChannelvsCommTypesAndPeriodsMap.get(key).getCommTypes(), commercialTypeIds)
                  && CollectionUtils.containsAny(
                      productChannelvsCommTypesAndPeriodsMap.get(key).getPeriods(), periodIds)
              : Boolean.FALSE;
      Boolean isProductRecordsNotExists =
          !isAllProductRecordsExists && !isProductRecordsPartiallyExists;
      ProductRecordAvailability productRecordAvailability = new ProductRecordAvailability(
          isAllProductRecordsExists, isProductRecordsPartiallyExists, isProductRecordsNotExists);
      System.out.println(productRecordAvailability.getIsAllProductRecordsExists());
      System.out.println(productRecordAvailability.getIsProductRecordsPartiallyExists());
      System.out.println(productRecordAvailability.getIsProductRecordsNotExists());
    }
  }
}
