/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import eventsim.EventSim;

import static supermarket.Checkout.PAY_DURATION;
import static supermarket.Checkout.SCAN_DURATION;

/**
 *
 * @author evenal
 */
public class Customer {
    // customer will pick a random number of products between these two values
    public static final int MAX_PRODUCTS =  10;
    public static final int MIN_PRODUCTS = 1;

    // customer will spend random amount of time between these values before
    // going to check out
    public static final int MAX_SHOP_TIME = 50;
    public static final int MIN_SHOP_TIME = 1;

    SuperMarket shop;
    String name;


    int beginCheckoutTime;
    int beginShoppingTime;
    int shoppingDuration;
    int numProducts;
    int endShoppingTime; // hvor lenge han er i butikken før kassakø
    int queueWaitDuration; // ventetid i kassakøen.
    int checkoutDuration; // hvor lang tid det tar å scanne produkter og betale. checkoutDuration = PAY_DURATION + SCAN_DURATION*customer.numProd
    int checkoutTime; // checkoutDuration + queueWaitDuration = checkoutTime
    int leaveTime; // den totale tiden. endShoppingTime + checkoutTime = leaveTime

    public Customer(SuperMarket shop, int i) {
        this.shop = shop;
        name = "Customer" + i;
        beginShoppingTime = i;
        numProducts = EventSim.nextInt(MIN_PRODUCTS, MAX_PRODUCTS);
        shoppingDuration = EventSim.nextInt(MIN_SHOP_TIME, MAX_SHOP_TIME);
        endShoppingTime = beginShoppingTime + shoppingDuration;
        checkoutDuration = PAY_DURATION + SCAN_DURATION*numProducts;
        queueWaitDuration = 0;
        checkoutTime = queueWaitDuration + checkoutDuration;
        leaveTime = endShoppingTime + checkoutTime;
    }

   /* public void waitduration () {
        for(int i = 0; i < NUM_CUSTOMER; i++) {
            if()
        }
        if()  {

        } else
            queueWaitDuration = 0;
    }
    */
}
