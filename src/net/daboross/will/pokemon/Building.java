package net.daboross.will.pokemon;

import java.awt.Graphics;
import java.awt.Image;
import net.daboross.engine.ImageHandler;

public class Building extends Actor {

    private Image[] sprites;
    private Image sprite;
    private String type;

    public Building(int x, int y, String type) {
        super(x, y);
        type = this.type;
    }

    public int getOriginalX() {
        return super.o_loc_x;
    }

    public int getOriginalY() {
        return super.o_loc_y;
    }

    public int getCurrentX() {
        return super.getX();
    }

    public int getCurrentY() {
        return super.getY();
    }

    public void paint(Graphics g) {
        if ("PokeMart".equals(type)) {
            for (int i = 0; i <= 15; i++) {
                sprites[i] = ImageHandler.getImage("graphics/tiles/mart/tiles-" + i + ".png");
                g.drawImage(sprites[i], super.getX() + (i * 32), super.getY() + (i * 32), null);
            }
        }
        if ("PokeCenter".equals(type)) {
            for (int i = 0; i <= 19; i++) {
                sprites[i] = ImageHandler.getImage("graphics/tiles/pokecenter/tiles-" + i + ".png");
                g.drawImage(sprites[i], super.getX() + (i * 32), super.getY() + (i * 32), null);
            }
        }
    }

    public int transportLocation() {
        return 1;
    }

    public Image getSprite() {
        return sprite;
    }

    public Image[] getSprites() {
        return sprites;
    }
}