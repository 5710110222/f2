import java.util.ArrayList;

public class Auction
{
  private ArrayList<Lot> lots; // list of lots in the auction

  public Auction() {
     lots = new ArrayList<Lot>();  
  }

  public void enterLot(int lotNum, String description){
     lots.add( new Lot(lotNum, description) );  
  }                  // should check uniqueness of lotNum

  public void bidFor(int id,String name, int price){
   
    for(Lot lot : lots){
      if(lot.getIdNum() == id && price >lot.getHighesBid()){
          System.out.println("The bid for lot number " + id + " was successful.");
          lot.bidFor(name, price);
        }
      else if(lot.getIdNum() == id && price < lot.getHighesBid()){
        System.out.println("Lot number:" + id + "already has a bid of" + price);
      }
    }
  

  
}  // end of Auction class

  public void showLots()
  { 
      for (Lot lot : lots)
      System.out.println(lot.toString());
  }

  public Lot getLot(int lotNum)
  {
    for(Lot lot : lots)
      if (lot.getIdNum() == lotNum)
      return lot;
    System.out.println("Lot number: " + lotNum +" does not exist.");
    return null;
  }  
}
