import java.util.*;
public class StudentClass {

  /**
   * @param args
   */
  static int class_no; 
  private String class_name;
  private String class_teacher;
  private int total_students;

  public static ArrayList<StudentClass> classList =  new ArrayList<StudentClass>();
  // Student Class Instance. 
  {
    System.out.println("Folloging Information is Details of All Students");
  }

  // Static Block
  static
  {
    System.out.println("**********************************");
    System.out.println("All Class Information");
    System.out.println("**********************************");
  }

  public StudentClass(int cno, String cname, String cteacher, int c_total){

    class_no = cno;
    class_name = cname; // KG, 1G to 5G
    class_teacher = cteacher;
    total_students = c_total;

  }

  static int getClasssNumber () {
    return class_no;
  }

  static String getClassName() {
    return class_name;
  }   

  public String getClassTeacherName() {
    return class_teacher;
  }
  public int getTotalStudetns() {
    return total_students;
  }

  public String to_string() {
    return "Class NO " +class_no +", classs Name: " +class_name +", class Teacher : "
        +class_teacher +",  Total Students :" +total_students;

  }

  public static void main(String[] args) {
    // TODO(sreenivasa): Auto-generated method stub
    classList.add(new StudentClass(1,"kg", "kg1",21));
    classList.add(new StudentClass(2,"kg", "kg2",21));
    classList.add(new StudentClass(3,"kg", "kg2",21));
    StudentClass sc = new StudentClass(5,"kg", "kg2",21);
    
    ListIterator<StudentClass> iterator = classList.listIterator();
    while( iterator.hasNext()) {
      StudentClass classInfo = iterator.next();
      System.out.println("classInfo = " +classInfo.to_string());
      System.out.println(sc.getClassName());
      classInfo.get
    }
  }

}
