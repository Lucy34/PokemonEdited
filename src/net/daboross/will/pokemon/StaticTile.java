package net.daboross.will.pokemon;

import java.awt.Image;

public class StaticTile extends Actor {

    private Image sprite;

    public StaticTile(int x, int y, Image s) {
        super(x, y);
        sprite = s;
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

    @Override
    public void act() {
    }

    @Override
    public void move() {
    }

    public Image getSprite() {
        return sprite;
    }
}
