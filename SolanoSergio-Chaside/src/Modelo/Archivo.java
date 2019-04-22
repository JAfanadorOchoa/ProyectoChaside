package Modelo;
import java.io.*;



public class Archivo {
		
	private FileReader fr;
	private BufferedReader br;
	private File f;
	private String linea;
	private String[] pregun;
		
	public String[] leerArchivo() {
			
			
		f = new File("Preguntas.txt");
		pregun = new String[98];
		try {
				
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			int line = 0;
			linea = br.readLine();
			while(linea!=null) {
					
				pregun[line] = linea; 
				linea = br.readLine();
				line++;
					
			}
			fr.close();
		}
			
		catch(IOException e) {
			//System.out.println("error");
			e.printStackTrace();
		}
		return pregun;
		}
}
