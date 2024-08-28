import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerChoice = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        MissedCalls missedCalls = new MissedCalls();
        int choice;
        String name, surname, phoneNumber, text;
        Group group;
        one:
        while (true) {
            System.out.println("Select option:\n1.Add contact\n2.Add Missed call\n3.Show all missed calls" +
                    "\n4.Clear missed call list\n5.end of program");
            choice = scannerChoice.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter name");
                    name = scannerString.nextLine();
                    System.out.println("Enter surname");
                    surname = scannerString.nextLine();
                    System.out.println("Enter phone number");
                    phoneNumber = scannerString.nextLine();
                    System.out.println("Enter group");
                    text = scannerString.nextLine();
                    group = Group.valueOf(text);
                    Contact.newContact(name, surname, phoneNumber, group);
                    break;
                case 2:
                    System.out.println("Enter number from which they called");
                    text = scannerString.nextLine();
                    missedCalls.addMissCall(text);
                    break;
                case 3:
                    missedCalls.showMissCalls(Contact.getMap());
                    break;
                case 4:
                    missedCalls.clearMissCalls();
                    break;
                case 5:
                    break one;
            }
        }
    }
}
