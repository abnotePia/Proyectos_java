package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;

public class condicional7 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int numero=1,mitjana=0,cont=0;
		while (numero!=0) {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			mitjana+=numero;
			cont++;
		}
		System.out.println("La mitjana contant el 0 es:"+mitjana/cont);
		System.out.println("La mitjana  sense contar el 0 es:"+mitjana/(cont-1));
		valor.close();
	}

}
