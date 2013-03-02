package net.daboross.engine;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public final class ImageHandler {

    public static BufferedImage getImage(String imgName) {
        BufferedImage img = null;
        URL fl = ImageHandler.class.getResource(imgName);
        if (fl != null) {
            try {
                img = ImageIO.read(fl);
            } catch (IOException e) {
            }
        }
        return img;
    }
}
