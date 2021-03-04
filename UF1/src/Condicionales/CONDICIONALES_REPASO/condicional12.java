package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class condicional12 {

	public static void main(String[] args) {
		int numeros,imparell,cont=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numeros=valor.nextInt();
		System.out.println("Els numeros imparells son: ");
		while (cont<numeros) {
			if (cont%2!=0) {
				System.out.println(cont);
			}
			cont++;
		}
	}

}
