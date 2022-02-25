package com.piotr.zajdzinski.shapes;

public class Cuboid extends Shape3D{

    private double a;
    private double b;
    private double c;

    public Cuboid(String name, Long id, double a, double b,double c){
        super(name, id);
        setShapeType(ShapeType.CUBOID);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString(){
        return super.toString() + " a: " + a + " b: " + b + " c: " + c + " area: " + getArea() + " Volume: " + getVolume();
    }

    @Override
    public void calculateArea() {
        setArea((2*a * b) + (2*a*c) + (2*b*c));
    }

    @Override
    public void calculateValume(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a * b * c);
        setVolume(a * b * c);
        System.out.println(getVolume());
    }
    public ShapeType getType(){
        return ShapeType.CUBOID;
    }
}
