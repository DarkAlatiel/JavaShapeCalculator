package com.company.model.triangle;

import com.company.model.Validator;

public class RectangularTriangle extends Triangle {
    public RectangularTriangle(double firstCathet, double secondCathet) {
        super("Прямоугольный треугольник");
        if (Validator.isValidSideValue(firstCathet)) {
            this.firstSide = firstCathet;
        } else {
            throw new IllegalArgumentException("Неверное значение первого катета!");
        }
        if (Validator.isValidSideValue(secondCathet)) {
            this.secondSide = secondCathet;
        } else {
            throw new IllegalArgumentException("Неверное значение второго катета!");
        }
        thirdSide = Math.hypot(firstCathet, secondCathet);
    }

    @Override
    public double getSquare() {
        return firstSide * secondSide / 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(getName());
        builder.append("\nПервый катет: ").append(firstSide);
        builder.append("\nВторой катет: ").append(secondSide);
        builder.append("\nГипотенуза: ").append(thirdSide);
        return builder.toString();
    }

}