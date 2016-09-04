package com.jvs.javagame2d.basics.donut;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

public class Application extends JFrame {
	final static Logger log = Logger.getLogger(Application.class);
	
	public Application() {
		initUI();
	}

	private void initUI() {
		add(new Board());

		setSize(250, 200);
		setTitle("Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Application ex = new Application();
				ex.setVisible(true);
			}
		});
	}
	
}