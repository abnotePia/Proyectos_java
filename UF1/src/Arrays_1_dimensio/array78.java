package Arrays_1_dimensio;
import java.util.Scanner;
public class array78 {

	public static void main(String[] args) {
		//Anar introduint caràcters pel teclat d'una frase finalitzada amb punt. Després caldrà dir quantes
		//lletres de tot l'abecedari s'han introduït. (a-z)*/
		char [] text;
		char lletra=' ';
		int cont=0;
		int repetides=0;
		Scanner valor=new Scanner(System.in);
		text=new char[250];
		while (lletra!='.') {
			lletra=valor.next().charAt(0);
			text[cont]=lletra;
			for(int j=0;j<250;j++) {
				if (text[cont]==text[j] && j!=cont) {
					repetides++;
				}
			}
			cont++;
		}
		valor.close();
		System.out.println("Se han introducido "+(cont-repetides-1)+" letras del abecedario");
		
	}

}
