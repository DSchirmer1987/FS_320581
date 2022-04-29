package gui_beispiel_dozent.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarActionListener implements ActionListener{
	
	private final static MenuBarActionListener instance = new MenuBarActionListener();
	
	public static MenuBarActionListener getInstance() {
		return MenuBarActionListener.instance;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand().toLowerCase()) {
			case "neu":{
				System.out.println("Neu ausgewählt.");
				break;
			}
			case "öffnen":{
				System.out.println("Öffnen gewählt.");
				break;
			}
			case "beenden":{
				System.out.println("Beenden gewählt.");
				break;
			}
			case "über":{
				System.out.println("Über gewählt.");
				break;
			}
		}
		
	}

}
