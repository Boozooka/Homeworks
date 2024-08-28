import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    final static int maxFloor = 25;
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            System.out.println("Select floor");
            choice = scanner.nextInt();
            if (choice == 0) break;
            if (choice <= maxFloor && choice > 0){
                queue.add(choice);
            } else {
                System.out.println("Incorrect floor");
            }
        }
        showQueue(queue);
    }
    public static void showQueue (Queue<Integer> queue){
        System.out.println("Elevator route: ");
        while (!queue.isEmpty()){
            System.out.print(" -> " + queue.poll() + " floor ");
        }
    }
}
