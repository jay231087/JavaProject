import org.apache.commons.lang.StringEscapeUtils;

public class QuoteTest {

  public String splitTechnique(String text) {
    text = StringEscapeUtils.escapeCsv(text);
    return text;
  }

  public String splitTechniqueCustom(String test) {
    StringBuffer result = new StringBuffer();
    for (char c : test.toCharArray()) {
      if (c == '\"') {
        result.append("\"").append("\"");
      } else {
        result.append(c);
      }
    }
    test = result.toString();
    return test;
  }
}

class testQuote {
  public static void main(String[] args) {
    String str = "Test_\"Pr\"\"od1\",_st'd_0709',";
    QuoteTest qt2 = new QuoteTest();
    str = qt2.splitTechnique(str);
    System.out.println(str);
    String str1 = "Test_\"Pr\"\"od1\",_st'd_0709',";
    str = qt2.splitTechniqueCustom(str1);
    System.out.println(str);
  }
}
