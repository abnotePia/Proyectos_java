import java.util.Scanner;
public class ddddd5 {

	public static void main(String[] args) {
		int divisors,maxim,suma=0,suma2=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el maximo numero divisor");
		maxim=valor.nextInt();
		System.out.println("Introduce el divisor");
		divisors=valor.nextInt();
		while (suma<=maxim) {
			suma2+=suma;
			suma+=divisors;
		}
		System.out.print(suma2);
	}

}
