package net.daboross.will.pokemon;

import java.awt.Image;
import net.daboross.engine.ImageHandler;

public class MessageBox {

    private Image msgbox = ImageHandler.getImage("graphics/pictures/Message_Text.png");
    private String text;
    //private int lines;
    private int style;
    //private NPC conversation;

    public MessageBox(String t, int s) {
        text = t;
        //lines = l;
        style = s;
        //conversation = c;
    }

    public void displayText() {
    }

    public String getLines() {
        return text;
    }

    public Image getMessageStyle() {
        //Regular Text Box
        if (style == 0) {
            return msgbox;
        } //Sign Post
        else if (style == 1) {
            return msgbox;
        }
        return msgbox;
    }
}