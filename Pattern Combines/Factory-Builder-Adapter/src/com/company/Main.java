package com.company;

public class Main {

    public static void main(String[] args) {
	    ShapeFactory factory = new ShapeFactory();

	    IShape circle = factory.GetShapeInstance(ShapeType.CIRCLE, "Red");
	    IShape square = factory.GetShapeInstance(ShapeType.SQUARE, "Blue");

	    Triangle triangle = new Triangle();

	    DrawingTool drawingTool = new DrawingTool();
	    drawingTool.DrawShape(circle);
	    drawingTool.DrawShape(square);

        TraingleAdapter traingleAdapter = new TraingleAdapter(triangle);

        traingleAdapter.draw();
    }
}

