public class SupplierUser extends User implements Supplier{
    public SupplierUser(String name) {
        super(name);
    }

    @Override
    public void bring(Book book) {
        System.out.println(name + " bring " + book.name + " in library\n");
    }
}
