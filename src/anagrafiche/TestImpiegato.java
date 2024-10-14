package anagrafiche;

public class TestImpiegato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Impiegato Andrea = new ImpiegatoStipendiato("Andrea", 100, 1500);
		System.out.println(Andrea);
		
		Impiegato Francesco = new ImpiegatoACottimo("Francesco", 1200, 50, 100);
		System.out.println(Francesco);
		
		Andrea.setCodice(200);
		Andrea.setNome("Gianluca");
		System.out.println(Andrea);
		
		ImpiegatoStipendiato Antonio = new ImpiegatoStipendiato("Andrea", 700, 1500);
		System.out.println(Antonio);
		
		
		Antonio.setStipend(2300);
		System.out.println(Antonio);
		
		ImpiegatoACottimo Edoardo = new ImpiegatoACottimo("Valentino", 500, 70, 150);
		System.out.println(Edoardo);
	
		
		System.out.println(Antonio instanceof ImpiegatoStipendiato);
		System.out.println();
		
		
		
		
		
		
	}

}
