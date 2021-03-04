package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;

public class condicional9 {

	public static void main(String[] args) {
		int numero,Gran,petit,cont=0,mitjana=0;
		Scanner valor=new Scanner(System.in);
		numero=valor.nextInt();
		Gran=numero;
		petit=numero;
		while (numero!=0) {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			mitjana+=numero;
			if (numero>Gran) {
				Gran=numero;
			}
			else if (numero<petit) {
				petit=numero;
			}
			cont++;
		}
		System.out.println("El numero més gran introduit es: "+Gran);
		System.out.println("El numero més petit introduit es: "+petit);
		System.out.println("La mitjana contant el 0 es: "+mitjana/cont);
		valor.close();

	}

}
