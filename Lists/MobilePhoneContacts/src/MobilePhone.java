import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);

        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int indexOfOldContact = findContact(oldContact);
        if (indexOfOldContact < 0) {
            return false;
        }
        myContacts.set(indexOfOldContact, newContact);

        return true;
    }

    public boolean removeContact(Contact contact) {

        int indexOfContact = findContact(contact);
        if (indexOfContact < 0) {
            return false;
        }
        myContacts.remove(indexOfContact);
        return true;
    }

    private int findContact(Contact contact) {

        return myContacts.indexOf(contact);
    }

    private int findContact(String contact) {

        return myContacts.indexOf(queryContact(contact));
    }

    public Contact queryContact(String contact) {

        for (Contact c : myContacts) {
            if (c.getName().equals(contact)) {
                return c;
            }
        }
        return null;
    }

    public void printContacts() {

        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.printf("%d. %s -> %s%n", i+1, contact.getName(), contact.getPhoneNumber());
        }
    }
}
