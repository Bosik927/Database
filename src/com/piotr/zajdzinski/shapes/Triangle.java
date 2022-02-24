package com.piotr.zajdzinski.shapes;

public class Triangle extends Shape2D{
    private double height;
    private double c;

    public Triangle(String name, long id, double a, double b, double height){
        super(name, id, a, b);
        this.height = height;
    }

    public ShapeType getType(){
        return ShapeType.TRIANGLE;
    }

    @Override
    public void calculateArea() {
        setArea((getA() * height)/2);
    }

    @Override
    public void calculateCircumference() {
        setCircumference(getA() + getB() + c);
    }

    public String toString(){
        return super.toString() + " height: " + height;
    }


}
