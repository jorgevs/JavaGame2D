package com.jvs.javagame2d.moving.shottingmisiles;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class Craft extends Sprite {
	final static Logger log = Logger.getLogger(Craft.class);
	
	private int dx;
	private int dy;
	private ArrayList missiles;

	public Craft(int x, int y) {
		super(x, y);
		initCraft();
	}

	private void initCraft() {
		missiles = new ArrayList();
		loadImage("/home/jorgevs/Desktop/images/javagame2d/craft.png");
		getImageDimensions();
	}

	public void move() {
		x += dx;
		y += dy;
	}

	public ArrayList getMissiles() {
		return missiles;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_SPACE) {
			fire();
		}
		if (key == KeyEvent.VK_LEFT) {
			dx = -1;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx = 1;
		}
		if (key == KeyEvent.VK_UP) {
			dy = -1;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = 1;
		}
	}

	public void fire() {
		missiles.add(new Missile(x + width, y + height / 2));
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
		if (key == KeyEvent.VK_UP) {
			dy = 0;
		}
		if (key == KeyEvent.VK_DOWN) {
			dy = 0;
		}
	}
	
}