/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pointofsale;

/**
 *
 * @author Ryan
 */
public class Receipt {
    
    private Customer customer1;
    private LineItem lineItem1;
    private Store store1;
    private LineItem[] lineItems;
    


    public Receipt(String customerId, String unitId, int quantity) {
          this.nextCustomer(customerId);
          this.nextLineItem(unitId, quantity);
//       
    }
    
    public void nextLineItem(String unitId, int quantity){
        lineItem1 = new LineItem(unitId, quantity);
    }
    private void nextCustomer(String customerId){
        customer1 = new Customer(customerId);
    }
    
    private int receiptNumber;
    private double subTotal;
    private double tax;
    

//    Receipt(String customerId, String unitId, int quantity) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    public void printReceipt(){
        
        
    }

    
    
    public int getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(int receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    
    
    
    
    
    private double generateGrandTotal() {
        return subTotal + (subTotal * tax);
    }


    
}
