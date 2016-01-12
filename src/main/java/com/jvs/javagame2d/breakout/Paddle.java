package com.jvs.javagame2d.breakout;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import org.apache.log4j.Logger;

public class Paddle extends Sprite implements Commons {
	final static Logger log = Logger.getLogger(Paddle.class);
	
	private int dx;

	public Paddle() {
		ImageIcon ii = new ImageIcon("/home/jorgevs/Desktop/images/javagame2d/breakout/paddle.png");
		image = ii.getImage();

		i_width = image.getWidth(null);
		i_heigth = image.getHeight(null);

		resetState();
	}

	public void move() {
		x += dx;

		if (x <= 0) {
			x = 0;
		}
		if (x >= WIDTH - i_width) {
			x = WIDTH - i_width;
		}
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT) {
			dx = -1;
		}
		if (key == KeyEvent.VK_RIGHT) {
			dx = 1;
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
	}

	private void resetState() {
		x = INIT_PADDLE_X;
		y = INIT_PADDLE_Y;
	}

}