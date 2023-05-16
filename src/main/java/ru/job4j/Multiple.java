package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        int first_number = 1;
        int result;
        for (int i = 2; i <= 9; i++) {
            result = first_number * i;
            System.out.println(first_number + " * " + i + " = " + result);
        }
    }
}
