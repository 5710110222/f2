import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ControlPanel extends JPanel implements GameControlListener{
  private GameController gc;
  private JButton playButton;
  private JLabel playerLabelP1;//
  
  private JLabel diceLabelD01; //
 
  private JLabel diceLabelD11; //
  
  private JLabel totaldiceLabelD1; //
  

  public ControlPanel(){
    gc = GameController.getInstance();
    gc.addControlListener(this);

    JButton exitButton = new JButton("Exit");
    exitButton.addActionListener(new ActionListener(){    
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(1);
      }
    });

    playButton = new JButton("Play");
    playButton.addActionListener(new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e) {
        gc.takeTurn();
      }
    });

   
    playerLabelP1 = new JLabel("", SwingConstants.CENTER); 
    playerLabelP1.setFont(playerLabelP1.getFont().deriveFont(18.0f)); 

    

    diceLabelD01 = new JLabel("", SwingConstants.CENTER); //
    diceLabelD01.setFont(diceLabelD01.getFont().deriveFont(14.0f)); //

   

    diceLabelD11 = new JLabel("", SwingConstants.CENTER); //
    diceLabelD11.setFont(diceLabelD11.getFont().deriveFont(14.0f)); //

   
   
    
    totaldiceLabelD1 = new JLabel("", SwingConstants.CENTER);//
    totaldiceLabelD1.setFont(totaldiceLabelD1.getFont().deriveFont(16.0f));//

    

    updatePlayerLabel();
    setLayout(new GridLayout(0,1));//
    add(exitButton);
    add( playerLabelP1);
    
    add(diceLabelD01);//
   
    add(diceLabelD11);//
   
    add(totaldiceLabelD1);
   
    add(playButton); 
     
  }

  public void changeGamePlayEnabled(boolean enabled){
    playButton.setEnabled(enabled);
    updatePlayerLabel();
  }

  private void updatePlayerLabel(){
    playerLabelP1.setText(gc.getCurrentPlayer().toString() );
    
    diceLabelD01.setText("Dice1 = " + gc.d1.getFace());//
   
    diceLabelD11.setText("Dice2 = " + gc.d2.getFace());//
    
    totaldiceLabelD1.setText("TotalDice = " + Integer.toString(gc.d1.getFace() + gc.d2.getFace()));
    
   
    
  }
}