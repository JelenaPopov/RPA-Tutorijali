
public class RadSaStringovima {

	public static void main(String[] args) {
		
		String imeOsobe = "Ana"; 
		
		//Konkatenacija (spajanje) stringova može da se vrši upotrebom + znaka
		String novoImeOsobe = imeOsobe + " Marija"; 
		System.out.println("Primer konkatenacije stringova: " + novoImeOsobe); 
		
		int duzina = imeOsobe.length(); 
		System.out.println("Dužina stringa je: " + duzina); 
		
		System.out.println("Primer upotrebe toUpperCase() metode:  " + imeOsobe.toUpperCase()); 
		
		System.out.println("Primer upotrebe toLowerCase() metode: " + imeOsobe.toLowerCase()); 
		
		String podstring = novoImeOsobe.substring(4,10);
		System.out.println("Primer upotrebe substring() metode: " + podstring); 
		
		String recenica = "Ana je rodjena pre 2 godine, 4 meseca i 12 dana."; 
		String izmenjenaRecenica = recenica.replace('2',  '3');
		System.out.println("Primer upotrebe replace() metode: " + izmenjenaRecenica); 
		

	}

}
