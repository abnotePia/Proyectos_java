import java.util.Scanner;
public class Condicionals3 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		float saldo;
		System.out.println("Introdueix el saldo del teu compte bancari: ");
		saldo=valor.nextFloat();
		if (saldo>=1000) {
			System.out.println("solvent");
		}
		else if (saldo<1000 && saldo>0) {
			System.out.println("precari");
		}
		else if (saldo<=0) {
			System.out.println("apurat");
		}
		else {
			System.out.println("moros");
		}
		valor.close();
	}

}
