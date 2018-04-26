package client.graphics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class PanelProperty extends JPanel {

	JScrollPane scroll;

	/**
	 * Create the panel.
	 */
	public PanelProperty() {
		//faccio il panelProperty
		super();
		this.setVisible(true);
		GridLayout layout =new GridLayout(10, 3);//imposto il layout
		layout.setHgap(15);
		layout.setVgap(15);
		this.setLayout(layout);
		this.setAutoscrolls(true);	//autoscroll
		this.setBackground(Color.GREEN.brighter());
		TitledBorder border = BorderFactory.createTitledBorder("PROPRIETÀ"); //titolo
		this.setBorder(border);

		for(int i=0; i<3; i++) {
			for(int j=0; j<10; j++) {
				PanelBox panelBox = new PanelBox(Color.PINK, "PARCO DELLA VITTORIA" + (i+j), "" + i + j, PanelBox.PROPERTY);
				this.add(panelBox, i, j);
			}
		}
		//TODO ogni riga è un gruppo, così non devo riordinarli







	}

}
