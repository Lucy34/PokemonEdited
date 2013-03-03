package net.daboross.engine;

import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import net.daboross.will.pokemon.Pokemon;

public final class ImageHandler {

    public static BufferedImage getImage(String imgName) throws FileNotFoundException {
        String fullName = (imgName.startsWith("/") ? "/net/daboross/will/pokemon" : "/net/daboross/will/pokemon/") + imgName;
        BufferedImage img = null;
        URL fl = Pokemon.class.getResource(fullName);
        if (fl == null) {
            throw new FileNotFoundException(fullName);
        } else {
            try {
                img = ImageIO.read(fl);
            } catch (IOException e) {
            }
        }
        return img;
    }
}