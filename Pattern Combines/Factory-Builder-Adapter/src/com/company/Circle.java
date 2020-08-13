package com.company;

public class Circle implements IShape{

    String Color;

    public Circle(String color) {
        this.Color = color;
    }

    @Override
    public void draw() {
        System.out.println("I am a Circle");
    }
}

