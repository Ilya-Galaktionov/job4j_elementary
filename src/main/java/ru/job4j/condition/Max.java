package ru.job4j.condition;

public class Max {
    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return a > max(b, c) ? a : max(b, c);
    }

    public int max(int a, int b, int c, int d) {
        return a > max(b, c, d) ? a : max(b, c, d);
    }

    public static void main(String[] args) {
        Max maxNumber = new Max();
        System.out.println("Максимальное чилсло = " + maxNumber.max(1, 2));
    }
}
