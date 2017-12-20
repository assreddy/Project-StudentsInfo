import java.util.*;

public class BillingInfo{
<<<<<<< HEAD
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
=======
  String b_no;
  double b_amount;

  public static ArrayList<BillingInfo> billArrayList = new ArrayList<BillingInfo>();

  BillingInfo(String bno, double amount){
    b_no = bno;
    b_amount = amount;       
  }

  public String getBillNumber() {
    return b_no;
  }

  public double getBillAmount() {
    return b_amount;
  }

  public void addBillingInfo(String b_no, double b_amount ){
    BillingInfo bill = new BillingInfo(b_no,b_amount);
    billArrayList.add(bill);
  }
  public String toStringBillingInfo() {
    return "Billing Info:: Bill Number: " +b_no + ", Bill Amount: " +b_amount +"\n";
>>>>>>> ebaa76818d79404da87c0b3b4b4e51f5676499bf
  }
  
  public void printBillingInfoAll() {
    ListIterator<BillingInfo> lt = billArrayList.listIterator();
    while(lt.hasNext()) {
      BillingInfo b = lt.next();
      System.out.print(b.toStringBillingInfo());
    }
  }
}