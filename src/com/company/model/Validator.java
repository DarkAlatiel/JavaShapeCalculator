package com.company.model;

public class Validator {

    public static boolean isValidSideValue(double side) {
        return side > 0;
    }

    public static boolean isNotValidSideValues(double firstSide, double secondSide, double thirdSide) {
        return (firstSide + secondSide <= thirdSide) ||
                (firstSide + thirdSide <= secondSide) ||
                (secondSide + thirdSide <= firstSide);
    }

}