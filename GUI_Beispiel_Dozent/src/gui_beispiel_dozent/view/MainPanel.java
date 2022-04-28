package gui_beispiel_dozent.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel{
	
	private JPanel pnl_north = new JPanel();
	private JPanel pnl_center = new JPanel();
	private JPanel pnl_south = new JPanel();
	private JPanel pnl_west = new JPanel();
	private JPanel pnl_east = new JPanel();
	
	private JLabel lbl_title = new JLabel("Kundendaten");
	private JLabel lbl_vorname = new JLabel("Vorname");
	private JLabel lbl_nachname = new JLabel("Nachname");
	private JLabel lbl_addresse = new JLabel("Addresse");
	private JLabel lbl_kundennummer = new JLabel("Kundennummer");
	
	private JTextField txtF_vorname = new JTextField();
	private JTextField txtF_nachname = new JTextField();
	private JTextField txtF_addresse = new JTextField();
	private JTextField txtF_kundennummer = new JTextField();
	
	private JButton btn_next = new JButton("Nächster");
	private JButton btn_prev = new JButton("Vorheriger");
	
	public JTextField getTxtF_vorname() {
		return txtF_vorname;
	}

	public JTextField getTxtF_nachname() {
		return txtF_nachname;
	}

	public JTextField getTxtF_addresse() {
		return txtF_addresse;
	}

	public JTextField getTxtF_kundennummer() {
		return txtF_kundennummer;
	}

	public JButton getBtn_next() {
		return btn_next;
	}

	public JButton getBtn_prev() {
		return btn_prev;
	}

	public MainPanel() {
		this.setLayout(new BorderLayout(5,5));
		
		/*
		 * North - Blau
		 */
		this.add(pnl_north, BorderLayout.NORTH);
		pnl_north.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		pnl_north.add(lbl_title);
		/*
		 * South - Rot
		 */
		this.add(pnl_south, BorderLayout.SOUTH);
		pnl_south.setBorder(BorderFactory.createLineBorder(Color.RED));
		pnl_south.add(btn_prev);
		pnl_south.add(btn_next);
		pnl_south.setLayout(new FlowLayout());
		/*
		 * East - Gelb
		 */
		this.add(pnl_east, BorderLayout.EAST);
		pnl_east.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		/*
		 * West - Grün
		 */
		this.add(pnl_west, BorderLayout.WEST);
		pnl_west.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		/*
		 * Center - Schwarz
		 */
		this.add(pnl_center, BorderLayout.CENTER);
		pnl_center.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		pnl_center.setLayout(new GridLayout(0, 2));
		pnl_center.add(lbl_vorname);
		pnl_center.add(txtF_vorname);
		pnl_center.add(lbl_nachname);
		pnl_center.add(txtF_nachname);
		pnl_center.add(lbl_addresse);
		pnl_center.add(txtF_addresse);
		pnl_center.add(lbl_kundennummer);
		pnl_center.add(txtF_kundennummer);
	}
}
