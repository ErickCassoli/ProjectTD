package main;

import java.awt.Graphics;

public class Render {
    

    public Render(GameScreen gameScreen) {

        this.gameScreen = gameScreen;
    }

    public void render(Graphics g){
        switch(GameStates.gameState){

            case MENU:

                break;
            case PLAYING:

                break;
            case SETTINGS:
            
                break;

        }
    }
}
