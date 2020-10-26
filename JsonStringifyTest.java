/*
 * Copyright (c) 2019 Operative. All Rights Reserved. THE AUTHOR MAKES NO
 * REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT. THE
 * AUTHOR SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT
 * OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 */
package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Paths;
import org.springframework.http.HttpStatus;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.sintecmedia.ratecard.exception.RatecardException;

/**
 * 
 * @author mrithunjaykumar
 * @date 25-Apr-2020
 *
 */
public class JsonStringifyTest {
  
  private final static ObjectMapper jacksonObjectMapper = new ObjectMapper();  
  
  public JsonStringifyTest() {
    jacksonObjectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    jacksonObjectMapper.registerModule(new JavaTimeModule());
    
//    byte[] resonseInBytes;
//    try {
//      resonseInBytes = jsonToSmile(jacksonObjectMapper.writeValueAsString(linearRatecardWorkspaceResponse));
//      File file = new File("D:\\compressedResonse.txt");
//      OutputStream os = new FileOutputStream(file);
//      os.write(resonseInBytes);
//    } catch (Exception e) {
//      logger.error("Some error occurred while compressing linear ratecard workspace response ", e);
//      throw new RatecardException(HttpStatus.UNPROCESSABLE_ENTITY,
//          "Some error occurred while compressing linear ratecard workspace response ");
//    }
  }

  
  public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, Exception {
    String stringiFyJson = getInputStreamFromFile("header_notification_ingest.json").toString();
    System.out.println(stringiFyJson);
  }
  
  public static InputStream getInputStreamFromFile(String filename) throws Exception {
    final InputStream is =
        new FileInputStream(Paths.get(ClassLoader.getSystemResource(filename).toURI()).toString());
    return is;
  }
}
