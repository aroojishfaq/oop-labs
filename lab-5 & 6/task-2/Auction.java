
import java.util.ArrayList;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Auction
{
    private ArrayList<Lot> lots;
    
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
            
        public  ArrayList<Lot> getUnsold(){
    ArrayList<Lot> unsold=new ArrayList<Lot>();
    for(Lot lot:lots){
        Bid bid=lot.getHighestBid();
        if(bid==null){
            unsold.add(lot);
        }
    
    
    }
    return unsold;
    
   }
    

    public void BidFor(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            boolean successful = selectedLot.BidFor(new Bid(bidder, value));
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
            }
            else {
                // Report which bid is higher.
                Bid HighestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   HighestBid.getValue());
            }
        }
    }

   
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            // The number seems to be reasonable.
            Lot selectedLot = lots.get(lotNumber - 1);
            // Include a confidence check to be sure we have the
            // right lot.
            if(selectedLot.getNumber() != lotNumber) {
                System.out.println("Internal error: Lot number " +
                                   selectedLot.getNumber() +
                                   " was returned instead of " +
                                   lotNumber);
                // Don't return an invalid lot.
                selectedLot = null;
            }
            return selectedLot;
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
        }
    }
    


    public Lot removeLot(int number)
    {
        if(number == 0)
        {
            System.out.println("Invalid Entry: You need to enter a valid number");
        }
        
        else if (number<= lots.size())
        
        {
        lots.remove(number);
        System.out.println("Item Number " +number+ " has been deleted.");
        }
        return null;
         }


    
    public void close(){
        for (Lot lotLoopVariable : lots ){
            System.out.println(lotLoopVariable);
            
        }
    }
}
    