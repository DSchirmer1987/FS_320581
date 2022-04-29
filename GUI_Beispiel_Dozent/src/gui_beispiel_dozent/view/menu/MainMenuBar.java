package gui_beispiel_dozent.view.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenuBar extends JMenuBar{
	private JMenu mnuFile = new JMenu("Datei");
	private JMenu mnuHelp = new JMenu("Hilfe");
	private JMenuItem mniAbout = new JMenuItem("Über");
	private JMenuItem mniNew = new JMenuItem("Neu");
	private JMenuItem mniOpen = new JMenuItem("Öffnen");
	private JMenuItem mniExit = new JMenuItem("Beenden");
	
	
	public MainMenuBar() {
		this.mnuFile.add(this.mniNew);
		this.mnuFile.add(this.mniOpen);
		this.mnuFile.addSeparator();
		this.mnuFile.add(this.mniExit);
		
		this.mnuHelp.add(this.mniAbout);
		
		this.add(mnuFile);
		this.add(mnuHelp);
	}
}
