import java.util.Scanner;
public class condicional29 {

	public static void main(String[] args) {
		char lletra;
		Scanner valor= new Scanner(System.in);
		System.out.println("Introduce un caracter: ");
		lletra=valor.next().charAt(0);
		if (Character.isLetter(lletra)) { // Character.isLetter(nomvariable) serveix per saber si el caracter introduit es una lletra
			if (Character.isUpperCase(lletra)) { //Character.isUpperCase(nomvariable) serveix per saber si el caracter introduit esta en majuscula
				System.out.println("La letra: "+lletra+" esta en mayuscula");
			}
			else {
				System.out.println("La letra: "+lletra+" esta en minuscula");
			}
		}
		
		else {
			System.out.println ("Error, el caracter introducido no es una letra");
		}
	}

}
// es podia fer comparant amb el numero ascii de la lletre
// if (lletra>=65 && lletra<=95) {
// System.out.println("La letra: "+lletra+" esta en mayuscula");
//}
