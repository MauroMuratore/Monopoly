package client.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;

public class PanelTable extends JPanel {

	private PanelBox[] boxes;
	private PanelInnerTable panelOp;
	private JPanel panelNorth;
	private JPanel panelSouth;
	private JPanel panelWest;
	private JPanel panelEast;
	

	/**
	 * Create the panel.
	 */
	public PanelTable() {
		//creare il panelTable
		this.setVisible(true);
		BorderLayout border = new BorderLayout();
		this.setLayout(border);
		int dim = new PanelBox(null, null, null, PanelBox.TABLE).getSize().width;

		//creo le cose da mettere nel panel
		//caselle
		boxes= new PanelBox[36];
		for(int i=0; i<36; i++) {
			boxes[i]= new PanelBox(Color.BLUE, ""+ i, "100", PanelBox.TABLE);
			//TODO mettere i nomi giusti
			//TODO mettere la rotazione
		}
		
		//i vari panel dove piazzare le caselle
		int contatore;
		
		//south
		panelSouth = new JPanel();
		panelSouth.setLayout(new GridLayout());
		for(contatore=0; contatore<10; contatore++)
			panelSouth.add(boxes[contatore]);
		this.add(panelSouth, BorderLayout.SOUTH);

		//west
		panelWest = new JPanel();
		panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));
		for(contatore=contatore; contatore<18; contatore++) { 
			
			panelWest.add(boxes[contatore]);
		}
		this.add(panelWest, BorderLayout.WEST);
		
		//north
		panelNorth = new JPanel();
		panelNorth.setLayout(new GridLayout());
		for(contatore=contatore; contatore<28; contatore++)
			panelNorth.add(boxes[contatore]);
		this.add(panelNorth, BorderLayout.NORTH);

		//east
		panelEast = new JPanel();
		panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
		for(contatore=contatore; contatore<36; contatore++) {
			
			panelEast.add(boxes[contatore]);
		}
		this.add(panelEast, BorderLayout.EAST);
		
		//la parte in centro
		panelOp= new PanelInnerTable();
		panelOp.setVisible(true);
		this.add(panelOp, BorderLayout.CENTER);
		
		

	}
	
	public void rollDice(int dice) {
		panelOp.rollDice(dice);
	}

	
	
	
}
