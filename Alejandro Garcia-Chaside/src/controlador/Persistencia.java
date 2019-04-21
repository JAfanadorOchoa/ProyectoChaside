package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import modelo.Mundo;
/**
 * @author Alejandro Garcia olarte
 *
 */
public class Persistencia {
	private Mundo mundo ;
	
	public Persistencia(Mundo pMundo) {
		mundo = pMundo;
	}
	
	public String intereces(String letra) {
		String intereses = " ";
		if (letra.equals("c")) {
			intereses ="C \n"
		+"Organizativo \n"
		+"Supervisi�n \n"
		+ "Orden \n"
		+ "An�lisis y s�ntesis \n"
		+ "Colaboraci�n \n"
		+"C�lculo \n"
		+"Liderazgo \n"
		+"Participaci�n Activa \n";
		}
		else if (letra.equals("h")) {
			intereses ="H \n"
					+"Precisi�n Verbal  \n"
					+"Organizaci�n \n"
					+ "Relaci�n \n"
					+ "Ling��stica \n"
					+"Orden \n"
					+"Justicia \n"
					+"anal�tico  \n";
		}
		else if (letra.equals("a")) {
			intereses ="A \n"
					+"Est�tico \n"
					+"Arm�nico \n"
					+ "Manual \n"
					+ "Visual \n"
					+ "Auditivo \n"
					+"Observaci�n \n"
					+"Senso Perceptivo \n";
		}
		else if (letra.equals("s")) {
			intereses ="S \n"
					+"Asistir \n"
					+"Investigativo \n"
					+ "Precisi�n \n"
					+"Senso Perceptivo \n"
					+ "Anal�tico \n"
					+"Ayudar \n"
					+"Curar \n"
					+"Rehabilitar  \n";
			}
		else if (letra.equals("i")) {
			intereses ="I \n"
					+"C�lculo \n"
					+"Cient�fico \n"
					+ "Manual \n"
					+ "Exacto \n"
					+ "Planificar \n"
					+"Organizar \n"
					+"Controlar \n";
		}
		else if (letra.equals("d")) {
			intereses ="D \n"
					+"Justicia \n"
					+"Equidad \n"
					+ "Colaboraci�n \n"
					+ "Equipo \n"
					+ "Liderazgo \n"
					+"Coordinaci�n \n"
					+"Destreza \n";
		}
		else if (letra.equals("e")) {
			intereses ="E \n"
					+"Investigaci�n \n"
					+"Orden \n"
					+ "Organizaci�n \n"
					+ "An�lisis y s�ntesis \n"
					+ " Num�rico \n"
					+"Clasificar \n"
					+"Precisi�n \n"
					+" Exacto \n";
		} 
		return intereses;
		
	}
	
	
	public void cargarpreguntas() throws IOException{	
		File archivo = new File("./archivos/preguntas.properties");
		FileInputStream lee = new FileInputStream(archivo);
		
		Properties prop = new Properties();
		prop.load(lee);
		
		String propCant = prop.getProperty("cantidad");
		int cantidad = Short.parseShort(propCant);
		
		
			
		
		int c = 0;
		while(c<cantidad)
		{
			String proptexto = prop.getProperty("pre"+c+".texto");
			String propnum = prop.getProperty("pre"+c+".num");
			int propNum = Integer.parseInt(propnum);
			String propclase = prop.getProperty("pre"+c+".clase");
			String propletra = prop.getProperty("pre"+c+".letra");

			
			
			mundo.agregarpreguntas(proptexto, propNum, propclase, propletra);

			
			c++;
		}
		
		
		}
	public String aptitudes(String letra) {
		String aptitudes = " ";
		if (letra.equals("c")) {
			aptitudes ="C \n"
					+"Persuasivo \n"
		+"Objetivo \n"
		+ "Pr�ctico \n"
		+ "Tolerante \n"
		+ "Responsable \n"
		+"Ambicioso \n"
		+"Din�mico \n"
		+"Resolutivo  \n";
		}
		else if (letra.equals("h")) {
			aptitudes ="H \n"
					+"Responsable  \n"
					+"Justo \n"
					+ "Conciliador \n"
					+ "Persuasivo \n"
					+"Sagaz \n"
					+"Imaginativo \n"
					+"Comprensivo  \n"
					+ "Estabilidad Emocional";
		}
		else if (letra.equals("a")) {
			aptitudes ="A \n"
					+"Sensible  \n"
					+"Imaginativo \n"
					+ "Creativo \n"
					+ "Detallista \n"
					+"Innovador \n"
					+"Intuitivo \n"
					+"Paciente  \n"
					+ "Espont�neo";
		}
		else if (letra.equals("s")) {
			aptitudes ="S \n"
					+"Altruista  \n"
					+"Solidario \n"
					+ "Paciente \n"
					+ "Comprensivo \n"
					+"Respetuoso \n"
					+"Persuasivo \n"
					+"Servicial  \n"
					+ "Observador";
			}
		else if (letra.equals("i")) {
			aptitudes ="I \n"
					+"Preciso  \n"
					+"Pr�ctico \n"
					+ "Cr�tico \n"
					+ "Anal�tico \n"
					+"R�gido \n"
					+"Racional \n"
					+"Independiente  \n";
		}
		else if (letra.equals("d")) {
			aptitudes ="D \n"
					+"Arriesgado  \n"
					+"Solidario \n"
					+ "Valiente \n"
					+ "Agresivo \n"
					+"Persuasivo \n"
					+"Aventurero \n"
					+"Equilibri Ps�quico  \n";
		}
		else if (letra.equals("e")) {
			aptitudes ="E \n"
					+"Met�dico  \n"
					+"Anal�tico \n"
					+ "Observador \n"
					+ "Introvertido \n"
					+"Paciente \n"
					+"Seguro \n"
					+"Independiente  \n"
					+ "Intuitivo";
			} 
		return aptitudes;
		
	}

}
