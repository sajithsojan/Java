

public class Sample {
  
public static void main(String[] args) {
  
  Thread t = new Thread(){

    public void run()
    {
      System.out.println("Inner class thread");
    }
  };
  t.start();

}
}
