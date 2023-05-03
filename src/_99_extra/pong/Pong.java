package _99_extra.pong;

import processing.core.PApplet;

public class Pong extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
int x;
int y;
int xSpeed;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
    	x=10;
    	y=10;
     	fill(0,166,198);
    	ellipse(x,10, 20,20);
    	
    	if(x>width) {
    		xSpeed = -xSpeed;
    	}
    }

    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}