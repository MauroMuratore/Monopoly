package client.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelPlayer extends JPanel {

	private JLabel notice;
	private JPanel panelNotice;
	private PanelProperty panelProp;
	private PanelGeneral panelGen;
	
	/**
	 * Create the panel.
	 */
	public PanelPlayer() {
		//costruisco il panel Player
		super();
		this.setVisible(true);
		FlowLayout layout = new FlowLayout();
		layout.setAlignOnBaseline(true);
		layout.setVgap(30);
		this.setLayout(layout);
		this.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		//misure utili
		int height= Toolkit.getDefaultToolkit().getScreenSize().height;
		int width = Toolkit.getDefaultToolkit().getScreenSize().width/2; //spessore del panel
		
		//faccio il notice
		notice = new JLabel("MONOPOLY START");
		notice.setPreferredSize(new Dimension(notice.getMaximumSize().width, notice.getMinimumSize().height));
		notice.setOpaque(true);
		//lo metto in un pannello
		panelNotice = new JPanel();
		panelNotice.setOpaque(true);
		panelNotice.setBackground(Color.RED.brighter().brighter());
		//ci faccio un titolo con bordo
		TitledBorder border =BorderFactory.createTitledBorder("NOTIFICHE");
		border.setTitleColor(Color.BLACK);
		border.setTitlePosition(TitledBorder.CENTER);
		panelNotice.setBorder(border);
		panelNotice.add(notice);
		panelNotice.setPreferredSize(new Dimension(width -40, panelNotice.getMinimumSize().height+10));
		this.add(panelNotice);
		
		//faccio il PanelProperty
		panelProp = new PanelProperty();
		JScrollPane scroll = new JScrollPane(panelProp);
		scroll.setVerticalScrollBarPolicy(scroll.VERTICAL_SCROLLBAR_ALWAYS);

		this.add(scroll);
		
		//faccio il PanelGeneral
		String[][] string = new String[4][4];
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				string[i][j]= ""+ i +j;
			}
		}
				
		panelGen= new PanelGeneral(string);
		this.add(panelGen);
		
		scroll.setPreferredSize(new Dimension ( width -40, height/2));

	}

}
