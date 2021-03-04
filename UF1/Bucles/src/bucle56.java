import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class bucle56 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		int iLetra,a;
		a=0;
		System.out.println("Introduce una frase acabada con intro: ");
		iLetra=buffer.read();
		while (iLetra!=13 && iLetra!=10) {
			iLetra=buffer.read();
			if (iLetra==65 || iLetra==97) {
				a++;
			}
		}
		System.out.println("La letra a sale "+a+" veces");
	}
}
