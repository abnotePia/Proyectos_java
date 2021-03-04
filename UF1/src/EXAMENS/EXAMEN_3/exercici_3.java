package EXAMENS.EXAMEN_3;
import java.util.Scanner;

public class exercici_3 {

	public static void main(String[] args) {
		Scanner valor=new Scanner(System.in);
		int [][] taula=new int[5][10];
		int [][] taulaO=new int [5][10];
		int numero=0,columna=0;
		int cont=0;
		//Inicialitzar taula
		for (int fila=0;fila<5;fila++) {
			for (int col=0;col<9;col++) {
				taula[fila][col]=cont;
				taulaO[fila][col]=cont;
				cont++;
			}
		}
		for (int fila=0;fila<5;fila++) {
			//introducir numero
			System.out.println("Introduce el numero que quieres insertar ");
			numero=valor.nextInt();
			//introducir columna
			System.out.println("De la fila "+fila+" en que columna quieres insertar el numero");
			columna=valor.nextInt();
			//desplazar numeros a la derecha
			for (int col=columna;col<10;col++) {
				if (col+1!=10) {
				taula[fila][col+1]=taulaO[fila][col];
				}
			}
			taula[fila][columna]=numero;
			//Imprimir Resultant
			for (int filas=0;filas<5;filas++) {
				for(int col=0;col<10;col++) {
					System.out.print(taula[filas][col]+" ");
				}
				System.out.println(" ");
			}
		}
		valor.close();
	}

}
