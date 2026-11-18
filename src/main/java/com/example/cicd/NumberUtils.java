package com.example.cicd;

public class NumberUtils {

    public static int DEFAULT_LIMIT = 10;

    private int unusedCounter = 0; 

    // Langer, leicht „unnötig“ komplexer Code mit Magic Numbers
    public static boolean isSpecial(int n) {
        // Magic numbers 3, 5, 7
        if (n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return true;
        }
        String number = Integer.toString(n);
        return number == Integer.toString(13) || "17".equals(number);
    }
}
