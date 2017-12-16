import java.util.*;

public class StudentInfo {
  private int m_no;
  private String m_name;
  private String m_section;

  public static ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();

  public StudentInfo(int no, String name, String section){

    this.m_no = no;    
    this.m_name = name;
    this.m_section = section;
  }

  // Get Student Number.
  public int getNo() {
    return m_no;
  }

  // Get Student Name.
  public String getName() {
    return m_name;
  }

  // Get Student section.
  public String getSection() {
    return m_section;
  }

  // @Override
  // Format to Print Student INFO.
  public String toStringStudents() {
    return "S No: " +m_no + ", Name: " + m_name +", Section:" + m_section + "\n";
  }

  //Get all students information based on Class Section.
  public static void getStudentsFromSection(String section) {
    ListIterator<StudentInfo> lt = students.listIterator();
    while(lt.hasNext()) {
      StudentInfo s = lt.next();
      if (s.getSection() == section) {
        System.out.printf("Getting all Student with Section %s \n", section);
      }
    }
  }

  // Add single Student information at a time.
  public static void addNewStudentInfo(int no, String name, String section){
    StudentInfo student = new StudentInfo(no,name,section);
    students.add(student);
  }

  // Delete Any Student Information.
  public static void deleteStudent(int sno) {
    ListIterator<StudentInfo> lt = students.listIterator();
    StudentInfo s = lt.next();
    if (s.getNo() == sno) {
      System.out.printf("Student Details to Delete '%s' \n", sno);
      students.remove(s);
    }
  }

  // Delete all Students Information.
  public static void deleteAllStudens() {
    students.removeAll(students);
  }
  // Get any student information.
  public static void getStudent(int sno) {
    ListIterator<StudentInfo> lt = students.listIterator();
    StudentInfo s = lt.next();
    if (s.getNo() == sno) {
      System.out.printf("Student Get NNN ONLY '%s' \n", sno);
      System.out.println(s);
    }
  }

  // Get All student information.
  public static void printStudentsAll() {
    ListIterator<StudentInfo> lt = students.listIterator();
    while(lt.hasNext()) {
      StudentInfo s = lt.next();
      System.out.println(s.toStringStudents());
    }
  }

  public static void main(String[] args) {
    int choice = 0;
    Scanner inputKey = new Scanner(System.in);

    System.out.println("Student Front Office Information System");
    System.out.println("=============================================================");
    System.out.println("1). ADD");
    System.out.println("2). DELETE");
    System.out.println("3). MODIFY");
    System.out.println("4). READ");
    System.out.println("5). EXIT");
    System.out.println("Choose One of Option above....... ");
    do {
      choice = inputKey.nextInt();
      switch(choice) {
        case 1 : 
          System.out.println("Pease Enter Student Info");
          System.out.println("Number = ");
          int no_key = inputKey.nextInt();
          System.out.println("Name = ");
          String name_key = inputKey.next();
          System.out.println("Section = "); 
          String section_key = inputKey.next();
          addNewStudentInfo(no_key,name_key,section_key);
          System.out.println("After Adding Existing Studends Info...");
          printStudentsAll();
          System.out.println("If you want add another student you can add then enter one 1(ADD).");
          break;
        case 2 : 
          System.out.println("Your's Choice DELETE");
          System.out.println("Student NO To delete = ");
          // TODO when deleted 2nd student it still shows both the students.
          int del_Sno = inputKey.nextInt();
          deleteStudent(del_Sno);
          System.out.println("After Deleting Existing Studends Info...");
          printStudentsAll();
          break;
        case 3 : 
          System.out.println("Your's Choice MODIFY");
          // TODO LIST
          break;
        case 4 : 
          System.out.println("Your's Choice RETRIVE");
          printStudentsAll();

          break;
        case 5 : 
          System.out.println("Your's Choice EXIT");
          break;
        default : 
          System.out.printf("Your's NOT Selected Any Option");  
      }
    } while(choice < 5);
    System.out.println("All Student Information");
    System.out.println("****************************************************");
    printStudentsAll();
    System.out.println("*****************END of the program ****************");

  }

}
