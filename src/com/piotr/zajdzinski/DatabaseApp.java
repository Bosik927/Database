package com.piotr.zajdzinski;

import com.piotr.zajdzinski.shapes.Shape;
import com.piotr.zajdzinski.shell.Shell;

import java.util.ArrayList;
import java.util.List;

public class DatabaseApp {

    private static Shell shell = new Shell();
    public static List<Shape> shapes = new ArrayList<>();

    public static void main(String... args) {
        shell.printManu();
        int option = 0;
        while (option != 7) {
            option = shell.getOptionNumber();
            switch (option) {
                case 0:
                    break;
                case 1:
                    shell.addNewObject();
                    break;
                case 2:
                    shell.deleteById();
                    break;
                case 3:
                    shell.displayAll();
                    break;
                case 4:
                    shell.displayByType();
                    break;
                case 5:
                    shell.displayUsingNameFilter();
                    break;
                case 6:
                    shell.printManu();
                    break;
                case 7:
                    break;
                case 8:
                    shell.calculateAreas();
                    break;
                case 9:
                    shell.calculateValume();
                    break;
                case 10:
                    shell.calculateCircumference();
                    break;
                default:
                    System.out.println("Unknown operation!");
            }
        }
    }
}
