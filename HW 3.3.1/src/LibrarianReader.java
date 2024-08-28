public interface LibrarianReader extends Librarian, Reader{
    @Override
    void orderBook(Supplier supplier, Book book);

    @Override
    void takeBook(Book book);

    @Override
    void giveBook(Book book);
}
