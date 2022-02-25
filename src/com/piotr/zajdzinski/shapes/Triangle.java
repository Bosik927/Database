package com.piotr.zajdzinski.shapes;

public class Triangle extends Shape2D{

    private double c;

    public Triangle(String name, long id, double a, double b, double c){
        super(name, id, a, b);
        setShapeType(ShapeType.TRIANGLE);
        this.c = c;
    }

    public ShapeType getType(){
        return ShapeType.TRIANGLE;
    }

    @Override
    public void calculateArea() {
        double s = (getA()+getB() + c)/2;
        setArea(Math.sqrt(s * (s-getA()) * (s-getB())* (s-c)));
    }

    @Override
    public void calculateCircumference() {
        setCircumference(getA() + getB() + c);
    }

    public String toString(){
        return super.toString() + " c: " + c + " area: " + getArea() + " " + " Circumference " + getCircumference();
    }


}
