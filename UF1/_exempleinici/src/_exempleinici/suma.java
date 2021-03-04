package _exempleinici;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		//zona per declaració de les variables i constants
		float valor1,valor2,resultat,Resultat1,Resultat2,Resultat3;
		
		//Tipus String (Cadena de caracters)
		String textAvisResultat;
		String resultat1,resultat2,resultat3;

		//L'element Scanner serveix per tal de interectuar amb l'usuari i el seu teclat
		Scanner entrada = new Scanner(System.in);
		
		//Assignació de valors a les variables  Inicialització
		System.out.println("Entra el primer valor: ");
		valor1= entrada.nextInt();
		System.out.println("Entra el segon valor: ");
		valor2= entrada.nextInt();
		resultat=0;
		Resultat1=0;
		Resultat2=0;
		Resultat3=0;
		textAvisResultat= "EL Resultat de la suma es: ";
		resultat1= "El resultat de la resta es: ";
		resultat2= "El resultat de la multiplicació es: ";
		resultat3= "El resultat de la divisio es: ";
		//Operacions funcionals del programa
		resultat=valor1+valor2;
		Resultat1=valor1*valor2;
		Resultat2=valor1-valor2;
		Resultat3=valor1/valor2;
		System.out.println(textAvisResultat +resultat);
		System.out.println(resultat2 +Resultat1);
		System.out.println(resultat3 +Resultat3);
		System.out.println(resultat1 +Resultat2);
		
		System.out.println("Final");
		
	}

}
