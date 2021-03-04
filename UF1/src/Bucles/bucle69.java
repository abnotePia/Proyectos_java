package Bucles;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class bucle69 {
	public static void main(String[] args) throws IOException {
	
		int numlineas,iLetra,numespais,numparaules,numcaracters=0;
		//IMPORTANTE
		numparaules=1;
		numlineas=1;
		numespais=0;
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduce una frase acabada con intro: ");
		iLetra=buffer.read();
		while (iLetra!=47 ) {
			iLetra=buffer.read();
			if (iLetra!=47 && iLetra!=32 && iLetra!=42) {
			numcaracters++;
			numespais=0;
			}
			else if (iLetra==32 || iLetra==42) {
				if(numespais==0) {
					numparaules++;
					numespais++;
					}
				if (iLetra==42) {
					numlineas++;
				}
			}
		}
		System.out.println("Caracters: "+numcaracters);
		System.out.println("Paraules: "+numparaules);
		System.out.println("Lineas: "+numlineas);
			
		}	
	}
	


