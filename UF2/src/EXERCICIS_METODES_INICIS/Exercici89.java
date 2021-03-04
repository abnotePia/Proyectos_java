package EXERCICIS_METODES_INICIS;

import java.util.Scanner;

public class Exercici89 {

	public static void main(String[] args) {
		Exercici89 p=new Exercici89();
		p.principal();
	}
	
	public void principal() {
	int [] numeros=new int [250];
	Scanner valor=new Scanner(System.in);
	int cont=0;
	do {
		numeros[cont]=LlegirEnter(valor);
		cont++;
		if (cont%2==0) {
			if (esDivisor(numeros[cont-1],numeros[cont-2])) {
				System.out.println("El numero "+numeros[cont-1]+" es divisor del numero "+numeros[cont-2] );
			}
		}
	} while(numeros[cont-1]!=0);
	valor.close();
	
	}
	public int LlegirEnter(Scanner valor) {
		int numero=0;
		System.out.println("Introduce un numero:");
		numero=valor.nextInt();
		return numero;
	}
	
	public boolean esDivisor(int divisor,int divident) {
		boolean divisible=false;
		if (divident%divisor==0) {
			divisible=true;
		}
		return divisible;
	}
}
