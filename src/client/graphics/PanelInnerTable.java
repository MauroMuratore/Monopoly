package client.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class PanelInnerTable extends JPanel {

	private JLabel risk;
	private JLabel opportunity;
	private JButton rollDice;
	private JPanel panelRD;
	private JPanel panelRich;
	private PanelDice dices;
	private BorderLayout layout;

	public static final String PATH_RICH = "res/RichUnclePennyBags.jpg";
	
	
	/**
	 * Create the panel.
	 */
	public PanelInnerTable() {
		//inizializzare il PanelOptions
		super();
		this.setVisible(true);
		layout = new BorderLayout();
		layout.setVgap(50);
		this.setLayout(layout);
		this.setBorder(new EmptyBorder(50, 50, 50, 80));

		//inizializzo i componenti all'interno
		//risk
		risk= new JLabel();
		risk.setText("RISCHIO");
		risk.setBackground(Color.RED);
		risk.setOpaque(true);
		this.add(risk, BorderLayout.EAST);

		//opportunity
		opportunity = new JLabel();
		opportunity.setText("OPPORTUNITÀ");
		opportunity.setBackground(Color.GREEN);
		opportunity.setOpaque(true);
		this.add(opportunity, BorderLayout.WEST);


		risk.setPreferredSize(new Dimension(opportunity.getMinimumSize().width +10, 
				opportunity.getMinimumSize().height + 35)); //Dimensione
		risk.setHorizontalAlignment(SwingConstants.CENTER);	//allineamento
		risk.setBorder(BorderFactory.createRaisedSoftBevelBorder());

		opportunity.setPreferredSize(new Dimension(opportunity.getMinimumSize().width +10, 
				opportunity.getMinimumSize().height + 35));
		opportunity.setHorizontalAlignment(SwingConstants.CENTER);
		opportunity.setBorder(BorderFactory.createRaisedSoftBevelBorder());
		//TODO mettere bordi carini


		//bottone rollDice
		rollDice = new JButton("Lancia il dado");
		rollDice.setPreferredSize(new Dimension(rollDice.getMinimumSize().width,
				rollDice.getMinimumSize().height + 10));
		panelRD = new JPanel();
		panelRD.add(rollDice);
		this.add(panelRD, BorderLayout.SOUTH);

		//Uncle rich 
		FlowLayout layoutRich = new FlowLayout();
		layoutRich.setAlignment(FlowLayout.CENTER);
		panelRich = new PanelImage(PATH_RICH);
		panelRich.setLayout(layoutRich);
		this.add(panelRich, BorderLayout.NORTH);
		
		//dice
		dices = new PanelDice();
		this.add(dices, BorderLayout.CENTER);
	}
	
	public void rollDice(int dice) {
		dices.rollDice(dice);
	}
	
}
