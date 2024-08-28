public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта стоимости топлива");

        int fuelType1 = 92;
        int amount = 50;

        double fuel92Price = 60.2;
        double fuel95price = 67.33;

        double discount = 0.1;

        double fuelPrice = 0;
        if(fuelType1 == 92) {
            fuelPrice = fuel92Price;

        }
        else if(fuelType1 == 95) {
            fuelPrice = fuel95price;
        }else {
            System.out.println("Указан неверный тип топлива");
        }

        if (amount > 10) {
            fuelPrice = (1 - discount) * fuelPrice;
        }

        if(amount < 1) {
            System.out.println("Указан малое количество топлива");
            amount = 0;
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + "руб.");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");

    }
}
