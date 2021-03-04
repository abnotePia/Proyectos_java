package metodes;

import java.util.Scanner;

public class Exercici92 {
	
	public static void main(String[] args) {
		Exercici92 p=new Exercici92();
		p.principal();
	}
	public void principal() {
		Scanner valor=new Scanner(System.in);
		String paraula=" ";
		char [] lletra={'a','e','i','o','u'};
		int [] numlletra=new int [5];
		do {
		paraula=llegirString(valor);
		for (int cont=0;cont<5;cont++) {
		numlletra[cont]=comptarLletra(paraula,lletra,cont);
		System.out.println("En la palabra "+paraula+" hay "+numlletra[cont]+" "+lletra[cont]);
		}
		}while (continuar(valor));
		System.out.println("Fin del programa");
	}
	public String llegirString(Scanner valor) {
		System.out.println("Introduce una palabra");
		String paraula=valor.next();
		
		return paraula;
	}
	public boolean continuar(Scanner valor) {
		boolean continuar=false;
		String con;
		System.out.println("¿Quieres continuar?");
		con=valor.next();
		if (con.charAt(0)=='S' || con.charAt(0)=='s' ) {
			continuar=true;
		}
		return continuar;
	}
	public int comptarLletra(String paraula,char [] lletra,int cont) {
		int numvocals=0;
		for (int i=0;i<paraula.length();i++) {
				if (paraula.charAt(i)==lletra[cont]) {
					numvocals++;
				}
		}
		return numvocals;
	}
}
