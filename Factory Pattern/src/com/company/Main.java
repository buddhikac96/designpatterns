package com.company;

public class Main {

    public static void main(String[] args) {
	    ShapeFactory shapeFactory = new ShapeFactory();

	    IShape circle = shapeFactory.GetShapeInstance(ShapeType.CIRCLE);
        circle.draw();

        IShape square = shapeFactory.GetShapeInstance(ShapeType.SQUARE);
        square.draw();
    }
}

