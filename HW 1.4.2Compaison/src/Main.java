import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstD;
        float secondF;

        System.out.println("Выберите операцию над числами Double или Float (дробные числа)");
        System.out.println("1. Сравнить\n2. Округлить\n3. Отбросить дробную часть");
        int choise = scanner.nextInt();

        switch (choise){
            case 1 :
                System.out.println("Введите первое число");
                firstD = scanner.nextDouble();
                System.out.println("Введите второе число");
                secondF = scanner.nextFloat();

                if (Math.abs(firstD - (double) secondF) < 0.00001){
                    System.out.println("Числа равны");
                } else if (firstD > secondF) {
                    System.out.println(firstD + " больше чем " + secondF);
                } else if (secondF > firstD) {
                    System.out.println(secondF + " больше чем " + firstD);
                }
                break;
            case 2 :
                System.out.println("Введите число");
                firstD = scanner.nextDouble();
                System.out.println("Округлённое число: " + Math.round(firstD));

            case 3 :
                System.out.println("Введите число");
                firstD = scanner.nextDouble();
                System.out.println("Число без дробной части: " + (long) firstD);
        }
    }
}
