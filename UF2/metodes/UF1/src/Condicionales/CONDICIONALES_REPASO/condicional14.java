package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class condicional14 {

	public static void main(String[] args) {
		int costat;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el tamaño del cuadrado");
		costat=valor.nextInt();
		for (int cont=0;cont<costat;cont++) {
			for (int cont2=0;cont2<costat;cont2++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		valor.close();
	}

}
