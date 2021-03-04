import java.util.Scanner;
public class bucle42 {

	public static void main(String[] args) {
		// Dir quin es el numero més gran d'una sequencia que acabara quan l'usuari introdueixi un 0
		int numero,acumulador;
		Scanner valor=new Scanner(System.in);
		numero=0;
		acumulador=0;
		do {
			System.out.println("Introduce un numero: ");
			numero=valor.nextInt();
			if (numero>=acumulador) {
				acumulador=numero;
			}
		}while (numero!=0);
		System.out.println("El numero més gran de la seqüencia introduida es: "+acumulador);
		valor.close();
	}

}
