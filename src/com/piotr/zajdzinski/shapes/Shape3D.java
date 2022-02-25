package com.piotr.zajdzinski.shapes;

public abstract class Shape3D extends Shape{

    private double volume;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public  Shape3D(String name, Long id){
        super(name, id);
    }

    @Override
    public void calculateCircumference(){
    }

    public double getVolume() {
        return volume;
    }
}
