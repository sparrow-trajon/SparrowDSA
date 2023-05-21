package main.desing.patterns.decorator;

public class PizzaBuzzCorner {


    public static void main(String[] args) {

        int cost = takeOrder();
        System.out.println(cost);
    }

    private static int takeOrder() {

        BasePizza basePizza = new Margerita();
        ExtraChesse extraChesse = new ExtraChesse(basePizza);
        Mushroom mushroom= new Mushroom(extraChesse);

        return mushroom.cost();
    }
}
