package Condicionales;
import java.util.Scanner;
public class condicional19 {

	public static void main(String[] args) {
		int MIN, A,B,C;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el valor de A: ");
		A=valor.nextInt();
		System.out.println("Introduce el valor de B: ");
		B=valor.nextInt();
		System.out.println("Introduce el valor de C: ");
		C=valor.nextInt();
		if (A<B && A<C ) {
			MIN=A;
		}
		else if (B<A && B<C) {
			MIN=B;
		}
		else {
			MIN=C;
		}
		System.out.println("El valor més petit es: "+MIN);
	}
}
