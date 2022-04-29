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
				System.out.println("Neu ausgew�hlt.");
				break;
			}
			case "�ffnen":{
				System.out.println("�ffnen gew�hlt.");
				break;
			}
			case "beenden":{
				System.out.println("Beenden gew�hlt.");
				break;
			}
			case "�ber":{
				System.out.println("�ber gew�hlt.");
				break;
			}
		}
		
	}

}
