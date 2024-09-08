/*
 For every thread JVM will create a separate stack at the time of Thread creation. All 
method calls performed by that thread will be stored in that stack. Each entry in the 
stack is called "Activation record" (or) "stack frame".
After completing every method call JVM removes the corresponding entry from the 
stack. 
After completing all method calls JVM destroys the empty stack and terminates the 
program normally
 */
class RuntimeStackMechanismWithoutException {

  public static void main(String[] args) {
    doStuff();
  }
  public static void doStuff()
  {
    doMoreStuff();
  }
  public static void doMoreStuff() {
  System.out.println("Hello");
  }
}