
public class Operatori {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 50;
		System.out.println("***** ARITMETICKI OPERATORI *****"); 
		int zbir = a + b;
		System.out.println("Rezultat primene '+' operatora: " + zbir); 
		int razlika = a - b;
		System.out.println("Rezultat primene '-' operatora: " + razlika); 
		int proizvod = a * b;
		System.out.println("Rezultat primene '*' operatora: " + proizvod); 
		a++;
		System.out.println("Rezultat primene '++' operatora: " + a); 
		b--;
		System.out.println("Rezultat primene '--' operatora: " + b); 
		
		int c = 10;
		int d = 5;
		boolean e = false;
		System.out.println("***** RELACIONI OPERATORI *****"); 
		e = c == d;
		System.out.println("Rezultat primene '==' operatora: " + e); 
		e = c != d;
		System.out.println("Rezultat primene '!=' operatora: " + e); 
		e = c > d;
		System.out.println("Rezultat primene '>' operatora: " + e); 
		e = c < d;
		System.out.println("Rezultat primene '<' operatora: " + e); 
		
		boolean f = true;
		boolean g = false;
		boolean h = false;
		System.out.println("***** LOGICKI OPERATORI *****"); 
		h = f && g;
		System.out.println("Rezultat primene '&&' operatora: " + h); 
		h = f || g;
		System.out.println("Rezultat primene '||' operatora: " + h); 
		h = !f;
		System.out.println("Rezultat primene '!' operatora: " + h); 
		
		int i = 20;
		int j = 10;
		System.out.println("***** OPERATORI DODELE *****"); 
		j += i;
		System.out.println("Rezultat primene '+=' operatora: " + j); 
		j = 10;
		j -= i;
		System.out.println("Rezultat primene '-=' operatora: " + j); 
		j = 10;
		j *= i;
		System.out.println("Rezultat primene '*=' operatora: " + j); 
		

	}

}
