package com.piotr.zajdzinski.shapes;

public enum ShapeType {
    SPHERE(4),
    TRIANGLE(1),
    RECTANGLE(2),
    CUBOID(3);

    public final int num;

    private ShapeType(int num) {
        this.num = num;
    }
}
