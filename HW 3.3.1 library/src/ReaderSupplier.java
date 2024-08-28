public interface ReaderSupplier extends Reader, Supplier{
    @Override
    void takeBook(Librarian giver, Book book);

    @Override
    void giveBook(User giver, Book book);

    @Override
    void bringBook(User taker, Book book);
}
