public class ContactsManager{
 Contact[] mycontacts;
 int ContactsCount;

public ContactsManager(){
 ContactsCount=0;
  mycontacts = new Contact[500];
}
public void addContacts(String name,String num){
 if(ContactsCount<=500){
 Contact contact = new Contact();
 mycontacts[ContactsCount] = contact;
 mycontacts[ContactsCount].name = name;
 mycontacts[ContactsCount].num = num;

System.out.println(mycontacts[ContactsCount].name +" " + mycontacts[ContactsCount].num);
 ContactsCount++;

}
else{
 System.out.println("NO MORE CAPACITY TO STORE CONTACTS");
}
}
 Contact searchContacts(String searchName){
  for(int i=0;i<=ContactsCount;i++){
  String n1=mycontacts[i].name;
  if(n1.equals(searchName)){
   System.out.println("Contact found");
   return mycontacts[i];

}
}
 return null;

}
}




