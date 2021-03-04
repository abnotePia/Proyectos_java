package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;
public class condicional2 {

	public static void main(String[] args) {
		int numero,cont=1;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		numero=valor.nextInt();
		while (cont<=numero) {
			System.out.println(cont+"-->"+cont*cont);
			cont++;
		}
	}

}
