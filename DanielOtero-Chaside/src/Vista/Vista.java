package Vista;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Vista {
	
	private int[] respuestas;

	public Vista() {
		
		
		
	}
	
	public int[] preguntar(ArrayList<String> preguntas) {
		respuestas = new int[98];
		
		for(int i = 0; i < preguntas.size();i++) {
			respuestas[i] = JOptionPane.showConfirmDialog(null, preguntas.get(i));
		}
		
		//for(int i = 0; i< respuestas.length;i++) {
			//System.out.println(respuestas[i]);
		//}
		return respuestas;
	}
	
	public void Mostar(String[] res) {
		
		String ic = "Administrativas y Contables: Organizativo,Supervisi�n ,Orden ,An�lisis y s�ntesis,Colaboraci�n,C�lculo,Liderazgo";
		String ih ="Human�sticas y Sociales: Precisi�n Verbal, Organizaci�n,Relaci�n de Hechos,Ling��stica,Orden,Justicia,El hombre anal�tico";
		String ia ="Art�sticas: Est�tico,Arm�nico,Manual,Visual,Auditivo,Observaci�n y An�lisis,Senso-Perceptivo ";
		String is = "Medicina y Cs. De la Salud: Asistir,Investigativo,Precisi�n,Senso-Perceptivo,Anal�tico,Ayudar,Curar";
		String ii= "Ingenier�a y Computaci�n: C�lculo,Manual,Exacto,Planificar,Organizar,Controlar";
		String id ="Defensa y Seguridad: Justicia,Equidad,Colaboraci�n,Esp�ritu de Equipo,Liderazgo,Coordinaci�n,Destreza F�sica"; 
		String ie ="Ciencias Exactas y Agrarias: Investigaci�n,Orden,Organizaci�n,An�lisis y S�ntesis,Num�rico,Clasificar,Precisi�n,Exacto";
		
		String ac ="Administrativas y Contables:Persuasivo,Objetivo, Pr�ctico,Tolerante,Responsable,Ambicioso ,Din�mico  ";
		String ah ="Human�sticas y Sociales: Responsable,Justo,Conciliador,Persuasivo,Sagaz,Imaginativo,Comprensivo ";
		String aa ="Art�sticas: Sensible,Imaginativo,Creativo,Detallista,Innovador,Intuitivo,Paciente,Espont�neo";
		String as ="Medicina y Cs. De la Salud: Altruista,Solidario,Paciente,Comprensivo,Respetuoso,Persuasivo,Servicial,Observador";
		String ai ="Ingenier�a y Computaci�n: Preciso,Pr�ctico, Cr�tico,Anal�tico,R�gido,Racional,Independiente ";
		String ad ="Defensa y Seguridad: Arriesgado,Solidario,Valiente,Agresivo,Persuasivo,Aventurero";
		String ae ="Ciencias Exactas y Agrarias: Met�dico,Anal�tico,Observador,Introvertido,Paciente,Seguro,Independiente,Intuitivo";
		
		
		JOptionPane.showMessageDialog(null, "Segun sus intereses podria ser su vocacion");
		if(res[0] != "") {
			if(res[0] == "c") {
				JOptionPane.showMessageDialog(null, ic);
			}
			else if(res[0]== "h") {
				JOptionPane.showMessageDialog(null, ih);
			}
			else if(res[0]== "a") {
				JOptionPane.showMessageDialog(null, ia);
			}
			else if(res[0]== "s") {
				JOptionPane.showMessageDialog(null, is);
			}
			else if(res[0]== "i") {
				JOptionPane.showMessageDialog(null, ii);
			}
			else if(res[0]== "d") {
				
				JOptionPane.showMessageDialog(null, id);
			}else if(res[0]== "e") {
				JOptionPane.showMessageDialog(null, ie);
			}
		}
		
		
		JOptionPane.showMessageDialog(null, "Segun sus aptitudes podria ser su vocacion");
		
		if(res[1] != "") {
			if(res[1]== "c") {
				JOptionPane.showMessageDialog(null, ac);
			}else if(res[1]=="h") {
				JOptionPane.showMessageDialog(null, ah);
			}
			else if(res[1]=="a") {
				JOptionPane.showMessageDialog(null, aa);
			}else if(res[1]=="s") {
				JOptionPane.showMessageDialog(null, as);
			}else if(res[1]=="i") {
				JOptionPane.showMessageDialog(null, ai);
			}else if(res[1]=="d") {
				JOptionPane.showMessageDialog(null, ad);
			}else if(res[1]=="e") {
				JOptionPane.showMessageDialog(null, ae);
			}
		}
		
		
		
		
	}
	
	
}
