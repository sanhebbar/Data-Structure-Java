package com.company.designpattern.factorypattern;

interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
class Rectangle implements Shape{
    @Override
    public void draw(){
        System.out.println("rectangle");
    }
}

public abstract class ShapeFactory {
    public abstract Shape createShape(String type);

    public Shape getShape(String type){
        Shape shape = createShape(type);
        return shape;
    }
}
