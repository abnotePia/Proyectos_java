package Condicionales;
import java.util.Scanner;
public class condicional20 {

	public static void main(String[] args) {
	int A,B,C,D,MIN;
	Scanner valor= new Scanner(System.in);
	System.out.println("Introduce el valor de A: ");
		A=valor.nextInt();
	System.out.println("Introduce el valor de B: ");
	B=valor.nextInt();
	System.out.println("Introduce el valor de C: ");
	C=valor.nextInt();
	System.out.println("Introduce el valor de D: ");
	D=valor.nextInt();
	if (A<B && A<C && A<D) {
		MIN=A;
	}
	else if (B<A && B<C && B<D) {
		MIN=B;
	}
	else if (C<A && C<B && C<D) {
		MIN=C;
	}
	else {
		MIN=D;
	} 
	System.out.println("El valor de la variable MIN es: "+MIN);
	}
}
