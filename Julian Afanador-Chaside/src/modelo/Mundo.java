package modelo;

public class Mundo {

	
	
	
	private InteresesAptitudes intereses;
	private Persistencia persistencia;
	
	public Mundo() {
		
		intereses = new InteresesAptitudes();
		persistencia  = new Persistencia();
	}



	public InteresesAptitudes getIntereses() {
		return intereses;
	}

	public void setIntereses(InteresesAptitudes intereses) {
		this.intereses = intereses;
	}

	public Persistencia getPersistencia() {
		return persistencia;
	}

	
	
}
