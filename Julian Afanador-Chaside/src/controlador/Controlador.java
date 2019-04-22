package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;


import modelo.Mundo;
import vista.InterfazGui;

public class Controlador implements ActionListener {
	private Mundo bd;
	private InterfazGui gui;
	int i ;
	public Controlador() throws IOException {
		bd = new Mundo();
		gui = new InterfazGui(this);
		gui.setVisible(true);
		i = 0;
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		if(evento.getActionCommand().equals(gui.getPanelPreguntas().NEXT) && i<98) {
			
			gui.getPanelPreguntas().getTxtPregunta().setText(null);
			gui.getPanelPreguntas().getTxtPregunta().setText(String.valueOf(bd.getPersistencia().preguntas[i]));
			
			gui.getPanelPreguntas().getButNext().setEnabled(false);
			gui.getPanelPreguntas().getButSi().setEnabled(true);
			gui.getPanelPreguntas().getButNo().setEnabled(true);
			
			
			
		}else
			if(evento.getActionCommand().equals(gui.getPanelPreguntas().NEXT) && i==98) {
			
		gui.getPanelPreguntas().getButSi().setEnabled(false);
		gui.getPanelPreguntas().getButNo().setEnabled(false);
		bd.getIntereses().mayorAptitud();
		bd.getIntereses().mayorInteres();
		gui.getPanelPreguntas().getTxtPregunta().setText( bd.getIntereses().gettAptitudes()[6] +  "\n" + bd.getIntereses().gettAptitudes()[5]);
		i++;
		
			}else
				if(evento.getActionCommand().equals(gui.getPanelPreguntas().NEXT) && i ==99) {
					gui.getPanelPreguntas().getTxtPregunta().setText(
				bd.getIntereses().gettIntereses()[6] + "\n"  +
				bd.getIntereses().gettIntereses()[5]);
					i++;
				}else
					if(evento.getActionCommand().equals(gui.getPanelPreguntas().NEXT) && i ==100) {
						gui.getPanelPreguntas().getTxtPregunta().setText("Gracias por realizar el test CHASIDE" +  "\n" +
					"Tenga un buen dia");
						gui.getPanelPreguntas().getButNext().setText("Cerrar");
						i++;
					}else
						if(evento.getActionCommand().equals(gui.getPanelPreguntas().NEXT) && i ==101) {
						gui.setVisible(false);
						}
			if(evento.getActionCommand().equals(gui.getPanelPreguntas().SI)) {
				
				bd.getIntereses().sumar(i);
				gui.getPanelPreguntas().getButNext().setEnabled(true);
				gui.getPanelPreguntas().getButSi().setEnabled(false);
				gui.getPanelPreguntas().getButNo().setEnabled(false);
				i++;
				
				
			}
				if(evento.getActionCommand().equals(gui.getPanelPreguntas().NO)) {
					
					
					gui.getPanelPreguntas().getButNext().setEnabled(true);
					gui.getPanelPreguntas().getButSi().setEnabled(false);
					gui.getPanelPreguntas().getButNo().setEnabled(false);
					i++;
					
				}
		
			
			
			
			}
}
