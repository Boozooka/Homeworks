public class FromArchived extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.AVAILABLE){
            book.status = requestedStatus;
        } else {
            System.out.println("Transfer to this class is not possible");
        }
    }
}
