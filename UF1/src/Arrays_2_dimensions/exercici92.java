package Arrays_2_dimensions;
import java.util.Scanner;
public class exercici92 {

	public static void main(String[] args) {
		int n,m;
		Scanner valor=new Scanner(System.in);
		System.out.println("Introduce el numero de filas de las matrizes");
		n=valor.nextInt();
		System.out.println("Introduce el numero de colmnas de las matrizes");
		m=valor.nextInt();
		double [][] matriu1=new double[n][m];
		double [][] matriu2=new double[n][m];
		double [][] suma=new double[n][m];
		//Rellenar primera matriz
		System.out.println("Primera matriz");
		for (int filas=0;filas<n;filas++) {
			for (int col=0;col<m;col++) {
				System.out.println("Introduce el valor de la fila "+filas+" y la columna "+col);
				matriu1[filas][col]=valor.nextDouble();
			}
		}
		//Rellenar segunda matriz
		System.out.println("Segunda matriz");
		for (int filas=0;filas<n;filas++) {
			for (int col=0;col<m;col++) {
				System.out.println("Introduce el valor de la fila "+filas+" y la columna "+col);
				matriu2[filas][col]=valor.nextDouble();
			}
		}	
		//Operacion
		System.out.println("El resultado de la suma es: ");
		for (int filas=0;filas<n;filas++) {
			for (int col=0;col<m;col++) {
				suma[filas][col]=matriu1[filas][col]+matriu2[filas][col];
				System.out.print(suma[filas][col]+" ");
			}
			System.out.println(" ");
		}
		valor.close();
	}

}
