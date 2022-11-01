package main.java;

import java.util.Random;

public class Check {
    public static boolean palindrom(String s1) {
        StringBuffer stringBuffer = new StringBuffer(s1);
        stringBuffer.reverse();
        String s2 = stringBuffer.toString();
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean oneLatter(String s) {
        char ch1 = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (ch1 != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean vozrastanie(String s) {
        String input = "abcdefghijklmnopqrstuvweyz";
        if (input.contains(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static String generateText(String letters, int length) {
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }
}
