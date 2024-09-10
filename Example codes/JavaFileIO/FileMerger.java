/*Program to Merge two files */
import java.io.*;
public class FileMerger {

  public static void main(String[] args) throws IOException {
    
    // File f1 = new File("File1.txt");
    // File f2 = new File("File2.txt");
    File f3 = new File("File3.txt");
    // FileWriter fw1 = new FileWriter(f1);
    // FileWriter fw2 = new FileWriter(f2);
    // // FileWriter fw3 = new FileWriter(f3,true);
    // f1.createNewFile();
    // f2.createNewFile();
    // PrintWriter pw1 = new PrintWriter(fw1);
    // pw1.println("AAA");
    // pw1.println("BBB");
    // pw1.println("CCC");
    // pw1.flush();
    // pw1.close();

    // PrintWriter pw2 = new PrintWriter(fw2);
    // pw2.println(111);
    // pw2.println(222);
    // pw2.println(333);
    // pw2.flush();
    // pw2.close();

    PrintWriter pw3 = new PrintWriter(f3);
    BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
    String line = br.readLine();
    while(line != null)
    {
      pw3.println(line);
      line = br.readLine();
    }

    br = new BufferedReader(new FileReader("File2.txt"));
    line = br.readLine();
    while(line != null)
    {
      pw3.println(line);
      line = br.readLine();
    }

    pw3.flush();
    br.close();
    pw3.close();


  }
}