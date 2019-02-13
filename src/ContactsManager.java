import java.util.*;

public class ContactsManager {

    List<Contact> contacts = new ArrayList<>();

    void addContact(String name, String phoneNumber) {
        Contact contact = new Contact();
        contact.name = name;
        contact.phoneNumber = phoneNumber;
        contacts.add(contact);
    }

   String searchContact(String name){
       for (Contact contact : contacts) {
           if (contact.name.equals(name)) {
               return contact.phoneNumber;
           }
       }
       return null;
   }
}
