package managers;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import objects.Tile;

public class TileManager {

    public Tile GRASS,water,ROAD;
    public BufferedImage atlas;
    public ArrayList<Tile> tiles = new ArrayList<>();

    public TileManager(){
        loadAtalas();
        createTiles();
    }
    
    private void createTiles() {

		int id = 0;

		tiles.add(GRASS = new Tile(getSprite(9, 0), id++, GRASS_TILE));
		tiles.add(WATER = new Tile(getAniSprites(0, 0), id++, WATER_TILE));
    }

    private void loadAtalas(){

    }

    public BufferedImage getSprite(int id) {
		return tiles.get(id).getSprite();
	}

    private BufferedImage getSprite(int xCord, int yCord){
        return atlas.getSubimage(xCord * 32, yCord * 32, 32, 32);
    }

}
