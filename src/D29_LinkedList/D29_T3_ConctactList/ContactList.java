package D29_LinkedList.D29_T3_ConctactList;

import java.util.LinkedList;

public class ContactList {

    //    Creating my Instance of a List with groceryItems for using it with a constructor of a List
    LinkedList<ContactItem> myContactList = new LinkedList<>();


    public void addContact(String givenName, String givenPhoneNumber) {
        ContactItem contactItem = new ContactItem(givenName, givenPhoneNumber);
        myContactList.add(contactItem);
    }


    public void searchContact(String searchName) {
        System.out.println("- - - - -");
        boolean isSearchName = false;

        for (ContactItem element : myContactList) {
            if (element.name.equals(searchName)) {
                isSearchName = true;
                System.out.printf("The searched name %s found successfully: \n", searchName);
                System.out.printf("Name : %s, \t Phone Number: %s.\n", element.name, element.phoneNumber);
            }
        }

        if (!isSearchName) {
            System.out.printf("The searched name %s does not exist in the List.\n", searchName);
        }

    }


    public void displayList() {
        if (!myContactList.isEmpty()) {
            System.out.println("- - - - -");
            System.out.println("The Contact List: ");
            for (ContactItem element : myContactList) {
                System.out.printf("Name : %s, \t Phone Number: %s.\n", element.name, element.phoneNumber);
            }
        } else {
            System.out.println("The List is empty. Add a contact first.");
        }

    }
}