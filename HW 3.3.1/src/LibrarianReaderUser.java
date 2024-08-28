public class LibrarianReaderUser extends User implements LibrarianReader{
    public LibrarianReaderUser(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println(name + " order " + book.name + " from supplier\n");
        supplier.bring(book);
    }

    @Override
    public void takeBook(Book book) {
        System.out.println(name + " take " + book.name + "\n");
    }

    @Override
    public void giveBook(Book book) {
        System.out.println(name + " return " + book.name + " in library\n");
    }
}
