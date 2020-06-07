import java.util.*;

public class Main
{
   public static void main(String args[]){
        Library lib = new Library();
       Book b1= new Book("atif ishaq",100, 1979,"7th","8675456779");
       Book b2= new Book("ali raza",120, 2000,"9th","884764367439");
       Book b3= new Book("mir taki mir",150, 1999,"11th","1736844899");
       Book b4= new Book("bahadar sha zafar",200, 2011,"12th","4572727828");
    
        lib.addBooks("8675456779",b1);
        lib.addBooks("884764367439",b2);
         lib.addBooks("1736844899",b3);
          lib.addBooks("4572727828",b4);
         Book b5= lib.search("1736844899");
         
        b5.display();
          
          
        
   

}
}

