import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class proves2 {
	public static void main(String[] args) throws IOException {
		int numlineas,numespais,numparaules,numcaracters=0;
		//IMPORTANTE
		numparaules=1;
		numlineas=1;
		numespais=0;
		String nombre;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Per acabar el text has de posar el caracter '/'. ");
		System.out.println("Per acabar la linea has de posar el caracter '*'. ");
		nombre = teclado.nextLine();
		char[] arrayChar = nombre.toCharArray();
		for (int cont=0;arrayChar[cont] !='/';cont++) {
			if (arrayChar[cont] !='/' && arrayChar[cont] != ' ' && arrayChar[cont] != '*' ) {
				numcaracters++;
				numespais=0;
			}
			if (arrayChar[cont] ==' ' || arrayChar[cont] =='*' ) {
				if(numespais==0) {
					numparaules++;
					numespais++;
					}
			}	
			if (arrayChar[cont] =='*') {
				numlineas++;
			}
				
		}
		System.out.println("Caracters: "+numcaracters);
		System.out.println("Paraules: "+numparaules);
		System.out.println("Lineas: "+numlineas);
	}
}
