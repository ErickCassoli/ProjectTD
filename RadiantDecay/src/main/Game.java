package main;

import javax.swing.JFrame;

import inputs.KeyboardListener;
import inputs.MyMouseListener;

public class Game extends JFrame{

    private GameScreen gameScreen;
    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;



    public Game() {

        setSize(1024,640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        gameScreen = new GameScreen();
        add(gameScreen);
    }

    public static void main(String[] arg){
        Game game = new Game();
    }

}