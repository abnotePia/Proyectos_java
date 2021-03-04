package Bucles;
import java.util.Scanner;
//Taules de multiplicar de 1 a 10
public class bucle44 {
	public static void main(String[] args) {
		int taula=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introdueix quina taula de multiplicar vols: ");
		taula=valor.nextInt();
		for (int cont=1;cont<=10;cont++) {
			System.out.println(cont+" * "+taula+" = "+(cont*taula));
		}
	}
}
