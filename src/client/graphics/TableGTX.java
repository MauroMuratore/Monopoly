package client.graphics;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TableGTX extends JFrame {

	private JPanel contentPane;	
	private PanelTable panelTable;
	private PanelPlayer panelPl;
	
	/**
	 * Creazione dell'interfaccia grafica
	 */
	public TableGTX() {
		//creazione del jframe
		super("Monopoly");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);
		//creazione del contentPane
		contentPane = new JPanel();
		contentPane.setVisible(true);
		contentPane.setOpaque(true);
		GridLayout layout= new GridLayout();
		layout.setHgap(5);
		contentPane.setLayout(layout);
		setContentPane(contentPane);
		//creazione e aggiunta degli altri pannelli
		panelTable = new PanelTable();
		panelPl = new PanelPlayer();	
		contentPane.add(panelTable);
		contentPane.add(panelPl);
		contentPane.setBorder(new EmptyBorder(0,0, 0,0 ));
		panelTable.setVisible(true);
		panelPl.setVisible(true);
		
	

	}
	
	public void rollDice(int dice) {
		panelTable.rollDice(dice);
	}

	
	
}
