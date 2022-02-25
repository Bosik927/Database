package com.piotr.zajdzinski.shapes;

public abstract class Shape {
    public static final double PI = 3.14;

    private String name;
    private long id;
    private double area;
    private double circumference;
    private ShapeType shapeType;

    public Shape(String name, long id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "ShapeType: "+ shapeType + " Id: " + id + " Name: " + name;
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setArea(double area){
        this.area = area;
    }

    public void setCircumference(double circumference){
        this.circumference = circumference;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }


    public abstract ShapeType getType();
    public abstract void calculateArea();
    public abstract void calculateCircumference();
    public abstract void calculateValume();

}
