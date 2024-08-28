import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String name = ask("Name", "Misha");
        String task = ask("task", "I want walk today from 14 to 19");
        int startTime = extractTime(task, "from ");
        int endTime = extractTime(task, "to ");

        System.out.println("Task time need: " + (endTime - startTime) + " hours");
    }
    public static int extractTime(String task, String phrase){
        int pos = task.indexOf(phrase);
        pos += phrase.length();
        String timeStr = task.substring(pos, pos+2);
        timeStr = timeStr.trim();
        int timeInt = Integer.parseInt(timeStr);
        return timeInt;
    }

    public static String ask(String message, String example) {

        System.out.println("Say your " + message);
        System.out.println("Example: " + example);
        System.out.print(">> ");
        String input = scanner.nextLine();
        System.out.println();
        return input;
    }
}
