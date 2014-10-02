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
public class LineItem {
    
    private int quantity;
    private String unitId;
    //private double price;

    public LineItem(String unitId, int quantity) {
        this.quantity = quantity;
        this.unitId = unitId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    Product P1 = new Product();
    
//    private void addToArray(final LineItem item) {
//        // needs validation
//        LineItem[] tempItems = new LineItem[lineItems.length + 1];
//        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
//        tempItems[lineItems.length] = item;
//        lineItems = tempItems;
//    }
    
    
    
//    private double lineItemTotals(){
//        
//        return quantity * price;
//    }
}
