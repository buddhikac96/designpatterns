package com.company;

public interface IShapeBuilder{
    IShapeBuilder setColor(String color);

    IShape Build();
}
