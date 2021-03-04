package EXAMENS.EXAMEN_3;
import java.util.Scanner;

public class exercici_1 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		char [] A=new char[10];
		//Omplenar array amb els valors marcats pel usuari
		for (int cont=0;cont<10;cont++) {
			System.out.println("Introdueix una lletra: ");
			A[cont]=valor.next().charAt(0);
		}
		//comprovar vocals i consonants
		int consonants=0,vocals=0;
		for(int cont=0;cont<10;cont++) {
			if (A[cont]=='a' || A[cont]=='A'||A[cont]=='e'||A[cont]=='E'||A[cont]=='O'||A[cont]=='o'||A[cont]=='i'||A[cont]=='I'||A[cont]=='u'||A[cont]=='U') {
				vocals++;
			}
			else {
				consonants++;
			}
			
		}
		//imprimir resultat
		System.out.println("De les 10 lletres introduides "+vocals+" son vocals i "+consonants+" son consonants");
		valor.close();
	}

}
