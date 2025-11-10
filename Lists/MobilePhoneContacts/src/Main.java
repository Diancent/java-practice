public class Main {

    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("34567891");
        Contact bob = new Contact("Bob", "31415926");
        Contact alice = new Contact("Alice", "16180339");
        Contact charlie = new Contact("Charlie", "44444444");
        Contact david = new Contact("David", "555555555");

        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(bob);
        mobilePhone.addNewContact(alice);
        mobilePhone.addNewContact(charlie);

        mobilePhone.printContacts();

        mobilePhone.removeContact(alice);
        mobilePhone.printContacts();

        mobilePhone.updateContact(charlie, david);
        mobilePhone.printContacts();
    }
}
