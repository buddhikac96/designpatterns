package com.company;

public class ShapeFactory{
    public IShape GetShapeInstance(ShapeType shapeType, String Color){
        switch (shapeType){
            case SQUARE:
                return GetSquare(Color);
            case CIRCLE:
                return GetCircle(Color);
            default:
                return null;
        }
    }

    private IShape GetSquare(String Color){
        SquareBuilder squareBuilder = new SquareBuilder();
        IShape square = squareBuilder.setColor(Color).Build();
        return square;
    }

    private IShape GetCircle(String Color){
        IShapeBuilder circleBuilder = new CircleBuilder();
        IShape circle = circleBuilder.setColor(Color).Build();
        return circle;
    }
}



