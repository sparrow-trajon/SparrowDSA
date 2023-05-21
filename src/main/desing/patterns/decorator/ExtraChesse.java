package main.desing.patterns.decorator;

public class ExtraChesse  extends  ToppingDecorator{

    BasePizza basePizza;

    public ExtraChesse(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost()+50;
    }
}
