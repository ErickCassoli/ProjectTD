package main;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GameScreen extends JPanel{

    public GameScreen(){

    }
    public void paintConponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.red);

        for(int x = 0; x < 20; x++){
            
        }
    }
}
