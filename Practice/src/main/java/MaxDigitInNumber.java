import java.util.Random;

public class MaxDigitInNumber {
    public static void main(String[] args) {
        int min = 99;
        Random random = new Random();
        int i = random.nextInt(900);
        i += min;
        System.out.println(i);
        int first = i / 100;
        int second = (i / 10) % 10;
        int third = (i % 100) % 10;
        int max = Math.max(first, Math.max(second,third));
        System.out.println(max);
        }
    }

