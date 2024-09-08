/*
 
Customized Exception Handling by using try-catch:
->  It is highly recommended to handle exceptions.
->  In our program the code which may raise exception is called risky code, we have 
    to place risky code inside try block and the corresponding handling code inside
    catch block.

 */

public class ExceptionHandlingTryCatch{
 public static void main(String[] args) {
  
  System.err.println("Open Connection");
  try
  {
    System.out.println(10/0 + " reading data");
  }
  catch(ArithmeticException e)
  {
    System.out.println(10/2 + " Reading local data");
  }
  System.out.println("close connection");
 } 
}
