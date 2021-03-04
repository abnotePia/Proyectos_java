package Bucles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class bucle59 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		int iLetra;
		double resultat,a,espaiBlanc;
		resultat=0;
		a=1;
		espaiBlanc=0;
		System.out.println("Introduce una frase acabada con intro: ");
		iLetra=buffer.read();
		while (iLetra!=13 && iLetra!=10) {
			iLetra=buffer.read();
			if (iLetra==65 || iLetra==97) {
				a++;
			}
			else if (iLetra==32) {
				espaiBlanc++;
			}
		
		}
		resultat=(a/espaiBlanc)*100;
		System.out.println("La letra a es  "+resultat+"% respecto a los espacios en blanco");
	}

}
