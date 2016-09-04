package com.jvs.javagame2d.breakout;

import javax.swing.ImageIcon;

import org.apache.log4j.Logger;

public class Brick extends Sprite {
	final static Logger log = Logger.getLogger(Brick.class);
	
	private boolean destroyed;

	public Brick(int x, int y) {
		this.x = x;
		this.y = y;

		ImageIcon ii = new ImageIcon("/home/jorgevs/Desktop/images/javagame2d/breakout/brickie.png");
		image = ii.getImage();

		i_width = image.getWidth(null);
		i_heigth = image.getHeight(null);

		destroyed = false;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean val) {
		destroyed = val;
	}

}