class Student
{

  int roll;
  String name;

  Student(String name, int roll)
  {

    this.name = name;
    this.roll = roll;

  }

}

public class EqualsProgram {
  public static void main(String[] args) {
    
    Student s1 = new Student("sas",10);
    Student s2 = new Student("saj", 12);
    Student s3 = new Student("saj", 12);
    Student s4 = s1;
    System.out.println(s1.equals(s4));
    System.out.println(s2.equals(s4));
    System.out.println(s3.equals(s2));

  }
}
