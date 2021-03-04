package Condicionales;
import java.util.Scanner;
public class condicional30 {

	public static void main(String[] args) {
		int x,y;
		Scanner valor=new Scanner(System.in);
		System.out.println("Elige tu opción jugador uno: ");
		System.out.println("[1] Papel");
		System.out.println("[2] Tijera");
		System.out.println("[3] Piedra");
		x= valor.nextInt();
		System.out.println("Elige tu opción jugador dos: ");
		System.out.println("[1] Papel");
		System.out.println("[2] Tijera");
		System.out.println("[3] Piedra");
		y= valor.nextInt();
		if (x==1){
			if (y==1) {
				System.out.println("Es un empate");
			}
			else if (y==2) {
				System.out.println("El jugador dos guanya");
			}
			else {
				System.out.println("El jugador uno gana");
			}
		}
		else if (x==2){
			if (y==1) {
				System.out.println("El jugador uno gana");
			}
			else if (y==2) {
				System.out.println("Es un empate ");
			}
			else {
				System.out.println("El jugador dos gana");
			}
		}
		else if (x==3) {
			if (y==1) {
				System.out.println("El jugador dos gana");
			}
			else if (y==2) {
				System.out.println("El jugador uno gana ");
			}
			else {
				System.out.println("Es un empate");
			}
		}
		
	}

}
