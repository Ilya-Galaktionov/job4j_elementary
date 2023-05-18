package ru.job4j.calculator;

public class Fit {

    public static final double HEIGHT_TO_WEIGHT = 1.15;

    public static double manWeight(short height) {
        double rsl = (height - 100) * HEIGHT_TO_WEIGHT;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * HEIGHT_TO_WEIGHT;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
