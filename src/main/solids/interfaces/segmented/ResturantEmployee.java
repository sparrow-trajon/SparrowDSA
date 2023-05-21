package main.solids.interfaces.segmented;


/**
 * This interface is breaking the SOLID principle
 * interface segmented principle
 * because let say there is an employee whose work is to serve the food
 * and we crate the class of that employee say Waiter
 * then that class should implement other methods too.
 * So what we can do is
 * we can create multiple interfaces of the interface such as
 * waiterinterface
 * chefInterface
 * helperInterface
 */
public interface ResturantEmployee {

    void serveFood();
    void prepareFoor();
    void washDishes();
}
