/*
PrintWriter:
-> This is the most enhanced Writer to write text data to the file.
-> By using FileWriter and BufferedWriter we can write only character data to the 

File but by using PrintWriter we can write any type of data to the File.

Constructors:

PrintWriter pw=new PrintWriter(String name);
PrintWriter pw=new PrintWriter(File f);
PrintWriter pw=new PrintWriter(Writer w); 
PrintWriter can communicate either directly to the File or via some Writer object also.

Methods:

1. write(intch);
2. write (char[] ch);
3. write(String s);
4. flush();
5. close();
6. print(char ch);
7. print (int i);
8. print (double d);
9. print (boolean b);
10. print (String s);
11. println(char ch);
12. println (int i);
13. println(double d);
14. println(boolean b);
15. println(String s)

 */
import java.io.*;
public class PrintWriterDemo {
  public static void main(String[] args) throws IOException{
    File f = new File("abc.txt");
    FileWriter fw = new FileWriter("abc.txt");
    BufferedWriter bw = new BufferedWriter(fw); 
    PrintWriter pw1 = new PrintWriter("abc.txt"); //Can communicate directly with file
    PrintWriter pw2 = new PrintWriter(f); // Can communicate using file object
    PrintWriter pw3 = new PrintWriter(fw); // Can communicate with any writer object
    PrintWriter pw4 =new PrintWriter(bw);// Can communicate with any writer object

    pw1.write(100);
    pw2.print("Hello");
    pw3.println(100);
    pw4.println('h');

    pw1.flush();
    pw2.flush();
    pw3.flush();
    pw4.flush();

    pw1.close();
    pw2.close();
    pw3.close();
    pw4.close();
  }
}
