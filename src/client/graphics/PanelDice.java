package client.graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PanelDice extends JPanel {

	
	private Image[] dice= {
			Toolkit.getDefaultToolkit().createImage(DICE1),
			Toolkit.getDefaultToolkit().createImage(DICE2),
			Toolkit.getDefaultToolkit().createImage(DICE3),
			Toolkit.getDefaultToolkit().createImage(DICE4),
			Toolkit.getDefaultToolkit().createImage(DICE5),
			Toolkit.getDefaultToolkit().createImage(DICE6),
	};
	
	private int index = 0;
	//serve per il paintComponent

	public static final String DICE1 = "res/dice-six-faces-one.jpg";
	public static final String DICE2 = "res/dice-six-faces-two.jpg";
	public static final String DICE3 = "res/dice-six-faces-three.jpg";
	public static final String DICE4 = "res/dice-six-faces-four.jpg";
	public static final String DICE5 = "res/dice-six-faces-five.jpg";
	public static final String DICE6 = "res/dice-six-faces-six.jpg";

	public static final int DADO1 = 0;
	public static final int DADO2 = 1;
	public static final int DADO3 = 2;
	public static final int DADO4 = 3;
	public static final int DADO5 = 4;
	public static final int DADO6 = 5;

	public static final int POSITIONX =75;
	public static final int POSITIONY =55;

	public PanelDice() {
		this.setPreferredSize(new Dimension(dice[0].getWidth(null), dice[0].getHeight(null)));
		index=5; 
		this.loadImage(dice[5]);
		
	}

	private void loadImage(Image img) {
		try {
			MediaTracker track = new MediaTracker(this);
			track.addImage(img, img.hashCode());
			track.waitForID(img.hashCode());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void paintComponent(Graphics g) {
		this.setOpaque(false);
		g.drawImage(dice[index], POSITIONX, POSITIONY, null);
		super.paintComponent(g);
	}
	
	public void rollDice(int dice) {
		for(int i=0; i<10; i++, index++) {
			if(index>5) {
				index=0;
			}
			
			loadImage(this.dice[index]);
			this.repaint();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		index=dice;
		loadImage(this.dice[index]);
	}
	
	
	
	
	
	

}
