package com.jvs.javagame2d.collitions.shootingalliens.withthread;

import org.apache.log4j.Logger;

public class Missile extends Sprite {
	final static Logger log = Logger.getLogger(Missile.class);

	private final int BOARD_WIDTH = 390;
	private final int MISSILE_SPEED = 2;

	public Missile(int x, int y) {
		super(x, y);
		initMissile();
	}

	private void initMissile() {
		loadImage("/home/jorgevs/Desktop/images/javagame2d/missile.png");
		getImageDimensions();
	}

	public void move() {
		x += MISSILE_SPEED;

		if (x > BOARD_WIDTH){
			vis = false;
		}
	}
	
}