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

// Start up class is called PointOfSale.
public class PointOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Register r1 = new Register();
        
        //Will have customerId, unitId, and quantity
        r1.startOrder("100", "A1", 1);
    }
    
}
