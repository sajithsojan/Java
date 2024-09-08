
 class  Student{

  int i;

  Student(int i)
  {
    this.i = i;
  }

  // public String toString()
  // {
  //   return i+ "";
  // }

  public int hashCode()
  {
    return i;
  }
  
}

public class HashCodeProgram {
  public static void main(String[] args) {
    
    Student s1 = new Student(10);
    Student s2 = new Student(250);

    System.out.println(s1);
    System.out.println(s2);
  }
}
