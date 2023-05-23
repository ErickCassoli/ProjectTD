package package1;

import javax.swing.JFrame;

public class Game extends JFrame{

    public Game() {

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        System.out.println("Sim");
    }

}