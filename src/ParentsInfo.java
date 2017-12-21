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

  public String toStringParentsInfo() {
    return "Parents Info:: Parent Name:" +p_name+", Occupation: " +p_occupation+", Mobile: " +p_phone;
  }
  public void addParentInfo(String p_name, String p_occupation, int p_phone ) {
    ParentsInfo parent = new ParentsInfo(p_name,p_occupation,p_phone);

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
