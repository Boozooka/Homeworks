import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число");

        int value = new Scanner(System.in).nextInt();
        int factorial ;

        for (int i = 1; i < value + 1; i = i + 1) {
            factorial = i * (i-1)*(i-2) * (i-2) * (i-3);

        }
        System.out.println();


    }
}
