import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] list = {"Milk", "Bread", "Cheese", "Chicken", "Buckwheat"};
        int[] price = {60, 20, 100, 250, 45};
        for (int j = 0; j < 5; j++){
            System.out.println((j + 1) + " " + list[j] + ", " +price[j] + " rubles per unit");
        }
        int[] basket = new int[5];
        int[] totalPrice = new int[5];
        while (true){
            System.out.println("Select new product or <end>");
            String select = scanner.nextLine();//1 3
            if ("end".equals(select)){
                break;
            }
            String[] parts = select.split(" ");//[1, 3]
            int product = Integer.parseInt(parts[0]) - 1;
            int count = Integer.parseInt(parts[1]);
            basket[product] += count;
        }
        for (int i = 0; i < 5; i++) {
            totalPrice[i] = basket[i] * price[i];
        }
        System.out.println("Your product Price FullPrice");
        for (int i = 0; i < 5; i++ ){
            if (totalPrice[i] != 0){
                System.out.println(list[i]+ " \t " + price[i] + " \t " + totalPrice[i]);
            }
        }
    }
}
