import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise, income, consum;
        double genIncome = 0;
        double genConsum = 0;
        double tax1, tax2;

        for (; ; ) {
            System.out.println("Выберите одну из четырёх операций");
            System.out.println("1. Добавить доход");
            System.out.println("2. Добавить расход");
            System.out.println("3. Выбрать систему налогов");
            System.out.println("4. Завершить работу программы");

            choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Введите доход");
                    income = scanner.nextInt();
                    genIncome += income;
                    break;
                case 2:
                    System.out.println("Введите расход");
                    consum = scanner.nextInt();
                    genConsum += consum;
                    break;
                case 3:
                    if (genIncome >= genConsum) {
                        flow(getTax1(genIncome), getTax2(genIncome, genConsum));
                    } else {
                        System.out.println("Расход превысил доход");
                        System.out.println("Расход не должен превышать доход");
                    }
            }
            if (choise == 4) {
                break;
            }
        }
    }
    public static double getTax1(double income){
        return income * 0.06;
    }
    public static double getTax2(double income, double consum){
        return Math.abs(income - consum) * 0.15;
    }

    public static void flow(double flow1, double flow2) {
        if (flow1 < flow2) {
            System.out.println("Рекомендую выбрать систему налога 1");
            System.out.println("Налог при этой системе УСН доходы 6%: " + flow1);
            System.out.println("Налог при другой системе УСН доходы - расходы: " + flow2);
            System.out.println("Экономия: " + (flow2 - flow1));
        } else if (flow1 > flow2) {
            System.out.println("Рекомендую выбрать систему налога 2");
            System.out.println("Налог при этой системе УСН доходы - расходы: " + flow2);
            System.out.println("Налог при другой УСН доходы 6%: " + flow1);
            System.out.println("Экономия: " + (flow1 - flow2));
        }
    }
}