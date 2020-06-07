
  public class Main{
    public static void main(String args[]) 
   {     Book book1=new Book();
         Book book2=new Book();
         Author author1=new Author("Arooj","talktoarooj@gmail.com");
        author1.displayA();
          book1.setTitle("OOP");
          book1.getTitle();


      book1.setAuthor(author1);
       book1.getAuthor();

     book1.setQuantity(11);
     book1.getQuantity();


    book1. setPrice(984.32);
    book1.getPrice();


    book2.setTitle("Accounting");
    book2.getTitle();

  
    book2.setAuthor(author1);
    book2.getAuthor();


    book2.setQuantity(10);
    book2.getQuantity();
  
    book2. setPrice(900.21);
     book2.getPrice();

   book1.display();
   book2.display();
   
   Book  book3=new Book("English",author1,400,8);
   book3.display();
   Book book4=new Book("History",author1,600,23);
    book4.display();





}
}
