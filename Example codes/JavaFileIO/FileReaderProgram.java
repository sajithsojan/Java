/*
FileReader:
By using FileReader object we can read character data from the file. 

Constructors:

FileReaderfr=new FileReader(String name); 
FileReaderfr=new FileReader (File f); 

Methods:

int read();
It attempts to read next character from the file and return its Unicode value. If 
the next character is not available then we will get -1. 

*/


import java.io.*;

public class FileReaderProgram {
  public static void main(String[] args) throws IOException
  {
    File f = new File("abc.txt");

    FileReader fr = new FileReader(f);

    int i = fr.read();

    while (i != -1)
    {
      System.out.print((char)i);
      i = fr.read();      
    }
    fr.close();

    FileReader fr1 = new FileReader(f);
    char[] ch = new char[(int)f.length()];
    fr1.read(ch);
    for(char ch1 : ch)
    {
      System.out.print(ch1);
    }
fr1.close();
  }
}
