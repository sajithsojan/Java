import java.io.*;

public class ListoutFolders {
  public static void main(String[] args) {
    int countFile = 0;
    int countDirectory = 0;
    File f = new File("D:\\");
    String[] s = f.list();
    for(String s1 : s)
    {
      File f1 = new File(f,s1);
      if(f1.isFile())
      {
        countFile++;
        System.out.println(s1);
      }
      else if(f1.isDirectory())
      {
        countDirectory++;
        System.out.println(s1);
      }
   
    }
    System.out.println("The total no pf files present is :" + countFile);
    System.out.println("The total no pf files present is :" + countDirectory);
  }
}
