package main;

import javax.swing.JFrame;

import inputs.KeyboardListener;
import inputs.MyMouseListener;

public class Game extends JFrame{

    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;



    public Game() {

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] arg){
        Game game = new Game();
    }

}