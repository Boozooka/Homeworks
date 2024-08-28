public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instane.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        /*
        Чтобы деление работало отказоустойчиво всегда, нужно сделать
        проверку второго числа на равенство с 0
        В положительном случае вернуть ошибку или -1
         */
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}
