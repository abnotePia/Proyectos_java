package Condicionales;
import java.util.Scanner;
public class condicional17 {

	public static void main(String[] args) {
	Scanner valor= new Scanner(System.in);
	double x,resultat;
	System.out.println("Introduce un numero: ");
	x=valor.nextDouble();
	if (x>20) {
		resultat=x*x;
	}
	else {
		resultat=x*x*x;
	}
	System.out.println("El resulat es: "+resultat);
	}
}
