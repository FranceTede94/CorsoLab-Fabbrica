package anagrafiche;

public class Impiegato {
	
	private String Nome;
	private int Codice;
	
	
	public Impiegato(String nom, int cod) {
		this.Nome = nom;
		this.Codice = cod;
	}
	
	public void setNome(String nom) {
		this.Nome = nom;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public void setCodice(int cod) {
		this.Codice = cod;
	}
	
	public String getCodice() {
		return this.Nome;
	}
	
	
	public String toString() {
		return "L'impiegato si chiama " + Nome + " e il suo codice è " + Codice;
	}

}
