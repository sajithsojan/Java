public class ThrowKeyword {
  static ArithmeticException e;
  public static void main(String[] args) {
    // System.out.println(10/0);
    throw e;
  }
}
