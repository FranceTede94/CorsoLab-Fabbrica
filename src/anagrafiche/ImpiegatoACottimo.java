package anagrafiche;

public class ImpiegatoACottimo extends Impiegato{
	
	private int ProdottiLavorati;
	private int PagaPerProdotto;

	public ImpiegatoACottimo(String nom, int cod, int PagaPerProdotto, int ProdottiLavorati) {
		super(nom, cod);
		this.PagaPerProdotto = PagaPerProdotto;
		this.ProdottiLavorati = ProdottiLavorati;
	
}

	public int getProdottiLavorati() {
		return ProdottiLavorati;
	}


	public void setProdottiLavorati(int prodottiLavorati) {
		ProdottiLavorati = prodottiLavorati;
	}



	public int getPagaPerProdotto() {
		return PagaPerProdotto;
	}



	public void setPagaPerProdotto(int pagaPerProdotto) {
		PagaPerProdotto = pagaPerProdotto;
	}
	
	
	public String toString() {
		return super.toString() + " e l'impiegato ha ricevuto questo stipendio " +  (PagaPerProdotto * ProdottiLavorati);
	}

	
	
	
	
	
}