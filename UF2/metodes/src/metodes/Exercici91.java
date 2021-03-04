package metodes;

import java.util.Scanner;

public class Exercici91 {

	public static void main(String[] args) {
		Exercici91 p=new Exercici91();
		p.principal();
	}
	public void principal() {
		Scanner valor=new Scanner(System.in);
		String paraula=" ";
		do {
		paraula=llegirString(valor);
		int num_a=comptarA(paraula);
		System.out.println("En la palabra "+paraula+" hay "+num_a+" a");
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
	public int comptarA(String paraula) {
		int num_a=0;
		for (int i=0;i<paraula.length();i++) {
			if (paraula.charAt(i)=='a') {
				num_a++;
			}
			
		}
		
		return num_a;
	}
}
