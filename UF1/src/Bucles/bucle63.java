package Bucles;
import java.util.Scanner;
public class bucle63 {
	public static void main(String[] args) {
	
		int cont,numseguides;
		char caracter1,caracter2,caracter;
		caracter=' ';
		caracter1=' ';
		caracter2=' ';
		cont=0;
		numseguides=0;
		while (caracter!='.') {
			Scanner teclado = new Scanner(System.in);
			caracter = teclado.next().charAt(0);
			if (cont==0) {
				caracter1=caracter;
			}
			if (caracter==caracter1) {
				caracter=teclado.next().charAt(0);
				cont++;
				if (cont==1) {
				caracter2=caracter;}
				if (caracter==caracter2) {
					numseguides++;
				}
			}
			cont++;
		}
		System.out.println("La lletre "+caracter1+" i la lletre "+caracter2+" surten juntes "+numseguides+" vegades");
	}

}
