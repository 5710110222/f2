public class Counter{
    private int val;
    public void counter(){
        val = 0;
    }
    public void inc(){
        val++;
    }
    public void reset(){
        val = 0;
    }
    public int getVal(){
        return val;
    }
}