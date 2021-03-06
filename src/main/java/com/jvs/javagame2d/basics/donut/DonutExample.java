package com.jvs.javagame2d.basics.donut;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

public class DonutExample extends JFrame {
	final static Logger log = Logger.getLogger(DonutExample.class);
	
	public DonutExample() {
		initUI();
	}

	private void initUI() {
		add(new Board());

		setSize(330, 330);
		setTitle("Donut");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				DonutExample ex = new DonutExample();
				ex.setVisible(true);
			}
		});
	}
	
}