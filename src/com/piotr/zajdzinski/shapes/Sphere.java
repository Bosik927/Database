package com.piotr.zajdzinski.shapes;

public class Sphere extends Shape3D {

    private double r;

    public Sphere(String name, Long id, double r) {
        super(name, id);
        setShapeType(ShapeType.SPHERE);
        this.r = r;
    }

    public String toString(){
        return super.toString() + " r: " + r + " area: " + getArea() + " Volume: " + getVolume();
    }

    @Override
    public void calculateArea() {
        setArea(4 * PI * r * r);
    }

    @Override
    public void calculateValume(){
        setVolume((4 * PI * r*r*r)/3);
    }


    public ShapeType getType(){
        return ShapeType.SPHERE;
    }
}
