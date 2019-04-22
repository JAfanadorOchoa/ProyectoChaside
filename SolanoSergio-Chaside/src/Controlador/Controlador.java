package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Mundo;
import Vista.Interfaz;

public class Controlador implements ActionListener{
	
	private Interfaz gui;
	private Mundo bd;
	
	public Controlador(){
		
		
		gui = new Interfaz(this);
		gui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		if(evento.getActionCommand().equalsIgnoreCase(gui.getBoton().empezarCuestionario)){
			bd = new Mundo();
			int[] respuestas = new int[98];
			for(int i = 0;i<bd.getPreguntas().length;i++){
				String preg = bd.mostrarPreguntas(i);
				int res = gui.respuestas(preg);
				respuestas[i] = res;
			}
			for(int i = 0;i<respuestas.length;i++){
				if(respuestas[i]==0){
					bd.buscarRespuestas(i+1);
				}
			}
			int intereses = bd.contarMaximoIntereses();
			String res="";
			if(intereses == 0){
				res = "C - Administrativas y Contables "+"\n"+"Organizativo"+"\n"+"Supervisi�n"+"\n"+"Orden"+"\n"+ "An�lisis y s�ntesis"+"\n"+"Colaboraci�n"+"\n"+"C�lculo"+"\n"+"Liderazgo"+"\n"+"Participaci�n Activa";
			}
			else if(intereses == 1){
				res = "H � Human�sticas y Sociales "+"\n"+"Precisi�n Verbal"+"\n"+"Organizaci�n"+"\n"+"Relaci�n de Hechos "+"\n"+"Ling��stica"+"\n"+"Orden"+"\n"+"Justicia"+"\n"+"El hombre anal�tico ";
			}
			else if(intereses == 2){
				res = "A - Art�sticas "+"\n"+"Est�tico"+"\n"+"Arm�nico"+"\n"+"Manual"+"\n"+"Visual"+"\n"+"Auditivo"+"\n"+"Observaci�n y An�lisis"+"\n"+"Senso-Perceptivo";
			}
			else if(intereses == 3){
				res = "S  � Medicina y Cs. De la Salud "+"\n"+"Asistir "+"\n"+"Investigativo"+"\n"+"Precisi�n"+"\n"+"Senso-Perceptivo "+"\n"+"Anal�tico"+"\n"+"Ayudar"+"\n"+"Curar"+"\n"+"Rehabilitar";
			}
			else if(intereses == 4){
				res = "I  � Ingenier�a y Computaci�n "+"\n"+"C�lculo "+"\n"+"Cient�fico"+"\n"+"Manual"+"\n"+"Exacto"+"\n"+"Planificar"+"\n"+"Organizar"+"\n"+"Controlar";
			}
			else if(intereses == 5){
				res = "D - Defensa y Seguridad "+"\n"+"Justicia"+"\n"+"Equidad"+"\n"+"Colaboraci�n"+"\n"+"Esp�ritu de Equipo"+"\n"+"Liderazgo"+"\n"+"Coordinaci�n"+"\n"+"Destreza F�sica ";
			}
			else if(intereses == 6){
				res = "E - Ciencias Exactas y Agrarias "+"\n"+"Investigaci�n"+"\n"+"Orden"+"\n"+"Organizaci�n"+"\n"+"An�lisis y S�ntesis"+"\n"+" Num�rico"+"\n"+"Clasificar"+"\n"+"Precisi�n"+"\n"+"Exacto";
			}
			gui.escribirDatoInteres(res);
			int aptitudes = bd.contarMaximoAptitudes();
			String resAptitudes = "";
			if(aptitudes == 0){
				resAptitudes = "C - Administrativas y Contables "+"\n"+"Persuasivo"+"\n"+"Objetivo"+"\n"+"Pr�ctico"+"\n"+ "Tolerante"+"\n"+"Responsable"+"\n"+"Ambicioso"+"\n"+"Din�mico"+"\n"+"Resolutivo";
			}
			else if(aptitudes == 1){
				resAptitudes = "H � Human�sticas y Sociales "+"\n"+"Responsable"+"\n"+"Justo"+"\n"+"Conciliador"+"\n"+"Persuasivo"+"\n"+"Sagaz"+"\n"+"Imaginativo"+"\n"+"Comprensivo"+"\n"+"Estabilidad Emocional";
			}
			else if(aptitudes == 2){
				resAptitudes = "A - Art�sticas "+"\n"+"Sensible"+"\n"+"Imaginativo"+"\n"+"Creativo"+"\n"+"Detallista"+"\n"+"Innovador"+"\n"+"Intuitivo"+"\n"+"Paciente"+"\n"+"Espont�neo";
			}
			else if(aptitudes == 3){
				resAptitudes = "S  � Medicina y Cs. De la Salud "+"\n"+"Altruista"+"\n"+"Solidario"+"\n"+"Paciente"+"\n"+"Comprensivo"+"\n"+"Respetuoso"+"\n"+"Persuasivo"+"\n"+"Servicial"+"\n"+"Observador";
			}
			else if(aptitudes == 4){
				resAptitudes = "I  � Ingenier�a y Computaci�n "+"\n"+"Preciso"+"\n"+"Pr�ctico"+"\n"+"Cr�tico"+"\n"+"Anal�tico"+"\n"+"R�gido"+"\n"+"Racional"+"\n"+"Independiente";
			}
			else if(aptitudes == 5){
				resAptitudes = "D - Defensa y Seguridad "+"\n"+"Arriesgado"+"\n"+"Solidario"+"\n"+"Valiente"+"\n"+"Agresivo"+"\n"+"Persuasivo"+"\n"+"Aventurero"+"\n"+"Equilibrio Ps�quico";
			}
			else if(aptitudes == 6){
				resAptitudes = "E - Ciencias Exactas y Agrarias "+"\n"+"Met�dico"+"\n"+"Anal�tico"+"\n"+"Observador"+"\n"+"Introvertido"+"\n"+"Paciente"+"\n"+"Seguro"+"\n"+"Independiente"+"\n"+"Intuitivo";
			}
			gui.escribirDatoAptitudes(resAptitudes);	
		}
	}
	
	

}