package com.jvs.javagame2d.moving.movingsprites;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import org.apache.log4j.Logger;

public class Craft {
	final static Logger log = Logger.getLogger(Craft.class);
	
	private int dx;
	private int dy;
	private int x;
	private int y;
	private Image image;

	public Craft() {
		initCraft();
	}

	private void initCraft() {
		ImageIcon ii = new ImageIcon("/home/jorgevs/Desktop/images/javagame2d/craft.png");
		image = ii.getImage();
		x = 40;
		y = 60;
	}

	public void move() {
		x += dx;
		y += dy;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImage() {
		return image;
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

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