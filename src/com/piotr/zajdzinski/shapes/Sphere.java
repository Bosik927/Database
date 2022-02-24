package com.piotr.zajdzinski.shapes;

public class Sphere extends Shape3D {

    private double r;

    public Sphere(String name, Long id, double r) {
        super(name, id);
        this.r = r;
    }

    public String toString(){
        return super.toString() + " r: " + r;
    }

    @Override
    public void calculateArea() {
        //setArea();
    }

    @Override
    public void calculateCircumference() {
        //setCircumference();
    }

    public ShapeType getType(){
        return ShapeType.SPHERE;
    }
}
