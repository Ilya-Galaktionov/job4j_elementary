package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        int firstNumber = 1;
        int result;
        for (int i = 2; i <= 9; i++) {
            result = firstNumber * i;
            System.out.println(firstNumber + " * " + i + " = " + result);
        }
    }
}
