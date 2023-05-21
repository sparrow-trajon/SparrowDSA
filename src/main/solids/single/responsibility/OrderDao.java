package main.solids.single.responsibility;


/**
 * This class is not following the SOLID principle
 * 2 one which is
 * O ->> Open for extension and close for modification
 *
 * Think In near future we need to save the changes to database as well as file. So in that case
 * we should not make changes in this class instead we should create the interface and create multiple extended classes
 * for it.
 *
 * 
 */
public class OrderDao {

    Order order;


    public static void save(Order order){

        // saving the order to database.

    }
}
