public class AdminUser extends User implements Admin{
    public AdminUser(String name) {
        super(name);
    }

    @Override
    public void remindOverdued(Reader reader, Book book) {
        System.out.println(name + " remind about overdued " + book.name + " to reader\n");
        reader.giveBook(book);
    }

    @Override
    public void giveBook(Reader reader, Book book) {
        System.out.println(name + " give " + book.name + " to reader\n");
        reader.takeBook(book);
    }
}
