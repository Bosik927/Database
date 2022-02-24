package com.piotr.zajdzinski.shapes;

public abstract class Shape {
    public static final double PI = 3.14;

    private String name;
    private long id;
    private double area;
    private double circumference;

    public Shape(String name, long id){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return "Id: " + id + "Name: " + name + " Area " + area + " Circumference: " + circumference;
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

    public abstract ShapeType getType();
    public abstract void calculateArea();
    public abstract void calculateCircumference();

}
