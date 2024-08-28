public class Main {
    public static void main(String[] args) {

        int coffeeAmount = 40;
        int milkAmount = 10;

        int coffeeRequired = 60;
        int milkRequired = 40;


        if (coffeeAmount >= coffeeRequired) {
            System.out.println("Кофе достаточно");
        } else {
            System.out.println("Кофе недостаточно");
        }
        if (milkAmount >= milkRequired) {
            System.out.println("Молока достаточно");
        } else {
            System.out.println("Молока недостаточно");
        }


        if (coffeeAmount >= coffeeRequired && milkAmount >= milkRequired) {
            System.out.println("Готовим кофе");
        } else {
            System.out.println("Ингредиентов недостаточно");
        }
    }
}
