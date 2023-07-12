import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
        System.out.println("Contact added: " + contact.getName());
    }

    public void searchContact(String name) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            System.out.println("Contact found: " + contact.getName() + " - " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void updateContact(String name, String phoneNumber) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            contact.setPhoneNumber(phoneNumber);
            System.out.println("Contact updated: " + contact.getName());
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void deleteContact(String name) {
        Contact contact = contacts.remove(name);
        if (contact != null) {
            System.out.println("Contact deleted: " + contact.getName());
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public void displayContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts.values()) {
            System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
        }
    }
}