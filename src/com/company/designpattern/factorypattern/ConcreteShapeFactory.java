package com.company.designpattern.factorypattern;

public class ConcreteShapeFactory extends ShapeFactory{
    @Override
    public Shape createShape(String type) {
        if (type == null){
            return null;
        }
        if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
