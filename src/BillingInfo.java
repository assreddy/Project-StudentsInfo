import java.util.*;

public class BillingInfo{
  private String billNumber;
  private double termAmount;

  public static ArrayList<BillingInfo> billArrayList = new ArrayList<BillingInfo>();

  BillingInfo(String billNumber, double termAmount){
    this.billNumber = billNumber;
    this.termAmount = termAmount;       
  }

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
   * @return the termtermAmount
   */
  public double termAmount() {
  return termAmount;}

  /**
   * @param termtermAmount the termtermAmount to set
   */
  public void setTermtermAmount(double termtermAmount) {
  this.termtermAmount = termtermAmount;}

  public void addBillingInfo(String billNumber, double termtermAmount ){
    BillingInfo bill = new BillingInfo(billNumber,termtermAmount);
    billArrayList.add(bill);
  }
  public String toStringBillingInfo() {
    return "Billing Info:: Bill Number: " +billNumber + ","
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