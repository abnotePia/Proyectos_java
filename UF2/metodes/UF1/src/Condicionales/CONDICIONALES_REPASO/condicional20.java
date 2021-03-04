package Condicionales.CONDICIONALES_REPASO;
import java.io.IOException;

public class condicional20 {

	public static void main(String[] args) throws IOException {
		int text=0,lletra1=0,lletra2=0,cont=0,repetides=1;
		while (text!=46 ) {
			text=System.in.read();
			if (cont==0) {
				lletra1=text;
			}
			else if (cont==1) {
				lletra2=text;
			}
			else if (text==lletra1) {
				text=System.in.read();
				if (text==lletra2) {
					repetides++;
				}
			}
			cont++;
		}
		System.out.println("El numero de "+(char)lletra1+""+(char)lletra2+ " que hi han es: "+repetides);

	}

}
