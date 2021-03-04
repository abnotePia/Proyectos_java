package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class condicional17 {

	public static void main(String[] args) {
		int haltura;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la haltura de la piramide: ");
		haltura=valor.nextInt();
		for (int cont=1;cont<=haltura;cont++) {
			for (int Blanc=0;Blanc<haltura-cont;Blanc++) {
				System.out.print(" ");
			}
			for (int figura=1;figura<cont*2;figura++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
