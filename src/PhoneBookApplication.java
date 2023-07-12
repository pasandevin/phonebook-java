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
                    System.out.print(UIConstants.ASK_CONTACT_NAME_MSG);
                    String name = scanner.nextLine();
                    System.out.print(UIConstants.ASK_CONTACT_PHONE_NUMBER_MSG);
                    String phoneNumber = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber);
                    phoneBook.addContact(contact);
                    break;
                case 2:
                    System.out.print(UIConstants.ASK_CONTACT_NAME_TO_SEARCH_MSG);
                    String searchName = scanner.nextLine();
                    phoneBook.searchContact(searchName);
                    break;
                case 3:
                    System.out.print(UIConstants.ASK_CONTACT_NAME_TO_UPDATE_MSG);
                    String updateName = scanner.nextLine();
                    System.out.print(UIConstants.ASK_CONTACT_PHONE_NUMBER_TO_UPDATE_MSG);
                    String newPhoneNumber = scanner.nextLine();
                    phoneBook.updateContact(updateName, newPhoneNumber);
                    break;
                case 4:
                    System.out.print(UIConstants.ASK_CONTACT_NAME_TO_DELETE_MSG);
                    String deleteName = scanner.nextLine();
                    phoneBook.deleteContact(deleteName);
                    break;
                case 5:
                    phoneBook.displayContacts();
                    break;
                case 0:
                    System.out.println(UIConstants.EXISTING_APP_MSG);
                    break;
                default:
                    System.out.println(UIConstants.INVALID_CHOICE_MSG);
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
