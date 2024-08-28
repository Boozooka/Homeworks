import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static Set<Student> set = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 1;
        String text;
        one:
        while (true) {
            System.out.println("1 Чтобы добавить ученика, 2 Чтобы вывести список учеников, 0 Чтобы выйти.");
            String s = scanner.nextLine();
            choice = Integer.parseInt(s);
            scanner.reset();
            switch (choice) {
                case 1:
                    System.out.println("Введите ученика (Фио, Номер класса, ID ученика)");
                    text = scanner.nextLine();
                    scanner.reset();
                    addStudent(text);
                    break;
                case 2:
                    for (Student student : set) {
                        System.out.println("- " + student.getName() + ", " +
                                student.getGroup() + ", " + student.getStudentId());
                    }
                    break;
                case 0:
                    break one;
            }
        }
    }

    public static void addStudent(String text) {
        String[] newText = new String[3];
        int nameEndPos = text.indexOf(" ");
        newText[0] = text.substring(0, nameEndPos);
        text = text.substring(nameEndPos + 1);
        int groupEndPos = text.indexOf(" ");
        newText[1] = text.substring(0, groupEndPos);
        text = text.substring(groupEndPos + 1);
        newText[2] = text;
        newText[0].trim();
        newText[1].trim();
        newText[2].trim();
        Student student = new Student(newText[0], newText[1], newText[2]);
        if (studentHasAlready(student)) {
            System.out.println("Студент с таким ID уже существует");
            return;
        }
        set.add(student);
    }

    public static boolean studentHasAlready(Student student) {
        return set.contains(student);
    }
}
