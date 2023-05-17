package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int x;
int y;
int xSpeed;
int ySpeed;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    fill(0,0,255);
    noStroke();
    ellipse(100, 100, 10,10);
    if(x>width) {
    	xSpeed = -xSpeed;
    }
    if(y>height) {
    	ySpeed = -ySpeed;
    }
    
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}