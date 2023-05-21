package main.desing.patterns.factory;

public class ShapeFactory {

    Shape shape;

    public static Shape getShape(String str){

        if(str.equalsIgnoreCase("circle")){
            return  new Circle();
        }
        else{
            return  new Triangle();
        }
    }

    public static void main(String[] args) {
        ShapeFactory.getShape("circle").draw();

    }


}
