import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static AtomicInteger count3 = new AtomicInteger(0);
    public static AtomicInteger count4 = new AtomicInteger(0);
    public static AtomicInteger count5 = new AtomicInteger(0);
    public static String[] texts = new String[100_000];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < texts.length; i++) {
            texts[i] = Check.generateText("abc", 3 + random.nextInt(3));
        }

        Thread thread1=new Thread(() -> {
            for (String s : texts) {
                if (s.length() == 3 & (Check.palindrom() || Check.oneLatter(s) || Check.vozrastanie(s))) {
                    count3.getAndIncrement();
                }
            }
            System.out.println("Красивых слов длиною 3 " + count3.get());
        });

        Thread thread2=new Thread(() -> {
            for (String s : texts) {
                if (s.length() == 4 & (Check.palindrom() || Check.oneLatter(s) || Check.vozrastanie(s))) {
                    count4.getAndIncrement();
                }
            }
            System.out.println("Красивых слов длиною 4 " + count4.get());
        });

        Thread thread3=new Thread(() -> {
            for (String s : texts) {
                if (s.length() == 5 & (Check.palindrom() || Check.oneLatter(s) || Check.vozrastanie(s))) {
                    count5.getAndIncrement();
                }
            }
            System.out.println("Красивых слов длиною 5 " + count5.get());
        });

    thread1.start();
    thread2.start();
    thread3.start();

    }
}
