package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelPreguntas extends JPanel {
		

	private JTextArea txtPregunta;
	private JButton butSi;
	private JButton butNo;
	private JButton butNext;
	public static final String SI = "Si";
	public static final String NO = "No";
	public static final String NEXT = "Next";
	private Font fuente;
	public PanelPreguntas()  {
		setLayout(null);
		fuente = new Font("Arial", Font.ITALIC, 15);
		
		txtPregunta = new JTextArea("Aqui se iran presentando las preguntas a responder de el test CHASIDE");
		txtPregunta.setForeground(Color.BLACK);
		txtPregunta.setBackground(Color.white);
		txtPregunta.setFont(fuente);
		txtPregunta.setBounds(50, 60, 700, 70);
		txtPregunta.setEditable(false);
		butSi = new JButton("Si");
		butSi.setActionCommand(SI);
		butSi.setBounds(400, 150, 150, 50);
		butSi.setEnabled(false);
		butNo = new JButton("No");
		butNo.setActionCommand(NO);
		butNo.setBounds(200, 150, 150, 50);
		butNo.setEnabled(false);
		butNext = new JButton("Next");
		butNext.setActionCommand(NEXT);
		butNext.setBounds(635, 210, 150, 50);
		butNext.setBackground(Color.lightGray);
		butNext.setForeground(Color.black);
		add(txtPregunta);
		add(butSi);
		add(butNo);
		add(butNext);
		
		
		
	}
	public JTextArea getTxtPregunta() {
		return txtPregunta;
	}
	public void setTxtPregunta(JTextArea txtPregunta) {
		this.txtPregunta = txtPregunta;
	}
	public JButton getButSi() {
		return butSi;
	}
	public void setButSi(JButton butSi) {
		this.butSi = butSi;
	}
	public JButton getButNo() {
		return butNo;
	}
	public void setButNo(JButton butNo) {
		this.butNo = butNo;
	}
	public JButton getButNext() {
		return butNext;
	}
	public void setButNext(JButton butNext) {
		this.butNext = butNext;
	}
	public Font getFuente() {
		return fuente;
	}
	public void setFuente(Font fuente) {
		this.fuente = fuente;
	}
	
}
