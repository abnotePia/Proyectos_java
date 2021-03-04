package Bucles;
import java.util.Scanner;
public class bucle47 {

	public static void main(String[] args) {
		//Calcular factorial
		int factorial,contador;
		double resultat,proba;
		resultat=0;
		proba=1;
		contador=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introdueix el numero per fer el factorial: ");
		factorial=valor.nextInt();
		System.out.print(factorial+ "! = ");
		while (contador<factorial) {
			resultat=factorial-contador;
			proba=proba*resultat;
			System.out.print((factorial-contador));
			contador++;
			if (contador<factorial) {
				System.out.print("*");
			}
		}
		System.out.println("");
		System.out.println("El factorial del numero "+factorial+" es: "+proba);
	}

}
