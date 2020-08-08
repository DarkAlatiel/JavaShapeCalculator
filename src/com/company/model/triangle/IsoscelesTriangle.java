package com.company.model.triangle;

import com.company.model.Validator;

public class IsoscelesTriangle extends Triangle {
    public IsoscelesTriangle(double side, double base) {
        super("Равнобедренный треугольник");
        if (Validator.isValidSideValue(side)) {
            this.firstSide = this.secondSide = side;
        } else {
            throw new IllegalArgumentException("Неверное значение боковой стороны!");
        }
        if (Validator.isValidSideValue(base)) {
            this.thirdSide = base;
        } else {
            throw new IllegalArgumentException("Неверное значение основания!");
        }
        if (Validator.isNotValidSideValues(this.firstSide, this.secondSide, this.thirdSide)) {
            throw new IllegalArgumentException("Треугольник невозможно построить!");
        }
    }

    @Override
    public double getPerimeter() {
        return firstSide * 2 + thirdSide;
    }

    @Override
    public double getSquare() {
        return thirdSide * Math.sqrt(Math.pow(firstSide, 2) - Math.pow(thirdSide, 2) / 4) / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(getName());
        builder.append("\nБоковая сторона: ").append(firstSide);
        builder.append("\nОснование: ").append(thirdSide);
        return builder.toString();
    }
}