package ru.ithub;

public class Main {

    public static void main(String[] args) {
        String str = "9999909";

        System.out.println("Before: " + str);
        System.out.println("After: " + stringIncrement(str));
    }

    private static String stringIncrement(String str) {
        char lastChar = str.charAt(str.length() - 1);
        String withoutLastChar = str.substring(0, str.length() - 1);

        if (lastChar >= '0' && lastChar < '9') {
            return withoutLastChar + (++lastChar);
        } else if (!withoutLastChar.equals("")) {
            return stringIncrement(withoutLastChar) + "0";
        } else {
            return "10";
        }
    }
}
