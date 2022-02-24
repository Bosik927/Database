package com.piotr.zajdzinski.shapes;

public class Cuboid extends Shape3D{

    private double a;
    private double b;
    private double c;

    public Cuboid(String name, Long id, double a, double b,double c){
        super(name, id);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString(){
        return super.toString() + " a: " + a + " b: " + b + " c: " + c;
    }

    @Override
    public void calculateArea() {
        //setArea();
    }

    @Override
    public void calculateCircumference() {
        //setCircumference((2*a * b) + (2*a*c) + (2*b*c));
    }

    public ShapeType getType(){
        return ShapeType.CUBOID;
    }
}
