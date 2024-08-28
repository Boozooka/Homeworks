public class BookMover {
    protected String name;
    protected Status status = Status.AVAILABLE;

    protected void moveToStatus(Book book, Status requestedStatus) {
        System.out.println("Moving status...");
        book.status = requestedStatus;
    }
}
