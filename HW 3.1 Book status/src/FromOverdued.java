public class FromOverdued extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.AVAILABLE || requestedStatus == Status.ARCHIVED){
            book.status = requestedStatus;
        } else {
            System.out.println("Transfer to this class is not possible");
        }
    }
}
