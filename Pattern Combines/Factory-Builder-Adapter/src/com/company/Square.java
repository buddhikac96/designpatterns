package com.company;

public class Square implements IShape{

    public String Color;

    public Square(String color) {
        Color = color;
    }

    @Override
    public void draw() {
        System.out.println("I am a Square");
    }
}

