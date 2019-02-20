import java.util.ArrayList;

public class Lot{
    private int n;
    private String e;
    private int highest;
    private ArrayList<Bid> bids;

    public Lot(int num, String explain){
       
        n = num;
        e = explain;
        highest =0;
         bids = new ArrayList<Bid>(); 
    }

    public void bidFor(String namebid,int price){
        bids.add(new Bid(namebid,price));
    }

    public String getDescription(){
        return e;
    }

    public int getHighesBid(){
        for(Bid b : bids){
            if(b.getValue()> highest)
                highest = b.getValue();
        }
        return highest;
    }
    public int getIdNum(){
        return n;
    }
    public String toString(){
        String s = " ";
        if(bids.isEmpty()){
            s = getIdNum() + getDescription() + "          <NO bid>";
        }
        else{
            for(Bid b: bids){
                if(b.getValue() == getHighesBid())
                    s = getIdNum() + getDescription() + "Bid " + getHighesBid() + "by" + b.getBidderName();
            }
        }
        return s;
    }

}