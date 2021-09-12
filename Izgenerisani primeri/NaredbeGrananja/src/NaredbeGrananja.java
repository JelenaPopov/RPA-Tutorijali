
public class NaredbeGrananja {

	public static void main(String[] args) {
		
		int cena = 2000; 
		if (cena > 1000) {
			System.out.println("Cena je veca od 1000."); 
		}
		
		int broj = 5;
		if ((broj % 2) == 0) {
			System.out.println("Broj " + broj + " je paran broj."); 
		} else { 
			System.out.println("Broj " + broj + " je neparan broj."); 
		}
		
		int redniBrojDanaUNedelji = 5;
		String dan = "";
		switch (redniBrojDanaUNedelji) {
		case 1: 
			dan = "Ponedeljak";
			break;
		case 2: 
			dan = "Utorak";
			break;
		case 3: 
			dan = "Sreda";
			break;
		case 4: 
			dan = "Cetvrtak";
			break;
		case 5: 
			dan = "Petak";
			break;
		case 6: 
			dan = "Subota";
			break;
		case 7: 
			dan = "Nedelja";
			break;
		}
		System.out.println("Danas je: " + dan); 

	}

}
