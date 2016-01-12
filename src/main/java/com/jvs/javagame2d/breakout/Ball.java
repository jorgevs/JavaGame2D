package com.jvs.javagame2d.breakout;

import javax.swing.ImageIcon;

import org.apache.log4j.Logger;

public class Ball extends Sprite implements Commons {
	final static Logger log = Logger.getLogger(Ball.class);
	
	private int xdir;
	private int ydir;

	public Ball() {
		xdir = 1;
		ydir = -1;

		ImageIcon ii = new ImageIcon("/home/jorgevs/Desktop/images/javagame2d/breakout/ball.png");
		image = ii.getImage();

		i_width = image.getWidth(null);
		i_heigth = image.getHeight(null);

		resetState();
	}

	public void move() {
		x += xdir;
		y += ydir;

		if (x == 0) {
			setXDir(1);
		}
		if (x == WIDTH - i_width) {
			setXDir(-1);
		}
		if (y == 0) {
			setYDir(1);
		}
	}

	private void resetState() {
		x = INIT_BALL_X;
		y = INIT_BALL_Y;
	}

	public void setXDir(int x) {
		xdir = x;
	}

	public void setYDir(int y) {
		ydir = y;
	}

	public int getYDir() {
		return ydir;
	}

}