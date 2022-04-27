package einstieg_gui_dozent.Joptionpanes;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class inputDialog {
	/*
	 * InputDialog
	 * JOptionPane.showInputDialog
	 * 
	 * Für Eingabe über einen Dialog
	 * 
	 * Syntax:
	 * JOptionPane.showInputDialog(Object) :
	 *  - Einfaches Inputfeld mit einer Nachricht (Object = Nachricht)
	 *  
	 * JOptionPane.showInputDialog(Object, Object)
	 *  - Einfaches Inputfeld mit einer Nachricht und einen InitialWert(Object = Nachricht, InitialWert)
	 *  
	 * JOptionPane.showInputDialog(Component, Object)
	 *  - Einfaches Inputfeld mit einer Nachricht innerhalb eines Fensters(Component = Fenster ,Object = Nachricht)
	 * 
	 * JOptionPane.showInputDialog(Component, Object, Object)
	 *  - Einfaches Inputfeld mit einer Nachricht und einem InitialWert innerhalb eines Fensters(Component = Fenster ,Object = Nachricht, InitialWert)
	 *  
	 * JOptionPane.showInputDialog(Component, Object, String, MessageType)
	 * - Einfaches Inputfeld mit einer Nachricht und einem Titel innerhalb eines Fensters und des MessageTypes (Component = Fenster ,Object = Nachricht)
	 * 
	 * JOptionPane.showInputDialog(Component, Object, String, MessageType, Icon, Object[], Object)
	 * - Inputfeld mit vorgegebenen Werten - Sozusagen ein Dropdown Input mit den Optionen als Object[] und die Startwahl als Object
	 * 
	 */
	public static void simpleInput() {
		String input = JOptionPane.showInputDialog("Bitte Namen eingeben!");
		System.out.println("Sie haben eingegeben im simpleInput: " + input);
	}
	
	public static void simpleInputInitial() {
		String input = JOptionPane.showInputDialog("Bitte Namen eingeben!", "Herbert");
		System.out.println("Sie haben eingegeben im simpleInput: " + input);
	}
	
	public static void inputTitleMessageType() {
		String input = JOptionPane.showInputDialog(null, "Bitte Namen eingeben!", "Namenseingabe", JOptionPane.WARNING_MESSAGE);
		System.out.println("Sie haben eingegeben: " + input);
	}
	
	public static void inputDropdown() {
		String[] options = {"Feierabend", "Pause", "Arbeitszeit", "Urlaub"};
		// Icon erzeugen
		ImageIcon icon = new ImageIcon("src/icon.png");
		Image image = icon.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH);
		icon = new ImageIcon(image);
		String input = (String) JOptionPane.showInputDialog(null, "Bitte auswählen", "Auswahl", 0, icon, options, options[0]);
		System.out.println("Sie haben " + input + " gewählt.");
	}
}
