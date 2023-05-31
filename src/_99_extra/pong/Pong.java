package _99_extra.pong;

import processing.core.PApplet;
import processing.core.PImage;

public class Pong extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 470;
    PImage image;
int x;
int y;
int xSpeed;
int ySpeed;
int paddleX = 260;
int paddleY = 441;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	image = loadImage("grey.png");
    	
    }

    @Override
    public void draw() {
    	image(image, 0,0, 600,470);
        fill(53,122,185);
        noStroke();
        ellipse(9, 9, 17,17);
        if(x>width) {
        	xSpeed = -xSpeed;
        }
        if(y>height) {
        	ySpeed = -ySpeed;
        }
        paddleX=mouseX;
        fill(136,185,78);
        rect(paddleX,paddleY, 80,29);
         
    }
boolean intersects(int x, int y, int paddleX, int paddleY, int paddleLength) {
	if(y>paddleY && x>paddleX && x<paddleX+paddleLength) {
		return true;
	}
	else { 
		return false;
	}
		
}


    static public void main(String[] args) {
        PApplet.main(Pong.class.getName());
    }
}