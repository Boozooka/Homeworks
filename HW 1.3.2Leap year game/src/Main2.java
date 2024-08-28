/*import java.util.Scanner;
public class Main {
    public static void game () {
        Scanner scanner = new Scanner(System.in);
        int year;
        int days = 0;
        int truedays = 0;
        int score = 0;

        System.out.println("Введи год в формате \"yyyy\" и попробуй угадать кол-во дней в этом году");
        System.out.println("Набери как можно больше очков");

        do {
            year = scanner.nextInt();
            days = scanner.nextInt();
            if (year % 4 == 0){
                truedays = 366;
            } else {
                truedays = 365;
            }
            score++;
            System.out.println("Счёт: " +  score);
        } while (days == truedays);
        System.out.println("Правильный ответ был: " + truedays);
        System.out.println("Игра окончена, ваш счёт: " + score);
    }

    public static void main(String[] args)
            throws java.io.IOException {
        System.out.println("Хотите сыграть? (Y or N)");
        char choise ;

        for (;;){
            choise = (char) System.in.read();
            if (choise == 'Y') {
                game();
                System.out.println("Хотите продолжить? (Y or N)");
            } else if (choise == 'N') {
                break;
            }
        }
    }
}*/

