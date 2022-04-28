package gui_beispiel_dozent.view.menu;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MainPopupMenu extends JPopupMenu{
	
	public MainPopupMenu() {
		this.add(new JMenuItem("Lade Kunde"));
		this.add(new JMenuItem("Speichern"));
	}
}
