public class ReplaceNumbers {
    public static void main(String[] args) {
        int first = 45;
        int second = 100;
        int third = -20;
        if (first < second && first < third && second < third) {
            System.out.println(first + " " + second + " " + third);
        } else if (second < first && second < third && first < third) {
            System.out.println(second + " " + first + " " + third);
        } else {
            System.out.println(third + " " + first + " " + second);
        }
    }
}
