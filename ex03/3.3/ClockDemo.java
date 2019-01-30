public class ClockDemo{
    public static void main(String args[]){
        ClockDisplay clock = new ClockDisplay();
        clock.setTime(14, 10);

        while(true){
            clock.minIncrement();
            System.out.println("Tick...");
            System.out.println("Current time: "+clock.getTime());

            wait(100);
        }
    }
    private static void wait(int millisecond){
        try{
            Thread.sleep(millisecond);
        }
        catch(Exception e){}
    }
}
