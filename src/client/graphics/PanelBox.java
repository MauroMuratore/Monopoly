package client.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;

public class PanelBox extends JPanel {

	private JPanel color;
	private JPanel house;
	private JPanel panelString;
	private JLabel name;
	private JLabel price;
	private Box box;
	
	public static final int TABLE = 0;
	public static final int PROPERTY = 1;

	/**
	 * Create the panel.
	 */
	public PanelBox(Color col, String _name, String _price, int typeBox) {
		//creo il panelbox
		if(typeBox==TABLE) //se il tipo è table dimensioni ridotte
			this.setPreferredSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width/20, 
					Toolkit.getDefaultToolkit().getScreenSize().width/20) ); //dimensione della casella un ventesimo dello schermo
		else if(typeBox==PROPERTY)
			this.setPreferredSize(new Dimension(150, 150));
		
		
		this.setVisible(true);
		this.setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		this.setBorder(border);

		//creo color e lo aggiungo
		color = new JPanel();
		color.setBackground(col);
		this.add(color);
		//TODO BISOGNERÀ DIVIDERE IN 4 PER LE CASE
		house = new JPanel();
		house.setBackground(Color.WHITE);
		this.add(house);


		//creo le label e le aggiungo
		panelString= new JPanel();
		BoxLayout stringLayout = new BoxLayout(panelString, BoxLayout.Y_AXIS);
		panelString.setLayout(stringLayout);
		if(typeBox==PROPERTY) panelString.setBorder(new EmptyBorder(15,5,5,5));
		
		//TODO SISTEMARE COME VIENE VISUALIZZATO NEL PANELPROPERTY
		name = new JLabel (_name);
		name.setOpaque(true);
		price = new JLabel (_price + "$");
		price.setHorizontalAlignment(SwingConstants.CENTER);
		panelString.add(name);
		panelString.add(price);
		
		
		panelString.setPreferredSize(new Dimension(this.getWidth(), 100));
		
		this.add(panelString);		

	}

	//TODO per la pedina tolgo name e price e metto la pedina, quando se ne va tolgo la pedina e rimetto name e price


}
