package com.piotr.zajdzinski.shapes;

public class Rectangle extends Shape2D{

    public Rectangle(String name, long id, double a, double b){
        super(name, id, a, b);
        setShapeType(ShapeType.RECTANGLE);
    }

    @Override
    public void calculateArea() {
        setArea(getA() * getB());
    }

    @Override
    public void calculateCircumference() {
        setCircumference(2*getA() + 2*getB());
    }

    public ShapeType getType(){
        return ShapeType.RECTANGLE;
    }

    public String toString(){
        return super.toString() + " area: " + getArea() + " " + " Circumference " + getCircumference();
    }
}