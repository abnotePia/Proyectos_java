import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bucle61 {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		int iLetra,la,si;
		la=0;
		si=0;
		System.out.println("Introduce una frase acabada con intro: ");
		iLetra=buffer.read();
		while (iLetra!=13 && iLetra!=10) {
			iLetra=buffer.read();
			if (iLetra==76 || iLetra==108) {
				iLetra=buffer.read();
				if (iLetra==65 || iLetra==97) {
				la++;
				}
			}
			else if (iLetra==83||iLetra==115) {
				iLetra=buffer.read();
				if (iLetra==73 || iLetra==105) {
				si++;
				}
			}
		}
		System.out.println("La seqüencia 'la' es repeteix "+la+" vegades i la seqüencia 'si' es repeteix "+si+" vegades");

	}

}
