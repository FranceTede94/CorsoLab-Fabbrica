package anagrafiche;

public class ImpiegatoStipendiato extends Impiegato {
	
	private int stipend;

	public ImpiegatoStipendiato(String nom, int cod, int stipendio) {
		super(nom, cod);
		this.stipend = stipendio;
	
	}

	public int getStipend() {
		return stipend;
	}

	public void setStipend(int newstipend) {
		this.stipend = newstipend;
	}
	

	public String toString() {
		return super.toString() + " e lo stipendio dell'impiegato è " + stipend;
	}
	
	
	
	
	

}
