public class Dice{
    private int v;
    public Dice(){
        v=1;
    }
    public void roll(){
        v=(int)(Math.random()*6)+1;
    }
    public int getValue(){
        return v;
    }  
}
