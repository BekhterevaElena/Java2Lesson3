import java.util.ArrayList;

public class Phonebook {


    ArrayList<Contact> directory = new ArrayList();
    void add(String surname, String phoneNumber) {
        directory.add(new Contact(surname, phoneNumber));

    }
        ArrayList<String> get(String surname) {
        ArrayList<String> searchContact = new ArrayList<>();
        for (int i=0; i < directory.size(); i++) {
            if (directory.get(i).getSurname() == surname) {
                searchContact.add( directory.get(i).getPhoneNumber());
            }
         }
            return searchContact;
        }

    }


