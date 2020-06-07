   public class Author{
   String name;
   String email;
   String newEmail;
    public Author(String AuthorName,String AuthorEmail)
  { 
      name=AuthorName;
      email=AuthorEmail;

}
public Author(){
   }
   public String getName(){
   return name;
}
   public String getEmail(){
   return email;
   
}
   public void setName(String name){
   this.name=name;

}
    public void setEmail(String email){
    this.email=email;
}

boolean updateEmail(String newEmail){
   this.email=newEmail;
   return true;

 }
  public void displayA(){
     System.out.println("Name of author is"+name);
     System.out.println("Name of email is"+email);
     System.out.println("New Email is updated:"+newEmail);

}
																								}