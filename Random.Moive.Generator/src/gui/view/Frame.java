package gui.view;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.AppController;


public class Frame extends JFrame{
	
	private Panel firstPanel;
	private AppController appController;
	
	public Frame(AppController appController) {
		super();
		this.appController = appController;
		this.firstPanel = new Panel();
		
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(firstPanel);
		this.setVisible(true);
		this.setSize(500, 400);
		this.setTitle("Random Entertainment");
	}
	

}
