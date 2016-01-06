package com.jvs.javagame2d.collitions.shootingalliens.inthread;

import org.apache.log4j.Logger;

public class Alien extends Sprite {
	final static Logger log = Logger.getLogger(Alien.class);
	
	private final int INITIAL_X = 400;

	public Alien(int x, int y) {
		super(x, y);
		initAlien();
	}

	private void initAlien() {
		loadImage("/home/jorgevs/Desktop/images/javagame2d/alien.png");
		getImageDimensions();
	}

	public void move() {
		if (x < 0) {
			x = INITIAL_X;
		}
		x -= 1;
	}
}