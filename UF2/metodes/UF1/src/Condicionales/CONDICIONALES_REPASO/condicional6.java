package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class condicional6 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int numero=1,mitjana=0;
		while (numero!=0) {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			mitjana+=numero;
			
		}
		System.out.println("La suma es:"+mitjana);
		valor.close();
	}

}
