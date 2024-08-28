public class AdminUser extends User implements Admin{
    AdminUser(String name) {
        super("Admin " + name);
    }

    @Override
    public void remindOverdued(Reader reader, Book book) {
        System.out.println(name + " remind around overdued " + book.name + " to Reader");
    }

    @Override
    public void takeBook(Reader giver, Book book) {
        System.out.println(name + " take " + book.name + " by ");
    }
}
