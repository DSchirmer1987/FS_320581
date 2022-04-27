package einstieg_gui_dozent.frames;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		// Größe des Frames setzen
		this.setSize(640, 480);
		
		// Verhalten beim Schließen des Frames steuern
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Startposition des Frames festlegen
		// Bezieht sich IMMER auf die linke obere Ecke des Frames zum Bildschirm
		// 1. Option = Festlegen der Pixel
		this.setLocation(300, 300);
		
		//2. Option = Berechnung der Bildschirmgröße und Frame-Größe
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		System.out.println(dim);
		this.setLocation(dim.width /2 - (this.getWidth() / 2), dim.height / 2 - (this.getHeight() / 2));
		
		//3. Option - Die faule Version
		this.setLocationRelativeTo(null);
		
		// Zusatz - Look And Feel voreinstellen.
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/*
		 * Das Frame befüllen
		 */
		// Layout setzen - Wie soll der Inhalt angezeigt werden.
		// FlowLayout() - Einfaches dynamischh anpassendes Layout
		// Alignment kann mitgegeben werden
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// BoxLayout
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		
		// GridLayout
		this.setLayout(new GridLayout(4,4));
		
		// Einen Button hinzufügen
		JButton button = new JButton("Drück mich");
		this.add(button);
		
		// Ein Beschriftungsfeld (Label) hinzufügen
		JLabel label = new JLabel("Ich bin ein Label!");
		this.add(label);
		
		JButton mausButton = new JButton("Ich reagiere auf rechtsklicks");
		this.add(mausButton);
		
		/*
		 * Dem Button eine Funktion hinzufügen
		 * 
		 * In 3 Versionen
		 */
		// 1. Version - Innere anonyme Klasse
		button.addActionListener(new ActionListener() {	
			int i = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				label.setText("Sie haben den Button " + i + " mal gedrückt");
			}
		});
		
		// 2. Version - Lambda-Ausdruck
		button.addActionListener(e -> System.out.println("Mit Lambda"));
		
		// 3. Version - Eigene Klasse
		button.addActionListener(new MyButtonActionListener());
		
		/*
		 * Button mit rechtsklick aktivieren
		 */
		mausButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Mausklick");
				if(SwingUtilities.isLeftMouseButton(e)) {
					System.out.println("Linksklick");
				} else if(SwingUtilities.isMiddleMouseButton(e)) {
					System.out.println("Mittelklick");
				}
			}
		});
	}
}
