import java.util.Random;

public class Check {
    public static boolean palindrom() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(Main.texts));
        String s1 = String.valueOf(stringBuffer.reverse());
        String s2 = s1.toString();
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean oneLatter(String s) {
        char ch1 = s.charAt(0);
        for (int i = 0; i < Main.texts.length; i++) {
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
