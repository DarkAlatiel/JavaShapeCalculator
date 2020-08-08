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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.firstSide, firstSide) != 0) return false;
        if (Double.compare(triangle.secondSide, secondSide) != 0) return false;
        return Double.compare(triangle.thirdSide, thirdSide) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(firstSide);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(thirdSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
