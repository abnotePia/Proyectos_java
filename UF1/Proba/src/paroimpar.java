import java.util.Scanner;
public class paroimpar {

	public static void main(String[] args) {
		int numero;
		Scanner valor=new Scanner(System.in);
		do {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			if (numero%2==0) {
				System.out.println("El numero "+numero+" es parell");
			}
			else if (numero%2!=0) {
				System.out.println("El numero "+numero+" es imparell");
			}
		} while (numero!=0);
	}

}
