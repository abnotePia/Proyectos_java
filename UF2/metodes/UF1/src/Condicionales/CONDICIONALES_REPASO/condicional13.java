package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class condicional13 {

	public static void main(String[] args) {
		int factorial,cont=1,resultat=1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		factorial=valor.nextInt();
		System.out.print(factorial+"!"+"="+factorial+"*");
		while (cont<=factorial) {
			if (cont!=factorial-1) {
			System.out.print((factorial-cont)+"*");
			resultat=(factorial*cont)*resultat;
			}
			else {
				System.out.print((factorial-cont));
				resultat=(factorial*cont)*resultat;
			}
			cont++;
		}
		System.out.println("\nEl resultat del factorial del numero "+factorial+" es "+resultat);
	}

}
