/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;


/**
 *
 * @author evenal
 */
public class Checkout {
    // amount of time per product (to scan barcode)
    public static final int SCAN_DURATION = 1;
    // amount of time to pay
    public static final int PAY_DURATION = 2;
    //total time for checkout = PAY_DURATION + SCAN_DURATION*customer.numProd

    SuperMarket shop;
    String name;


    public Checkout(SuperMarket shop, int i) {
        this.shop = shop;
        this.name = "Checkout " + i;
        System.out.println(name);
    }
}
