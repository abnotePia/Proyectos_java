import java.util.Scanner;
public class bucle40 {

	public static void main(String[] args) {
		// Si entra un 0 el bucle acaba
		int numero,i,acumulador;
		i=1;
		acumulador=0;
		Scanner valor=new Scanner(System.in);
		do {
			System.out.println("Introduce un numero para sumar: ");
			numero=valor.nextInt();
			acumulador=acumulador+numero; //acumulador += numero;
		} while (numero!=0);
		System.out.println("La suma total de todos los numeros es: "+acumulador);
	}

}
