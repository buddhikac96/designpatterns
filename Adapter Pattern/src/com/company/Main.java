package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle();
	    Square square = new Square();
	    Triangle triangle = new Triangle();

	    DrawingTool drawingTool = new DrawingTool();

	    drawingTool.DrawShape(circle);
	    drawingTool.DrawShape(square);

        TriangleAdapter triangleAdapter = new TriangleAdapter(triangle);

	    drawingTool.DrawShape(triangleAdapter);
    }
}


