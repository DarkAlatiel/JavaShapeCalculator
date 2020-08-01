package com.company.model;

// геометрическая фигура
public abstract class ShapeBase {

    protected ShapeBase(String name) {
        this.name = name;
    }

    // название фигуры
    private String name;

    // метод вычисления периметра
    public abstract double getPerimeter();

    // метод вычисления площади
    public abstract double getSquare();

    public String getName() {
        return name;
    }
}
