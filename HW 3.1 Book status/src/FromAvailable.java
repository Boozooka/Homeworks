public class FromAvailable extends BookMover{
    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.BORROWED || requestedStatus == Status.ARCHIVED){
            book.status = requestedStatus;
        } else {
            System.out.println("Transfer to this class is not possible");
        }
    }
}
   /* public void statusCheck (Book book, Status requestedStatus) {
        if (requestedStatus == Status.BORROWED || requestedStatus == Status.ARCHIVED){
            moveToStatus(book, requestedStatus);
        } else {
            System.out.println("Transfer to this class is not possible");
        }
    }*/