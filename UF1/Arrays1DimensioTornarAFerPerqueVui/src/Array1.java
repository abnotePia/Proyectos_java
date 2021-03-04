import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		int vegadesNumeros,suma=0;
		int [] numeros;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros a introducir:");
		vegadesNumeros=valor.nextInt();
		numeros=new int[vegadesNumeros];
		for (int cont=0; cont<vegadesNumeros;cont++) {
			System.out.println("Introdueix un numero: ");
			numeros[cont]=valor.nextInt();
			suma+=numeros[cont];
		}
		System.out.println("La suma total es: "+suma);
		valor.close();
	}

}
