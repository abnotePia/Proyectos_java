package Arrays_1_dimensio;
import java.util.Scanner;

public class Array82 {

	public static void main(String[] args) {
		int [] numeros;
		Scanner valor=new Scanner(System.in);
		int llarg,cont=0;
		double mitjana=0;
		System.out.println("INtroduce la longuitud de la array: ");
		llarg=valor.nextInt();
		numeros=new int[llarg];
		while (cont<llarg) {
			System.out.println("Introduce un numero: ");
			numeros[cont]=valor.nextInt();
			mitjana=mitjana+numeros[cont];
			cont++;
			
		}
		mitjana=mitjana/llarg;
		cont=0;
		while (cont<llarg) {
			if (numeros[cont]>mitjana) {
				System.out.println(numeros[cont]+" > "+mitjana);
			}
			else {
				System.out.println(numeros[cont]+" < "+mitjana);
			}
			cont++;
		}
		valor.close();
	}

}
