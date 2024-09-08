/*

-> The way of handling an exception is varied from exception to exception. Hence for every 
exception type it is recommended to take a separate catch block. That is try with 
multiple catch blocks is possible and recommended to use. 

-> If try with multiple catch blocks present then order of catch blocks is very 
important. It should be from child to parent by mistake if we are taking from 
parent to child then we will get Compile time error saying 


 */

public class ExceptionHandlingWithMultipleCatchBlocks {
  public static void main(String[] args) {
    System.out.println(" Open DB Connection");

    try
    {
      System.out.println(10/0 + "Reading data");
    }
    // catch(Exception e)
    // {
    //   System.out.println(10/2 + " Reading local data");
    // }
    catch(ArithmeticException e)
    {
      System.out.println(10/2 + " Reading local data");
    }

    catch(Exception e)
    {
      System.out.println(10/2 + " Reading local data");
    }
  }
}
