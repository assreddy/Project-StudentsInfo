import java.util.*;

public class BillingInfo{
  private int studentNumber;
  private String billNumber;
  private double termtermAmount;

  public static ArrayList<BillingInfo> billArrayList = new ArrayList<BillingInfo>();

  BillingInfo(int studentNumber, String billNumber, double termAmount){
    this.studentNumber = studentNumber; 
    this.billNumber = billNumber;
    this.termtermAmount = termAmount;       
  }

  public int  getStudentNumber() {
    return studentNumber;
  }
  
  public String getBillNumber() {
    return billNumber;
  }

  public double getBilltermAmount() {
    return termtermAmount;
  }

  public void addBillingInfo(int studentNumber, String billNumber, double termtermAmount ){
    BillingInfo bill = new BillingInfo(studentNumber, billNumber,termtermAmount);
    billArrayList.add(bill);
  }
  public String toStringBillingInfo() {
    return "Billing Info:: Studnet Number: " +studentNumber + " ,Bill Number: " +billNumber + ","
        + " Term Fee: " +termtermAmount +"\n";
  }
  
  public void printBillingInfoAll() {
    ListIterator<BillingInfo> lt = billArrayList.listIterator();
    while(lt.hasNext()) {
      BillingInfo b = lt.next();
      System.out.print(b.toStringBillingInfo());
    }
  }
}