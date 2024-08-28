public class ReaderUser extends User implements Reader{
    ReaderUser(String name) {
        super("Reader " + name);
    }

    @Override
    public void takeBook( User giver, Book book) {
        System.out.println(name + " take book " + book.name);
    }

    @Override
    public void giveBook( User giver, Book book) {
        System.out.println(name + " give book " + book.name);
    }
}
