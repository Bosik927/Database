package com.piotr.zajdzinski.shapes;

public abstract class Shape2D extends Shape {

    private double circumference;
    private double a;
    private double b;

    public Shape2D(String name, Long id, double a, double b){
        super(name, id);
        this.a = a;
        this.b = b;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String toString(){
        return super.toString() + " a: " + getA() + " b: " + getB();
    }

    @Override
    public void calculateValume(){

    }

}
