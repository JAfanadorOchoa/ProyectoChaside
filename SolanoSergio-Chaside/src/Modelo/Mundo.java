package Modelo;

public class Mundo {
	
	private Persistencia BD;
	private Archivo archivoPreguntas;
	private String[] preguntas;
	
	public Mundo(){
		
		BD = new Persistencia();
		archivoPreguntas = new Archivo();
		preguntas = archivoPreguntas.leerArchivo();
		
	}
	
	public String mostrarPreguntas(int pVal){
		
		return preguntas[pVal];
	}

	public Persistencia getBD() {
		return BD;
	}

	public Archivo getArchivoPreguntas() {
		return archivoPreguntas;
	}

	public String[] getPreguntas() {
		return preguntas;
	}
	
	public void buscarRespuestas(int pValor){
				
		boolean bul = false;
		for(int i = 0;i<10 && !bul;i++){
			for(int j = 0;j<7;j++){
				int val = BD.intereses[i][j]; 
				if(val==pValor){
					BD.intereses[i][j] = 0;
					bul = !bul;
				}
			}
		}
		if(!bul){
			for(int i = 0;i<4 && !bul;i++){
				for(int j = 0;j<7;j++){
					int val = BD.aptitudes[i][j];
					if(val==pValor){
						BD.aptitudes[i][j] = 0;
						bul = !bul;
					}
				}
			}
		}
	}
		
		public int contarMaximoIntereses(){
			
			int indice = 0;
			int mayor = 0;			
			for(int i = 0;i<7;i++){
				int cont = 0;
				for(int j=0;j<10;j++){
					if(BD.intereses[j][i]==0){
						cont++;
					}
				}
				if(mayor<cont){
					mayor = cont;
					indice = i;
				}
			}
			return indice;
		}
		
		public int contarMaximoAptitudes(){
			
			int indice = 0;
			int mayor = 0;			
			for(int i = 0;i<7;i++){
				int cont = 0;
				for(int j=0;j<4;j++){
					if(BD.aptitudes[j][i]==0){
						cont++;
					}
				}
				if(mayor<cont){
					mayor = cont;
					indice = i;
				}
			}
			return indice;
		}
	}