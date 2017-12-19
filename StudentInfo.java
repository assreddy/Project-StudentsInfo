package ToPushGitHUb.ToPUsh.Students;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

class ParentsInfo{
  String p_name;
  String p_occupation;
  int p_phone;

  public static ArrayList<ParentsInfo> parentArrayList = new ArrayList<ParentsInfo>();

  ParentsInfo(String pname, String poccupation, int pphone){
    p_name = pname;
    p_occupation = poccupation;
    p_phone = pphone;
  }

  public String getParentName() {
    return p_name;
  }

  public  String getParentOccupation() {
    return p_occupation;

  }
  public int getParentPhoneNo() {
    return p_phone;
  }

  public String getPrintParentinfo() {
    return " Parent Name " +p_name + ", Parent Occupation: " +p_occupation +
        ", Parent Contact Number" +p_phone;
  }
  public void addParentInfo(String p_name, String p_occupation, int p_phone ) {
    ParentsInfo parent = new ParentsInfo(p_name,p_occupation,p_phone);
    parentArrayList.add(parent) ;
  }
}

public class StudentsInfo extends ParentsInfo{

  static
  {
    System.out.println("Student Front Office Information System");
    System.out.println("=============================================================");
    System.out.println("1). ADD");
    System.out.println("2). DELETE");
    System.out.println("3). MODIFY");
    System.out.println("4). READ");
    System.out.println("5). EXIT");
    System.out.println("Choose One of Option above....... ");
    System.out.println("=============================================================");
  }
  private int m_no;
  private String m_name;
  private String m_section;

  public static ArrayList<StudentsInfo> studentsInfo = new ArrayList<StudentsInfo>();

  public StudentsInfo(int no, String name, String section, String pname, 
      String poccupation, int pphone){
    super(pname, poccupation, pphone);
    m_no = no;    
    m_name = name;
    m_section = section;
  }

  // Get Student Number.
  public int getStudentNo() {
    return m_no;
  }

  // Get Student Name.
  public String getStudentName() {
    return m_name;
  }

  // Get Student section.
  public String getstudentsInfoection() {
    return m_section;
  }

  // Format to Print Student INFO.
  public String toStringstudentsInfo() {
    return "Student Info:"+ "S No: " +m_no+ ", Name: "+m_name+", Section:"+m_section+"\n"+    
        "Parents Info : "+ "Parent Name " +p_name + ", Parent Occupation: " +p_occupation +
        ", Parent Contact Number" +p_phone ;
  }

  //Get all studentsInfo information based on Class Section.
  public static void getstudentsInfoFromSection(String section) {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    while(lt.hasNext()) {
      StudentsInfo s = lt.next();
      if (s.getstudentsInfoection() == section) {
        System.out.printf("Getting all Student with Section %s \n", section);
      }
    }
  }

  // Add single Student information at a time.
  public static void addNewStudentsInfo(int no, String name, String section,String pname,
      String poccupation,int pphone){
    StudentsInfo student = new StudentsInfo(no,name,section,pname,poccupation,pphone);
    studentsInfo.add(student);
  }

  // Delete Any Student Information.
  public static void deleteStudent(int sno) {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    StudentsInfo s = lt.next();
    if (s.getStudentNo() == sno) {
      System.out.printf("Student Details to Delete '%s' \n", sno);
      studentsInfo.remove(s);
    }
  }

  // Delete all studentsInfo Information.
  public static void deleteAllStudens() {
    studentsInfo.removeAll(studentsInfo);
  }
  // Get any student information.
  public static void getStudent(int sno) {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    StudentsInfo s = lt.next();
    if (s.getStudentNo() == sno) {
      System.out.printf("Student Get NNN ONLY '%s' \n", sno);
      System.out.println(s);
    }
  }

  // Get All student information.
  public static void printstudentsInfoAll() {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    
    while(lt.hasNext()) {
      StudentsInfo s = lt.next();
      System.out.println(s.toStringstudentsInfo());
    }
  }

  public static void main(String[] args) {
    int choice = 0;
    Scanner inputKey = new Scanner(System.in);

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
          System.out.println("Parent Name = "); 
          String pname_key = inputKey.next();
          System.out.println("Parent Occupation = "); 
          String poccupation_key = inputKey.next();
          System.out.println("Parent Phone = "); 
          int pphone_key = inputKey.nextInt();
          // addParentInfo(pname_key,poccupation_key,pphone_key,pphone_key);
          addNewStudentsInfo(no_key,name_key,section_key,pname_key,poccupation_key,pphone_key);
          System.out.println("After Adding Existing Studends Info...");
          
          printstudentsInfoAll();
          System.out.println("If you want add another student you can add then enter one 1(ADD).");
          break;
        case 2 : 
          System.out.println("Your's Choice DELETE");
          System.out.println("Student NO To delete = ");
          // TODO when deleted 2nd student it still shows both the studentsInfo.
          int del_Sno = inputKey.nextInt();
          deleteStudent(del_Sno);
          System.out.println("After Deleting Existing Studends Info...");
          printstudentsInfoAll();
          break;
        case 3 : 
          System.out.println("Your's Choice MODIFY");
          // TODO LIST
          break;
        case 4 : 
          System.out.println("Your's Choice RETRIVE");
          printstudentsInfoAll();

          break;
        case 5 : 
          System.out.println("Your's Choice EXIT");
          break;
        default : 
          System.out.printf("Your's NOT Selected Any Option");  
      }
    } while(choice < 5);
    inputKey.close();
    System.out.println("All Student Information");
    System.out.println("****************************************************");
    printstudentsInfoAll();
    System.out.println("*****************END of the program ****************");
  }

}


public class StudentInfo {}
