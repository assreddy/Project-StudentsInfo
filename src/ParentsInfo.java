import java.util.*;

public class ParentsInfo{
<<<<<<< HEAD
=======
  private int studentNumber;
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
  private String parentName;
  private String parentOccupation;
  private int parentPhone;

  public static ArrayList<ParentsInfo> parentArrayList = new ArrayList<ParentsInfo>();

<<<<<<< HEAD
  ParentsInfo(String parentName, String parentOccupation, int parentPhone){
=======
  ParentsInfo(int studentNumber, String parentName, String parentOccupation, int parentPhone){
    this.studentNumber = studentNumber;
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
    this.parentName = parentName;
    this.parentOccupation = parentOccupation;
    this.parentPhone = parentPhone;
  }
<<<<<<< HEAD
  
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
   * @param parentName the parentName to set
   */
  public void setParentName(String parentName) {
  this.parentName = parentName;}

  /**
   * @param parentOccupation the parentOccupation to set
   */
  public void setParentOccupation(String parentOccupation) {
  this.parentOccupation = parentOccupation;}
  
  

  public String toStringParentsInfo() {
    return "Parents Info:: Parent Name:" +parentName+ 
        ", Occupation: " +parentOccupation+", Phone Number: " +parentPhone;
  }
  public void addParentInfo(String parentName, String parentOccupation, int parentPhone ) {
    ParentsInfo parent = new ParentsInfo(parentName,parentOccupation,parentPhone);
=======

  public String getParentName() {
    return parentName;
  }
  
  public int getStudentNumber() {
    return studentNumber;
  }

  public  String getParentOccupation() {
    return parentOccupation;

  }
  public int getParentPhoneNo() {
    return parentPhone;
  }

  public String toStringParentsInfo() {
    return "Parents Info:: Studnet Number:" +studentNumber+ " ,Parent Name:" +parentName+ 
        ", Occupation: " +parentOccupation+", Phone Number: " +parentPhone;
  }
  public void addParentInfo(int studentNumber, String parentName, String parentOccupation, int parentPhone ) {
    ParentsInfo parent = new ParentsInfo(studentNumber,parentName,parentOccupation,parentPhone);
>>>>>>> 6a49b2a2a2a8ebe7442d7d64994bda883b1d9fd6
    parentArrayList.add(parent) ;
  }
  
  public void printPrentsInfoAll() {
    ListIterator<ParentsInfo> lt = parentArrayList.listIterator();
    while(lt.hasNext()) {
      ParentsInfo p = lt.next();
      System.out.println(p.toStringParentsInfo());
    }
  }
  
}