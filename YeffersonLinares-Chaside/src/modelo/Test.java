package modelo;

public class Test 
{
	private int[] respuestas;
	private String resultados;
	private int[] chasideInteres;
	private int[] chasideAptitud;

	
	public Test() 
	{
		respuestas = new int[98];
		chasideAptitud = new int[7];
		chasideInteres = new int[7];
		resultados = "";
	}
	
	public int[] guardarRespuestas(int[] z)
	{
		for(int x=0;x<respuestas.length;x++)
		{
			if(z[x]==0) respuestas[x]=1;
			else if(z[x]==1) respuestas[x]=0;
		}
		return respuestas;
	}
	
	public String calificarRespuestas()
	{
		int pro = -1;
		int sas = -1;
		chasideAptitud[0] = respuestas[14]+respuestas[50]+respuestas[1]+respuestas[45];
		chasideAptitud[1] = respuestas[62]+respuestas[29]+respuestas[71]+respuestas[85];
		chasideAptitud[2] = respuestas[21]+respuestas[38]+respuestas[75]+respuestas[81];
		chasideAptitud[3] = respuestas[68]+respuestas[39]+respuestas[28]+respuestas[3];
		chasideAptitud[4] = respuestas[25]+respuestas[58]+respuestas[89]+respuestas[9];
		chasideAptitud[5] = respuestas[12]+respuestas[65]+respuestas[17]+respuestas[42];
		chasideAptitud[6] = respuestas[93]+respuestas[6]+respuestas[78]+respuestas[54]; 
		
		chasideInteres[0] = respuestas[97]+respuestas[11]+respuestas[63]+respuestas[52]+respuestas[84]+respuestas[0]+respuestas[77]+respuestas[19]+respuestas[70]+respuestas[90];
		chasideInteres[1] = respuestas[8]+respuestas[33]+respuestas[79]+respuestas[24]+respuestas[94]+respuestas[66]+respuestas[40]+respuestas[73]+respuestas[55]+respuestas[88];
		chasideInteres[2] = respuestas[20]+respuestas[44]+respuestas[95]+respuestas[56]+respuestas[27]+respuestas[10]+respuestas[4]+respuestas[2]+respuestas[80]+respuestas[35];
		chasideInteres[3] = respuestas[32]+respuestas[91]+respuestas[69]+respuestas[7]+respuestas[86]+respuestas[61]+respuestas[22]+respuestas[43]+respuestas[15]+respuestas[51];
		chasideInteres[4] = respuestas[74]+respuestas[5]+respuestas[18]+respuestas[37]+respuestas[59]+respuestas[26]+respuestas[82]+respuestas[53]+respuestas[46]+respuestas[96];
		chasideInteres[5] = respuestas[83]+respuestas[30]+respuestas[47]+respuestas[72]+respuestas[4]+respuestas[64]+respuestas[13]+respuestas[36]+respuestas[57]+respuestas[23];
		chasideInteres[6] = respuestas[76]+respuestas[41]+respuestas[87]+respuestas[16]+respuestas[92]+respuestas[31]+respuestas[67]+respuestas[48]+respuestas[34]+respuestas[60];
		
		for(int x=0;x<chasideAptitud.length;x++)
		{
			if(chasideAptitud[x]>pro)
			{
				pro = chasideAptitud[x];
			}
			if(chasideInteres[x]>sas)
			{
				sas = chasideInteres[x];
			}
		}
		if(pro==chasideAptitud[0]) resultados = "APTITUDES para Administrativas y contables, eres:"+"\n"+"Persuasivo"+"\n"+"Objetivo"+"\n"+"Pr�ctico"+"\n"+"Tolerante"+"\n"
		+"Responsabe"+"\n"+"Ambicioso"+"\n"+"Din�mico"+"\n"+"Resolutivo";
		else
		{
			if(pro==chasideAptitud[1]) resultados = "APTITUDES para Human�sticas y Sociales, eres:"+"\n"+"Responsable"+"\n"+"Justo"+"\n"+"Conciliador"+"\n"+"Persuasivo"+"\n"+
		"Sagaz"+"\n"+"Imaginativo"+"\n"+"Comprensivo"+"\n"+"Estabilidad Emocional";
			else
			{
				if(pro==chasideAptitud[2]) resultados ="APTITUDES para Art�sticas, eres:"+"\n"+"Sensible"+"\n"+"Imaginativo"+"\n"+"Creativo"+"\n"+"Detallista"+"\n"+"Innovador"+"\n"+"Intuitivo"
			+"\n"+"Paciente"+"\n"+"Espont�neo";
				else
				{
					if(pro==chasideAptitud[3]) resultados = "APTITUDES para Medicina y ciencias de la salud, eres:"+"\n"+"Altruista"+"\n"+"Solidario"+"\n"+"Paciente"+"\n"
				+"Comprensivo"+"\n"+"Respetuoso"+"\n"+"Persuasivo"+"\n"+"Servicial"+"\n"+"Observador";
					else
					{
						if(pro==chasideAptitud[4]) resultados = "APTITUDES para Ingenier�a y computaci�n, eres:"+"\n"+"Preciso"+"\n"+"Pr�ctico"+"\n"+"Cr�tico"
					+"\n"+"Anal�tico"+"\n"+"R�gido"+"\n"+"Racional"+"\n"+"Independiente";
						else
						{
							if(pro==chasideAptitud[5]) resultados = "APTITUDES para Defensa y seguridad, eres:"+"\n"+"Arriesgado"+"\n"+"Solidario"+"\n"+"Valiente"+"\n"
						+"Agresivo"+"\n"+"Persuasivo"+"\n"+"Aventurero"+"\n"+"Equlibrio Ps�quico";
							else
								{
								if(pro==chasideAptitud[6]) resultados = "APTITUDES para Ciencias exactas y agrarias, eres:"+"\n"+"Met�dico"+"\n"+"Anal�tico"+"\n"
								+"Observador"+"\n"+"Introvertido"+"\n"+"Paciente"+"\n"+"Seguro"+"\n"+"Independiente"+"\n"+"Intuitivo";
								}
						}
					}
				}
			}
		}
		if(sas==chasideInteres[0]) resultados +="\n"+"\n"+"\n"+"INTERESES-Administrativas y contables, eres de"+"\n"+"Organizativo"+"\n"+"Supervisi�n"+"\n"+"Orden"
		+"\n"+"An�lisis y s�ntesis"+"\n"+"Colaboraci�n"+"\n"+"Liderazgo"+"\n"+"Participaci�n Activa";
		else
		{
			if(sas==chasideInteres[1]) resultados +="\n"+"\n"+"\n"+"INTERESES-Human�sticas y Sociales, eres de"+"\n"+"Precisi�n verbal"+"\n"+"Organizaci�n"+"\n"+"Relaci�n de hechos"+"\n"
		+"Ling��stica"+"\n"+"Orden"+"Justicia"+"El hombre anal�tico";
			else
			{
				if(sas==chasideInteres[2]) resultados +="\n"+"\n"+"\n"+"INTERESES-Artisticas, eres de"+"\n"+"Est�tico"+"\n"+"Arm�nico"+"\n"+"Manual"+"\n"+"Visual"+"\n"
			+"Auditivo"+"\n"+"Observaci�n y Analisis"+"Senso-Perceptivo";
				else
				{
					if(sas==chasideInteres[3]) resultados += "\n"+"\n"+"\n"+"INTERESES-Medicina y ciencias de la salud, eres de"+"\n"+"Asistir"+"\n"+"Investigativo"
			+"\n"+"Precisi�n"+"Senso-Perceptivo"+"\n"+"Anal�tico"+"\n"+"Ayudar"+"\n"+"Curar"+"\n"+"Rehabilitar";
					else
					{
						if(sas==chasideInteres[4]) resultados +="\n"+"\n"+"\n"+"INTERESES-Ingenier�a y computaci�n, eres de"+"\n"+"C�lculo"+"\n"+"Cient�fico"+"\n"
					+"Manual"+"Exacto"+"\n"+"Planificar"+"\n"+"Organizar"+"\n"+"Controlar";
						else
						{
							if(sas==chasideInteres[5]) resultados += "\n"+"\n"+"\n"+"INTERESES-Defensa y Seguridad, eres de"+"\n"+"Justicia"+"\n"+"Equidad"+"\n"
						+"Colaboraci�n"+"\n"+"Esp�ritu de equipo"+"\n"+"Liderazgo"+"\n"+"Coordinaci�n"+"\n"+"Destreza F�sica";
							else
								{
								if(sas==chasideInteres[6]) resultados +="\n"+"\n"+"\n"+"INTERESES-Ciencias exactas y agrarias, eres de"+"\n"+"Investigaci�n"+"\n"+"Orden"+"\n"
								+"Organizaci�n"+"\n"+"An�lisis y S�ntesis"+"\n"+"Num�rico"+"Clasificar"+"\n"+"Presici�n"+"\n"+"Exacto";
								}
						}
					}
				}
			}
		}
		return resultados;
	}

	public int[] getRespuestas() 
	{
		return respuestas;
	}
}