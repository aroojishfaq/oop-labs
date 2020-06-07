
public class ContactsManager{
 Contact[]mycontacts;
 int ContactsCount;

public ContactsManager(){
 ContactsCount=0;
 Contact[]mycontacts=new Contact[500];
}
public void addContacts(String name,String num){
 if(ContactsCount<=500){
 Contact C=new Contact(name,num);
 ContactsCount++;

}
else{
 System.out.println("NO MORE CAPACITY TO STORE CONTACTS");
}
}
public Contact searchcontacts(String searchname){
  for(int i=0;i<=ContactsCount;i++){
  String n1=mycontacts[i].getName();
  if(n1.equals(searchname)){
   System.out.println("Contact found");
   return mycontacts[i];

}
}

return null;
}
}

