import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
    int start = 5;
    final Random random = new Random();
    int i = random.nextInt(155);
    i += start;
    if (i >= 25 & i <= 100){
        System.out.println("Число "+ i + " содержится в интервале (25, 100)");
    } else{
        System.out.println("Число " + i + " не содержится в интервале (25, 100)");
    }
    }
}
