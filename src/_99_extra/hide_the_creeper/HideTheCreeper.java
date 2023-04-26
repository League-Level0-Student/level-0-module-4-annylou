package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    PImage creeper;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	PImage minecraft = loadImage("minecraft.png");
    	minecraft.resize(width, height); 
    	background(minecraft); 
    	creeper=loadImage("creeper.png"); 
    	creeper.resize(10, 10);
    }

    @Override
    public void draw() {
    	image(creeper, mouseX, mouseY);
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
