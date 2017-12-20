import java.util.*;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentsInfo{

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
<<<<<<< HEAD
  private int studentNumber;
  private String studentName;
  private String studentSection;

  public static ArrayList<StudentsInfo> studentsInfo = new ArrayList<StudentsInfo>();

  
  public StudentsInfo(int no, String name, String section) {
    studentNumber = no;    
    studentName = name;
    studentSection = section;
  }
  
  // Get Student Number.
  public int getStudentNo() {
    return studentNumber;
=======
  private int m_no;
  private String m_name;
  private String m_section;

  public static ArrayList<StudentsInfo> studentsInfo = new ArrayList<StudentsInfo>();

  public StudentsInfo(int no, String name, String section) {
    m_no = no;    
    m_name = name;
    m_section = section;
  }

  // Get Student Number.
  public int getStudentNo() {
    return m_no;
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
  }

  // Get Student Name.
  public String getStudentName() {
<<<<<<< HEAD
    return studentName;
=======
    return m_name;
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
  }

  // Get Student section.
  public String getstudentsInfoection() {
<<<<<<< HEAD
    return studentSection;
=======
    return m_section;
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
  }

  // Format to Print Student INFO.
  public String toStringstudentsInfo() {
<<<<<<< HEAD
    return "Student Info:: Student Number: " +studentNumber+ ", Name: "+studentName+", Section: "+studentSection+"";        
=======
    return "Student Info:: S No: " +m_no+ ", Name: "+m_name+", Section: "+m_section+"";        
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
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
  public void addNewStudentsInfo(int no, String name, String section) {
    StudentsInfo student = new StudentsInfo(no,name,section);
    studentsInfo.add(student);
<<<<<<< HEAD
    
=======
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
  }

  // Delete Any Student Information.
  public static void deleteStudent(int sno) {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
<<<<<<< HEAD
    int pos = 1;

    
    while(lt.hasNext()) {
      if (pos > studentsInfo.size()) {            
        StudentsInfo s = lt.next();
        if (s.getStudentNo() == sno) {
          studentsInfo.remove(s);
          System.out.printf("Student '%s' Deleted Successfully.\n", sno);
        }  
      }
      else {
        System.out.println("Not Allowed to Students info empty.");
        break;
      }
    }
  }  

=======
    StudentsInfo s = lt.next();
    if (s.getStudentNo() == sno) {
      System.out.printf("Student Details to Delete '%s' \n", sno);
      studentsInfo.remove(s);
    }
  }
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf

  // Delete all studentsInfo Information.
  public static void deleteAllStudens() {
    studentsInfo.removeAll(studentsInfo);
  }
  // Get any student information.
  public static void getStudent(int sno) {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    StudentsInfo s = lt.next();
<<<<<<< HEAD
    while(lt.hasNext()) {
      if (s.getStudentNo() == sno) {
        System.out.printf("Student Get NNN ONLY '%s' \n", sno);
        System.out.println(s);  
      }
=======
    if (s.getStudentNo() == sno) {
      System.out.printf("Student Get NNN ONLY '%s' \n", sno);
      System.out.println(s);
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
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
<<<<<<< HEAD

=======
  
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
  public static void main(String[] args) {

    Scanner inputKey = new Scanner(System.in);
    int choice = 0;

    do {
      choice = inputKey.nextInt();
      switch(choice) {
        case 1 : 
          System.out.println("Please Enter Student Info");
<<<<<<< HEAD
          System.out.print("Student Number = ");
          int no_key = inputKey.nextInt();
          System.out.print("Student Name = ");
          String name_key = inputKey.next();
          System.out.print("Student Class Section = "); 
          String section_key = inputKey.next();
          System.out.print("Parent Name = "); 
          String pname_key = inputKey.next();
          System.out.print("Parent Occupation = "); 
          String poccupation_key = inputKey.next();
          System.out.print("Parent Phone = ");    
          int pphone_key = inputKey.nextInt();
          System.out.print("Bill Number = ");
          String bbill_key1 = inputKey.next();          
          System.out.print("Term Fee:");
          double bamount_key = inputKey.nextDouble();

          StudentsInfo students = new StudentsInfo(no_key,name_key,section_key);
          BillingInfo billing = new BillingInfo(no_key,bbill_key1,bamount_key);
          ParentsInfo parents = new ParentsInfo(no_key, pname_key,poccupation_key,pphone_key);

          students.addNewStudentsInfo(no_key,name_key,section_key);
          parents.addParentInfo(no_key,pname_key,poccupation_key,pphone_key);
          billing.addBillingInfo(no_key,bbill_key1,bamount_key);

          printstudentsInfoAll();
          parents.printPrentsInfoAll();
          billing.printBillingInfoAll(); 

          System.out.println("If you want add another student you can add then enter one 1(ADD).");
          break;
        case 2 : 
          // TODO when deleted 2nd student it still shows both the studentsInfo.
          System.out.println("Your's Choice DELETE");
  
          if(studentsInfo.size() > 0) {
            System.out.println("Please enter Student Number to delete= ");
            int del_Sno = inputKey.nextInt();
            deleteStudent(del_Sno);
            System.out.println("Existing Students Info...");
            printstudentsInfoAll();}
          else {
            System.out.println("No Students in the System. Please ADD");}
=======
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
          System.out.println("Bill Number = ");
          String bbill_key1 = inputKey.next();          
          System.out.println("Amount Paid = ");
          double bamount_key = inputKey.nextDouble();
          
          StudentsInfo students = new StudentsInfo(no_key,name_key,section_key);
          BillingInfo billing = new BillingInfo(bbill_key1,bamount_key);
          ParentsInfo parents = new ParentsInfo(pname_key,poccupation_key,pphone_key);
          
          students.addNewStudentsInfo(no_key,name_key,section_key);
          parents.addParentInfo(pname_key,poccupation_key,pphone_key);
          billing.addBillingInfo(bbill_key1,bamount_key);
          
          printstudentsInfoAll();
          parents.printPrentsInfoAll();
          billing.printBillingInfoAll(); 
          
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
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
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
<<<<<<< HEAD

=======
      
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
    } 
    while(choice < 5);
    inputKey.close();
    System.out.println("All Student Information");
    System.out.println("****************************************************");
    System.out.println("*****************END of the program ****************");
  }

}
