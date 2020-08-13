package com.company;

public class ShapeFactory {
    public IShape GetShapeInstance(ShapeType type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}

