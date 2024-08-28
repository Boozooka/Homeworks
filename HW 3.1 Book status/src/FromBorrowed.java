public class FromBorrowed extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.AVAILABLE || requestedStatus == Status.ARCHIVED ||
        requestedStatus == Status.OVERDUED){
            book.status = requestedStatus;
        } else {
            System.out.println("Transfer to this class is not possible");
        }
    }
}
