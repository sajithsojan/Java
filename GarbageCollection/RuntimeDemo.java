import java.util.Date;
public class RuntimeDemo {
  public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
    System.out.println(r.totalMemory()); //totalMemory is used to get the total available memory
    System.out.println(r.freeMemory());  //freeMemory is used to get the available memory
    for(int i=0; i<10000; i++)
    {
      Date d = new Date();
      for(int j = i; j<10000; j+=2)
      {
        d = null;
      }
    }
    System.out.println(r.freeMemory()); 
    r.gc();                               // gc() is used to Request JVM for garbage collection
    System.out.println(r.freeMemory());

  }
}
