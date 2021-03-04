import java.io.IOException;

public class ProbaArray79 {

	public static void main(String[] args) throws IOException {
		/*Introduir una frase caràcter a caràcter en una taula. Posteriorment caldrà mostrar-la per
		pantalla invertida canviant la vocat „a‟ per la „e‟, la „e‟ per la „i‟, la „i‟ per la „o‟, la „o‟ per la
		„u‟ i la „u‟ per la „a‟*/
		char [] text;
		int paraula=0, cont=0;
		text=new char[250];
		System.out.println("Escriu un text");
		while (paraula!=46) {
				paraula=System.in.read();
				text[cont]=(char)paraula;
					if (text[cont]=='a' || text[cont]=='A') {
						if (text[cont]=='a') {
							text[cont]='e';
							}
							else {
								text[cont]='E';
							}
					}
					else if (text[cont]=='e' || text[cont]=='E') {
						if (text[cont]=='e') {
							text[cont]='i';
							}
							else {
								text[cont]='I';
							}
					}
					else if (text[cont]=='i' || text[cont]=='I') {
						if (text[cont]=='i') {
							text[cont]='o';
							}
							else {
								text[cont]='O';
							}
					}
					else if (text[cont]=='o' || text[cont]=='O') {
						if (text[cont]=='o') {
							text[cont]='u';
							}
							else {
								text[cont]='U';
							}
					}
					else	if (text[cont]=='u' || text[cont]=='U') {
						if (text[cont]=='u') {
						text[cont]='a';
						}
						else {
							text[cont]='A';
						}
					
				}
				cont++;
		}
		cont=0;
		while (text[cont]!=46) {
		System.out.print(text[cont]);
		cont++;
		}
	
	}

}
