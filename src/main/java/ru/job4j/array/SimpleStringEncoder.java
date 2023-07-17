package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += String.valueOf(symbol) + (counter > 1 ? counter : "");
                counter = 1;
                symbol = input.charAt(i);
            }
        }
        result += String.valueOf(symbol) + (counter > 1 ? counter : "");
        return result;
    }
}
