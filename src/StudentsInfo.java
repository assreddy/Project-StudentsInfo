import java.util.*;
<<<<<<< HEAD
=======
import java.util.ListIterator;
import java.util.Scanner;
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6

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
<<<<<<< HEAD
    System.out.println("=============================================================");
  }

  public int studentNumber;
  public String studentName;
  public String studentSection;
  public String parentName;
  public String parentOccupation;
  public int parentPhone;
  public String billNumber;
  public double termAmount;

  public static ArrayList<StudentsInfo> StudentsInfo = new ArrayList<StudentsInfo>();

  public StudentsInfo(int studentNumber, String studentName, String studentSection, String parentName,
      String parentOccupation, int parentPhone, String billNumber,  double termAmount) {
    this.studentNumber = studentNumber;    
    this.studentName = studentName;
    this.studentSection = studentSection;
    this.parentName = parentName;
    this.parentOccupation = parentOccupation;
    this.parentPhone = parentPhone;
    this.billNumber = billNumber;
    this.termAmount = termAmount;
  }

  /**
   * @return the parentName
   */
  public String getParentName() {
    return parentName;}

  /**
   * @param parentName the parentName to set
   */
  public void setParentName(String parentName) {
    this.parentName = parentName;}

  /**
   * @return the studentNumber
   */
  public int getStudentNumber() {
    return studentNumber;}

  /**
   * @param studentNumber the studentNumber to set
   */
  public void setStudentNumber(int studentNumber) {
    this.studentNumber = studentNumber;}

  /**
   * @return the studentName
   */
  public String getStudentName() {
    return studentName;}

  /**
   * @param studentName the studentNumber to set
   */
  public void setStudentName(String studentName) {
    this.studentName = studentName;}

  /**
   * @return the studentSection
   */
  public String getStudentSection() {
    return studentSection;}

  /**
   * @param studentSection the studentSection to set
   */
  public void setStudentSection(String studentSection) {
    this.studentSection = studentSection;}

  /**
   * @return the parentOccupation
   */
  public String getParentOccupation() {
    return parentOccupation;}


  /**
   * @param parentOccupation the parentOccupation to set
   */
  public void setParentOccupation(String parentOccupation) {
    this.parentOccupation = parentOccupation;}


  /**
   * @return the parentPhone
   */
  public int getParentPhone() {
    return parentPhone;}

  /**
   * @param parentPhone the parentPhone to set
   */
  public void setParentPhone(int parentPhone) {
    this.parentPhone = parentPhone;}

  /**
   * @return the billNumber
   */
  public String getBillNumber() {
    return billNumber;}


  /**
   * @param billNumber the billNumber to set
   */
  public void setBillNumber(String billNumber) {
    this.billNumber = billNumber;}

  /**
   * @return the termAmount
   */
  public double getTermAmount() {
    return termAmount;}


  /**
   * @param termAmount the termAmount to set
   */
  public void setTermAmount(double termAmount) {
    this.termAmount = termAmount;}
  // Format to Print Student INFO.
  public String toStringstudentsInfo() {
    return " " +studentNumber +"      "  +studentName +"     " +studentSection +"     "
        +parentName  +"        " +parentOccupation +"          " +parentPhone +"       " 
        +billNumber+"      "  +termAmount; 
  }

  //Get all StudentsInfo information based on Class Section.
  public static void getstudentsInfoFromSection(String section) {
    ListIterator<StudentsInfo> lt = StudentsInfo.listIterator();
    while(lt.hasNext()) {
      StudentsInfo s = lt.next();
      if (s.getStudentSection() == section) {
=======
    System.out.println("Choose One of Option above....... ");
    System.out.println("=============================================================");
  }
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
  }

  // Get Student Name.
  public String getStudentName() {
    return studentName;
  }

  // Get Student section.
  public String getstudentsInfoection() {
    return studentSection;
  }

  // Format to Print Student INFO.
  public String toStringstudentsInfo() {
    return "Student Info:: Student Number: " +studentNumber+ ", Name: "+studentName+", Section: "+studentSection+"";        
  }

  //Get all studentsInfo information based on Class Section.
  public static void getstudentsInfoFromSection(String section) {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    while(lt.hasNext()) {
      StudentsInfo s = lt.next();
      if (s.getstudentsInfoection() == section) {
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
        System.out.printf("Getting all Student with Section %s \n", section);
      }
    }
  }

  // Add single Student information at a time.
<<<<<<< HEAD
  public void addNewStudentsInfo(int studentNumber, String studentName, String studentSection, String parentName,
      String parentOccupation, int parentPhone, String billNumber,  double termAmount) {
    StudentsInfo student = new StudentsInfo(studentNumber,studentName,studentSection,parentName,parentOccupation,
        parentPhone,billNumber,termAmount);
    StudentsInfo.add(student);
=======
  public void addNewStudentsInfo(int no, String name, String section) {
    StudentsInfo student = new StudentsInfo(no,name,section);
    studentsInfo.add(student);
    
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
  }

  // Delete Any Student Information.
  public static void deleteStudent(int sno) {
<<<<<<< HEAD
    ListIterator<StudentsInfo> lt = StudentsInfo.listIterator();
    int pos = 1;
    while(lt.hasNext()) {
      if (pos < StudentsInfo.size()) {            
        StudentsInfo s = lt.next();
        if (s.getStudentNumber() == sno) {
          StudentsInfo.remove(s);
=======
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    int pos = 1;

    
    while(lt.hasNext()) {
      if (pos > studentsInfo.size()) {            
        StudentsInfo s = lt.next();
        if (s.getStudentNo() == sno) {
          studentsInfo.remove(s);
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
          System.out.printf("Student '%s' Deleted Successfully.\n", sno);
        }  
      }
      else {
        System.out.println("Not Allowed to Students info empty.");
        break;
      }
    }
  }  

<<<<<<< HEAD
  // Delete all StudentsInfo Information.
  public static void deleteAllStudens() {
    StudentsInfo.removeAll(StudentsInfo);
  }
  // Get any student information.
  public static void getStudent(int sno) {
    ListIterator<StudentsInfo> lt = StudentsInfo.listIterator();
    StudentsInfo s = lt.next();
    while(lt.hasNext()) {
      if (s.getStudentNumber() == sno) {
=======

  // Delete all studentsInfo Information.
  public static void deleteAllStudens() {
    studentsInfo.removeAll(studentsInfo);
  }
  // Get any student information.
  public static void getStudent(int sno) {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
    StudentsInfo s = lt.next();
    while(lt.hasNext()) {
      if (s.getStudentNo() == sno) {
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
        System.out.printf("Student Get NNN ONLY '%s' \n", sno);
        System.out.println(s);  
      }
    }
  }

  // Get All student information.
<<<<<<< HEAD
  public void printstudentsInfoAll() {
    ListIterator<StudentsInfo> lt = StudentsInfo.listIterator();
=======
  public static void printstudentsInfoAll() {
    ListIterator<StudentsInfo> lt = studentsInfo.listIterator();
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
    while(lt.hasNext()) {
      StudentsInfo s = lt.next();
      System.out.println(s.toStringstudentsInfo());
    }
  }

  public static void main(String[] args) {
<<<<<<< HEAD
    StudentsInfo students = new StudentsInfo(10,"Sudent1","Section1","Parent1","Occ1",1,"B1", 100);
    students.addNewStudentsInfo(1,"Sudent1","Section1","Parent1","Occ1",1,"B1", 100);
    students.addNewStudentsInfo(2,"Sudent2","Section2","Parent2","Occ2",2,"B2", 200);
    System.out.println("Existing Students Info::");
    System.out.println("S.NO  |   Name  |   Section |  Parent Name |  Occupation | Phone | B.NO | Term Amount");
    students.printstudentsInfoAll();

    System.out.println("Choose One of Option above....... ");
=======
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6

    Scanner inputKey = new Scanner(System.in);
    int choice = 0;

    do {
      choice = inputKey.nextInt();
      switch(choice) {
        case 1 : 
          System.out.println("Please Enter Student Info");
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

<<<<<<< HEAD
          students.addNewStudentsInfo(no_key,name_key,section_key,pname_key,poccupation_key,pphone_key,bbill_key1,bamount_key);
          students.printstudentsInfoAll();
=======
          StudentsInfo students = new StudentsInfo(no_key,name_key,section_key);
          BillingInfo billing = new BillingInfo(no_key,bbill_key1,bamount_key);
          ParentsInfo parents = new ParentsInfo(no_key, pname_key,poccupation_key,pphone_key);

          students.addNewStudentsInfo(no_key,name_key,section_key);
          parents.addParentInfo(no_key,pname_key,poccupation_key,pphone_key);
          billing.addBillingInfo(no_key,bbill_key1,bamount_key);

          printstudentsInfoAll();
          parents.printPrentsInfoAll();
          billing.printBillingInfoAll(); 
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6

          System.out.println("If you want add another student you can add then enter one 1(ADD).");
          break;
        case 2 : 
<<<<<<< HEAD
          // TODO
          System.out.println("Your's Choice DELETE");
          if(StudentsInfo.size() > 0) {
=======
          // TODO when deleted 2nd student it still shows both the studentsInfo.
          System.out.println("Your's Choice DELETE");
  
          if(studentsInfo.size() > 0) {
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
            System.out.println("Please enter Student Number to delete= ");
            int del_Sno = inputKey.nextInt();
            deleteStudent(del_Sno);
            System.out.println("Existing Students Info...");
<<<<<<< HEAD
            students.printstudentsInfoAll();}
=======
            printstudentsInfoAll();}
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
          else {
            System.out.println("No Students in the System. Please ADD");}
          break;
        case 3 : 
          System.out.println("Your's Choice MODIFY");
<<<<<<< HEAD
          // TODO
          break;
        case 4 : 
          System.out.println("Your's Choice RETRIVE");
          students.printstudentsInfoAll();
=======
          // TODO LIST
          break;
        case 4 : 
          System.out.println("Your's Choice RETRIVE");
          printstudentsInfoAll();

>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
          break;
        case 5 : 
          System.out.println("Your's Choice EXIT");
          break;
        default : 
          System.out.printf("Your's NOT Selected Any Option");  
<<<<<<< HEAD
      }
    } 
    while(choice < 5);
    inputKey.close();
    System.out.println("************************** Final STUDETNS INFORMATION **************************");
    students.printstudentsInfoAll();
    System.out.println("****************************END of the program**********************************");
  }
=======

      }

    } 
    while(choice < 5);
    inputKey.close();
    System.out.println("All Student Information");
    System.out.println("****************************************************");
    System.out.println("*****************END of the program ****************");
  }

>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
}
