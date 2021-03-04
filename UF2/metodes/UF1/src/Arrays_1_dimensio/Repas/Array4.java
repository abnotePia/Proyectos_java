package Arrays_1_dimensio.Repas;
import java.util.Scanner;
public class Array4 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int [] taula1;
		int[] taulaInvertida;
		int llarg;
		System.out.println("Introdueix quants numeros vols introduir: ");
		llarg=valor.nextInt();
		taula1=new int[llarg];
		taulaInvertida=new int[llarg];
		for (int cont=0, j=taula1.length-1;cont<llarg;cont++, j--) {
			System.out.println("Introdueix un numero: ");
			taula1[cont]=valor.nextInt();
			taulaInvertida[j]=taula1[cont];
		}
		System.out.println("La taula invertida es: ");
		for (int cont=0;cont<llarg;cont++) {
			System.out.println(taulaInvertida[cont]);
		}
		valor.close();
	}

}
