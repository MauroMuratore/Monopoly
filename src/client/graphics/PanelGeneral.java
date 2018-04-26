package client.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelGeneral extends JPanel {
	
	private JLabel[][] toString = new JLabel[5][4];
	
	public static final int NAME_PLAYER=0;
	public static final int MONEY=1;
	public static final int NUMBER_PROPERTIES=2;
	public static final int VALUE_PROPERTIES=3;
	public static final int PLAYER_ONE =1;
	public static final int PLAYER_TWO =2;
	public static final int PLAYER_THREE=3;
	public static final int PLAYER_FOUR=4;
	
	/**
	 * Create the panel.
	 */
	public PanelGeneral(String[][] string) {
		//creo il panel general
		super();
		this.setVisible(true);
		this.setLayout(new GridLayout(5, 4));
		this.setBackground(Color.CYAN.brighter());
		TitledBorder border = BorderFactory.createTitledBorder("GENERAL");
		this.setBorder(border);
		
		
		//creo tutti i JLabel
		toString[0][NAME_PLAYER]=new JLabel("Nome Giocatore");
		this.add(toString[0][NAME_PLAYER], 0, NAME_PLAYER);
		toString[0][MONEY]=new JLabel("Soldi");
		this.add(toString[0][MONEY], 0, MONEY);
		toString[0][NUMBER_PROPERTIES]=new JLabel("Numero Proprietà");
		this.add(toString[0][NUMBER_PROPERTIES], 0, NUMBER_PROPERTIES);
		toString[0][VALUE_PROPERTIES]=new JLabel("Valore Proprietà");
		this.add(toString[0][VALUE_PROPERTIES], 0, VALUE_PROPERTIES);
		
		//TODO POI DA FAR PASSARE I NOMI DEI GIOCATORI CAZZI E MAZZI
		for(int i=1; i<5; i++) {
			for(int j=0; j<4; j++) {
				toString[i][j]= new JLabel(string[i-1][j]);
				toString[i][j].setVisible(true);
				this.add(toString[i][j], i, j);
			}
		}
		
		int width = Toolkit.getDefaultToolkit().getScreenSize().width/2; //spessore del panel
		this.setPreferredSize(new Dimension(width -40, this.getMinimumSize().height+10));
	}

}
