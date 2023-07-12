import java.util.Scanner;

public class PhoneBookApplication {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.print(UIConstants.MENU_PROMPT);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact phone number: ");
                    String phoneNumber = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber);
                    phoneBook.addContact(contact);
                    break;
                case 2:
                    System.out.print("Enter contact name to search: ");
                    String searchName = scanner.nextLine();
                    phoneBook.searchContact(searchName);
                    break;
                case 3:
                    System.out.print("Enter contact name to update: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    phoneBook.updateContact(updateName, newPhoneNumber);
                    break;
                case 4:
                    System.out.print("Enter contact name to delete: ");
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;
                case 5:
                    phoneBook.displayContacts();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
