package com.exercises.designPatterns.factory;

public class Demo {

    public static void main(String[] args){
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.EnumShape.SQUARE);
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.EnumShape.RECTANGLE);
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.EnumShape.CIRCLE);
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
