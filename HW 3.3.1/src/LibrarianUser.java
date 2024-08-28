public class LibrarianUser extends User implements Librarian{
    public LibrarianUser(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println(name + " order " + book.name + " from supplier\n");
        supplier.bring(book);
    }
}
