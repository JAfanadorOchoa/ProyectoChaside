package Vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBoton extends JPanel{
	
	private JButton butEmpezar;
	public static final String empezarCuestionario = "EMPEZAR CUESTIONARIO";
	
	
	public PanelBoton(){
		
	    setLayout( new BorderLayout( ) );
	    
		butEmpezar = new JButton("Empezar Cuentionario");
		butEmpezar.setActionCommand(empezarCuestionario);
		add(butEmpezar,BorderLayout.CENTER);
		
	}


	public JButton getButEmpezar() {
		return butEmpezar;
	}


}
