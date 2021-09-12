
public class Nizovi {

	public static void main(String[] args) {
		
		String[] automobili;
		int[] ocene = new int[2];
		automobili = new String[4];
		
		automobili[0] = "Audi"; 
		automobili[1] = "Peugeot"; 
		automobili[2] = "BMW"; 
		automobili[3] = "Citroen"; 
		System.out.println("Vrednost NULTOG elementa niza 'AUTOMOBILI' je: " + automobili[0]); 
		System.out.println("Vrednost PRVOG elementa niza 'AUTOMOBILI' je: " + automobili[1]); 
		System.out.println("Vrednost DRUGOG elementa niza 'AUTOMOBILI' je: " + automobili[2]); 
		System.out.println("Vrednost TRECEG elementa niza 'AUTOMOBILI' je: " + automobili[3]); 
		
		ocene[0] = 5; 
		ocene[1] = 4; 
		System.out.println("Vrednost NULTOG elementa niza 'OCENE' je: " + ocene[0]); 
		System.out.println("Vrednost PRVOG elementa niza 'OCENE' je: " + ocene[1]); 
		
		double[] cene = {520, 350.45, 450.63};
		System.out.println("Vrednost NULTOG elementa niza 'CENE' je: " + cene[0]); 
		System.out.println("Vrednost PRVOG elementa niza 'CENE' je: " + cene[1]); 
		System.out.println("Vrednost DRUGOG elementa niza 'CENE' je: " + cene[2]); 
		
		int duzinaNizaCene = cene.length; 
		System.out.println("Duzina niza 'CENE' je: " + duzinaNizaCene); 
		

	}

}
