package com.jvs.javagame2d.breakout;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

public class Breakout extends JFrame {
	final static Logger log = Logger.getLogger(Breakout.class);
	
	public Breakout() {
		initUI();
	}

	private void initUI() {
		add(new Board());
		setTitle("Breakout");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(Commons.WIDTH, Commons.HEIGTH);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Breakout game = new Breakout();
				game.setVisible(true);
			}
		});
	}

}