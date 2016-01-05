package com.jvs.javagame2d.basics.image;

import java.awt.EventQueue;
import javax.swing.JFrame;

import org.apache.log4j.Logger;

public class ImageExample extends JFrame {
	final static Logger log = Logger.getLogger(ImageExample.class);
	
    public ImageExample() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        pack();
        setTitle("Bardejov");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                ImageExample ex = new ImageExample();
                ex.setVisible(true);
            }
        });
    }
    
}