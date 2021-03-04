import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class exercici_4 {

	public static void main(String[] args) {
		String text;
		int posicio=1;
		char caracter;
		Scanner teclat=new Scanner(System.in);
		System.out.println("Introduce un texto");
		text=teclat.nextLine();
		do {
			System.out.println("Introduce un caracter: ");
			caracter=teclat.next().charAt(0);
			if (caracter!='-') {
			while (text.charAt(posicio)!=caracter) {
				posicio++;
			}
			
			System.out.println("El caracter "+caracter+" es troba en la posicio "+posicio);
				}
			}while (caracter!='-');
		

	}

}
