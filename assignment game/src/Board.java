import java.awt.Point;
import java.util.HashMap;
import java.util.Random;

public class Board {  
  private int finishPos;
  private HashMap<Integer, Integer> tunnels = new HashMap<>();
  public Board(int finishPos) {
    this.finishPos = finishPos;
    prepareTunnels();
  }

  public int getFinishPos() {
    return finishPos;
  }

  public Integer getTunnelOutPos(int pos){
    return tunnels.get(pos);
  }

  public Point getRefLocationForPos(int pos){
    //800*500
    int row = ((pos - 1) / 10);
    int x;    
    if(row % 2 == 1){
      x = 82 * ((pos - 1) % 10);
    }else{
      x = 820 - ((pos - (row * 10)) * 82);
    }
    return new Point(x,  448 - (row * 64));
  }

  private void prepareTunnels(){
    tunnels.put(5, 18);
    tunnels.put(15, 26);
    tunnels.put(24, 38);
    tunnels.put(34, 48);
    tunnels.put(44, 54);
    tunnels.put(58, 65);
    tunnels.put(53, 76);
    tunnels.put(30, 13);
    tunnels.put(41, 21);
    tunnels.put(47, 35);
    tunnels.put(49, 33);
    tunnels.put(59, 43);
    tunnels.put(73, 67);
    tunnels.put(78, 62);
  }
}