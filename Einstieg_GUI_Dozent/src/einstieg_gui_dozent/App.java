package einstieg_gui_dozent;

import javax.swing.JOptionPane;

import einstieg_gui_dozent.Joptionpanes.inputDialog;
import einstieg_gui_dozent.frames.MyFrame;

public class App {

	public static void main(String[] args) {
//		inputDialog.simpleInputInitial();
//		inputDialog.inputTitleMessageType();
//		inputDialog.inputDropdown();
		
		//Frames
		MyFrame myframe = new MyFrame();
		myframe.setVisible(true);
	}

}
