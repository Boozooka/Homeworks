import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String list[] = {"Milk", "Bread", "Buckwheat", "Chicken", "Cheese"};
        int prices[] = {60, 25, 40, 250, 130};

        System.out.println("Product\tPrice\n" + list[0] + "  \t" + prices[0] + '\n' + list[1] + '\t' + prices[1] + '\n' + list[2] +
                '\t' + prices[2] + '\n' + list[3] + '\t' + prices[3] + '\n' + list[4] + '\t' + prices[4]);

        while (true) {
            System.out.println("Enter <new product> or <end>");
            String choice = scanner.nextLine();
            if (choice.equals("end")) break;

            else if (choice.equals("new product")){
            String[] parts = choice.split(" ");
            int numberProduct = Integer.parseInt(parts[0]);
            int count = Integer.parseInt(parts[1]);
            Product product1 = new Product(list[numberProduct], prices[numberProduct], count);
            }
        }
    }
}
