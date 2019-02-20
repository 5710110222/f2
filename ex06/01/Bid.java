public class Bid{
    private String bidderName;
    private int value; 

    public Bid(String bidname, int price){
        bidderName = bidname;
        value = price;
    }
    public String getBidderName(){
        return bidderName;
    }
    public int getValue(){
        return value;
    }
}