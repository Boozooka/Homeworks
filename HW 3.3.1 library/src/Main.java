public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java guide", "Gerber Shildt");
        Book book2 = new Book("Red Riding Hood", "Sharl Perro");
        Book book3 = new Book("Field of death", "Li Child");
        AdminUser admin = new AdminUser("Genadiy");
        LibrarianUser librarian = new LibrarianUser("Natalia");
        ReaderSupplierUser supplier = new ReaderSupplierUser("Ivan");
        ReaderUser reader = new ReaderUser("Gregory");
        reader.takeBook( librarian, book1);
        admin.remindOverdued( supplier, book2);
        librarian.orderBook( supplier, book3);
        admin.remindOverdued( reader, book1);
        supplier.bringBook( librarian, book3);
        supplier.giveBook( admin, book2);
        reader.giveBook( admin, book1);
    }
}
