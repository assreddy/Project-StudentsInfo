import java.util.*;

public class ParentsInfo{
  private int studentNumber;
  private String parentName;
  private String parentOccupation;
  private int parentPhone;

  public static ArrayList<ParentsInfo> parentArrayList = new ArrayList<ParentsInfo>();

  ParentsInfo(int studentNumber, String parentName, String parentOccupation, int parentPhone){
    this.studentNumber = studentNumber;
    this.parentName = parentName;
    this.parentOccupation = parentOccupation;
    this.parentPhone = parentPhone;
  }

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