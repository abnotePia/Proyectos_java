package Arrays_1_dimensio.Repas;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
		int vegadesNumeros,positius=0,negatius=0,neutres=0;
		int [] numeros;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce la cantidad de numeros a introducir:");
		vegadesNumeros=valor.nextInt();
		numeros=new int[vegadesNumeros];
		for (int cont=0; cont<vegadesNumeros;cont++) {
			System.out.println("Introdueix un numero: ");
			numeros[cont]=valor.nextInt();
			if (numeros[cont]>0) {
				positius++;
			}
			else if (numeros[cont]<0) {
				negatius++;
			}
			else {
				neutres++;
			}
				
		}
		System.out.println("Hi han "+positius+" numeros positius");
		System.out.println("Hi han "+negatius+" numeros negatius");
		System.out.println("Hi han "+neutres+" numeros neutres");
		valor.close();

	}

}
