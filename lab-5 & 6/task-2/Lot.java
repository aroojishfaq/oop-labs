
import java.util.*;
public class Lot
{
    
    
    private int  number;
    private String description;
    private Bid HighestBid;
    
    public Lot(int number, String description){
        this.number=number;
        this.description=description;
    }
      public int getNumber(){
          return number;
        }
        public String getdiscription(){
            return description;
        }
        public Bid getHighestBid(){
            return this.HighestBid;
        }
        public void setHighestBid(Bid HighestBid){
            this.HighestBid=HighestBid;
        }
        
        
         public String toString()
    {
        String details = number + ": " + description;
        if(HighestBid != null) {
            details += "    Bid: " + 
                       HighestBid.getValue();
        }
        else {
            details += "    (No bid)";
        }
        return details;
    }
    
     public boolean BidFor(Bid bid)
    {
        if((HighestBid == null) ||
               (bid.getValue() > HighestBid.getValue())) {
            // This bid is the best so far.
            HighestBid = bid;
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * @return The lot's description.
     */
    public String getDescription()
    {
        return description;
    }
    
        
       
    
    
    
    
    
}
