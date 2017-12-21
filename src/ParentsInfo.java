import java.util.*;

public class ParentsInfo{
  private String parentName;
  private String parentOccupation;
  private int parentPhone;

  public static ArrayList<ParentsInfo> parentArrayList = new ArrayList<ParentsInfo>();

  ParentsInfo(String parentName, String parentOccupation, int parentPhone){
    this.parentName = parentName;
    this.parentOccupation = parentOccupation;
    this.parentPhone = parentPhone;
  }
  
  /**
   * 
   */
  public ParentsInfo() {
    super();
    // TODO(sreenivasa): Auto-generated constructor stub
  }

  
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
   * @return the parentName
   */
  public String getParentName() {
  return parentName;}

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

  public String toStringParentsInfo() {
    return "Parents Info:: Parent Name:" +parentName+ 
        ", Occupation: " +parentOccupation+", Phone Number: " +parentPhone;
  }
  public void addParentInfo(String parentName, String parentOccupation, int parentPhone ) {
    ParentsInfo parent = new ParentsInfo(parentName,parentOccupation,parentPhone);
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
