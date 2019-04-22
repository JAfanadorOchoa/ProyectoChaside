package vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.IOException;

import javax.swing.JFrame;

import controlador.Controlador;

public class InterfazGui extends JFrame {
	
	private PanelImagen panelImagen;
	private PanelPreguntas panelPreguntas;
	
	public InterfazGui(Controlador control) throws IOException {
		setSize(800,550);
		setResizable(false);
		setTitle("Test CHASIDE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(2,1));
		panelImagen = new PanelImagen();
		add(panelImagen);
		panelPreguntas = new PanelPreguntas();
		panelPreguntas.setBackground(Color.white);
		add(panelPreguntas);
		
		panelPreguntas.getButNext().addActionListener(control);
		panelPreguntas.getButNo().addActionListener(control);
		panelPreguntas.getButSi().addActionListener(control);
		
		
	}

	

	public PanelPreguntas getPanelPreguntas() {
		return panelPreguntas;
	}

	public void setPanelPreguntas(PanelPreguntas panelPreguntas) {
		this.panelPreguntas = panelPreguntas;
	}
	
	
}
