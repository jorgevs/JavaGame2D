package com.jvs.javagame2d.moving.movingsprites;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

public class MovingSpriteEx extends JFrame {
	final static Logger log = Logger.getLogger(MovingSpriteEx.class);
	
	public MovingSpriteEx() {
		initUI();
	}

	private void initUI() {
		add(new Board());

		setSize(400, 300);
		setResizable(false);
		setTitle("Moving sprite");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				MovingSpriteEx ex = new MovingSpriteEx();
				ex.setVisible(true);
			}
		});
	}
	
}