package Arrays_1_dimensio;
import java.io.IOException;
public class Array87 {

	public static void main(String[] args) throws IOException {
		/* Realitzar un algoritme que permeti entrar per teclat (caràcter a caràcter) un text no buit acabat
		amb punt. Determinar quantes paraules comencen amb la lletra „A‟ i d‟aquestes quantes
		contenen la seqüencia „LA‟. Nota: S‟entén que una paraula sempre porta un espai davant i
		darrera, excepte la primera i última paraula. Exemple
		Frase: A LA CALA DEL ALAN HI HA ARCILLA.
		Solució: 3 paraules comencen amb „A‟ de les que 2 tenen „LA‟*/
		char [] text;
		int paraula=0, cont=1,LA=0,cont2=1,paraulas=0;
		int [] posicioBlanc;
		posicioBlanc=new int[250];
		text=new char[250];
		text[0]=' ';
		posicioBlanc[0]=1;
		while (paraula!=46) {
			paraula=System.in.read();
			text[cont]=(char)paraula;
			if (text[cont]==' ') {
				posicioBlanc[cont]=1;
			}
			cont++;
		}
		posicioBlanc[cont]=1;
		cont=1;
		while (text[cont]!=46) {
			if (cont==1) {
				if ((text[cont]=='a' || text[cont]=='A') && posicioBlanc[cont-1]==1) {
					paraulas++;
				}
				while (posicioBlanc[cont2]!=1) {
					if ((text[cont]=='a' || text[cont]=='A') && posicioBlanc[cont-1]==1) {
						if (text[cont2]=='l'|| text[cont2]=='L') {
							if (text[cont2+1]=='a' || text[cont2+1]=='A') {
									LA++;
								}
							}
						}
					cont2++;
					}
			}
			
			else {
			if (posicioBlanc[cont]==1) {
				cont2=cont+1;
				if ((text[cont+1]=='a' || text[cont+1]=='A') && posicioBlanc[cont]==1) {
					paraulas++;
				}
				while (posicioBlanc[cont2]!=1) {
					if ((text[cont+1]=='a' || text[cont+1]=='A') && posicioBlanc[cont]==1) {
						if (text[cont2]=='l'|| text[cont2]=='L') {
							if (text[cont2+1]=='a' || text[cont2+1]=='A') {
									LA++;
								}
							}
						}
					cont2++;
					}
			
				}
			}
			cont++;
		}
		
		System.out.println("Hi han  "+paraulas+" parales que començan amb 'a' i de aquestes "+LA+" tenen la seqüencia 'la'.");
	}
}
