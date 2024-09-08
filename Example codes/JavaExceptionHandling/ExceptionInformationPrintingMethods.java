
/*
 
Throwable class defines the following methods to print exception information to the 
console. 

-> printStackTrace():This method prints exception information in the following format. 
Name of the exception: description of exception 
Stack trace

-> toString(): This method prints exception information in the following format. 
Name of the exception: description of exception

-> getMessage(): This method returns only description of the exception. 
Description.

 */


public class ExceptionInformationPrintingMethods {
  public static void main(String[] args) {
    System.out.println("Open DB Connection");
    try {
      System.out.println(10/0 + " Reading Data ");
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.out.println();
      System.out.println(e);
    }
    System.out.println(" Closing connection");
  }
  
}
