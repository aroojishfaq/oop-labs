

public class Main
{
   
    public static void main(String args[]){
Auction auction1=new Auction();
 auction1.enterLot("car");
 auction1.showLots();
Person p1=new Person("Ali");
 auction1.BidFor(1,p1,50000);
 auction1.showLots();
 auction1.getUnsold();
 auction1.removeLot(10);
 auction1.close();
 
Auction auction2=new Auction();
 auction2.enterLot("bike");
 auction2.showLots();
auction2.getUnsold();
Person p2=new Person("hadi");
auction2.BidFor(2,p2,400);
auction2.getUnsold();
 auction2.removeLot(20);
 auction2.close();
 

}
}
