import java.util.*;

public class BillingInfo{
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
  }
  
  public void printBillingInfoAll() {
    ListIterator<BillingInfo> lt = billArrayList.listIterator();
    while(lt.hasNext()) {
      BillingInfo b = lt.next();
      System.out.print(b.toStringBillingInfo());
    }
  }
}