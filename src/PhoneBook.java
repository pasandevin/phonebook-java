import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts;

    public PhoneBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
        System.out.println(UIConstants.CONTACT_ADDED_MSG+ contact.getName());
    }

    public void searchContact(String name) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            System.out.println(UIConstants.CONTACT_FOUND_MSG + contact.getName() + " - " + contact.getPhoneNumber());
        } else {
            System.out.println(UIConstants.CONTACT_NOT_FOUND_MSG + name);
        }
    }

    public void updateContact(String name, String phoneNumber) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            contact.setPhoneNumber(phoneNumber);
            System.out.println(UIConstants.CONTACT_UPDATED_MSG + contact.getName());
        } else {
            System.out.println(UIConstants.CONTACT_NOT_FOUND_MSG + name);
        }
    }

    public void deleteContact(String name) {
        Contact contact = contacts.remove(name);
        if (contact != null) {
            System.out.println(UIConstants.CONTACT_DELETED_MSG + contact.getName());
        } else {
            System.out.println(UIConstants.CONTACT_NOT_FOUND_MSG + name);
        }
    }

    public void displayContacts() {
        System.out.println(UIConstants.CONTACTS_DISPLAY_MSG);
        for (Contact contact : contacts.values()) {
            System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
        }
    }
}