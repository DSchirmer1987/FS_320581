package gui_beispiel_dozent.view;

import javax.swing.JFrame;

import gui_beispiel_dozent.view.menu.MainMenuBar;

public class MainFrame extends JFrame{
	private MainPanel content = new MainPanel();
	private MainMenuBar menubar = new MainMenuBar();

	public MainPanel getContent() {
		return content;
	}
	
	public MainFrame() {
		this.setTitle("GUI Beispiel");
		this.setSize(640, 480);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(content);
		this.setJMenuBar(menubar);
	}
}
