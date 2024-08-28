public class LibrarianUser extends User implements Librarian{
    LibrarianUser(String name) {
        super("Librarian " + name);
    }

    @Override
    public void orderBook(User salesMan, Book book) {
        System.out.println(name + " order " + book.name + " by " + salesMan.name);
    }

    @Override
    public void giveBook(Reader taker, Book book) {
        System.out.println(name + " give " + book.name + " to " + giver.name);
    }
}
