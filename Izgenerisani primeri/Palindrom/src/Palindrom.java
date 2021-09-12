import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		String unetiTekst, obrnutiTekst = ""; 
		Scanner skener = new Scanner(System.in); 
		System.out.println("Unesite tekst za koji želite da proverite da li je palindrom:"); 
		
		unetiTekst = skener.nextLine(); 
		unetiTekst = unetiTekst.replace(" ", "").toLowerCase();
		
		int duzina = unetiTekst.length(); 
		
		for (int i = duzina - 1; i >= 0; i--)
			obrnutiTekst = obrnutiTekst + unetiTekst.charAt(i);
		if (unetiTekst.equals(obrnutiTekst)) {
			System.out.println("Uneti tekst JESTE palindrom."); 
		} else {
			System.out.println("Uneti tekst NIJE palindrom."); 
		}
		
		skener.close();

	}

}
