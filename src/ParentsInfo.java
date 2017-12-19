import java.util.*;

public class ParentsInfo{
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