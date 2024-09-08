/*
 
By using FileWriter object we can write character data to the file. 

Constructors:

FileWriterfw=new FileWriter(String name);
FileWriterfw=new FileWriter(File f);

The above 2 constructors meant for overriding.
Instead of overriding if we want append operation then we should go for the following 2 
constructors.


FileWriterfw=new FileWriter(String name,boolean append);
FileWriterfw=new FileWriter(File f,boolean append);

If the specified physical file is not already available then these constructors will create 
that file.


Methods:
1. write(intch);
To write a single character to the file.
2. write(char[] ch);
To write an array of characters to the file.
3. write(String s);
To write a String to the file.
4. flush();
To give the guarantee the total data include last character also written to the file.
5. close();
To close the strea

 */


import java.io.*;

public class FileWriterProgram {
  public static void main(String[] args) throws IOException{
    FileWriter fw = new FileWriter("abc.txt");
    fw.write('a');
    char[] ch = {'b','c','d'};
    fw.write(ch);
    fw.write("\n");
    fw.write("Hello World");
    fw.flush();
    fw.close();

    FileWriter fw1 = new FileWriter("def.txt", true);
    fw1.write(2);
    fw1.write('a');
    fw1.write(ch);
    fw1.write("\n");
    fw1.write("Bye");
    fw1.flush();
    fw1.close();
  }
  
}
