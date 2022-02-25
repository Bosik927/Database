package com.piotr.zajdzinski.shell;

import com.piotr.zajdzinski.DatabaseApp;
import com.piotr.zajdzinski.shapes.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;

public class Shell {

    public void printManu() {
        System.out.println("1) Add new object");
        System.out.println("2) Delete object by id");
        System.out.println("3) Display objects");
        System.out.println("4) Display objects type");
        System.out.println("5) Display objects using name filter");
        System.out.println("6) Help");
        System.out.println("7) Exit");
        System.out.println("8) Calculate areas");
        System.out.println("9) calculate valumes");
        System.out.println("10) Calculate circumferences");
    }

    public int getOptionNumber() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println("Occur Exception: Incorrect option value!");
        }
        return 0;
    }

    public void addNewObject() {
        System.out.println("Choose object type: 1) Triangle 2) Rectangle 3) Cuboid 4) Sphere");
        Scanner sc = new Scanner(System.in);
        try {
            int type = sc.nextInt();
            ShapeType enumInstance = ShapeType.values()[type-1];
            System.out.println(enumInstance);
            if (enumInstance == null) {
                System.out.println("Occur Exception: Incorrect option value!");
            } else {
                System.out.print("Enter name: ");
                String name = sc.next();
                System.out.print("Enter id: ");
                long id = sc.nextLong();

                if (enumInstance.equals(ShapeType.TRIANGLE)) {
                    try {
                        System.out.print("Enter a: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter b: ");
                        double b = sc.nextDouble();
                        System.out.print("Enter c: ");
                        double c = sc.nextDouble();
                        DatabaseApp.shapes.add(new Triangle(name, id, a, b, c));
                    }catch (Exception e){
                        System.out.println("Occur Exception: Incorrect option value!");
                    }
                } else if (enumInstance == ShapeType.RECTANGLE) {
                    try {
                        System.out.print("Enter a: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter b: ");
                        double b = sc.nextDouble();

                        DatabaseApp.shapes.add(new Rectangle(name, id, a, b));
                    }catch (Exception e){
                        System.out.println("Occur Exception: Incorrect option value!");
                    }
                } else if (enumInstance == ShapeType.CUBOID) {
                    try {
                        System.out.print("Enter a: ");
                        double a = sc.nextDouble();
                        System.out.print("Enter b: ");
                        double b = sc.nextDouble();
                        System.out.print("Enter c: ");
                        double c = sc.nextDouble();

                        DatabaseApp.shapes.add(new Cuboid(name, id, a, b, c));
                    }catch (Exception e){
                        System.out.println("Occur Exception: Incorrect option value!");
                    }

                } else if (enumInstance == ShapeType.SPHERE) {
                    System.out.print("Enter r: ");
                    double r = sc.nextDouble();
                    DatabaseApp.shapes.add(new Sphere(name, id, r));
                }
                System.out.println("End object creation");
            }


        } catch (Exception e) {
            System.out.println("Occur Exception: Incorrect option value!");
        }
    }

    public void deleteById() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter id");
            long id = sc.nextLong();
            Optional<Shape> shape = DatabaseApp.shapes.stream()
                    .filter(sh -> sh.getId() == id).findFirst();
            if (shape.isPresent()) {
                DatabaseApp.shapes.remove(shape.get());
                System.out.println("Removed object with id: " + id);
            } else {
                System.out.println("Didn't find object with inserted id");
            }
        } catch (Exception e) {
            System.out.println("Occur Exception: Incorrect id value!");
        }
    }

    public void displayAll() {
        DatabaseApp.shapes.forEach(shape -> {
            System.out.println(shape.toString());
        });
    }

    public void displayByType() {
        System.out.print("Choose object type: 1) Triangle 2) Rectangle 3) Cuboid 4) Sphere: ");
        Scanner sc = new Scanner(System.in);
        try {
            int type = sc.nextInt();
            ShapeType enumInstance = ShapeType.values()[type-1];
            if (enumInstance == null) {
                System.out.println("Occur Exception: Incorrect option value!");
            } else {
                DatabaseApp.shapes.stream()
                        .filter(shape -> shape.getType().equals(enumInstance))
                        .forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("Occur Exception: Incorrect option value!");
        }
    }

    public void displayUsingNameFilter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter part name: ");
        String partName = sc.next();

        DatabaseApp.shapes.stream()
                .filter(shape ->
                        shape.getName().contains(partName))
                .forEach(shape -> System.out.println(shape.toString()));
    }

    public void calculateAreas(){
        DatabaseApp.shapes.forEach(Shape::calculateArea);
        System.out.println("Areas calculated");
    }

    public void calculateValume(){
        DatabaseApp.shapes.forEach(Shape::calculateValume);
        System.out.println("Valumes calculated");
    }

    public void calculateCircumference(){
        DatabaseApp.shapes.forEach(Shape::calculateCircumference);
        System.out.println("Circumferences calculated");
    }
}
