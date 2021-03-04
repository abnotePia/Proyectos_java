package Inicio;
import java.util.Scanner;
public class Polinomi {

	public static void main(String[] args) {
	double polinomi, x;
	String valorX,resultat,Polinomi;
	valorX="Introdueix el valor d'x: ";
	resultat="El valor del polinomi es: ";
	Polinomi="Siguent el polinomi x^3 +3x^2 +7x+7";
	Scanner valor= new Scanner(System.in);
	System.out.println(Polinomi);
	System.out.println(valorX);
	x=valor.nextDouble();
	polinomi= (x*x*x)+3*(x*x)+7*x+7;
	System.out.println(resultat+ polinomi);
	}
}
