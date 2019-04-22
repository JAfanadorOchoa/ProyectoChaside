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
				res = "C - Administrativas y Contables "+"\n"+"Organizativo"+"\n"+"Supervisión"+"\n"+"Orden"+"\n"+ "Análisis y síntesis"+"\n"+"Colaboración"+"\n"+"Cálculo"+"\n"+"Liderazgo"+"\n"+"Participación Activa";
			}
			else if(intereses == 1){
				res = "H – Humanísticas y Sociales "+"\n"+"Precisión Verbal"+"\n"+"Organización"+"\n"+"Relación de Hechos "+"\n"+"Lingüística"+"\n"+"Orden"+"\n"+"Justicia"+"\n"+"El hombre analítico ";
			}
			else if(intereses == 2){
				res = "A - Artísticas "+"\n"+"Estético"+"\n"+"Armónico"+"\n"+"Manual"+"\n"+"Visual"+"\n"+"Auditivo"+"\n"+"Observación y Análisis"+"\n"+"Senso-Perceptivo";
			}
			else if(intereses == 3){
				res = "S  – Medicina y Cs. De la Salud "+"\n"+"Asistir "+"\n"+"Investigativo"+"\n"+"Precisión"+"\n"+"Senso-Perceptivo "+"\n"+"Analítico"+"\n"+"Ayudar"+"\n"+"Curar"+"\n"+"Rehabilitar";
			}
			else if(intereses == 4){
				res = "I  – Ingeniería y Computación "+"\n"+"Cálculo "+"\n"+"Científico"+"\n"+"Manual"+"\n"+"Exacto"+"\n"+"Planificar"+"\n"+"Organizar"+"\n"+"Controlar";
			}
			else if(intereses == 5){
				res = "D - Defensa y Seguridad "+"\n"+"Justicia"+"\n"+"Equidad"+"\n"+"Colaboración"+"\n"+"Espíritu de Equipo"+"\n"+"Liderazgo"+"\n"+"Coordinación"+"\n"+"Destreza Física ";
			}
			else if(intereses == 6){
				res = "E - Ciencias Exactas y Agrarias "+"\n"+"Investigación"+"\n"+"Orden"+"\n"+"Organización"+"\n"+"Análisis y Síntesis"+"\n"+" Numérico"+"\n"+"Clasificar"+"\n"+"Precisión"+"\n"+"Exacto";
			}
			gui.escribirDatoInteres(res);
			int aptitudes = bd.contarMaximoAptitudes();
			String resAptitudes = "";
			if(aptitudes == 0){
				resAptitudes = "C - Administrativas y Contables "+"\n"+"Persuasivo"+"\n"+"Objetivo"+"\n"+"Práctico"+"\n"+ "Tolerante"+"\n"+"Responsable"+"\n"+"Ambicioso"+"\n"+"Dinámico"+"\n"+"Resolutivo";
			}
			else if(aptitudes == 1){
				resAptitudes = "H – Humanísticas y Sociales "+"\n"+"Responsable"+"\n"+"Justo"+"\n"+"Conciliador"+"\n"+"Persuasivo"+"\n"+"Sagaz"+"\n"+"Imaginativo"+"\n"+"Comprensivo"+"\n"+"Estabilidad Emocional";
			}
			else if(aptitudes == 2){
				resAptitudes = "A - Artísticas "+"\n"+"Sensible"+"\n"+"Imaginativo"+"\n"+"Creativo"+"\n"+"Detallista"+"\n"+"Innovador"+"\n"+"Intuitivo"+"\n"+"Paciente"+"\n"+"Espontáneo";
			}
			else if(aptitudes == 3){
				resAptitudes = "S  – Medicina y Cs. De la Salud "+"\n"+"Altruista"+"\n"+"Solidario"+"\n"+"Paciente"+"\n"+"Comprensivo"+"\n"+"Respetuoso"+"\n"+"Persuasivo"+"\n"+"Servicial"+"\n"+"Observador";
			}
			else if(aptitudes == 4){
				resAptitudes = "I  – Ingeniería y Computación "+"\n"+"Preciso"+"\n"+"Práctico"+"\n"+"Crítico"+"\n"+"Analítico"+"\n"+"Rígido"+"\n"+"Racional"+"\n"+"Independiente";
			}
			else if(aptitudes == 5){
				resAptitudes = "D - Defensa y Seguridad "+"\n"+"Arriesgado"+"\n"+"Solidario"+"\n"+"Valiente"+"\n"+"Agresivo"+"\n"+"Persuasivo"+"\n"+"Aventurero"+"\n"+"Equilibrio Psíquico";
			}
			else if(aptitudes == 6){
				resAptitudes = "E - Ciencias Exactas y Agrarias "+"\n"+"Metódico"+"\n"+"Analítico"+"\n"+"Observador"+"\n"+"Introvertido"+"\n"+"Paciente"+"\n"+"Seguro"+"\n"+"Independiente"+"\n"+"Intuitivo";
			}
			gui.escribirDatoAptitudes(resAptitudes);	
		}
	}
	
	

}