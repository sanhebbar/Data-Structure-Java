package com.company.designpattern.factorypattern;

public class FactoryPatternTest {
    public static void main(String[] args) {
        ShapeFactory sf = new ConcreteShapeFactory();
        Shape shape = sf.getShape("circle");
        shape.draw();

        Shape shape1 = sf.getShape("rectangle");
        shape1.draw();
    }
}
