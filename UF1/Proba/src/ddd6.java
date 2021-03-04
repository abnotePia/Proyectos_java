import java.util.Scanner;
public class ddd6 {

	public static void main(String[] args) {
		int divisors,maxim,suma=0,suma2=0,numeroAcabar=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el maximo numero divisor");
		maxim=valor.nextInt();
		System.out.println("Introduce el divisor");
		divisors=valor.nextInt();
		System.out.println("Introduce amb quin numero a de acabar");
		numeroAcabar=valor.nextInt();
		while (suma<=maxim) {
			suma+=divisors;

			if (numeroAcabar==suma%10) {
				System.out.print(suma+" ");
			}
		}
	}

	}


