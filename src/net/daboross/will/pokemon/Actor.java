package net.daboross.will.pokemon;

public class Actor {

    public int loc_x;
    public int loc_y;
    public int o_loc_x;
    public int o_loc_y;

    public Actor(int x, int y) {
        loc_x = x;
        loc_y = y;
        o_loc_x = x;
        o_loc_y = y;
    }

    public int getX() {
        return loc_x;
    }

    public int getY() {
        return loc_y;
    }

    public void act() {
    }

    public void move() {
    }

    public String getText() {
        return "";
    }
}
