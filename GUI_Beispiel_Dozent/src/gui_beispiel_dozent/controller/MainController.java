package gui_beispiel_dozent.controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import gui_beispiel_dozent.model.Kunde;
import gui_beispiel_dozent.model.Kundenspeicher;
import gui_beispiel_dozent.view.MainFrame;
import gui_beispiel_dozent.view.menu.MainPopupMenu;

public class MainController {
	
	private Kundenspeicher speicher;
	private MainFrame mainframe;
	private int counter = 0;
	
	public MainController() {
		EventQueue.invokeLater(new Runnable() {		
			@Override
			public void run() {
				try {
					mainframe = new MainFrame();
					init();
					mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void init() {
		this.speicher = new Kundenspeicher(new ArrayList<Kunde>());
		for(int i = 0; i<10;i++) {
			this.speicher.getKunden().add(new Kunde("Max", "Mustermann" + i, "Musterweg", "ABC" + i));
		}
		
		mainframe.getContent().getBtn_prev().setEnabled(false);
		
		mainframe.getContent().getTxtF_vorname().setText(this.speicher.getKunden().get(0).getVorname());
		mainframe.getContent().getTxtF_nachname().setText(this.speicher.getKunden().get(0).getNachnamen());
		mainframe.getContent().getTxtF_addresse().setText(this.speicher.getKunden().get(0).getAddresse());
		mainframe.getContent().getTxtF_kundennummer().setText(this.speicher.getKunden().get(0).getKundennummer());
		
		mainframe.getContent().getBtn_next().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (counter >= 0) {
					mainframe.getContent().getBtn_prev().setEnabled(true);
				}
				if(counter < speicher.getKunden().size()) {
					counter++;
					mainframe.getContent().getTxtF_vorname().setText(speicher.getKunden().get(counter).getVorname());
					mainframe.getContent().getTxtF_nachname().setText(speicher.getKunden().get(counter).getNachnamen());
					mainframe.getContent().getTxtF_addresse().setText(speicher.getKunden().get(counter).getAddresse());
					mainframe.getContent().getTxtF_kundennummer().setText(speicher.getKunden().get(counter).getKundennummer());
					if (counter == speicher.getKunden().size() - 1){
						mainframe.getContent().getBtn_next().setEnabled(false);
						counter = speicher.getKunden().size() - 1;
					}
				} 
			}
		});
		
		mainframe.getContent().getBtn_prev().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (counter <= speicher.getKunden().size() -1) {
					mainframe.getContent().getBtn_next().setEnabled(true);
				}
				if (counter >= 0) {
					counter--;
					mainframe.getContent().getTxtF_vorname().setText(speicher.getKunden().get(counter).getVorname());
					mainframe.getContent().getTxtF_nachname().setText(speicher.getKunden().get(counter).getNachnamen());
					mainframe.getContent().getTxtF_addresse().setText(speicher.getKunden().get(counter).getAddresse());
					mainframe.getContent().getTxtF_kundennummer().setText(speicher.getKunden().get(counter).getKundennummer());
					if (counter == 0) {
						mainframe.getContent().getBtn_prev().setEnabled(false);
					}
				}
			}
		});
		
		mainframe.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.isPopupTrigger()) {
					MainPopupMenu pm = new MainPopupMenu();
					pm.show(e.getComponent(), e.getX(), e.getY());
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.isPopupTrigger()) {
					MainPopupMenu pm = new MainPopupMenu();
					pm.show(e.getComponent(), e.getX(), e.getY());
				}
			}
			
		});
	}
}
