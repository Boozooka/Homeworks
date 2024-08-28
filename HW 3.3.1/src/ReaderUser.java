public class ReaderUser extends User implements Reader{
    public ReaderUser(String name) {
        super(name);
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
