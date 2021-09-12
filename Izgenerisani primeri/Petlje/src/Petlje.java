
public class Petlje {

	public static void main(String[] args) {
		
		String[] automobili = {"Audi", "Peugeot", "BMW", "Citroen"};
		System.out.print("Vrednosti elemenata niza 'automobili' su: "); 
		for (int i = 0; i < automobili.length; i++) {
			System.out.print(automobili[i] + ", ");
		}
		
		int broj = 0;
		System.out.println();  //pomeranje kursora u novi red 
		System.out.print("While petlja -> Jednocifreni brojevi su: "); 
		while (broj < 10) { 
			System.out.print(broj + ", ");; 
			broj = broj + 1;
		}
		
		broj = 0;
		System.out.println();  //pomeranje kursora u novi red 
		System.out.print("Do-while petlja -> Jednocifreni brojevi su: "); 
		do { 
			System.out.print(broj + ", "); 
			broj = broj + 1;
		} while (broj < 10);
		

	}

}
