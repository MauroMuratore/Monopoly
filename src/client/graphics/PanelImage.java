package client.graphics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.JPanel;

public class PanelImage extends JPanel {

	private Image image;
	
	public static final int POSITIONX = 100;
	public static final int POSITIONY = 0;
	
	/**
	 * Create the panel.
	 */
	public PanelImage(String pathImage) {
		image = Toolkit.getDefaultToolkit().createImage(pathImage);
		loadImage(image);
		this.setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
		
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
		g.drawImage(image, POSITIONX, POSITIONY, null);
		super.paintComponent(g);
	}

}
