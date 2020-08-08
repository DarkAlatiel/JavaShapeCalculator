package com.company.model.triangle;

import com.company.model.ShapeBase;
import com.company.model.Validator;

public class Triangle extends ShapeBase {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;

    protected Triangle(String name) {
        super(name);
    }

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        super("Треугольник");
        if (Validator.isValidSideValue(firstSide)) {
            this.firstSide = firstSide;
        } else {
            throw new IllegalArgumentException("Неверное значение первой стороны!");
        }
        if (Validator.isValidSideValue(secondSide)) {
            this.secondSide = secondSide;
        } else {
            throw new IllegalArgumentException("Неверное значение второй стороны!");
        }
        if (Validator.isValidSideValue(thirdSide)) {
            this.thirdSide = thirdSide;
        } else {
            throw new IllegalArgumentException("Неверное значение третьей стороны!");
        }
        if (Validator.isNotValidSideValues(firstSide, secondSide, thirdSide)) {
            throw new IllegalArgumentException("Треугольник невозможно построить!");
        }
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getSquare() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) *
                (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(getName());
        builder.append("\nПервая сторона: ").append(firstSide);
        builder.append("\nВторая сторона: ").append(secondSide);
        builder.append("\nТретья сторона: ").append(thirdSide);
        return builder.toString();
    }
}
