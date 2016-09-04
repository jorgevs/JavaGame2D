package com.jvs.javagame2d.moving.shottingmisiles;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.apache.log4j.Logger;

public class Sprite {
	final static Logger log = Logger.getLogger(Sprite.class);
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean vis;
	protected Image image;

	public Sprite(int x, int y) {
		this.x = x;
		this.y = y;
		vis = true;
	}

	protected void loadImage(String imageName) {

		ImageIcon ii = new ImageIcon(imageName);
		image = ii.getImage();
	}

	protected void getImageDimensions() {

		width = image.getWidth(null);
		height = image.getHeight(null);
	}

	public Image getImage() {
		return image;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isVisible() {
		return vis;
	}

	public void setVisible(Boolean visible) {
		vis = visible;
	}
}