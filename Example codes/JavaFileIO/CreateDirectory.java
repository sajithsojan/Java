import java.io.*;

public class CreateDirectory {
public static void main(String[] args) throws IOException
{
  File f = new File("Directory");   /*  in UNIX everything is a file, java "file IO" is based on UNIX operating system 
                                                hence in java also we can represent both files and directories by File object only. */
  f.mkdir();
System.out.println(f.exists());
File f1 = new File(f,"demo.txt");
f1.createNewFile();
System.out.println(f1.exists());
}
}
