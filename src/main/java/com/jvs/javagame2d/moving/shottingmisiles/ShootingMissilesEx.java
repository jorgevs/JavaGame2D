package com.jvs.javagame2d.moving.shottingmisiles;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

public class ShootingMissilesEx extends JFrame {
	final static Logger log = Logger.getLogger(ShootingMissilesEx.class);
	
	public ShootingMissilesEx() {
		initUI();
	}

	private void initUI() {
		add(new Board());

		setSize(400, 300);
		setResizable(false);
		setTitle("Shooting missiles");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				ShootingMissilesEx ex = new ShootingMissilesEx();
				ex.setVisible(true);
			}
		});
	}
	
}