package Vista;

import Controlador.Controlador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Interfaz extends JFrame{
	
	private static final long serialVersionUID = 1L;	
	private PanelImagen imagen;
	private PanelBoton boton;
	
	
	public Interfaz(Controlador control){
		
		//710,600
		setSize(710,500);
		setResizable(false);
		setTitle("Cuestionario");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		imagen = new PanelImagen();
		add(imagen, BorderLayout.CENTER);
		
		boton = new PanelBoton();
		add(boton, BorderLayout.SOUTH);
		boton.getButEmpezar().addActionListener(control);
	}
	
	public int respuestas(String pPregunta){
		
		return JOptionPane.showConfirmDialog(null, pPregunta,"¡Pregunta!",JOptionPane.YES_NO_OPTION);
		
	}

	public PanelImagen getImagen() {
		return imagen;
	}

	public PanelBoton getBoton() {
		return boton;
	}
	
	public void escribirDatoInteres(String dato) {
		JOptionPane.showMessageDialog(null, dato,"Carrera según sus Intereses ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void escribirDatoAptitudes(String dato) {
		JOptionPane.showMessageDialog(null, dato,"Carrera según sus Intereses ", JOptionPane.INFORMATION_MESSAGE);
	}

}
