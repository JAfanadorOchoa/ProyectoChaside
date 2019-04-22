package modelo;

public class InteresesAptitudes {

	private int cInteres;
	private int hInteres;
	private int aInteres;
	private int sInteres;
	private int iInteres;
	private int dInteres;
	private int eInteres;
	
	private int cAptitud;
	private int hAptitud;
	private int aAptitud;
	private int sAptitud;
	private int iAptitud;
	private int dAptitud;
	private int eAptitud;

	private int[] intereses;
	private int[] aptitudes;
	private String[] tIntereses;
	private String[] tAptitudes;
	
	private Persistencia per;
	
	private int aux;
	private String aux2;
	private int aux3;
	private String aux4;
	public InteresesAptitudes() {
		
		per = new Persistencia();
		cInteres= hInteres = aInteres = sInteres = iInteres = dInteres = eInteres = 0;
		cAptitud = hAptitud = aAptitud = sAptitud = iAptitud= dAptitud = eAptitud = 0;
		
		tIntereses = new String[]{
				per.cIntereses, per.hIntereses,per.aIntereses,per.sIntereses,per.iIntereses,per.dIntereses,
				per.eIntereses
		};
		tAptitudes = new String[] {
			per.cAptitudes,per.hAptitudes,per.aAptitudes,per.sAptitudes,per.iAptitudes,per.dAptitudes,
			per.eAptitudes
		};
		
		intereses = new int[7];
		intereses[0] = cInteres;
		intereses[1] = hInteres;
		intereses[2] = aInteres;
		intereses[3] = sInteres;
		intereses[4] = iInteres;
		intereses[5] = dInteres;
		intereses[6] = eInteres;
		aptitudes = new int[7];
		aptitudes[0] = cAptitud;
		aptitudes[1] = hAptitud;
		aptitudes[2] = aAptitud;
		aptitudes[3] = sAptitud;
		aptitudes[4] = iAptitud;
		aptitudes[5] = dAptitud;
		aptitudes[6] = eAptitud;
		
		aux = 0;
		aux2= null;
	}
	
	
	public void sumar(int posicion) {
		if(posicion == 98 ||posicion == 12 ||posicion == 64|| posicion == 53 || posicion == 85 || 
				posicion == 1 || posicion == 78 || posicion == 20 || posicion == 71 || posicion == 91) {
			cInteres++;
		}
		
		if(posicion == 9 ||posicion == 34 ||posicion == 80|| posicion == 25 || posicion == 95 || 
				posicion == 67 || posicion == 41 || posicion == 74 || posicion == 56 || posicion == 89) {
			hInteres++;
		}
		if(posicion == 21 ||posicion == 45 ||posicion == 96|| posicion == 57 || posicion == 28 || 
				posicion == 11 || posicion == 5 || posicion == 3 || posicion == 81 || posicion == 36) {
			aInteres++;
		}
		if(posicion == 33 ||posicion == 92 ||posicion == 70|| posicion == 8 || posicion == 87 || 
				posicion == 62 || posicion == 23 || posicion == 44 || posicion == 16 || posicion == 52) {
			sInteres++;
		}
		if(posicion == 75 ||posicion == 6 ||posicion == 19|| posicion == 38 || posicion == 60 || 
				posicion == 27 || posicion == 83 || posicion == 54 || posicion == 47 || posicion == 97) {
			iInteres++;
		}
		if(posicion == 84 ||posicion == 31 ||posicion == 48|| posicion == 73 || posicion == 5 || 
				posicion == 65 || posicion == 14 || posicion == 37 || posicion == 58 || posicion == 24) {
			dInteres++;
		}
		if(posicion == 77 ||posicion == 42 ||posicion == 88|| posicion == 17 || posicion == 93 || 
				posicion == 32 || posicion == 68 || posicion == 49 || posicion == 35 || posicion == 61) {
			eInteres++;
		}
		if(posicion == 15 ||posicion == 51 ||posicion == 2|| posicion == 46 ) {
			cAptitud++;
		}
		if(posicion == 63 ||posicion == 30 ||posicion == 72|| posicion == 86) {
			hAptitud++;
		}
		if(posicion == 22 ||posicion == 39 ||posicion == 76|| posicion == 82) {
			aAptitud++;
		}
		if(posicion == 69 ||posicion == 40 ||posicion == 29|| posicion == 4) {
			sAptitud++;
		}
		if(posicion == 26 ||posicion == 59 ||posicion == 90|| posicion == 10) {
			iAptitud++;
		}
		if(posicion == 13 ||posicion == 66 ||posicion == 18|| posicion == 43) {
			dAptitud++;
		}
		if(posicion == 94 ||posicion == 7 ||posicion == 79|| posicion == 55) {
			eAptitud++;
		}
					
}
	
