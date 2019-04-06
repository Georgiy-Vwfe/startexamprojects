package ru.ithub;

public class Main {

    public static void main(String[] args) {
        String str = "14";

        System.out.println("Before: " + str);
        System.out.println("After: " + stringIncrement(str));
    }

    private static String stringIncrement(String str) {
        String lastChar = str.substring(str.length() - 1);
        String withoutLastChar = str.substring(0, str.length() - 1);

        switch (lastChar) {
            case "0": {
                return withoutLastChar + "1";
            }
            case "1": {
                return withoutLastChar + "2";
            }
            case "2": {
                return withoutLastChar + "3";
            }
            case "3": {
                return withoutLastChar + "4";
            }
            case "4": {
                return withoutLastChar + "5";
            }
            case "5": {
                return withoutLastChar + "6";
            }
            case "6": {
                return withoutLastChar + "7";
            }
            case "7": {
                return withoutLastChar + "8";
            }
            case "8": {
                return withoutLastChar + "9";
            }
            case "9": {
                if (!withoutLastChar.equals("")) {
                    return stringIncrement(withoutLastChar) + "0";
                } else {
                    return "10" + lastChar.substring(1);
                }
            }
            default: {
                return "Unknown Error";
            }
        }
    }
}
