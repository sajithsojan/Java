public class StringBufferProgram {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());
    sb.append("abcdefghijklmnop");
    System.out.println("The length is :"+sb.length());
    System.out.println(sb.capacity());

    sb.append("q");
    System.out.println(sb.capacity());
    System.out.println("The length is :"+sb.length());

    StringBuffer sb1 = new StringBuffer("hello");

    System.out.println(sb1.capacity());

    System.out.println(sb1.charAt(4));

  sb1.setCharAt(0, 'H');
  System.out.println(sb1);

  sb1.insert(0, 1);
  System.out.println(sb1);

  sb1.deleteCharAt(0);
  System.out.println(sb1);
  sb1.delete(0, 3);
  System.out.println(sb1);

  StringBuffer sb2 = new StringBuffer("malayalam");
  sb2.reverse();
  System.out.println(sb2);

  StringBuffer sb3 = new StringBuffer("HelloWorld");
  System.out.println(sb3);
  sb3.setLength(5);
  System.out.println(sb3);

  StringBuffer sb4 = new StringBuffer(100);
  System.out.println(sb4.capacity());
  
  StringBuffer sb5 = new StringBuffer();
  System.out.println(sb5.capacity());
  sb5.ensureCapacity(100);
  System.out.println(sb5.capacity());
  sb5.append("hellow");
  sb5.trimToSize();
  System.out.println(sb5.capacity());
  }
}
