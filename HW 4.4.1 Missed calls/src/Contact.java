import java.util.HashMap;
import java.util.Map;

public class Contact {
    private final String name;
    private final String surname;
    private final String phone;
    private final Group group;

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getPhone(){
        return phone;
    }
    public Group getGroup(){
        return group;
    }

    public Contact(String name, String surname, String phone, Group group) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.group = group;
    }

    static Map<String, Contact> map = new HashMap<>();
    public static Map<String, Contact> getMap(){
        return map;
    }
    protected static void newContact(String name, String surname, String phone, Group group) {
        Contact contact = new Contact(name, surname, phone, group);
        getMap().put(phone, contact);
    }

    protected static void deleteContact(String name, String surname) {
        for (Contact contact : getMap().values()) {
            if (contact.getSurname() == surname && contact.getName() == name) {
                getMap().remove(contact.getPhone());
                return;
            }
        }
        System.out.println("This Contact not found");
    }
    /*protected static Contact getContact(String phone){
        getMap().
    }*/

    protected static boolean findContact(String phone) {
        for (Contact contact : getMap().values()) {
            if (contact.getPhone().equals(phone)) {
                System.out.println("Contact find\n" + contact.getName() + " " + contact.getSurname());
                return true;
            }
        }
        System.out.println("Contact not found");
        return false;
    }

    @Override
    public String toString() {
        return name + " " + surname + "\n" +
                phone + " group - " + group;
    }
}
