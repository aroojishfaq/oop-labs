
public class Bid
{
   private final  Person bidder;
   private final long value;
   private  long HighestBid;
   public Bid(Person bidder, long value){
       this.bidder= bidder;
       this.value= value;
    }
    public long  getValue(){
        return this.value;
    }
     
    public Person getBidder(){
        return this.bidder;
    }
  
    
    
}