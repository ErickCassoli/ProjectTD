package helpz;
import java.awt.image.BufferedImage;

public class LoadSave {
    
    public static BufferedImage getSpriteAtlas() {
		BufferedImage img = null;
		InputStream is = LoadSave.class.getClassLoader().getResourceAsStream("spriteatlas.png");
        try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
    }
}