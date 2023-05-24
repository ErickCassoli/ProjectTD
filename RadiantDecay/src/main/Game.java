package main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import inputs.KeyboardListener;
import inputs.MyMouseListener;

public class Game extends JFrame {

    private GameScreen gameScreen;
    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;

    public Game() {

        setSize(1038, 640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen();
        add(gameScreen);
    }

    private void initInputs() {
        myMouseListener = new MyMouseListener();
        keyboardListener = new KeyboardListener();

        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);

        addKeyListener(keyboardListener);

        requestFocus();
    }

    public static void main(String[] arg) {
        Game game = new Game();
        game.initInputs();
    }

}