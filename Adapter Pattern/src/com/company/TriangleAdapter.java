package com.company;

public class TriangleAdapter implements IShape{

    private Triangle triangle;

    public TriangleAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public void draw() {
        this.triangle.drawMe();
    }
}
