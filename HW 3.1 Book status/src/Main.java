import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Book book = new Book("Java guide");
        int choice;
        System.out.println("Select a new status");
        System.out.println("1.Available \n2.Borrowed \n3.Archived \n4.Overdued \n5.Exit and show status");
        one:
        while (true) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    oldStatus(book, Status.AVAILABLE); break;
                case 2:
                    oldStatus(book, Status.BORROWED); break;
                case 3:
                    oldStatus(book, Status.ARCHIVED); break;
                case 4:
                    oldStatus(book, Status.OVERDUED); break;
                case 5:
                    break one;
            }
        }
        System.out.println(book.status);
    }

    public static void oldStatus(Book book, Status requestedStatus){
        FromAvailable fromAvailable = new FromAvailable();
        FromBorrowed fromBorrowed = new FromBorrowed();
        FromArchived fromArchived = new FromArchived();
        FromOverdued fromOverdued = new FromOverdued();

        switch (book.status){
            case AVAILABLE: fromAvailable.moveToStatus(book, requestedStatus); System.out.println("Current status " + book.status);
            break;
            case ARCHIVED: fromArchived.moveToStatus(book, requestedStatus); System.out.println("Current status " + book.status);
            break;
            case OVERDUED: fromOverdued.moveToStatus(book, requestedStatus); System.out.println("Current status " + book.status);
            break;
            case BORROWED: fromBorrowed.moveToStatus(book, requestedStatus); System.out.println("Current status " + book.status);
            break;
        }
    }
}


