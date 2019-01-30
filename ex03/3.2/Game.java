public class Game{
    private int player1, player2, count;
    public Game(int n){
        count = n;
        player1 = 0;
        player2 = 0;
    }
    public void walk(int num, int p){
        if(p == 1)
            player1 += num;
        else if(p == 2)
            player2 += num;
        if(player1 >= count)
            System.out.println("PLAYER 1 win!");
        if(player2 >= count)
            System.out.println("PLAYER 2 win!");
    }
}
