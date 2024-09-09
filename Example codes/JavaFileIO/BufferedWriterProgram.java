import java.io.*;
import java.io.IOException;

public class BufferedWriterProgram {
  public static void main(String[] args) throws IOException
  {
    FileWriter fw = new FileWriter("abc.txt");

    BufferedWriter bw = new BufferedWriter(fw);

    bw.write('a');
    bw.write("Hello");
    bw.write(10);
    char[] ch = {'a','d'};
    bw.write(ch);
    bw.flush();
    bw.close();    
  }
  
}
