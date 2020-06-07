public class Main {
    public static void main(String[] args) {
        ContactManager myContactsManager = new ContactManager();
        Contacts Arooj = new Contacts("Arooj", "125");
        myContactsManager.addContacts(Arooj);
        Contacts myContact2 = new Contacts();
        myContact2.setName("Sana");
        myContact2.setphoneNumber("451");
        myContactsManager.addContacts(myContact2);
        Contacts myContact3 = new Contacts();
        myContact3.setName("Aish");
        myContact3.setphoneNumber("78223");
        myContactsManager.addContacts(myContact3);
        boolean result = myContactsManager.searchContacts("Arooj");
        // System.out.println(result.getphoneNumber());
        boolean result2 = myContactsManager.removeContacts("Sana");
        boolean result3 = myContactsManager.searchContacts("Sana");

    }
}