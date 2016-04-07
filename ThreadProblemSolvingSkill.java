package home.trial.ds;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.commons.lang.StringUtils;

public class ThreadProblemSolvingSkill {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      new Thread(new MyMainClass(i)).start();
    }
  }
}

class MyMainClass implements Runnable {
  
  public Integer lineToRead = null;

  public MyMainClass(int lineNumber) {
    this.lineToRead = lineNumber;    
  }

  public void run() {
    try {
      read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void read() throws IOException {
    int lineSum = 0;
    LineNumberReader lineNumberReader = null;
    try {
      lineNumberReader = new LineNumberReader(new FileReader("C:/Users/kmritunjay/Desktop/number.txt"));
      lineNumberReader.setLineNumber(lineToRead);
      String actualLine = lineNumberReader.readLine();
      String [] numbers = actualLine.split(" ");
      for(int j =0; j< numbers.length ; j++){
        if(numbers[j] != null && numbers[j]!="" && StringUtils.isNumeric(numbers[j])){
          lineSum += Integer.parseInt(numbers[j]);
        }
      }
      write(lineSum);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void write(int lineSum) {
    Writer writer = null;
    try {
      writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/kmritunjay/Desktop/numberresult.txt"), "utf-8"));
      writer.write(lineSum);
    } catch (IOException ex) {
    } finally {
      try {
        writer.close();
      } catch (Exception ex) {
      }
    }
  }
}
