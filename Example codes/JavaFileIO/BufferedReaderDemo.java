/*

This is the most enhanced(better) Reader to read character data from the file. 
Constructors:

BufferedReaderbr=new BufferedReader(Reader r);
BufferedReaderbr=new BufferedReader(Reader r,intbuffersize); 

Note:BufferedReadercan not communicate directly with the File it should communicate 
via some Reader object.

The main advantage of BufferedReader over FileReader is we can read data line by line 
instead of character by character.

Methods:
1. int read();
2. int read(char[] ch);
3. String readLine(); 
It attempts to read next line and return it , from the File. if the next line is not 
available then this method returns null.
4. void close();

 */

import java.io.*;

public class BufferedReaderDemo {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("abc.txt");
    BufferedReader br = new BufferedReader(fr);

    String line = br.readLine();

    while(line != null)
    {
      System.out.println(line);
      line = br.readLine();
    }
    br.close();
    
  }
}
