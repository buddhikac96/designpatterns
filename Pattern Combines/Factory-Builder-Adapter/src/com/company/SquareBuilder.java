package com.company;

public class SquareBuilder implements IShapeBuilder{

    String Color;

    @Override
    public IShapeBuilder setColor(String color) {
        this.Color = color;
        return this;
    }

    @Override
    public IShape Build() {
        return new Square(this.Color);
    }
}


