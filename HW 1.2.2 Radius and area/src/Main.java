import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Записывайте в сантиметрах
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга в сантиметрах");
        int radius = scanner.nextInt();
        double pi = 3.1415;

        double area = pi * (radius * radius);
        double perimeter = pi * (radius * 2);

        System.out.println("Площадь равна " + area + " кв.см.");
        System.out.println("Периметр равен " + perimeter + " см.");

    }
}
