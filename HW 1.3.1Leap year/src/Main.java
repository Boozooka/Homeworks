import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год, не больше 2400 : ");
        short year = scanner.nextShort();

        if (year <= 2400 && (year % 4 == 0)){
            System.out.println("Год високосный");
        } else if (year > 2400){
            System.out.println("Некорректный год");
        } else {
            System.out.println("Год не високосный");
        }

    }
}
