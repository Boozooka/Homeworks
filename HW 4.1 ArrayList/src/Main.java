import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, numtask;
        one:
        while (true) {
            System.out.println("\nSelect operation\n1.Add task\n2.Delete task\n3.Show task list\n0.End");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter your task");
                    String task = scanner.next();
                    addTask(list, task);
                }
                break;
                case 2:
                    System.out.println("Select a task");
                    showList(list);
                    numtask = scanner.nextInt() - 1;
                    list.remove(numtask);
                    break;
                case 3:
                    showList(list);
                    break;
                case 0:
                    break one;
            }
        }
    }

    public static void addTask(List<String> list, String task) {
        list.add(task);
    }

    public static void showList(List<String> list) {
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

