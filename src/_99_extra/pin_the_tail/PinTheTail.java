package _99_extra.pin_the_tail;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;

public class PinTheTail extends PApplet {
    static final int WIDTH = 550;
    static final int HEIGHT = 406;
		
PImage donkey;
PImage tail;
int x;
int y;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	donkey = loadImage("donkey.jpg");
    	tail = loadImage("tail.png");
    	
    }

    @Override
    public void draw() {
        background(donkey);
        image(tail,  mouseX,  mouseY);
        tail.resize(141, 134);
        if(dist(0,0, mouseX,mouseY) > 30) {
        	background(106,155,48);
        	}
        if(mousePressed) {
        	System.out.println(mouseX);
        	System.out.println(mouseY);
        	x = mouseX;
        	y = mouseY;
        	}
        image(tail, x,y);
        if(dist(454,75, x,y) < 30) {
        	background(donkey);
        	image(tail, x,y);
        	playWhoohoo();
        }
    }

    static public void main(String[] args) {
        PApplet.main(PinTheTail.class.getName());
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    Clip clip = null;

    public void playDoh() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-doh.wav");
        }
    }

    public void playWhoohoo() {
        if (clip == null || !clip.isActive()) {
            clip = playSound("homer-woohoo.wav");
        }
    }

    public Clip getSong(String fileName) {
        String path = "src/";
        Clip clip = null;

        // Note: use .wav files
        try {
            clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
            clip.open(inputStream);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
        }

        return clip;
    }

    public Clip playSound(String fileName) {
        final Clip clip = getSong(fileName);

        new Thread(new Runnable() {
            @Override
            public void run() {
                clip.start();
            }
        }).start();

        return clip;
    }
}
