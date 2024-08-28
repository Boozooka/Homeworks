public class ReaderSupplierUser extends User implements ReaderSupplier{
    ReaderSupplierUser(String name) {
        super(name);
    }

    @Override
    public void takeBook(Librarian giver, Book book) {
        System.out.println(name + " take " + book.name + " from Librarian");
    }

    @Override
    public void giveBook(User taker, Book book) {
        System.out.println(name + " give " + book.name + " to " + taker.name);
    }

    @Override
    public void bringBook(User taker, Book book) {
        System.out.println(name + " bring " + book.name + " to " + taker.name);
    }
}
