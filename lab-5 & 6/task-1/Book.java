
 public class Book{
       
     String name ;
     int no_of_pages;
     int published_year;
     String edition;
     String isbn;
     public Book( String name,int no_of_pages, int published_year, String edition, String isbn){
         
         this.name=name;
         this.no_of_pages=no_of_pages;
         this.published_year=published_year;
         this.edition= edition;
         this.isbn= isbn;
        
         

        }
        public void display(){
            System.out.println("Author: " +name);
            System.out.println("No of pages : " +no_of_pages);
            System.out.println("published year : " +published_year);
            System.out.println("edition : " +edition);
            System.out.println("ISBN : " +isbn);
           
          
           
            
            
        }

   
    





   
    }

    