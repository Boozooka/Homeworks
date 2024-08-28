import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Contact contact1 = new Contact("Maria Ivanova", "8_999_873_66_78");
        Contact contact2 = new Contact("Gary Holdov", "7_444_333_12_34");
        Contact contact3 = new Contact("Ivan Campoch", "7_789_567_43_21");
        phoneBook.newList("Family");
        phoneBook.addContact("Family", contact1);
        phoneBook.addContact("Family", contact3);
        phoneBook.newList("Work");
        phoneBook.addContact("Work", contact2);
        phoneBook.addContact("Work", contact3);

        phoneBook.findToNumber("7_789_567_43_21");
        phoneBook.showGroup("Family");
    }
}
/*import java.util.*;

public class PhoneBook {
    HashMap<String, Set<Contact>> phoneBook = new HashMap<>();

    public void newList(String name) {
        Set<Contact> list1 = new HashSet<>();
        phoneBook.put(name, list1);
    }

    public void addContact(String groupName, Contact contact) {
        Set<Contact> list = phoneBook.get(groupName);
        list.add(contact);
    }

    public void findToNumber(String number) {
        one:
        for (Set<Contact> set : phoneBook.values()) {
            for (Contact contact : set) {
                if (contact.number.equals(number)) {
                    System.out.println(contact.getName() + "\n" + contact.getNumber());
                    break one;
                } else {
                    System.out.println("Contact not found");
                }
            }
        }
    }

    public void showGroup(String groupName) {
        System.out.println("\n" + groupName + ": ");
            for (Contact contact : phoneBook.get(groupName)){
                System.out.println(contact.name + "\n" + contact.number+ "\n");
            }

    }
}*/
/*public class Contact {
    String name;
    String number;
    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
*/
