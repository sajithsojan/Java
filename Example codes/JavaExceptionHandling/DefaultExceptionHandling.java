
/*
1. If an exception raised inside any method then that method is responsible to 
    create Exception object with the following information. 
    1. Name of the exception.
    2. Description of the exception.
    3. Location of the exception.(StackTrace)

2. After creating that Exception object, the method handovers that object to the 
JVM.

3. JVM checks whether the method contains any exception handling code or not. If 
method won't contain any handling code then JVM terminates that method 
abnormally and removes corresponding entry form the stack.

4. JVM identifies the caller method and checks whether the caller method contain 
any handling code or not. If the caller method also does not contain handling 
code then JVM terminates that caller method also abnormally and removes 
corresponding entry from the stack.

5. This process will be continued until main() method and if the main() method also 
doesn't contain any exception handling code then JVM terminates main() 
method also and removes corresponding entry from the stack.

6. Then JVM handovers the responsibility of exception handling to the default 
exception handler.

7. Default exception handler just print exception information to the console in the 
following format and terminates the program abnormally.
Exception in thread “xxx(main)” Name of exception: description 
Location of exception (stack trace)


 */


class DefaultExceptionHandling {
  public static void main(String[] args) {
   doStuff(); 
  }
  public static void doStuff(){
    doMoreStuff();
  }
  public static void doMoreStuff(){
    System.out.println(10/0);
  }
}
