package com.company;

import com.company.model.*;
import com.company.model.triangle.EquilateralTriangle;
import com.company.model.triangle.IsoscelesTriangle;
import com.company.model.triangle.RectangularTriangle;
import com.company.model.triangle.Triangle;

public class Main {

    public static void main(String[] args) {
        ShapeBase[] shapes = new ShapeBase[4];
        try {
            shapes[0] = new Triangle(3, 4, 5);
            shapes[1] = new IsoscelesTriangle(3, 5);
            shapes[2] = new EquilateralTriangle(3);
            shapes[3] = new RectangularTriangle(3, 4);
            for (int i = 0; i < shapes.length; i++) {
                System.out.println(shapes[i]);
                System.out.printf("Периметр: %.2f\n", shapes[i].getPerimeter());
                System.out.printf("Площадь: %.2f\n", shapes[i].getSquare());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Программа завершена");
    }
}