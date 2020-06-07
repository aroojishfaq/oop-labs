public class Book
{    
     String title;
     Author author;
     double price;
     int quantity;

     public Book(String Booktitle,Author Bookauthor,double Bookprice,int Bookquantity)
        {
           title=Booktitle;
           author= Bookauthor;
           price= Bookprice;
           quantity= Bookquantity;
}

 Book(){
   }
     public String getTitle()
    {
        String t=this.title;
        return t;
    }
    
     public Author getAuthor(){
   
        return author;
    }
     public int getQuantity()
    { int q=this.quantity;
        return q; 
    }
    public double getPrice()
    { double p=this.price;
        return p;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }
    
     public void setAuthor(Author author)
    {
       this.author=author;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    } 
    public void setPrice(double price)
    {
        this.price=price;
    }    
     public void display(){
           System.out.println("title of book is "+this.title);
           System.out.println("author of book is " +author.name+ ", " +author.email );
           System.out.println("price of book is "+this.price);
           System.out.println("quantity of book is "+this.quantity);
}
}
