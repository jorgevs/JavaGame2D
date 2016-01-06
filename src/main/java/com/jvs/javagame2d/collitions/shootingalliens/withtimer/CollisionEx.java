package com.jvs.javagame2d.collitions.shootingalliens.withtimer;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

import com.jvs.javagame2d.collitions.shootingalliens.withtimer.Board;

public class CollisionEx extends JFrame {
	final static Logger log = Logger.getLogger(CollisionEx.class);
	
	public CollisionEx() {
		initUI();
	}

	private void initUI() {
		add(new Board());
		
		setResizable(false);
		pack();
		setTitle("Collision");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				CollisionEx ex = new CollisionEx();
				ex.setVisible(true);
			}
		});
	}
	
}