	public void mayorInteres() {
		for (int i = 0; i < intereses.length-1; i++) {
			for (int j = 0; j < intereses.length-1; j++) {
				if(intereses[j] > intereses[j+1]) {
					aux = intereses[j];
					intereses[j] = intereses[j+1];
					intereses[j+1] = aux;
					
					aux2 = tIntereses[j];
					tIntereses[j] = tIntereses[j+1];
					tIntereses[j+1] = aux2;
					
					
				}
			}
		}
	}
	public void mayorAptitud() {
		for (int i = 0; i < aptitudes.length-1; i++) {
			for (int j = 0; j < aptitudes.length-1; j++) {
				aux3 = aptitudes[j];
				aptitudes[j] = aptitudes[j+1];
				aptitudes[j+1] = aux3;
				
				aux4 = tAptitudes[j];
				tAptitudes[j] = tAptitudes[j+1];
				tAptitudes[j+1] = aux4;
			}
		}
	}
	
	public int getcInteres() {
		return cInteres;
	}


	public void setcInteres(int cInteres) {
		this.cInteres = cInteres;
	}


	public int gethInteres() {
		return hInteres;
	}


	public void sethInteres(int hInteres) {
		this.hInteres = hInteres;
	}


	public int getaInteres() {
		return aInteres;
	}


	public void setaInteres(int aInteres) {
		this.aInteres = aInteres;
	}


	public int getsInteres() {
		return sInteres;
	}


	public void setsInteres(int sInteres) {
		this.sInteres = sInteres;
	}


	public int getiInteres() {
		return iInteres;
	}


	public void setiInteres(int iInteres) {
		this.iInteres = iInteres;
	}


	public int getdInteres() {
		return dInteres;
	}


	public void setdInteres(int dInteres) {
		this.dInteres = dInteres;
	}


	public int geteInteres() {
		return eInteres;
	}


	public void seteInteres(int eInteres) {
		this.eInteres = eInteres;
	}


	public int getcAptitud() {
		return cAptitud;
	}


	public void setcAptitud(int cAptitud) {
		this.cAptitud = cAptitud;
	}


	public int gethAptitud() {
		return hAptitud;
	}


	public void sethAptitud(int hAptitud) {
		this.hAptitud = hAptitud;
	}


	public int getaAptitud() {
		return aAptitud;
	}


	public void setaAptitud(int aAptitud) {
		this.aAptitud = aAptitud;
	}


	public int getsAptitud() {
		return sAptitud;
	}


	public void setsAptitud(int sAptitud) {
		this.sAptitud = sAptitud;
	}


	public int getiAptitud() {
		return iAptitud;
	}


	public void setiAptitud(int iAptitud) {
		this.iAptitud = iAptitud;
	}


	public int getdAptitud() {
		return dAptitud;
	}


	public void setdAptitud(int dAptitud) {
		this.dAptitud = dAptitud;
	}


	public int geteAptitud() {
		return eAptitud;
	}


	public void seteAptitud(int eAptitud) {
		this.eAptitud = eAptitud;
	}


	public int[] getIntereses() {
		return intereses;
	}


	public void setIntereses(int[] intereses) {
		this.intereses = intereses;
	}


	public int[] getAptitudes() {
		return aptitudes;
	}


	public void setAptitudes(int[] aptitudes) {
		this.aptitudes = aptitudes;
	}


	public String[] gettIntereses() {
		return tIntereses;
	}


	public void settIntereses(String[] tIntereses) {
		this.tIntereses = tIntereses;
	}


	public String[] gettAptitudes() {
		return tAptitudes;
	}


	public void settAptitudes(String[] tAptitudes) {
		this.tAptitudes = tAptitudes;
	}



	
	
}
