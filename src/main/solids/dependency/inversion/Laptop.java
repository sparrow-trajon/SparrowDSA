package main.solids.dependency.inversion;

/**
 * This class is breaking SOLIDS
 * inversion of control that says that object should be dependant on interface rather than the concrete classes.
 * Here in this example  we have seen that we have injected the directed object of wiredkeyboard and wiredmouse
 * So now if in futrue we want to replace our mouse and keyboard to wireless mouse and wireless keyboard then
 * we should change the code. that should not happen.
 */
public class Laptop {

    WiredKeyBoard wiredKeyBoard;
    WiredMouse wiredMouse;

    public Laptop(WiredKeyBoard wiredKeyBoard, WiredMouse wiredMouse) {
        this.wiredKeyBoard = wiredKeyBoard;
        this.wiredMouse = wiredMouse;
    }
}
