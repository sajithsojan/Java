/*

File f=new File("abc.txt"); 
This line 1st checks whether abc.txt file is already available (or) not if it is already 
available then "f" simply refers that file.
If it is not already available then it won't create any physical file just creates a java File 
object represents name of the file

 */

import java.io.*;
public class CreateFileProgram {

  public static void main(String[] args) throws IOException
  {
    File f = new File("abc.txt");
    System.out.println(f.exists());
    f.createNewFile();/*  New File will be created on current working directory named with abc.txt */
    System.out.println(f.exists());
  }
}