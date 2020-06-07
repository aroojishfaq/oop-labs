
  public class Main{
    public static void main(String args[]) 
   {     Book book1=new Book();
         Book book2=new Book();
         Author author1=new Author("Arooj","talktoarooj@gmail.com");
         author1.displayA();
         Author author2=new Author("Aish","aish123@gmail.com");
         author2.displayA();
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
   Book  book3=new Book("English",author1,400,8);
   Book book4=new Book("History",author1,600,23);

 /*  book1.display();
   book2.display();
   book3.display();
   book4.display();
*/
Book[] book;
 book=new Book[4];
book[1]=b1;
book[2]=b2;
book[3]=b3;
book[4]=b4;

for(int i=0;i<4;i++){
 book[i].display();


}
}
}
