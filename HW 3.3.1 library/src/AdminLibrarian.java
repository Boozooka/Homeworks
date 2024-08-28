public interface AdminLibrarian extends Admin, Librarian{
    @Override
    void remindOverdued( Reader reader, Book book);
    @Override
    void takeBook( Reader giver, Book book);

    @Override
    void orderBook( User salesMan, Book book);
    @Override
    void giveBook( Reader taker, Book book);
}
