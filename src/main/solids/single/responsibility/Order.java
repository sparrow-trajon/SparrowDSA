package main.solids.single.responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * this is not following the SOLID principle
 * 1. which is single responsibility principle
 * as there are many reasons to do the changes in this class
 *
 */
public class Order {

   private static  Product products ;
   private static int quantity;


    public static int getTotalPrice(){

        return products.price*quantity;

    }

    public static void invoice(){
        System.out.println("total price for the order is >> "+ getTotalPrice());
    }




}
