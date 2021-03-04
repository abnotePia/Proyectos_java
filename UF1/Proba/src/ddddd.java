import java.util.Scanner;
public class ddddd {

	public static void main(String[] args) {
		int numeros;
		Scanner valor=new Scanner(System.in);
		System.out.println("De que numero quieres saber su divisor?");
		numeros=valor.nextInt();
		System.out.println("Els divisors son: ");
		for (int cont=1;cont<=numeros;cont++) {
			if (numeros%cont==0) {
				System.out.print(cont+" ");
			}
		}
		System.out.println("\nCon bucle while");
		int cont=1;
		while (cont<=numeros) {
			if (numeros%cont==0) {
				System.out.print(cont+" ");
			}
			cont++;
		}
	}

}
