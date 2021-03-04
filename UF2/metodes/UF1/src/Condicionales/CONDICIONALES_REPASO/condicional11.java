package Condicionales.CONDICIONALES_REPASO;
import java.util.Scanner;

public class condicional11 {

	public static void main(String[] args) {
		int taula,cont=1,numero2=0;
		Scanner valor=new Scanner(System.in);
		System.out.println("Que tabla quieres: ");
		taula=valor.nextInt();
		System.out.println("Hasta que numero quieres:");
		numero2=valor.nextInt();
			while (cont<=numero2) {
			System.out.println(taula+"*"+cont+"="+(taula*cont));
			cont++;
			}
			valor.close();
	}

}
