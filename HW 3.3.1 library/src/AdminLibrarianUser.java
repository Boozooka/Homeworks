public class AdminLibrarianUser extends User implements AdminLibrarian{
    AdminLibrarianUser(String name) {
        super("AdminLibrarian " + name);
    }

    @Override
    public void remindOverdued(User reader, Book book) {
        System.out.println(name + " remind around overdued " + book.name + " by " + reader.name);
    }

    @Override
    public void takeBook(User giver, Book book) {
        System.out.println(name + " take "  + book.name + " from " + giver.name);
    }

    @Override
    public void orderBook(User salesMan, Book book) {
        System.out.println(name + " order " + book.name + " by " + salesMan.name);
    }

    @Override
    public void giveBook(User giver, Book book) {
        System.out.println(name + " give " + book.name + " to " + giver.name);
    }
}
