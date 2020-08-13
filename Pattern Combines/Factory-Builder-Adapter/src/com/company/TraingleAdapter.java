package com.company;

public class TraingleAdapter implements IShape{

    private Triangle triangle;

    public TraingleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void draw() {
        this.triangle.drawMe();
    }
}
