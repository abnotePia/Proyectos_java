package Bucles;
import java.util.Scanner;
public class bucle41 {
	public static void main(String[] args) {
		// Mitjana aritmetica
		double numero, acumulador,contador;
		numero=0;
		acumulador=0;
		contador=0;
		Scanner valor= new Scanner(System.in);
		do {
			System.out.println("Introduce un numero: ");
			numero=valor.nextDouble();
			acumulador=acumulador+numero;
			contador=contador+1;
		} while (numero !=0);
		System.out.println("La mitjana aritmetica sense contar el 0 es: "+ acumulador/(contador-1));
	}

}
