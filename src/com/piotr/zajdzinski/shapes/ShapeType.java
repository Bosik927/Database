package com.piotr.zajdzinski.shapes;

public enum ShapeType {
    TRIANGLE(1),
    RECTANGLE(2),
    CUBOID(3),
    SPHERE(4);

    public final int num;

    private ShapeType(int num) {
        this.num = num;
    }
}
