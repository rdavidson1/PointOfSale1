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
public class Register {
    
     private Receipt receipt1;
     
    /**
     *
     * @param customerId
     * @param unitId
     * @param quantity
     */
    public void startOrder(String customerId, String unitId, int quantity){
         receipt1 = new Receipt(customerId, unitId, quantity);
     }
    
    public void addItem(){
        
        
    }
}
