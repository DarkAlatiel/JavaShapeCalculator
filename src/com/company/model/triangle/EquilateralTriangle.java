package com.company.model.triangle;

import com.company.model.Validator;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super("Равносторонний треугольник");
        if (Validator.isValidSideValue(side)) {
            firstSide = secondSide = thirdSide = side;
        } else {
            throw new IllegalArgumentException("Неверное значение стороны!");
        }
    }

    @Override
    public double getPerimeter() {
        return firstSide * 3;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(3) * Math.pow(firstSide, 2) / 4;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(getName());
        builder.append("\nСторона: ").append(firstSide);
        return builder.toString();
    }
}