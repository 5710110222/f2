import java.util.ArrayList;         //----

public class Game{
    private int p1;
    private int p2;
    private int maxSlot;
    private int turn;
    private Dice dice1;
    private Dice dice2;
    private ArrayList<Tunnel> tunnels;      //---
    private Tunnel t;                       //---

    public Game(int max_slot){
        p1 = 0;
        p2 = 0;
        maxSlot = max_slot;
        turn = 1;
        dice1 = new Dice();
        dice2 = new Dice();
        tunnels = new ArrayList<Tunnel>();    //-----
    }

    public void addTunnel(int s_in, int s_out){     //----
        Tunnel t = new Tunnel(s_in, s_out);
        tunnels.add(t);
    }
    
    public void walk(int slot){
        if(turn == 1){
            p1 += slot;
            System.out.println("Player1=" + p1);
            for(Tunnel t: tunnels){         
                p1 = t.walkIn(p1);          
               
            }
        }else if(turn == 2){
            p2 += slot;
            System.out.println("Player2=" + p2);
            for(Tunnel t: tunnels){        
                p2 = t.walkIn(p2);        
               
            }
        }
        if(p1 >= maxSlot){
            System.out.println("Player1 win");
        }else if(p2 >= maxSlot){
            System.out.println("Player2 win");
        }
    }

    public boolean isEnded(){
        return p1 >= maxSlot || p2 >= maxSlot; 
    }

    public void play(){
        dice1.roll();
        System.out.println("dice1 =" + dice1.getValue()  );
        dice2.roll();
        System.out.println("dice2 =" + dice2.getValue()  );
        walk(dice1.getValue() + dice2.getValue());
        if(dice1.getValue() != dice2.getValue())
        changTurn();
    }

    public void changTurn(){
        turn = turn == 1 ? 2 : 1;
    }
}