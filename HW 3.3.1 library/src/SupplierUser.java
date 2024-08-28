public class SupplierUser extends User implements Supplier{
    SupplierUser(String name) {
        super("Supplier " + name);
    }

    @Override
    public void bringBook( User taker, Book book) {
        System.out.println(name + " brought " + book.name + " to " + taker.name);
    }
}
