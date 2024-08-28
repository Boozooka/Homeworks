public class Main {
    public static void main(String[] args) {
        LibrarianReader readerLibrarian = new LibrarianReaderUser("Genadiy");
        Reader reader = new ReaderUser("Michail");
        Admin admin = new AdminUser("Maria");
        Supplier supplier = new SupplierUser("Petya");
        Book book1 = new Book("War and peace");
        Book book2 = new Book("Field of Death");
        readerLibrarian.orderBook(supplier, book1);
        readerLibrarian.orderBook(supplier, book2);

        admin.giveBook(readerLibrarian, book1);
        admin.giveBook(reader, book2);
        admin.remindOverdued(readerLibrarian, book1);
        reader.giveBook(book2);

    }
}
