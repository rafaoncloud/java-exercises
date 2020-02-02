package com.exercises.designPatterns.factory;

public abstract class ShapeFactory {

    public enum EnumShape{
        SQUARE,
        RECTANGLE,
        CIRCLE
    }

    public static Shape getShape(EnumShape shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType == EnumShape.SQUARE){
            return new Square();
        } else if(shapeType == EnumShape.RECTANGLE){
            return new Rectangle();
        } else if(shapeType == EnumShape.CIRCLE){
            return new Circle();
        }
        return null;
    }
}
