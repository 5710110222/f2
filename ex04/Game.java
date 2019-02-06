public class Game{
    private int p1,p2;
    private int max;
    private int turn;
    private Dice dice1;
    private Dice dice2;
    public Game(int gg){
        p1=0;
        p2=0;
        max=gg;
        turn=1;
        dice1= new Dice(); 
        dice2= new Dice(); 
    }
    public void walk(int count){
        if(turn==1){
            p1+=count;
            System.out.println("p1="+p1);
        }
        else if(turn==2){
            p2+=count;
            System.out.println("p2="+p2);
        }
        if(p1 >= max ){
            System.out.println("P1 winwin");
        }
        else if(p2 >= max ){
            System.out.println("P2 winwin");
        }


    } 
    public void play(){
        dice1.roll();
        System.out.println("dice1="+dice1.getValue());
        dice2.roll();
        System.out.println("dice2="+dice2.getValue());
        
        walk(dice1.getValue()+dice2.getValue());
        if(dice1.getValue()!=dice2.getValue()){
            changplayyer();

        }
       

    }
    public boolean isEnded() {
        return p1 >=max || p2 >=max;
   

    }
    public void changplayyer(){
       turn = turn == 1 ? 2:1;

    }

}