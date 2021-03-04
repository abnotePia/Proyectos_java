import java.util.Scanner;
public class intercanviABC {

	public static void main(String[] args) {
		int A,B,C,A1;
		String pedirValorA,pedirValorC,pedirValorB,nuevoValorA,nuevoValorB,nuevoValorC;
		pedirValorA="Introduce el valor de A: "; pedirValorB="Introduce el valor de B: ";
		pedirValorC="Introduce el valor de C: "; nuevoValorA="El nuevo valor de A es:";
		nuevoValorB="El nuevo valor de B es: "; nuevoValorC="El nuevo valor de C es: ";
		Scanner valor= new Scanner(System.in);
		System.out.println(pedirValorA);
		A=valor.nextInt();
		System.out.println(pedirValorB);
		B=valor.nextInt();
		System.out.println(pedirValorC);
		C=valor.nextInt();
		A1=A;
		A=C;
		C=B;
		B=A1;
		System.out.println(nuevoValorA+A); System.out.println(nuevoValorB+B);
		System.out.println(nuevoValorC+C);
	}

}
