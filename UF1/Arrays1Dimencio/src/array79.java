import java.util.Scanner;
public class array79 {

	public static void main(String[] args) {
		/*Introduir una frase caràcter a caràcter en una taula. Posteriorment caldrà mostrar-la per
		pantalla invertida canviant la vocat „a‟ per la „e‟, la „e‟ per la „i‟, la „i‟ per la „o‟, la „o‟ per la
		„u‟ i la „u‟ per la „a‟*/
		char [] text;
		char lletra=' ';
		int cont=0;
		text=new char[250];
		Scanner valor=new Scanner (System.in);
		while (lletra !='.') {
			lletra=valor.next().charAt(0);
			text[cont]=lletra;
			if (text[cont]=='a') {
				text[cont]='e';
			}
			else if (text[cont]=='e') {
				text[cont]='i';
					}
			else if (text[cont]=='i') {
				text[cont]='o';
			}
			else if (text[cont]=='o') {
				text[cont]='u';
					}
			else if (text[cont]=='u') {
				text[cont]='a';
			}
			cont++;
		}
		cont=0;
		while (text[cont]!='.') {
			System.out.println(text[cont]);
			cont++;
		}
		
		valor.close();

	}

}
