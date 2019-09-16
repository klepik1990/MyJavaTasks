import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int prog, user, counter = 0;
        do {
            prog = (int) (Math.random() * 20 - 10);
        } while (prog == 0);
        System.out.println(prog);
        System.out.println("Я загадал число от -10 до 10, угадай его.");
        System.out.print("Введите ваше число:");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            do {
                user = input.nextInt();
                if (user == prog) {
                    System.out.println("В точку!");
                } else {
                    if (user >= -10 && user <= 10) {
                        System.out.println("Мимо");
                        if (prog * user < 0) {
                            System.out.println("Мое число другого знака");
                        } else if (prog < user) {
                            System.out.println("Мое число меньше");
                        } else {
                            System.out.println("Мое число больше");
                        }
                    } else {
                        System.out.println("Вообще хз откуда такое число взялось");
                    }
                }
                counter++;
            } while (user != prog);
            System.out.println("Вы угадали с " + counter + " попыток");
        } else {
            System.out.println("Не ввели число");
        }
        System.out.println("Пока");
    }
}
