import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by Bálint on 2017. 04. 10..
 */
public class GameObjects {

  BufferedImage image;
  int posX, posY;

  public GameObjects (String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
